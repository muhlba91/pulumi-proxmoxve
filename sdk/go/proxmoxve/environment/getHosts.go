// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package environment

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupHosts(ctx *pulumi.Context, args *LookupHostsArgs, opts ...pulumi.InvokeOption) (*LookupHostsResult, error) {
	var rv LookupHostsResult
	err := ctx.Invoke("proxmoxve:Environment/getHosts:getHosts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHosts.
type LookupHostsArgs struct {
	NodeName string `pulumi:"nodeName"`
}

// A collection of values returned by getHosts.
type LookupHostsResult struct {
	Addresses []string        `pulumi:"addresses"`
	Digest    string          `pulumi:"digest"`
	Entries   []GetHostsEntry `pulumi:"entries"`
	Hostnames [][]string      `pulumi:"hostnames"`
	// The provider-assigned unique ID for this managed resource.
	Id       string `pulumi:"id"`
	NodeName string `pulumi:"nodeName"`
}

func LookupHostsOutput(ctx *pulumi.Context, args LookupHostsOutputArgs, opts ...pulumi.InvokeOption) LookupHostsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupHostsResult, error) {
			args := v.(LookupHostsArgs)
			r, err := LookupHosts(ctx, &args, opts...)
			return *r, err
		}).(LookupHostsResultOutput)
}

// A collection of arguments for invoking getHosts.
type LookupHostsOutputArgs struct {
	NodeName pulumi.StringInput `pulumi:"nodeName"`
}

func (LookupHostsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHostsArgs)(nil)).Elem()
}

// A collection of values returned by getHosts.
type LookupHostsResultOutput struct{ *pulumi.OutputState }

func (LookupHostsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHostsResult)(nil)).Elem()
}

func (o LookupHostsResultOutput) ToLookupHostsResultOutput() LookupHostsResultOutput {
	return o
}

func (o LookupHostsResultOutput) ToLookupHostsResultOutputWithContext(ctx context.Context) LookupHostsResultOutput {
	return o
}

func (o LookupHostsResultOutput) Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupHostsResult) []string { return v.Addresses }).(pulumi.StringArrayOutput)
}

func (o LookupHostsResultOutput) Digest() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHostsResult) string { return v.Digest }).(pulumi.StringOutput)
}

func (o LookupHostsResultOutput) Entries() GetHostsEntryArrayOutput {
	return o.ApplyT(func(v LookupHostsResult) []GetHostsEntry { return v.Entries }).(GetHostsEntryArrayOutput)
}

func (o LookupHostsResultOutput) Hostnames() pulumi.StringArrayArrayOutput {
	return o.ApplyT(func(v LookupHostsResult) [][]string { return v.Hostnames }).(pulumi.StringArrayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupHostsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHostsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupHostsResultOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHostsResult) string { return v.NodeName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHostsResultOutput{})
}
