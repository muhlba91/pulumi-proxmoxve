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
	"path"
	"strconv"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"strings"
	"unicode"

	"github.com/bpg/terraform-provider-proxmox/fwprovider"
	"github.com/bpg/terraform-provider-proxmox/proxmoxtf/provider"
	"github.com/ettle/strcase"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/info"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

const (
	mainPkg = "proxmoxve"
	mainMod = "index"
)

var resourceIDOverrides = map[string][]string{
	"proxmox_storage_pbs":           {"proxmox_virtual_environment_storage_pbs"},
	"proxmox_sdn_fabric_ospf":       {"proxmox_virtual_environment_sdn_fabric_ospf"},
	"proxmox_storage_lvmthin":       {"proxmox_virtual_environment_storage_lvmthin"},
	"proxmox_sdn_zone_qinq":         {"proxmox_virtual_environment_sdn_zone_qinq"},
	"proxmox_sdn_zone_vlan":         {"proxmox_virtual_environment_sdn_zone_vlan"},
	"proxmox_storage_cifs":          {"proxmox_virtual_environment_storage_cifs"},
	"proxmox_storage_nfs":           {"proxmox_virtual_environment_storage_nfs"},
	"proxmox_sdn_vnet":              {"proxmox_virtual_environment_sdn_vnet"},
	"proxmox_storage_lvm":           {"proxmox_virtual_environment_storage_lvm"},
	"proxmox_storage_zfspool":       {"proxmox_virtual_environment_storage_zfspool"},
	"proxmox_sdn_zone_evpn":         {"proxmox_virtual_environment_sdn_zone_evpn"},
	"proxmox_vm":                    {"proxmox_virtual_environment_vm2"},
	"proxmox_sdn_zone_vxlan":        {"proxmox_virtual_environment_sdn_zone_vxlan"},
	"proxmox_cloned_vm":             {"proxmox_virtual_environment_cloned_vm"},
	"proxmox_replication":           {"proxmox_virtual_environment_replication"},
	"proxmox_sdn_zone_simple":       {"proxmox_virtual_environment_sdn_zone_simple"},
	"proxmox_storage_directory":     {"proxmox_virtual_environment_storage_directory"},
	"proxmox_sdn_fabric_openfabric": {"proxmox_virtual_environment_sdn_fabric_openfabric"},
	"proxmox_backup_job":            {},
}

var resourceFieldNameCSharpOverrides = map[string]map[string]string{
	"proxmox_virtual_environment_acme_certificate": {
		"certificate": "certificatePem",
	},
	"proxmox_acme_certificate": {
		"certificate": "certificatePem",
	},
	"proxmox_virtual_environment_acme_dns_plugin": {
		"plugin": "pluginName",
	},
	"proxmox_acme_dns_plugin": {
		"plugin": "pluginName",
	},
	"proxmox_virtual_environment_network_linux_vlan": {
		"vlan": "vlanId",
	},
	"proxmox_network_linux_vlan": {
		"vlan": "vlanId",
	},
	"proxmox_virtual_environment_metrics_server": {
		"server": "serverAddress",
	},
	"proxmox_metrics_server": {
		"server": "serverAddress",
	},
}

//go:embed cmd/pulumi-resource-proxmoxve/bridge-metadata.json
var metadata []byte

func convertName(tfname string) (module string, name string) {
	legacy := false
	if strings.Contains(tfname, "proxmox_virtual_environment_") {
		legacy = true
		tfname = strings.ReplaceAll(tfname, "proxmox_virtual_environment_", "proxmoxve_")
	}
	tfname = strings.ReplaceAll(tfname, "proxmox_", "proxmoxve_")
	tfNameItems := strings.Split(tfname, "_")

	contract.Assertf(len(tfNameItems) >= 2, "Invalid snake case name %s", tfname)
	contract.Assertf(tfNameItems[0] == "proxmoxve", "Invalid snake case name %s. Does not start with proxmoxve", tfname)

	if len(tfNameItems) == 2 {
		module = mainMod
		name = tfNameItems[1]
	} else {
		module = strings.Join(tfNameItems[1:len(tfNameItems)-1], "/")
		name = tfNameItems[len(tfNameItems)-1]
	}

	contract.Assertf(!unicode.IsDigit(rune(module[0])), "Pulumi namespace must not start with a digit: %s", name)
	contract.Assertf(!unicode.IsDigit(rune(name[0])), "Pulumi name must not start with a digit: %s", name)

	if legacy {
		name = fmt.Sprintf("%sLegacy", name)
	}

	name = strcase.ToPascal(name)
	return module, name
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
			if elem.Tok == "" {
				elem.Tok = makeResource(tfToken)
			}
			return nil
		},
		DataSource: func(tfToken string, elem *tfbridge.DataSourceInfo) error {
			if elem.Tok == "" {
				elem.Tok = makeDataSource(tfToken)
			}
			return nil
		},
	}
}

