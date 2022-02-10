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
	"github.com/bpg/terraform-provider-proxmox/proxmoxtf"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"path/filepath"
)

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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(proxmoxtf.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "proxmoxve",
		DisplayName:          "ProxmoxVE",
		Description:          "A Pulumi package for creating and managing Proxmox VE cloud resources.",
		Publisher:            "Daniel Muehlbachler-Pietrzykowski",
		Keywords:             []string{"pulumi", "proxmox", "proxmoxve"},
		License:              "Apache-2.0",
		Homepage:             "https://github.com/muhlba91/pulumi-proxmoxve",
		Repository:           "https://github.com/muhlba91/pulumi-proxmoxve",
		GitHubOrg:            "bpg",
		PluginDownloadURL:    "https://github.com/muhlba91/pulumi-proxmoxve/releases/download/v${VERSION}",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Cluster
			"proxmox_virtual_environment_cluster_alias": {Tok: tfbridge.MakeResource(mainPkg, clusterMod, "ClusterAlias")},
			"proxmox_virtual_environment_cluster_ipset": {Tok: tfbridge.MakeResource(mainPkg, clusterMod, "ClusterIPSet")},
			// VM/CT
			"proxmox_virtual_environment_vm":        {Tok: tfbridge.MakeResource(mainPkg, vmMod, "VirtualMachine")},
			"proxmox_virtual_environment_container": {Tok: tfbridge.MakeResource(mainPkg, containerMod, "Container")},
			// Storage
			"proxmox_virtual_environment_file": {Tok: tfbridge.MakeResource(mainPkg, storageMod, "File")},
			// Environment
			"proxmox_virtual_environment_dns":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DNS")},
			"proxmox_virtual_environment_certificate": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Certifi")},
			"proxmox_virtual_environment_hosts":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Hosts")},
			"proxmox_virtual_environment_time":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Time")},
			// Permission
			"proxmox_virtual_environment_user":  {Tok: tfbridge.MakeResource(mainPkg, permissionMod, "User")},
			"proxmox_virtual_environment_group": {Tok: tfbridge.MakeResource(mainPkg, permissionMod, "Group")},
			"proxmox_virtual_environment_pool":  {Tok: tfbridge.MakeResource(mainPkg, permissionMod, "Pool")},
			"proxmox_virtual_environment_role":  {Tok: tfbridge.MakeResource(mainPkg, permissionMod, "Role")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Cluster
			"proxmox_virtual_environment_cluster_alias":   {Tok: tfbridge.MakeDataSource(mainPkg, clusterMod, "getClusterAlias")},
			"proxmox_virtual_environment_cluster_aliases": {Tok: tfbridge.MakeDataSource(mainPkg, clusterMod, "getClusterAliases")},
			"proxmox_virtual_environment_nodes":           {Tok: tfbridge.MakeDataSource(mainPkg, clusterMod, "getNodes")},
			// Storage
			"proxmox_virtual_environment_datastores": {Tok: tfbridge.MakeDataSource(mainPkg, storageMod, "getDatastores")},
			// Environment
			"proxmox_virtual_environment_dns":     {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDNS")},
			"proxmox_virtual_environment_time":    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTime")},
			"proxmox_virtual_environment_hosts":   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getHosts")},
			"proxmox_virtual_environment_version": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getVersion")},
			// Permissions
			"proxmox_virtual_environment_users":  {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getUsers")},
			"proxmox_virtual_environment_user":   {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getUser")},
			"proxmox_virtual_environment_group":  {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getGroup")},
			"proxmox_virtual_environment_groups": {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getGroups")},
			"proxmox_virtual_environment_pool":   {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getPool")},
			"proxmox_virtual_environment_pools":  {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getPools")},
			"proxmox_virtual_environment_role":   {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getRole")},
			"proxmox_virtual_environment_roles":  {Tok: tfbridge.MakeDataSource(mainPkg, permissionMod, "getRoles")},
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
