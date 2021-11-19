// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type HostsEntry struct {
	Address   string   `pulumi:"address"`
	Hostnames []string `pulumi:"hostnames"`
}

// HostsEntryInput is an input type that accepts HostsEntryArgs and HostsEntryOutput values.
// You can construct a concrete instance of `HostsEntryInput` via:
//
//          HostsEntryArgs{...}
type HostsEntryInput interface {
	pulumi.Input

	ToHostsEntryOutput() HostsEntryOutput
	ToHostsEntryOutputWithContext(context.Context) HostsEntryOutput
}

type HostsEntryArgs struct {
	Address   pulumi.StringInput      `pulumi:"address"`
	Hostnames pulumi.StringArrayInput `pulumi:"hostnames"`
}

func (HostsEntryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*HostsEntry)(nil)).Elem()
}

func (i HostsEntryArgs) ToHostsEntryOutput() HostsEntryOutput {
	return i.ToHostsEntryOutputWithContext(context.Background())
}

func (i HostsEntryArgs) ToHostsEntryOutputWithContext(ctx context.Context) HostsEntryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostsEntryOutput)
}

// HostsEntryArrayInput is an input type that accepts HostsEntryArray and HostsEntryArrayOutput values.
// You can construct a concrete instance of `HostsEntryArrayInput` via:
//
//          HostsEntryArray{ HostsEntryArgs{...} }
type HostsEntryArrayInput interface {
	pulumi.Input

	ToHostsEntryArrayOutput() HostsEntryArrayOutput
	ToHostsEntryArrayOutputWithContext(context.Context) HostsEntryArrayOutput
}

type HostsEntryArray []HostsEntryInput

func (HostsEntryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HostsEntry)(nil)).Elem()
}

func (i HostsEntryArray) ToHostsEntryArrayOutput() HostsEntryArrayOutput {
	return i.ToHostsEntryArrayOutputWithContext(context.Background())
}

func (i HostsEntryArray) ToHostsEntryArrayOutputWithContext(ctx context.Context) HostsEntryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostsEntryArrayOutput)
}

type HostsEntryOutput struct{ *pulumi.OutputState }

func (HostsEntryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*HostsEntry)(nil)).Elem()
}

func (o HostsEntryOutput) ToHostsEntryOutput() HostsEntryOutput {
	return o
}

func (o HostsEntryOutput) ToHostsEntryOutputWithContext(ctx context.Context) HostsEntryOutput {
	return o
}

func (o HostsEntryOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v HostsEntry) string { return v.Address }).(pulumi.StringOutput)
}

func (o HostsEntryOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v HostsEntry) []string { return v.Hostnames }).(pulumi.StringArrayOutput)
}

type HostsEntryArrayOutput struct{ *pulumi.OutputState }

func (HostsEntryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]HostsEntry)(nil)).Elem()
}

func (o HostsEntryArrayOutput) ToHostsEntryArrayOutput() HostsEntryArrayOutput {
	return o
}

func (o HostsEntryArrayOutput) ToHostsEntryArrayOutputWithContext(ctx context.Context) HostsEntryArrayOutput {
	return o
}

func (o HostsEntryArrayOutput) Index(i pulumi.IntInput) HostsEntryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) HostsEntry {
		return vs[0].([]HostsEntry)[vs[1].(int)]
	}).(HostsEntryOutput)
}

type ProviderVirtualEnvironment struct {
	Endpoint *string `pulumi:"endpoint"`
	Insecure *bool   `pulumi:"insecure"`
	Otp      *string `pulumi:"otp"`
	Password *string `pulumi:"password"`
	Username *string `pulumi:"username"`
}

// ProviderVirtualEnvironmentInput is an input type that accepts ProviderVirtualEnvironmentArgs and ProviderVirtualEnvironmentOutput values.
// You can construct a concrete instance of `ProviderVirtualEnvironmentInput` via:
//
//          ProviderVirtualEnvironmentArgs{...}
type ProviderVirtualEnvironmentInput interface {
	pulumi.Input

	ToProviderVirtualEnvironmentOutput() ProviderVirtualEnvironmentOutput
	ToProviderVirtualEnvironmentOutputWithContext(context.Context) ProviderVirtualEnvironmentOutput
}

type ProviderVirtualEnvironmentArgs struct {
	Endpoint pulumi.StringPtrInput `pulumi:"endpoint"`
	Insecure pulumi.BoolPtrInput   `pulumi:"insecure"`
	Otp      pulumi.StringPtrInput `pulumi:"otp"`
	Password pulumi.StringPtrInput `pulumi:"password"`
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (ProviderVirtualEnvironmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderVirtualEnvironment)(nil)).Elem()
}

func (i ProviderVirtualEnvironmentArgs) ToProviderVirtualEnvironmentOutput() ProviderVirtualEnvironmentOutput {
	return i.ToProviderVirtualEnvironmentOutputWithContext(context.Background())
}

