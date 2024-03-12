// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type HostsEntry struct {
	// The IP address.
	Address string `pulumi:"address"`
	// The hostnames.
	Hostnames []string `pulumi:"hostnames"`
}

// HostsEntryInput is an input type that accepts HostsEntryArgs and HostsEntryOutput values.
// You can construct a concrete instance of `HostsEntryInput` via:
//
//	HostsEntryArgs{...}
type HostsEntryInput interface {
	pulumi.Input

	ToHostsEntryOutput() HostsEntryOutput
	ToHostsEntryOutputWithContext(context.Context) HostsEntryOutput
}

type HostsEntryArgs struct {
	// The IP address.
	Address pulumi.StringInput `pulumi:"address"`
	// The hostnames.
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
//	HostsEntryArray{ HostsEntryArgs{...} }
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

// The IP address.
func (o HostsEntryOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v HostsEntry) string { return v.Address }).(pulumi.StringOutput)
}

// The hostnames.
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

type ProviderSsh struct {
	// Whether to use the SSH agent for authentication. Takes precedence over the `privateKey` and `password` fields. Defaults to the value of the `PROXMOX_VE_SSH_AGENT` environment variable, or `false` if not set.
	Agent *bool `pulumi:"agent"`
	// The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
	AgentSocket *string `pulumi:"agentSocket"`
	// Overrides for SSH connection configuration for a Proxmox VE node.
	Nodes []ProviderSshNode `pulumi:"nodes"`
	// The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
	Password *string `pulumi:"password"`
	// The unencrypted private key (in PEM format) used for the SSH connection. Defaults to the value of the `PROXMOX_VE_SSH_PRIVATE_KEY` environment variable.
	PrivateKey *string `pulumi:"privateKey"`
	// The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
	Socks5Password *string `pulumi:"socks5Password"`
	// The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
	Socks5Server *string `pulumi:"socks5Server"`
	// The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
	Socks5Username *string `pulumi:"socks5Username"`
	// The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
	Username *string `pulumi:"username"`
}

// ProviderSshInput is an input type that accepts ProviderSshArgs and ProviderSshOutput values.
// You can construct a concrete instance of `ProviderSshInput` via:
//
//	ProviderSshArgs{...}
type ProviderSshInput interface {
	pulumi.Input

	ToProviderSshOutput() ProviderSshOutput
	ToProviderSshOutputWithContext(context.Context) ProviderSshOutput
}

type ProviderSshArgs struct {
	// Whether to use the SSH agent for authentication. Takes precedence over the `privateKey` and `password` fields. Defaults to the value of the `PROXMOX_VE_SSH_AGENT` environment variable, or `false` if not set.
	Agent pulumi.BoolPtrInput `pulumi:"agent"`
	// The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
	AgentSocket pulumi.StringPtrInput `pulumi:"agentSocket"`
	// Overrides for SSH connection configuration for a Proxmox VE node.
	Nodes ProviderSshNodeArrayInput `pulumi:"nodes"`
	// The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
	Password pulumi.StringPtrInput `pulumi:"password"`
	// The unencrypted private key (in PEM format) used for the SSH connection. Defaults to the value of the `PROXMOX_VE_SSH_PRIVATE_KEY` environment variable.
	PrivateKey pulumi.StringPtrInput `pulumi:"privateKey"`
	// The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
	Socks5Password pulumi.StringPtrInput `pulumi:"socks5Password"`
	// The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
	Socks5Server pulumi.StringPtrInput `pulumi:"socks5Server"`
	// The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
	Socks5Username pulumi.StringPtrInput `pulumi:"socks5Username"`
	// The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
	Username pulumi.StringPtrInput `pulumi:"username"`
}

func (ProviderSshArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderSsh)(nil)).Elem()
}

func (i ProviderSshArgs) ToProviderSshOutput() ProviderSshOutput {
	return i.ToProviderSshOutputWithContext(context.Background())
}

func (i ProviderSshArgs) ToProviderSshOutputWithContext(ctx context.Context) ProviderSshOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderSshOutput)
}

