// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "proxmoxve:Permission/group:Group":
		r = &Group{}
	case "proxmoxve:Permission/pool:Pool":
		r = &Pool{}
	case "proxmoxve:Permission/role:Role":
		r = &Role{}
	case "proxmoxve:Permission/user:User":
		r = &User{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := proxmoxve.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"Permission/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"Permission/pool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"Permission/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"Permission/user",
		&module{version},
	)
}
