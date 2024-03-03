// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package proxmoxve

import (
	"context"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/bpg/terraform-provider-proxmox/proxmoxtf/provider"
	"github.com/ettle/strcase"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
	shimprovider "github.com/muhlba91/pulumi-proxmoxve/provider/shim"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

const (
	mainMod       = "index"
	vmMod         = "vm"
	containerMod  = "ct"
	clusterMod    = "cluster"
	permissionMod = "permission"
	storageMod    = "storage"
	networkMod    = "network"
	firewallMod   = "firewall"
	downloadMod   = "download"
	haMod         = "ha"
)

// needed to keep backwards compatibility of resource module naming
var moduleOverrides = map[string]string{
	"Index":                     mainMod,
	"Vm":                        "VM",
	"Ct":                        "CT",
	"Ha":                        "HA",
	"Cluster/firewall/security": "Network",
	"Network/linux":             "Network",
}

// needed to keep backwards compatibility of resource module naming
var moduleNameOverrides = map[string]string{
	"index/pool":              permissionMod,
	"index/pools":             permissionMod,
	"index/role":              permissionMod,
	"index/roles":             permissionMod,
	"index/user":              permissionMod,
	"index/users":             permissionMod,
	"index/vm":                vmMod,
	"index/vms":               vmMod,
	"index/datastores":        storageMod,
	"index/group":             permissionMod,
	"index/groups":            permissionMod,
	"index/nodes":             clusterMod,
	"index/file":              storageMod,
	"index/container":         containerMod,
	"cluster/firewall":        networkMod,
	"firewall/options":        networkMod,
	"firewall/rules":          networkMod,
	"firewall/ipset":          networkMod,
	"firewall/security/group": networkMod,
	"firewall/alias":          networkMod,
	"index/hagroup":           haMod,
	"index/hagroups":          haMod,
	"index/haresource":        haMod,
	"index/haresources":       haMod,
}

// needed to keep backwards compatibility of resource naming
var nameNameOverrides = map[string]string{
	"index/certificate":               "certifi",
	"cluster/firewall/security/group": "firewall_security_group",
	"index/vm":                        "virtual_machine",
	"index/vms":                       "virtual_machines",
	"index/dns":                       "d_n_s",
	"firewall/rules":                  "firewall_rules",
	"firewall/alias":                  "firewall_alias",
	"firewall/options":                "firewall_options",
	"firewall/ipset":                  "firewall_i_p_set",
	"network/linux/vlan":              "network_vlan",
	"network/linux/alias":             "network_alias",
	"network/linux/bridge":            "network_bridge",
	"index/hagroup":                   "h_a_group",
	"index/hagroups":                  "h_a_groups",
	"index/haresource":                "h_a_resource",
	"index/haresources":               "h_a_resources",
}

func preConfigureCallback(_ resource.PropertyMap, _ shim.ResourceConfig) error {
	return nil
}

func convertName(tfname string) (module string, name string) {
	tfNameItems := strings.Split(tfname, "_")
	// convert proxmox to proxmoxve to match the namespace
	tfNameItems[0] = strings.Replace(tfNameItems[0], "proxmox", "proxmoxve", 1)
	// removes the virtual environment part
	tfNameItems = append(tfNameItems[:1], tfNameItems[3:]...)

	contract.Assertf(len(tfNameItems) >= 2, "Invalid snake case name %s", tfname)
	contract.Assertf(tfNameItems[0] == "proxmoxve", "Invalid snake case name %s. Does not start with proxmoxve", tfname)

	if len(tfNameItems) == 2 {
		module = mainMod
		name = tfNameItems[1]
	} else {
		module = strings.Join(tfNameItems[1:len(tfNameItems)-1], "/")
		name = tfNameItems[len(tfNameItems)-1]
	}

	// apply overrides for backwards compatibility
	moduleName := strings.Join([]string{module, name}, "/")
	if v, ok := moduleNameOverrides[moduleName]; ok {
		module = v
	}
	if v, ok := nameNameOverrides[moduleName]; ok {
		name = v
	}
	module = strcase.ToPascal(module)
	if v, ok := moduleOverrides[module]; ok {
		module = v
	}

	contract.Assertf(!unicode.IsDigit(rune(module[0])), "Pulumi namespace must not start with a digit: %s", name)
	contract.Assertf(!unicode.IsDigit(rune(name[0])), "Pulumi name must not start with a digit: %s", name)

	name = strcase.ToPascal(name)
	return
}

func makeDataSource(ds string) tokens.ModuleMember {
	mod, name := convertName(ds)
	return tfbridge.MakeDataSource("proxmoxve", mod, "get"+name)
}

func makeResource(res string) tokens.Type {
	mod, name := convertName(res)
	return tfbridge.MakeResource("proxmoxve", mod, name)
}

func moduleComputeStrategy() tfbridge.Strategy {
	return tfbridge.Strategy{
		Resource: func(tfToken string, elem *tfbridge.ResourceInfo) error {
			elem.Tok = makeResource(tfToken)
			return nil
		},
		DataSource: func(tfToken string, elem *tfbridge.DataSourceInfo) error {
			elem.Tok = makeDataSource(tfToken)
			return nil
		},
	}
}

func Provider() tfbridge.ProviderInfo {
	p := pf.MuxShimWithPF(context.Background(), shimv2.NewProvider(provider.ProxmoxVirtualEnvironment()), shimprovider.NewProvider())

	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "proxmox",
		DisplayName:          "Proxmox Virtual Environment (Proxmox VE)",
		Description:          "A Pulumi package for creating and managing Proxmox Virtual Environment cloud resources.",
		Publisher:            "Daniel Muehlbachler-Pietrzykowski",
		Keywords:             []string{"pulumi", "proxmox", "proxmoxve"},
		License:              "Apache-2.0",
		Homepage:             "https://github.com/muhlba91/pulumi-proxmoxve",
		Repository:           "https://github.com/muhlba91/pulumi-proxmoxve",
		LogoURL:              "https://raw.githubusercontent.com/muhlba91/pulumi-proxmoxve/main/assets/proxmox-logo.png",
		GitHubOrg:            "bpg",
		PluginDownloadURL:    "github://api.github.com/muhlba91/pulumi-proxmoxve",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		MuxWith:              []tfbridge.MuxProvider{},
		Resources:            map[string]*tfbridge.ResourceInfo{},
		DataSources:          map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@muhlba91/pulumi-proxmoxve",
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "pulumi_proxmoxve",
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/muhlba91/pulumi-%[1]s/sdk/", "proxmoxve"),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				"proxmoxve",
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				"proxmoxve": "ProxmoxVE",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "io.muehlbachler.pulumi",
		},
	}

	prov.MustComputeTokens(moduleComputeStrategy())
	prov.SetAutonaming(255, "-")

	return prov
}