func (i ProviderSshArgs) ToProviderSshPtrOutput() ProviderSshPtrOutput {
	return i.ToProviderSshPtrOutputWithContext(context.Background())
}

func (i ProviderSshArgs) ToProviderSshPtrOutputWithContext(ctx context.Context) ProviderSshPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderSshOutput).ToProviderSshPtrOutputWithContext(ctx)
}

// ProviderSshPtrInput is an input type that accepts ProviderSshArgs, ProviderSshPtr and ProviderSshPtrOutput values.
// You can construct a concrete instance of `ProviderSshPtrInput` via:
//
//	        ProviderSshArgs{...}
//
//	or:
//
//	        nil
type ProviderSshPtrInput interface {
	pulumi.Input

	ToProviderSshPtrOutput() ProviderSshPtrOutput
	ToProviderSshPtrOutputWithContext(context.Context) ProviderSshPtrOutput
}

type providerSshPtrType ProviderSshArgs

func ProviderSshPtr(v *ProviderSshArgs) ProviderSshPtrInput {
	return (*providerSshPtrType)(v)
}

func (*providerSshPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderSsh)(nil)).Elem()
}

func (i *providerSshPtrType) ToProviderSshPtrOutput() ProviderSshPtrOutput {
	return i.ToProviderSshPtrOutputWithContext(context.Background())
}

func (i *providerSshPtrType) ToProviderSshPtrOutputWithContext(ctx context.Context) ProviderSshPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderSshPtrOutput)
}

type ProviderSshOutput struct{ *pulumi.OutputState }

func (ProviderSshOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderSsh)(nil)).Elem()
}

func (o ProviderSshOutput) ToProviderSshOutput() ProviderSshOutput {
	return o
}

func (o ProviderSshOutput) ToProviderSshOutputWithContext(ctx context.Context) ProviderSshOutput {
	return o
}

func (o ProviderSshOutput) ToProviderSshPtrOutput() ProviderSshPtrOutput {
	return o.ToProviderSshPtrOutputWithContext(context.Background())
}

func (o ProviderSshOutput) ToProviderSshPtrOutputWithContext(ctx context.Context) ProviderSshPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProviderSsh) *ProviderSsh {
		return &v
	}).(ProviderSshPtrOutput)
}

// Whether to use the SSH agent for authentication. Takes precedence over the `privateKey` and `password` fields. Defaults to the value of the `PROXMOX_VE_SSH_AGENT` environment variable, or `false` if not set.
func (o ProviderSshOutput) Agent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *bool { return v.Agent }).(pulumi.BoolPtrOutput)
}

// The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
func (o ProviderSshOutput) AgentSocket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.AgentSocket }).(pulumi.StringPtrOutput)
}

// Overrides for SSH connection configuration for a Proxmox VE node.
func (o ProviderSshOutput) Nodes() ProviderSshNodeArrayOutput {
	return o.ApplyT(func(v ProviderSsh) []ProviderSshNode { return v.Nodes }).(ProviderSshNodeArrayOutput)
}

// The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
func (o ProviderSshOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.Password }).(pulumi.StringPtrOutput)
}

// The unencrypted private key (in PEM format) used for the SSH connection. Defaults to the value of the `PROXMOX_VE_SSH_PRIVATE_KEY` environment variable.
func (o ProviderSshOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
func (o ProviderSshOutput) Socks5Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.Socks5Password }).(pulumi.StringPtrOutput)
}

// The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
func (o ProviderSshOutput) Socks5Server() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.Socks5Server }).(pulumi.StringPtrOutput)
}

// The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
func (o ProviderSshOutput) Socks5Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.Socks5Username }).(pulumi.StringPtrOutput)
}

// The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
func (o ProviderSshOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v ProviderSsh) *string { return v.Username }).(pulumi.StringPtrOutput)
}

type ProviderSshPtrOutput struct{ *pulumi.OutputState }

func (ProviderSshPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProviderSsh)(nil)).Elem()
}

