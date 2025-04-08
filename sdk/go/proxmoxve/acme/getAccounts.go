// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package acme

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves the list of ACME accounts.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/acme"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := acme.GetAccounts(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dataProxmoxVirtualEnvironmentAcmeAccounts", example.Accounts)
//			return nil
//		})
//	}
//
// ```
func GetAccounts(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountsResult
	err := ctx.Invoke("proxmoxve:Acme/getAccounts:getAccounts", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	// The identifiers of the ACME accounts.
	Accounts []string `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetAccountsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetAccountsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetAccountsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("proxmoxve:Acme/getAccounts:getAccounts", nil, GetAccountsResultOutput{}, options).(GetAccountsResultOutput), nil
	}).(GetAccountsResultOutput)
}

// A collection of values returned by getAccounts.
type GetAccountsResultOutput struct{ *pulumi.OutputState }

func (GetAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsResult)(nil)).Elem()
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutput() GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutputWithContext(ctx context.Context) GetAccountsResultOutput {
	return o
}

// The identifiers of the ACME accounts.
func (o GetAccountsResultOutput) Accounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []string { return v.Accounts }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountsResultOutput{})
}
