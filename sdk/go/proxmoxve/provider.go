// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the proxmox package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The API token for the Proxmox VE API.
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// The endpoint for the Proxmox VE API.
	Endpoint pulumi.StringPtrOutput `pulumi:"endpoint"`
	// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
	MinTls pulumi.StringPtrOutput `pulumi:"minTls"`
	// The one-time password for the Proxmox VE API.
	//
	// Deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.
	Otp pulumi.StringPtrOutput `pulumi:"otp"`
	// The password for the Proxmox VE API.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The alternative temporary directory.
	TmpDir pulumi.StringPtrOutput `pulumi:"tmpDir"`
	// The username for the Proxmox VE API.
	Username pulumi.StringPtrOutput `pulumi:"username"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiToken != nil {
		args.ApiToken = pulumi.ToSecret(args.ApiToken).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiToken",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:proxmoxve", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The API token for the Proxmox VE API.
	ApiToken *string `pulumi:"apiToken"`
	// The endpoint for the Proxmox VE API.
	Endpoint *string `pulumi:"endpoint"`
	// Whether to skip the TLS verification step.
	Insecure *bool `pulumi:"insecure"`
	// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
	MinTls *string `pulumi:"minTls"`
	// The one-time password for the Proxmox VE API.
	//
	// Deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.
	Otp *string `pulumi:"otp"`
	// The password for the Proxmox VE API.
	Password *string `pulumi:"password"`
	// The SSH configuration for the Proxmox nodes.
	Ssh *ProviderSsh `pulumi:"ssh"`
	// The alternative temporary directory.
	TmpDir *string `pulumi:"tmpDir"`
	// The username for the Proxmox VE API.
	Username *string `pulumi:"username"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The API token for the Proxmox VE API.
	ApiToken pulumi.StringPtrInput
	// The endpoint for the Proxmox VE API.
	Endpoint pulumi.StringPtrInput
	// Whether to skip the TLS verification step.
	Insecure pulumi.BoolPtrInput
	// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
	MinTls pulumi.StringPtrInput
	// The one-time password for the Proxmox VE API.
	//
	// Deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.
	Otp pulumi.StringPtrInput
	// The password for the Proxmox VE API.
	Password pulumi.StringPtrInput
	// The SSH configuration for the Proxmox nodes.
	Ssh ProviderSshPtrInput
	// The alternative temporary directory.
	TmpDir pulumi.StringPtrInput
	// The username for the Proxmox VE API.
	Username pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The API token for the Proxmox VE API.
func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// The endpoint for the Proxmox VE API.
func (o ProviderOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Endpoint }).(pulumi.StringPtrOutput)
}

// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
func (o ProviderOutput) MinTls() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.MinTls }).(pulumi.StringPtrOutput)
}

// The one-time password for the Proxmox VE API.
//
// Deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.
func (o ProviderOutput) Otp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Otp }).(pulumi.StringPtrOutput)
}

// The password for the Proxmox VE API.
func (o ProviderOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The alternative temporary directory.
func (o ProviderOutput) TmpDir() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.TmpDir }).(pulumi.StringPtrOutput)
}

// The username for the Proxmox VE API.
func (o ProviderOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