func (o ProviderSshPtrOutput) ToProviderSshPtrOutput() ProviderSshPtrOutput {
	return o
}

func (o ProviderSshPtrOutput) ToProviderSshPtrOutputWithContext(ctx context.Context) ProviderSshPtrOutput {
	return o
}

func (o ProviderSshPtrOutput) Elem() ProviderSshOutput {
	return o.ApplyT(func(v *ProviderSsh) ProviderSsh {
		if v != nil {
			return *v
		}
		var ret ProviderSsh
		return ret
	}).(ProviderSshOutput)
}

// Whether to use the SSH agent for authentication. Takes precedence over the `privateKey` and `password` fields. Defaults to the value of the `PROXMOX_VE_SSH_AGENT` environment variable, or `false` if not set.
func (o ProviderSshPtrOutput) Agent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *bool {
		if v == nil {
			return nil
		}
		return v.Agent
	}).(pulumi.BoolPtrOutput)
}

// The path to the SSH agent socket. Defaults to the value of the `SSH_AUTH_SOCK` environment variable.
func (o ProviderSshPtrOutput) AgentSocket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.AgentSocket
	}).(pulumi.StringPtrOutput)
}

// Overrides for SSH connection configuration for a Proxmox VE node.
func (o ProviderSshPtrOutput) Nodes() ProviderSshNodeArrayOutput {
	return o.ApplyT(func(v *ProviderSsh) []ProviderSshNode {
		if v == nil {
			return nil
		}
		return v.Nodes
	}).(ProviderSshNodeArrayOutput)
}

// The password used for the SSH connection. Defaults to the value of the `password` field of the `provider` block.
func (o ProviderSshPtrOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.Password
	}).(pulumi.StringPtrOutput)
}

// The unencrypted private key (in PEM format) used for the SSH connection. Defaults to the value of the `PROXMOX_VE_SSH_PRIVATE_KEY` environment variable.
func (o ProviderSshPtrOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.PrivateKey
	}).(pulumi.StringPtrOutput)
}

// The password for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_PASSWORD` environment variable.
func (o ProviderSshPtrOutput) Socks5Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.Socks5Password
	}).(pulumi.StringPtrOutput)
}

// The address:port of the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_SERVER` environment variable.
func (o ProviderSshPtrOutput) Socks5Server() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.Socks5Server
	}).(pulumi.StringPtrOutput)
}

// The username for the SOCKS5 proxy server. Defaults to the value of the `PROXMOX_VE_SSH_SOCKS5_USERNAME` environment variable.
func (o ProviderSshPtrOutput) Socks5Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.Socks5Username
	}).(pulumi.StringPtrOutput)
}

// The username used for the SSH connection. Defaults to the value of the `username` field of the `provider` block.
func (o ProviderSshPtrOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProviderSsh) *string {
		if v == nil {
			return nil
		}
		return v.Username
	}).(pulumi.StringPtrOutput)
}

type ProviderSshNode struct {
	// The address of the Proxmox VE node.
	Address string `pulumi:"address"`
	// The name of the Proxmox VE node.
	Name string `pulumi:"name"`
	// The port of the Proxmox VE node.
	Port *int `pulumi:"port"`
}

// ProviderSshNodeInput is an input type that accepts ProviderSshNodeArgs and ProviderSshNodeOutput values.
// You can construct a concrete instance of `ProviderSshNodeInput` via:
//
//	ProviderSshNodeArgs{...}
type ProviderSshNodeInput interface {
	pulumi.Input

	ToProviderSshNodeOutput() ProviderSshNodeOutput
	ToProviderSshNodeOutputWithContext(context.Context) ProviderSshNodeOutput
}

type ProviderSshNodeArgs struct {
	// The address of the Proxmox VE node.
	Address pulumi.StringInput `pulumi:"address"`
	// The name of the Proxmox VE node.
	Name pulumi.StringInput `pulumi:"name"`
	// The port of the Proxmox VE node.
	Port pulumi.IntPtrInput `pulumi:"port"`
}

