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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/bpg/terraform-provider-proxmox/proxmoxtf"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "proxmoxve"
	// modules:
	mainMod       = "index" //nolint:deadcode,unused,varcheck
	vmMod         = "VM"
	containerMod  = "CT"
	clusterMod    = "Cluster"
	permissionMod = "Permission"
	storageMod    = "Storage"
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool { //nolint:deadcode,unused
	return &b
}

// stringValue gets a string value from a property map if present, else ""
func stringValue(vars resource.PropertyMap, prop resource.PropertyKey) string { //nolint:deadcode,unused
	val, ok := vars[prop]
	if ok && val.IsString() {
		return val.StringValue()
	}
	return ""
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"} //nolint:deadcode,unused,varcheck

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(proxmoxtf.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "proxmoxve",
		Description:          "A Pulumi package for creating and managing Proxmox VE cloud resources.",
		Keywords:             []string{"pulumi", "proxmox", "proxmoxve"},
		License:              "Apache-2.0",
		Homepage:             "https://github.com/muhlba91/pulumi-proxmoxve",
		Repository:           "https://github.com/muhlba91/pulumi-proxmoxve",
		GitHubOrg:            "bpg",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Cluster
			"proxmox_virtual_environment_cluster_alias": {Tok: makeResource(clusterMod, "ClusterAlias")},
			"proxmox_virtual_environment_cluster_ipset": {Tok: makeResource(clusterMod, "ClusterIPSet")},
			// VM/CT
			"proxmox_virtual_environment_vm":        {Tok: makeResource(vmMod, "VirtualMachine")},
			"proxmox_virtual_environment_container": {Tok: makeResource(containerMod, "Container")},
			// Storage
			"proxmox_virtual_environment_file": {Tok: makeResource(storageMod, "File")},
			// Environment
			"proxmox_virtual_environment_dns":         {Tok: makeResource(mainMod, "DNS")},
			"proxmox_virtual_environment_certificate": {Tok: makeResource(mainMod, "Certifi")},
			"proxmox_virtual_environment_hosts":       {Tok: makeResource(mainMod, "Hosts")},
			"proxmox_virtual_environment_time":        {Tok: makeResource(mainMod, "Time")},
			// Permission
			"proxmox_virtual_environment_user":  {Tok: makeResource(permissionMod, "User")},
			"proxmox_virtual_environment_group": {Tok: makeResource(permissionMod, "Group")},
			"proxmox_virtual_environment_pool":  {Tok: makeResource(permissionMod, "Pool")},
			"proxmox_virtual_environment_role":  {Tok: makeResource(permissionMod, "Role")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Cluster
			"proxmox_virtual_environment_cluster_alias":   {Tok: makeDataSource(clusterMod, "getClusterAlias")},
			"proxmox_virtual_environment_cluster_aliases": {Tok: makeDataSource(clusterMod, "getClusterAliases")},
			"proxmox_virtual_environment_nodes":           {Tok: makeDataSource(clusterMod, "getNodes")},
			// Storage
			"proxmox_virtual_environment_datastores": {Tok: makeDataSource(storageMod, "getDatastores")},
			// Environment
			"proxmox_virtual_environment_dns":     {Tok: makeDataSource(mainMod, "getDNS")},
			"proxmox_virtual_environment_time":    {Tok: makeDataSource(mainMod, "getTime")},
			"proxmox_virtual_environment_hosts":   {Tok: makeDataSource(mainMod, "getHosts")},
			"proxmox_virtual_environment_version": {Tok: makeDataSource(mainMod, "getVersion")},
			// Permissions
			"proxmox_virtual_environment_users":  {Tok: makeDataSource(permissionMod, "getUsers")},
			"proxmox_virtual_environment_user":   {Tok: makeDataSource(permissionMod, "getUser")},
			"proxmox_virtual_environment_group":  {Tok: makeDataSource(permissionMod, "getGroup")},
			"proxmox_virtual_environment_groups": {Tok: makeDataSource(permissionMod, "getGroups")},
			"proxmox_virtual_environment_pool":   {Tok: makeDataSource(permissionMod, "getPool")},
			"proxmox_virtual_environment_pools":  {Tok: makeDataSource(permissionMod, "getPools")},
			"proxmox_virtual_environment_role":   {Tok: makeDataSource(permissionMod, "getRole")},
			"proxmox_virtual_environment_roles":  {Tok: makeDataSource(permissionMod, "getRoles")},
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
	}

	prov.SetAutonaming(255, "-")

	return prov
}
