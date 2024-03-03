// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves API version details.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := proxmoxve.GetVersion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dataProxmoxVirtualEnvironmentVersion", map[string]interface{}{
//				"release":       example.Release,
//				"repository_id": example.RepositoryId,
//				"version":       example.Version,
//			})
//			return nil
//		})
//	}
//
// ```
func GetVersion(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetVersionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVersionResult
	err := ctx.Invoke("proxmoxve:index/getVersion:getVersion", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getVersion.
type GetVersionResult struct {
	// Placeholder identifier attribute.
	Id string `pulumi:"id"`
	// The current Proxmox VE point release in `x.y` format.
	Release string `pulumi:"release"`
	// The short git revision from which this version was build.
	RepositoryId string `pulumi:"repositoryId"`
	// The full pve-manager package version of this node.
	Version string `pulumi:"version"`
}

func GetVersionOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetVersionResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetVersionResult, error) {
		r, err := GetVersion(ctx, opts...)
		var s GetVersionResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetVersionResultOutput)
}

// A collection of values returned by getVersion.
type GetVersionResultOutput struct{ *pulumi.OutputState }

func (GetVersionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVersionResult)(nil)).Elem()
}

func (o GetVersionResultOutput) ToGetVersionResultOutput() GetVersionResultOutput {
	return o
}

func (o GetVersionResultOutput) ToGetVersionResultOutputWithContext(ctx context.Context) GetVersionResultOutput {
	return o
}

// Placeholder identifier attribute.
func (o GetVersionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionResult) string { return v.Id }).(pulumi.StringOutput)
}

// The current Proxmox VE point release in `x.y` format.
func (o GetVersionResultOutput) Release() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionResult) string { return v.Release }).(pulumi.StringOutput)
}

// The short git revision from which this version was build.
func (o GetVersionResultOutput) RepositoryId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionResult) string { return v.RepositoryId }).(pulumi.StringOutput)
}

// The full pve-manager package version of this node.
func (o GetVersionResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVersionResultOutput{})
}
