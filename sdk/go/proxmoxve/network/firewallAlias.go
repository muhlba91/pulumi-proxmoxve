// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Aliases are used to see what devices or group of devices are affected by a rule.
// We can create aliases to identify an IP address or a network. Aliases can be
// created on the cluster level, on VM / Container level.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/Network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Network.NewFirewallAlias(ctx, "localNetwork", &Network.FirewallAliasArgs{
//				NodeName: pulumi.Any(proxmox_virtual_environment_vm.Example.Node_name),
//				VmId:     pulumi.Any(proxmox_virtual_environment_vm.Example.Vm_id),
//				Cidr:     pulumi.String("192.168.0.0/23"),
//				Comment:  pulumi.String("Managed by Terraform"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				proxmox_virtual_environment_vm.Example,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = Network.NewFirewallAlias(ctx, "ubuntuVm", &Network.FirewallAliasArgs{
//				Cidr:    pulumi.String("192.168.0.1"),
//				Comment: pulumi.String("Managed by Terraform"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type FirewallAlias struct {
	pulumi.CustomResourceState

	// Network/IP specification in CIDR format.
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// Alias comment.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrOutput `pulumi:"containerId"`
	// Alias name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrOutput `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrOutput `pulumi:"vmId"`
}

// NewFirewallAlias registers a new resource with the given unique name, arguments, and options.
func NewFirewallAlias(ctx *pulumi.Context,
	name string, args *FirewallAliasArgs, opts ...pulumi.ResourceOption) (*FirewallAlias, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cidr == nil {
		return nil, errors.New("invalid value for required argument 'Cidr'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirewallAlias
	err := ctx.RegisterResource("proxmoxve:Network/firewallAlias:FirewallAlias", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallAlias gets an existing FirewallAlias resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallAlias(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallAliasState, opts ...pulumi.ResourceOption) (*FirewallAlias, error) {
	var resource FirewallAlias
	err := ctx.ReadResource("proxmoxve:Network/firewallAlias:FirewallAlias", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallAlias resources.
type firewallAliasState struct {
	// Network/IP specification in CIDR format.
	Cidr *string `pulumi:"cidr"`
	// Alias comment.
	Comment *string `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId *int `pulumi:"containerId"`
	// Alias name.
	Name *string `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName *string `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId *int `pulumi:"vmId"`
}

type FirewallAliasState struct {
	// Network/IP specification in CIDR format.
	Cidr pulumi.StringPtrInput
	// Alias comment.
	Comment pulumi.StringPtrInput
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrInput
	// Alias name.
	Name pulumi.StringPtrInput
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrInput
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrInput
}

func (FirewallAliasState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallAliasState)(nil)).Elem()
}

type firewallAliasArgs struct {
	// Network/IP specification in CIDR format.
	Cidr string `pulumi:"cidr"`
	// Alias comment.
	Comment *string `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId *int `pulumi:"containerId"`
	// Alias name.
	Name *string `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName *string `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId *int `pulumi:"vmId"`
}

// The set of arguments for constructing a FirewallAlias resource.
type FirewallAliasArgs struct {
	// Network/IP specification in CIDR format.
	Cidr pulumi.StringInput
	// Alias comment.
	Comment pulumi.StringPtrInput
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrInput
	// Alias name.
	Name pulumi.StringPtrInput
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrInput
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrInput
}

func (FirewallAliasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallAliasArgs)(nil)).Elem()
}

type FirewallAliasInput interface {
	pulumi.Input

	ToFirewallAliasOutput() FirewallAliasOutput
	ToFirewallAliasOutputWithContext(ctx context.Context) FirewallAliasOutput
}

func (*FirewallAlias) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallAlias)(nil)).Elem()
}

func (i *FirewallAlias) ToFirewallAliasOutput() FirewallAliasOutput {
	return i.ToFirewallAliasOutputWithContext(context.Background())
}

func (i *FirewallAlias) ToFirewallAliasOutputWithContext(ctx context.Context) FirewallAliasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAliasOutput)
}

func (i *FirewallAlias) ToOutput(ctx context.Context) pulumix.Output[*FirewallAlias] {
	return pulumix.Output[*FirewallAlias]{
		OutputState: i.ToFirewallAliasOutputWithContext(ctx).OutputState,
	}
}

// FirewallAliasArrayInput is an input type that accepts FirewallAliasArray and FirewallAliasArrayOutput values.
// You can construct a concrete instance of `FirewallAliasArrayInput` via:
//
//	FirewallAliasArray{ FirewallAliasArgs{...} }
type FirewallAliasArrayInput interface {
	pulumi.Input

	ToFirewallAliasArrayOutput() FirewallAliasArrayOutput
	ToFirewallAliasArrayOutputWithContext(context.Context) FirewallAliasArrayOutput
}

type FirewallAliasArray []FirewallAliasInput

func (FirewallAliasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallAlias)(nil)).Elem()
}

func (i FirewallAliasArray) ToFirewallAliasArrayOutput() FirewallAliasArrayOutput {
	return i.ToFirewallAliasArrayOutputWithContext(context.Background())
}