func (i ProviderVirtualEnvironmentArgs) ToProviderVirtualEnvironmentOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderVirtualEnvironmentOutput)
}

func (i ProviderVirtualEnvironmentArgs) ToProviderVirtualEnvironmentPtrOutput() ProviderVirtualEnvironmentPtrOutput {
	return i.ToProviderVirtualEnvironmentPtrOutputWithContext(context.Background())
}

func (i ProviderVirtualEnvironmentArgs) ToProviderVirtualEnvironmentPtrOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderVirtualEnvironmentOutput).ToProviderVirtualEnvironmentPtrOutputWithContext(ctx)
}

// ProviderVirtualEnvironmentPtrInput is an input type that accepts ProviderVirtualEnvironmentArgs, ProviderVirtualEnvironmentPtr and ProviderVirtualEnvironmentPtrOutput values.
// You can construct a concrete instance of `ProviderVirtualEnvironmentPtrInput` via:
//
//          ProviderVirtualEnvironmentArgs{...}
//
//  or:
//
//          nil
type ProviderVirtualEnvironmentPtrInput interface {
	pulumi.Input

	ToProviderVirtualEnvironmentPtrOutput() ProviderVirtualEnvironmentPtrOutput
	ToProviderVirtualEnvironmentPtrOutputWithContext(context.Context) ProviderVirtualEnvironmentPtrOutput
}

type providerVirtualEnvironmentPtrType ProviderVirtualEnvironmentArgs

func ProviderVirtualEnvironmentPtr(v *ProviderVirtualEnvironmentArgs) ProviderVirtualEnvironmentPtrInput {
	return (*providerVirtualEnvironmentPtrType)(v)
}

func (*providerVirtualEnvironmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderVirtualEnvironment)(nil)).Elem()
}

func (i *providerVirtualEnvironmentPtrType) ToProviderVirtualEnvironmentPtrOutput() ProviderVirtualEnvironmentPtrOutput {
	return i.ToProviderVirtualEnvironmentPtrOutputWithContext(context.Background())
}

func (i *providerVirtualEnvironmentPtrType) ToProviderVirtualEnvironmentPtrOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderVirtualEnvironmentPtrOutput)
}

type ProviderVirtualEnvironmentOutput struct{ *pulumi.OutputState }

func (ProviderVirtualEnvironmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderVirtualEnvironment)(nil)).Elem()
}

func (o ProviderVirtualEnvironmentOutput) ToProviderVirtualEnvironmentOutput() ProviderVirtualEnvironmentOutput {
	return o
}

func (o ProviderVirtualEnvironmentOutput) ToProviderVirtualEnvironmentOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentOutput {
	return o
}

func (o ProviderVirtualEnvironmentOutput) ToProviderVirtualEnvironmentPtrOutput() ProviderVirtualEnvironmentPtrOutput {
	return o.ToProviderVirtualEnvironmentPtrOutputWithContext(context.Background())
}

func (o ProviderVirtualEnvironmentOutput) ToProviderVirtualEnvironmentPtrOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProviderVirtualEnvironment) *ProviderVirtualEnvironment {
		return &v
	}).(ProviderVirtualEnvironmentPtrOutput)
}

func (o ProviderVirtualEnvironmentOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderVirtualEnvironment) *string { return v.Endpoint }).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ProviderVirtualEnvironment) *bool { return v.Insecure }).(pulumi.BoolPtrOutput)
}

func (o ProviderVirtualEnvironmentOutput) Otp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderVirtualEnvironment) *string { return v.Otp }).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderVirtualEnvironment) *string { return v.Password }).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderVirtualEnvironment) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type ProviderVirtualEnvironmentPtrOutput struct{ *pulumi.OutputState }

func (ProviderVirtualEnvironmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderVirtualEnvironment)(nil)).Elem()
}

func (o ProviderVirtualEnvironmentPtrOutput) ToProviderVirtualEnvironmentPtrOutput() ProviderVirtualEnvironmentPtrOutput {
	return o
}

func (o ProviderVirtualEnvironmentPtrOutput) ToProviderVirtualEnvironmentPtrOutputWithContext(ctx context.Context) ProviderVirtualEnvironmentPtrOutput {
	return o
}

func (o ProviderVirtualEnvironmentPtrOutput) Elem() ProviderVirtualEnvironmentOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) ProviderVirtualEnvironment {
		if v != nil {
			return *v
		}
		var ret ProviderVirtualEnvironment
		return ret
	}).(ProviderVirtualEnvironmentOutput)
}

func (o ProviderVirtualEnvironmentPtrOutput) Endpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) *string {
		if v == nil {
			return nil
		}
		return v.Endpoint
	}).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentPtrOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) *bool {
		if v == nil {
			return nil
		}
		return v.Insecure
	}).(pulumi.BoolPtrOutput)
}

func (o ProviderVirtualEnvironmentPtrOutput) Otp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) *string {
		if v == nil {
			return nil
		}
		return v.Otp
	}).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentPtrOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) *string {
		if v == nil {
			return nil
		}
		return v.Password
	}).(pulumi.StringPtrOutput)
}

func (o ProviderVirtualEnvironmentPtrOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderVirtualEnvironment) *string {
		if v == nil {
			return nil
		}
		return v.Username
	}).(pulumi.StringPtrOutput)
}

type GetHostsEntry struct {
	Address   string   `pulumi:"address"`
	Hostnames []string `pulumi:"hostnames"`
}

// GetHostsEntryInput is an input type that accepts GetHostsEntryArgs and GetHostsEntryOutput values.
// You can construct a concrete instance of `GetHostsEntryInput` via:
//
//          GetHostsEntryArgs{...}
type GetHostsEntryInput interface {
	pulumi.Input

	ToGetHostsEntryOutput() GetHostsEntryOutput
	ToGetHostsEntryOutputWithContext(context.Context) GetHostsEntryOutput
}

type GetHostsEntryArgs struct {
	Address   pulumi.StringInput      `pulumi:"address"`
	Hostnames pulumi.StringArrayInput `pulumi:"hostnames"`
}

func (GetHostsEntryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsEntry)(nil)).Elem()
}

func (i GetHostsEntryArgs) ToGetHostsEntryOutput() GetHostsEntryOutput {
	return i.ToGetHostsEntryOutputWithContext(context.Background())
}

func (i GetHostsEntryArgs) ToGetHostsEntryOutputWithContext(ctx context.Context) GetHostsEntryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHostsEntryOutput)
}

// GetHostsEntryArrayInput is an input type that accepts GetHostsEntryArray and GetHostsEntryArrayOutput values.
// You can construct a concrete instance of `GetHostsEntryArrayInput` via:
//
//          GetHostsEntryArray{ GetHostsEntryArgs{...} }
type GetHostsEntryArrayInput interface {
	pulumi.Input

	ToGetHostsEntryArrayOutput() GetHostsEntryArrayOutput
	ToGetHostsEntryArrayOutputWithContext(context.Context) GetHostsEntryArrayOutput
}

type GetHostsEntryArray []GetHostsEntryInput

func (GetHostsEntryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHostsEntry)(nil)).Elem()
}

func (i GetHostsEntryArray) ToGetHostsEntryArrayOutput() GetHostsEntryArrayOutput {
	return i.ToGetHostsEntryArrayOutputWithContext(context.Background())
}

func (i GetHostsEntryArray) ToGetHostsEntryArrayOutputWithContext(ctx context.Context) GetHostsEntryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetHostsEntryArrayOutput)
}

type GetHostsEntryOutput struct{ *pulumi.OutputState }

func (GetHostsEntryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostsEntry)(nil)).Elem()
}

func (o GetHostsEntryOutput) ToGetHostsEntryOutput() GetHostsEntryOutput {
	return o
}

func (o GetHostsEntryOutput) ToGetHostsEntryOutputWithContext(ctx context.Context) GetHostsEntryOutput {
	return o
}

func (o GetHostsEntryOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostsEntry) string { return v.Address }).(pulumi.StringOutput)
}

func (o GetHostsEntryOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostsEntry) []string { return v.Hostnames }).(pulumi.StringArrayOutput)
}

type GetHostsEntryArrayOutput struct{ *pulumi.OutputState }

func (GetHostsEntryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetHostsEntry)(nil)).Elem()
}

func (o GetHostsEntryArrayOutput) ToGetHostsEntryArrayOutput() GetHostsEntryArrayOutput {
	return o
}

func (o GetHostsEntryArrayOutput) ToGetHostsEntryArrayOutputWithContext(ctx context.Context) GetHostsEntryArrayOutput {
	return o
}

func (o GetHostsEntryArrayOutput) Index(i pulumi.IntInput) GetHostsEntryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetHostsEntry {
		return vs[0].([]GetHostsEntry)[vs[1].(int)]
	}).(GetHostsEntryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostsEntryInput)(nil)).Elem(), HostsEntryArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostsEntryArrayInput)(nil)).Elem(), HostsEntryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderVirtualEnvironmentInput)(nil)).Elem(), ProviderVirtualEnvironmentArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderVirtualEnvironmentPtrInput)(nil)).Elem(), ProviderVirtualEnvironmentArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHostsEntryInput)(nil)).Elem(), GetHostsEntryArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetHostsEntryArrayInput)(nil)).Elem(), GetHostsEntryArray{})
	pulumi.RegisterOutputType(HostsEntryOutput{})
	pulumi.RegisterOutputType(HostsEntryArrayOutput{})
	pulumi.RegisterOutputType(ProviderVirtualEnvironmentOutput{})
	pulumi.RegisterOutputType(ProviderVirtualEnvironmentPtrOutput{})
	pulumi.RegisterOutputType(GetHostsEntryOutput{})
	pulumi.RegisterOutputType(GetHostsEntryArrayOutput{})
}
