// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"fmt"

	"github.com/blang/semver"
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
	case "proxmoxve:index/certifi:Certifi":
		r = &Certifi{}
	case "proxmoxve:index/dNS:DNS":
		r = &DNS{}
	case "proxmoxve:index/hosts:Hosts":
		r = &Hosts{}
	case "proxmoxve:index/time:Time":
		r = &Time{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:proxmoxve" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"index/certifi",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"index/dNS",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"index/hosts",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"proxmoxve",
		"index/time",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"proxmoxve",
		&pkg{version},
	)
}