func (ProviderSshNodeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderSshNode)(nil)).Elem()
}

func (i ProviderSshNodeArgs) ToProviderSshNodeOutput() ProviderSshNodeOutput {
	return i.ToProviderSshNodeOutputWithContext(context.Background())
}

func (i ProviderSshNodeArgs) ToProviderSshNodeOutputWithContext(ctx context.Context) ProviderSshNodeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderSshNodeOutput)
}

// ProviderSshNodeArrayInput is an input type that accepts ProviderSshNodeArray and ProviderSshNodeArrayOutput values.
// You can construct a concrete instance of `ProviderSshNodeArrayInput` via:
//
//	ProviderSshNodeArray{ ProviderSshNodeArgs{...} }
type ProviderSshNodeArrayInput interface {
	pulumi.Input

	ToProviderSshNodeArrayOutput() ProviderSshNodeArrayOutput
	ToProviderSshNodeArrayOutputWithContext(context.Context) ProviderSshNodeArrayOutput
}

type ProviderSshNodeArray []ProviderSshNodeInput

func (ProviderSshNodeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProviderSshNode)(nil)).Elem()
}

func (i ProviderSshNodeArray) ToProviderSshNodeArrayOutput() ProviderSshNodeArrayOutput {
	return i.ToProviderSshNodeArrayOutputWithContext(context.Background())
}

func (i ProviderSshNodeArray) ToProviderSshNodeArrayOutputWithContext(ctx context.Context) ProviderSshNodeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderSshNodeArrayOutput)
}

type ProviderSshNodeOutput struct{ *pulumi.OutputState }

func (ProviderSshNodeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderSshNode)(nil)).Elem()
}

func (o ProviderSshNodeOutput) ToProviderSshNodeOutput() ProviderSshNodeOutput {
	return o
}

func (o ProviderSshNodeOutput) ToProviderSshNodeOutputWithContext(ctx context.Context) ProviderSshNodeOutput {
	return o
}

// The address of the Proxmox VE node.
func (o ProviderSshNodeOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderSshNode) string { return v.Address }).(pulumi.StringOutput)
}

// The name of the Proxmox VE node.
func (o ProviderSshNodeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v ProviderSshNode) string { return v.Name }).(pulumi.StringOutput)
}

// The port of the Proxmox VE node.
func (o ProviderSshNodeOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v ProviderSshNode) *int { return v.Port }).(pulumi.IntPtrOutput)
}

type ProviderSshNodeArrayOutput struct{ *pulumi.OutputState }

func (ProviderSshNodeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProviderSshNode)(nil)).Elem()
}

func (o ProviderSshNodeArrayOutput) ToProviderSshNodeArrayOutput() ProviderSshNodeArrayOutput {
	return o
}

func (o ProviderSshNodeArrayOutput) ToProviderSshNodeArrayOutputWithContext(ctx context.Context) ProviderSshNodeArrayOutput {
	return o
}

func (o ProviderSshNodeArrayOutput) Index(i pulumi.IntInput) ProviderSshNodeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProviderSshNode {
		return vs[0].([]ProviderSshNode)[vs[1].(int)]
	}).(ProviderSshNodeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostsEntryInput)(nil)).Elem(), HostsEntryArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostsEntryArrayInput)(nil)).Elem(), HostsEntryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderSshInput)(nil)).Elem(), ProviderSshArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderSshPtrInput)(nil)).Elem(), ProviderSshArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderSshNodeInput)(nil)).Elem(), ProviderSshNodeArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderSshNodeArrayInput)(nil)).Elem(), ProviderSshNodeArray{})
	pulumi.RegisterOutputType(HostsEntryOutput{})
	pulumi.RegisterOutputType(HostsEntryArrayOutput{})
	pulumi.RegisterOutputType(ProviderSshOutput{})
	pulumi.RegisterOutputType(ProviderSshPtrOutput{})
	pulumi.RegisterOutputType(ProviderSshNodeOutput{})
	pulumi.RegisterOutputType(ProviderSshNodeArrayOutput{})
}
