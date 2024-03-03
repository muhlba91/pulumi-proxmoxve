package shim

import (
	"github.com/bpg/terraform-provider-proxmox/fwprovider"
	tf "github.com/hashicorp/terraform-plugin-framework/provider"
	"github.com/muhlba91/pulumi-proxmoxve/provider/pkg/version"
)

func NewProvider() tf.Provider {
	return fwprovider.New(version.Version)()
}