func resourceComputeIDOverride() func(context.Context, resource.PropertyMap) (resource.ID, error) {
	return func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
		const resourceIDPropertyKey = resource.PropertyKey("id")
		return resource.ID(strconv.Itoa(state[resourceIDPropertyKey].V.(int))), nil
	}
}

func resourceFieldIDOverride(fields map[string]*tfbridge.SchemaInfo) map[string]*tfbridge.SchemaInfo {
	fields["id"] = &tfbridge.SchemaInfo{
		Name: "resourceId",
		Type: "string",
	}
	return fields
}

func resourceFieldsCustomOverride(fields map[string]*tfbridge.SchemaInfo, name string) map[string]*tfbridge.SchemaInfo {
	if override, ok := resourceFieldNameCSharpOverrides[name]; ok {
		for fieldName, csharpName := range override {
			fields[fieldName] = &tfbridge.SchemaInfo{
				CSharpName: csharpName,
			}
		}
	}
	return fields
}

func resourceFieldsOverride(name string, overrideID bool) map[string]*tfbridge.SchemaInfo {
	fields := map[string]*tfbridge.SchemaInfo{}

	if overrideID {
		resourceFieldIDOverride(fields)
	}
	resourceFieldsCustomOverride(fields, name)

	return fields
}

func resourceOverrides() map[string]*tfbridge.ResourceInfo {
	overrides := map[string]*tfbridge.ResourceInfo{}

	for name, aliases := range resourceIDOverrides {
		aliasList := []info.Alias{}
		for _, alias := range aliases {
			if alias != "" {
				aliasList = append(aliasList, info.Alias{
					Type: &alias,
				})
			}

			overrides[alias] = &tfbridge.ResourceInfo{
				Fields:    resourceFieldsOverride(alias, true),
				ComputeID: resourceComputeIDOverride(),
			}
		}

		overrides[name] = &tfbridge.ResourceInfo{
			Fields:    resourceFieldsOverride(name, true),
			ComputeID: resourceComputeIDOverride(),
			Aliases:   aliasList,
		}
	}

	for name := range resourceFieldNameCSharpOverrides {
		if _, ok := overrides[name]; !ok {
			overrides[name] = &tfbridge.ResourceInfo{
				Fields: resourceFieldsOverride(name, false),
			}
		}
	}

	return overrides
}

func Provider() tfbridge.ProviderInfo {
	p := pfbridge.MuxShimWithPF(context.Background(), shimv2.NewProvider(provider.ProxmoxVirtualEnvironment()), fwprovider.New(version.Version)())
	// p := pfbridge.ShimProvider(fwprovider.New(version.Version)())
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "proxmox",
		DisplayName:       "Proxmox Virtual Environment (Proxmox VE)",
		Description:       "A Pulumi package for creating and managing Proxmox Virtual Environment cloud resources.",
		Publisher:         "Daniel Muehlbachler-Pietrzykowski",
		Keywords:          []string{"proxmox", "proxmoxve", "category/infrastructure"},
		License:           "Apache-2.0",
		Homepage:          "https://github.com/muhlba91/pulumi-proxmoxve",
		Repository:        "https://github.com/muhlba91/pulumi-proxmoxve",
		LogoURL:           "https://raw.githubusercontent.com/muhlba91/pulumi-proxmoxve/main/assets/proxmox-logo.png",
		GitHubOrg:         "bpg",
		PluginDownloadURL: "github://api.github.com/muhlba91/pulumi-proxmoxve",
		Version:           version.Version,
		Config:            map[string]*tfbridge.SchemaInfo{},
		Resources:         resourceOverrides(),
		DataSources:       map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@muhlba91/pulumi-proxmoxve",
		},
		Python: &tfbridge.PythonInfo{
			PackageName:          "pulumi_proxmoxve",
			RespectSchemaVersion: true,
			PyProject:            struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				"github.com/pulumi/pulumi-proxmoxve/sdk/",
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			GenerateExtraInputTypes:        true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "ProxmoxVE",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "io.muehlbachler.pulumi",
			BuildFiles:  "gradle",
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(moduleComputeStrategy())
	prov.SetAutonaming(255, "-")

	return prov
}
