// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package acme

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves a single ACME plugin by plugin ID name.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Acme"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := Acme.GetPlugin(ctx, &acme.GetPluginArgs{
//				Plugin: "standalone",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dataProxmoxVirtualEnvironmentAcmePlugin", example)
//			return nil
//		})
//	}
//
// ```
func GetPlugin(ctx *pulumi.Context, args *GetPluginArgs, opts ...pulumi.InvokeOption) (*GetPluginResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPluginResult
	err := ctx.Invoke("proxmoxve:Acme/getPlugin:getPlugin", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlugin.
type GetPluginArgs struct {
	// ACME Plugin ID name.
	Plugin string `pulumi:"plugin"`
}

// A collection of values returned by getPlugin.
type GetPluginResult struct {
	// API plugin name.
	Api string `pulumi:"api"`
	// DNS plugin data.
	Data map[string]string `pulumi:"data"`
	// Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
	Digest string `pulumi:"digest"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// ACME Plugin ID name.
	Plugin string `pulumi:"plugin"`
	// ACME challenge type (dns, standalone).
	Type string `pulumi:"type"`
	// Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
	ValidationDelay int `pulumi:"validationDelay"`
}

func GetPluginOutput(ctx *pulumi.Context, args GetPluginOutputArgs, opts ...pulumi.InvokeOption) GetPluginResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPluginResult, error) {
			args := v.(GetPluginArgs)
			r, err := GetPlugin(ctx, &args, opts...)
			var s GetPluginResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPluginResultOutput)
}

// A collection of arguments for invoking getPlugin.
type GetPluginOutputArgs struct {
	// ACME Plugin ID name.
	Plugin pulumi.StringInput `pulumi:"plugin"`
}

func (GetPluginOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginArgs)(nil)).Elem()
}

// A collection of values returned by getPlugin.
type GetPluginResultOutput struct{ *pulumi.OutputState }

func (GetPluginResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPluginResult)(nil)).Elem()
}

func (o GetPluginResultOutput) ToGetPluginResultOutput() GetPluginResultOutput {
	return o
}

func (o GetPluginResultOutput) ToGetPluginResultOutputWithContext(ctx context.Context) GetPluginResultOutput {
	return o
}

// API plugin name.
func (o GetPluginResultOutput) Api() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Api }).(pulumi.StringOutput)
}

// DNS plugin data.
func (o GetPluginResultOutput) Data() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetPluginResult) map[string]string { return v.Data }).(pulumi.StringMapOutput)
}

// Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
func (o GetPluginResultOutput) Digest() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Digest }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPluginResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Id }).(pulumi.StringOutput)
}

// ACME Plugin ID name.
func (o GetPluginResultOutput) Plugin() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Plugin }).(pulumi.StringOutput)
}

// ACME challenge type (dns, standalone).
func (o GetPluginResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetPluginResult) string { return v.Type }).(pulumi.StringOutput)
}

// Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
func (o GetPluginResultOutput) ValidationDelay() pulumi.IntOutput {
	return o.ApplyT(func(v GetPluginResult) int { return v.ValidationDelay }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPluginResultOutput{})
}
