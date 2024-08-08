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
	_ "embed"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/bpg/terraform-provider-proxmox/fwprovider"
	"github.com/bpg/terraform-provider-proxmox/proxmoxtf/provider"
	"github.com/ettle/strcase"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
	pf "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

const (
	mainPkg       = "proxmoxve"
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

//go:embed cmd/pulumi-resource-proxmoxve/bridge-metadata.json
var metadata []byte

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
	"index/hagroup":     haMod,
	"index/hagroups":    haMod,
	"index/haresource":  haMod,
	"index/haresources": haMod,
}

// needed to keep backwards compatibility of resource naming
var nameNameOverrides = map[string]string{
	"network/linux/vlan":   "network_vlan",
	"network/linux/alias":  "network_alias",
	"network/linux/bridge": "network_bridge",
	"index/hagroup":        "h_a_group",
	"index/hagroups":       "h_a_groups",
	"index/haresource":     "h_a_resource",
	"index/haresources":    "h_a_resources",
}

func preConfigureCallback(_ resource.PropertyMap, _ shim.ResourceConfig) error {
	return nil
}

func convertName(tfname string) (module string, name string) {
	tfNameItems := strings.Split(strings.ReplaceAll(tfname, "proxmox_virtual_environment_", "proxmoxve_"), "_")

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

func Provider() tfbridge.ProviderInfo {
	p := pf.MuxShimWithPF(context.Background(), shimv2.NewProvider(provider.ProxmoxVirtualEnvironment()), fwprovider.New(version.Version)())

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
		Version:              version.Version,
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		MuxWith:              []tfbridge.MuxProvider{},
		MetadataInfo:         tfbridge.NewProviderMetadata(metadata),
		Resources: map[string]*tfbridge.ResourceInfo{
			// VM/CT
			"proxmox_virtual_environment_vm": {Tok: tfbridge.MakeResource(mainPkg, "VM", "VirtualMachine")},
			"proxmox_virtual_environment_vm2": {
				Tok: tfbridge.MakeResource(mainPkg, "VM", "VirtualMachine2"),
				ComputeID: func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
					const vm2ResourceIDPropertyKey = resource.PropertyKey("id")
					return resource.ID(state[vm2ResourceIDPropertyKey].V.(string)), nil
				},
			},
			"proxmox_virtual_environment_container": {
				Tok: tfbridge.MakeResource(mainPkg, "CT", "Container"),
				TransformOutputs: func(_ context.Context, rpm resource.PropertyMap) (resource.PropertyMap, error) {
					const containerResourceContainerFeaturesPropertyKey = resource.PropertyKey("features")
					if !rpm.HasValue(containerResourceContainerFeaturesPropertyKey) {
						rpm[containerResourceContainerFeaturesPropertyKey] = resource.NewPropertyValue(resource.NewPropertyValue(""))
					}
					return rpm, nil
				},
			},
			// Storage
			"proxmox_virtual_environment_file": {Tok: tfbridge.MakeResource(mainPkg, "Storage", "File")},
			// Environment
			"proxmox_virtual_environment_dns":         {Tok: tfbridge.MakeResource(mainPkg, "index", "DNS")},
			"proxmox_virtual_environment_certificate": {Tok: tfbridge.MakeResource(mainPkg, "index", "Certifi")},
			"proxmox_virtual_environment_hosts":       {Tok: tfbridge.MakeResource(mainPkg, "index", "Hosts")},
			"proxmox_virtual_environment_time":        {Tok: tfbridge.MakeResource(mainPkg, "index", "Time")},
			// Permission
			"proxmox_virtual_environment_user":  {Tok: tfbridge.MakeResource(mainPkg, "Permission", "User")},
			"proxmox_virtual_environment_group": {Tok: tfbridge.MakeResource(mainPkg, "Permission", "Group")},
			"proxmox_virtual_environment_pool":  {Tok: tfbridge.MakeResource(mainPkg, "Permission", "Pool")},
			"proxmox_virtual_environment_role":  {Tok: tfbridge.MakeResource(mainPkg, "Permission", "Role")},
			// Network
			"proxmox_virtual_environment_cluster_firewall":                {Tok: tfbridge.MakeResource(mainPkg, "Network", "Firewall")},
			"proxmox_virtual_environment_cluster_firewall_security_group": {Tok: tfbridge.MakeResource(mainPkg, "Network", "FirewallSecurityGroup")},
			"proxmox_virtual_environment_firewall_alias":                  {Tok: tfbridge.MakeResource(mainPkg, "Network", "FirewallAlias")},
			"proxmox_virtual_environment_firewall_ipset":                  {Tok: tfbridge.MakeResource(mainPkg, "Network", "FirewallIPSet")},
			"proxmox_virtual_environment_firewall_options":                {Tok: tfbridge.MakeResource(mainPkg, "Network", "FirewallOptions")},
			"proxmox_virtual_environment_firewall_rules":                  {Tok: tfbridge.MakeResource(mainPkg, "Network", "FirewallRules")},
			// ACME
			"proxmox_virtual_environment_acme_account": {
				Tok:       tfbridge.MakeResource(mainPkg, "index", "AcmeAccount"),
				ComputeID: tfbridge.DelegateIDField("name", "proxmoxve", "https://github.com/muhlba91/pulumi-proxmoxve"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Cluster
			"proxmox_virtual_environment_nodes": {Tok: tfbridge.MakeDataSource(mainPkg, "Cluster", "getNodes")},
			// VM/CT
			"proxmox_virtual_environment_vm":  {Tok: tfbridge.MakeDataSource(mainPkg, "VM", "getVirtualMachine")},
			"proxmox_virtual_environment_vms": {Tok: tfbridge.MakeDataSource(mainPkg, "VM", "getVirtualMachines")},
			// Storage
			"proxmox_virtual_environment_datastores": {Tok: tfbridge.MakeDataSource(mainPkg, "Storage", "getDatastores")},
			// Environment
			"proxmox_virtual_environment_dns":     {Tok: tfbridge.MakeDataSource(mainPkg, "Network", "getDNS")},
			"proxmox_virtual_environment_time":    {Tok: tfbridge.MakeDataSource(mainPkg, "Network", "getTime")},
			"proxmox_virtual_environment_hosts":   {Tok: tfbridge.MakeDataSource(mainPkg, "Network", "getHosts")},
			"proxmox_virtual_environment_version": {Tok: tfbridge.MakeDataSource(mainPkg, "Network", "getVersion")},
			// Permissions
			"proxmox_virtual_environment_user":   {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getUser")},
			"proxmox_virtual_environment_users":  {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getUsers")},
			"proxmox_virtual_environment_group":  {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getGroup")},
			"proxmox_virtual_environment_groups": {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getGroups")},
			"proxmox_virtual_environment_pool":   {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getPool")},
			"proxmox_virtual_environment_pools":  {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getPools")},
			"proxmox_virtual_environment_role":   {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getRole")},
			"proxmox_virtual_environment_roles":  {Tok: tfbridge.MakeDataSource(mainPkg, "Permission", "getRoles")},
		},
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
				fmt.Sprintf("github.com/muhlba91/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "ProxmoxVE",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "io.muehlbachler.pulumi",
		},
	}

	prov.MustComputeTokens(moduleComputeStrategy())
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}
