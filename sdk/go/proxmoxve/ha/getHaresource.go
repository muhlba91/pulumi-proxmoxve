// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ha

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the list of High Availability resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/ha"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			all, err := ha.GetHAResources(ctx, &ha.GetHAResourcesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			example := "TODO: For expression"
//			ctx.Export("proxmoxVirtualEnvironmentHaresourcesFull", example)
//			return nil
//		})
//	}
//
// ```
func LookupHAResource(ctx *pulumi.Context, args *LookupHAResourceArgs, opts ...pulumi.InvokeOption) (*LookupHAResourceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHAResourceResult
	err := ctx.Invoke("proxmoxve:HA/getHAResource:getHAResource", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHAResource.
type LookupHAResourceArgs struct {
	// The identifier of the Proxmox HA resource to read.
	ResourceId string `pulumi:"resourceId"`
}

// A collection of values returned by getHAResource.
type LookupHAResourceResult struct {
	// The comment associated with this resource.
	Comment string `pulumi:"comment"`
	// The identifier of the High Availability group this resource is a member of.
	Group string `pulumi:"group"`
	// The unique identifier of this resource.
	Id string `pulumi:"id"`
	// The maximal number of relocation attempts.
	MaxRelocate int `pulumi:"maxRelocate"`
	// The maximal number of restart attempts.
	MaxRestart int `pulumi:"maxRestart"`
	// The identifier of the Proxmox HA resource to read.
	ResourceId string `pulumi:"resourceId"`
	// The desired state of the resource.
	State string `pulumi:"state"`
	// The type of High Availability resource (`vm` or `ct`).
	Type string `pulumi:"type"`
}

func LookupHAResourceOutput(ctx *pulumi.Context, args LookupHAResourceOutputArgs, opts ...pulumi.InvokeOption) LookupHAResourceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupHAResourceResultOutput, error) {
			args := v.(LookupHAResourceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("proxmoxve:HA/getHAResource:getHAResource", args, LookupHAResourceResultOutput{}, options).(LookupHAResourceResultOutput), nil
		}).(LookupHAResourceResultOutput)
}

// A collection of arguments for invoking getHAResource.
type LookupHAResourceOutputArgs struct {
	// The identifier of the Proxmox HA resource to read.
	ResourceId pulumi.StringInput `pulumi:"resourceId"`
}

func (LookupHAResourceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHAResourceArgs)(nil)).Elem()
}

// A collection of values returned by getHAResource.
type LookupHAResourceResultOutput struct{ *pulumi.OutputState }

func (LookupHAResourceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHAResourceResult)(nil)).Elem()
}

func (o LookupHAResourceResultOutput) ToLookupHAResourceResultOutput() LookupHAResourceResultOutput {
	return o
}

func (o LookupHAResourceResultOutput) ToLookupHAResourceResultOutputWithContext(ctx context.Context) LookupHAResourceResultOutput {
	return o
}

// The comment associated with this resource.
func (o LookupHAResourceResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The identifier of the High Availability group this resource is a member of.
func (o LookupHAResourceResultOutput) Group() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.Group }).(pulumi.StringOutput)
}

// The unique identifier of this resource.
func (o LookupHAResourceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The maximal number of relocation attempts.
func (o LookupHAResourceResultOutput) MaxRelocate() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHAResourceResult) int { return v.MaxRelocate }).(pulumi.IntOutput)
}

// The maximal number of restart attempts.
func (o LookupHAResourceResultOutput) MaxRestart() pulumi.IntOutput {
	return o.ApplyT(func(v LookupHAResourceResult) int { return v.MaxRestart }).(pulumi.IntOutput)
}

// The identifier of the Proxmox HA resource to read.
func (o LookupHAResourceResultOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.ResourceId }).(pulumi.StringOutput)
}

// The desired state of the resource.
func (o LookupHAResourceResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.State }).(pulumi.StringOutput)
}

// The type of High Availability resource (`vm` or `ct`).
func (o LookupHAResourceResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHAResourceResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHAResourceResultOutput{})
}