func (i FirewallAliasArray) ToFirewallAliasArrayOutputWithContext(ctx context.Context) FirewallAliasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAliasArrayOutput)
}

func (i FirewallAliasArray) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallAlias] {
	return pulumix.Output[[]*FirewallAlias]{
		OutputState: i.ToFirewallAliasArrayOutputWithContext(ctx).OutputState,
	}
}

// FirewallAliasMapInput is an input type that accepts FirewallAliasMap and FirewallAliasMapOutput values.
// You can construct a concrete instance of `FirewallAliasMapInput` via:
//
//	FirewallAliasMap{ "key": FirewallAliasArgs{...} }
type FirewallAliasMapInput interface {
	pulumi.Input

	ToFirewallAliasMapOutput() FirewallAliasMapOutput
	ToFirewallAliasMapOutputWithContext(context.Context) FirewallAliasMapOutput
}

type FirewallAliasMap map[string]FirewallAliasInput

func (FirewallAliasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallAlias)(nil)).Elem()
}

func (i FirewallAliasMap) ToFirewallAliasMapOutput() FirewallAliasMapOutput {
	return i.ToFirewallAliasMapOutputWithContext(context.Background())
}

func (i FirewallAliasMap) ToFirewallAliasMapOutputWithContext(ctx context.Context) FirewallAliasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallAliasMapOutput)
}

func (i FirewallAliasMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallAlias] {
	return pulumix.Output[map[string]*FirewallAlias]{
		OutputState: i.ToFirewallAliasMapOutputWithContext(ctx).OutputState,
	}
}

type FirewallAliasOutput struct{ *pulumi.OutputState }

func (FirewallAliasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallAlias)(nil)).Elem()
}

func (o FirewallAliasOutput) ToFirewallAliasOutput() FirewallAliasOutput {
	return o
}

func (o FirewallAliasOutput) ToFirewallAliasOutputWithContext(ctx context.Context) FirewallAliasOutput {
	return o
}

func (o FirewallAliasOutput) ToOutput(ctx context.Context) pulumix.Output[*FirewallAlias] {
	return pulumix.Output[*FirewallAlias]{
		OutputState: o.OutputState,
	}
}

// Network/IP specification in CIDR format.
func (o FirewallAliasOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// Alias comment.
func (o FirewallAliasOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Container ID. Leave empty for cluster level aliases.
func (o FirewallAliasOutput) ContainerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.IntPtrOutput { return v.ContainerId }).(pulumi.IntPtrOutput)
}

// Alias name.
func (o FirewallAliasOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Node name. Leave empty for cluster level aliases.
func (o FirewallAliasOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.StringPtrOutput { return v.NodeName }).(pulumi.StringPtrOutput)
}

// VM ID. Leave empty for cluster level aliases.
func (o FirewallAliasOutput) VmId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallAlias) pulumi.IntPtrOutput { return v.VmId }).(pulumi.IntPtrOutput)
}

type FirewallAliasArrayOutput struct{ *pulumi.OutputState }

func (FirewallAliasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallAlias)(nil)).Elem()
}

func (o FirewallAliasArrayOutput) ToFirewallAliasArrayOutput() FirewallAliasArrayOutput {
	return o
}

func (o FirewallAliasArrayOutput) ToFirewallAliasArrayOutputWithContext(ctx context.Context) FirewallAliasArrayOutput {
	return o
}

func (o FirewallAliasArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallAlias] {
	return pulumix.Output[[]*FirewallAlias]{
		OutputState: o.OutputState,
	}
}

func (o FirewallAliasArrayOutput) Index(i pulumi.IntInput) FirewallAliasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallAlias {
		return vs[0].([]*FirewallAlias)[vs[1].(int)]
	}).(FirewallAliasOutput)
}

type FirewallAliasMapOutput struct{ *pulumi.OutputState }

func (FirewallAliasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallAlias)(nil)).Elem()
}

func (o FirewallAliasMapOutput) ToFirewallAliasMapOutput() FirewallAliasMapOutput {
	return o
}

func (o FirewallAliasMapOutput) ToFirewallAliasMapOutputWithContext(ctx context.Context) FirewallAliasMapOutput {
	return o
}

func (o FirewallAliasMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallAlias] {
	return pulumix.Output[map[string]*FirewallAlias]{
		OutputState: o.OutputState,
	}
}

func (o FirewallAliasMapOutput) MapIndex(k pulumi.StringInput) FirewallAliasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallAlias {
		return vs[0].(map[string]*FirewallAlias)[vs[1].(string)]
	}).(FirewallAliasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAliasInput)(nil)).Elem(), &FirewallAlias{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAliasArrayInput)(nil)).Elem(), FirewallAliasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallAliasMapInput)(nil)).Elem(), FirewallAliasMap{})
	pulumi.RegisterOutputType(FirewallAliasOutput{})
	pulumi.RegisterOutputType(FirewallAliasArrayOutput{})
	pulumi.RegisterOutputType(FirewallAliasMapOutput{})
}
