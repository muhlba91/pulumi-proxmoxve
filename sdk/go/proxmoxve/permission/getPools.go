// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the identifiers for all the available resource pools.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/permission"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := permission.GetPools(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPools(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetPoolsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPoolsResult
	err := ctx.Invoke("proxmoxve:Permission/getPools:getPools", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getPools.
type GetPoolsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The pool identifiers.
	PoolIds []string `pulumi:"poolIds"`
}

func GetPoolsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetPoolsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetPoolsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("proxmoxve:Permission/getPools:getPools", nil, GetPoolsResultOutput{}, options).(GetPoolsResultOutput), nil
	}).(GetPoolsResultOutput)
}

// A collection of values returned by getPools.
type GetPoolsResultOutput struct{ *pulumi.OutputState }

func (GetPoolsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPoolsResult)(nil)).Elem()
}

func (o GetPoolsResultOutput) ToGetPoolsResultOutput() GetPoolsResultOutput {
	return o
}

func (o GetPoolsResultOutput) ToGetPoolsResultOutputWithContext(ctx context.Context) GetPoolsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPoolsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoolsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The pool identifiers.
func (o GetPoolsResultOutput) PoolIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPoolsResult) []string { return v.PoolIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPoolsResultOutput{})
}
