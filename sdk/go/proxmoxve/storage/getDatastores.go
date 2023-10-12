// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Retrieves information about all the datastores available to a specific node.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/Storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Storage.GetDatastores(ctx, &storage.GetDatastoresArgs{
//				NodeName: "first-node",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDatastores(ctx *pulumi.Context, args *GetDatastoresArgs, opts ...pulumi.InvokeOption) (*GetDatastoresResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatastoresResult
	err := ctx.Invoke("proxmoxve:Storage/getDatastores:getDatastores", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatastores.
type GetDatastoresArgs struct {
	// A node name.
	NodeName string `pulumi:"nodeName"`
}

// A collection of values returned by getDatastores.
type GetDatastoresResult struct {
	// Whether the datastore is active.
	Actives []bool `pulumi:"actives"`
	// The allowed content types.
	ContentTypes [][]string `pulumi:"contentTypes"`
	// The datastore identifiers.
	DatastoreIds []string `pulumi:"datastoreIds"`
	// Whether the datastore is enabled.
	Enableds []bool `pulumi:"enableds"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	NodeName string `pulumi:"nodeName"`
	// Whether the datastore is shared.
	Shareds []bool `pulumi:"shareds"`
	// The available space in bytes.
	SpaceAvailables []int `pulumi:"spaceAvailables"`
	// The total space in bytes.
	SpaceTotals []int `pulumi:"spaceTotals"`
	// The used space in bytes.
	SpaceUseds []int `pulumi:"spaceUseds"`
	// The storage types.
	Types []string `pulumi:"types"`
}

func GetDatastoresOutput(ctx *pulumi.Context, args GetDatastoresOutputArgs, opts ...pulumi.InvokeOption) GetDatastoresResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDatastoresResult, error) {
			args := v.(GetDatastoresArgs)
			r, err := GetDatastores(ctx, &args, opts...)
			var s GetDatastoresResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDatastoresResultOutput)
}

// A collection of arguments for invoking getDatastores.
type GetDatastoresOutputArgs struct {
	// A node name.
	NodeName pulumi.StringInput `pulumi:"nodeName"`
}

func (GetDatastoresOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatastoresArgs)(nil)).Elem()
}

// A collection of values returned by getDatastores.
type GetDatastoresResultOutput struct{ *pulumi.OutputState }

func (GetDatastoresResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatastoresResult)(nil)).Elem()
}

func (o GetDatastoresResultOutput) ToGetDatastoresResultOutput() GetDatastoresResultOutput {
	return o
}

func (o GetDatastoresResultOutput) ToGetDatastoresResultOutputWithContext(ctx context.Context) GetDatastoresResultOutput {
	return o
}

func (o GetDatastoresResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDatastoresResult] {
	return pulumix.Output[GetDatastoresResult]{
		OutputState: o.OutputState,
	}
}

// Whether the datastore is active.
func (o GetDatastoresResultOutput) Actives() pulumi.BoolArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []bool { return v.Actives }).(pulumi.BoolArrayOutput)
}

// The allowed content types.
func (o GetDatastoresResultOutput) ContentTypes() pulumi.StringArrayArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) [][]string { return v.ContentTypes }).(pulumi.StringArrayArrayOutput)
}

// The datastore identifiers.
func (o GetDatastoresResultOutput) DatastoreIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []string { return v.DatastoreIds }).(pulumi.StringArrayOutput)
}

// Whether the datastore is enabled.
func (o GetDatastoresResultOutput) Enableds() pulumi.BoolArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []bool { return v.Enableds }).(pulumi.BoolArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatastoresResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatastoresResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDatastoresResultOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatastoresResult) string { return v.NodeName }).(pulumi.StringOutput)
}

// Whether the datastore is shared.
func (o GetDatastoresResultOutput) Shareds() pulumi.BoolArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []bool { return v.Shareds }).(pulumi.BoolArrayOutput)
}

// The available space in bytes.
func (o GetDatastoresResultOutput) SpaceAvailables() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []int { return v.SpaceAvailables }).(pulumi.IntArrayOutput)
}

// The total space in bytes.
func (o GetDatastoresResultOutput) SpaceTotals() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []int { return v.SpaceTotals }).(pulumi.IntArrayOutput)
}

// The used space in bytes.
func (o GetDatastoresResultOutput) SpaceUseds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []int { return v.SpaceUseds }).(pulumi.IntArrayOutput)
}

// The storage types.
func (o GetDatastoresResultOutput) Types() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDatastoresResult) []string { return v.Types }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatastoresResultOutput{})
}
