// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// An IPSet allows us to group multiple IP addresses, IP subnets and aliases. Aliases can be
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
//			_, err := Network.NewFirewallIPSet(ctx, "ipset", &Network.FirewallIPSetArgs{
//				NodeName: pulumi.Any(proxmox_virtual_environment_vm.Example.Node_name),
//				VmId:     pulumi.Any(proxmox_virtual_environment_vm.Example.Vm_id),
//				Comment:  pulumi.String("Managed by Terraform"),
//				Cidrs: network.FirewallIPSetCidrArray{
//					&network.FirewallIPSetCidrArgs{
//						Name:    pulumi.String("192.168.0.0/23"),
//						Comment: pulumi.String("Local network 1"),
//					},
//					&network.FirewallIPSetCidrArgs{
//						Name:    pulumi.String("192.168.0.1"),
//						Comment: pulumi.String("Server 1"),
//						Nomatch: pulumi.Bool(true),
//					},
//					&network.FirewallIPSetCidrArgs{
//						Name:    pulumi.String("192.168.2.1"),
//						Comment: pulumi.String("Server 1"),
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				proxmox_virtual_environment_vm.Example,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type FirewallIPSet struct {
	pulumi.CustomResourceState

	// IP/CIDR block (multiple blocks supported).
	Cidrs FirewallIPSetCidrArrayOutput `pulumi:"cidrs"`
	// Arbitrary string annotation.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrOutput `pulumi:"containerId"`
	// Network/IP specification in CIDR format.
	Name pulumi.StringOutput `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrOutput `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrOutput `pulumi:"vmId"`
}

// NewFirewallIPSet registers a new resource with the given unique name, arguments, and options.
func NewFirewallIPSet(ctx *pulumi.Context,
	name string, args *FirewallIPSetArgs, opts ...pulumi.ResourceOption) (*FirewallIPSet, error) {
	if args == nil {
		args = &FirewallIPSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirewallIPSet
	err := ctx.RegisterResource("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallIPSet gets an existing FirewallIPSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallIPSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallIPSetState, opts ...pulumi.ResourceOption) (*FirewallIPSet, error) {
	var resource FirewallIPSet
	err := ctx.ReadResource("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallIPSet resources.
type firewallIPSetState struct {
	// IP/CIDR block (multiple blocks supported).
	Cidrs []FirewallIPSetCidr `pulumi:"cidrs"`
	// Arbitrary string annotation.
	Comment *string `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId *int `pulumi:"containerId"`
	// Network/IP specification in CIDR format.
	Name *string `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName *string `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId *int `pulumi:"vmId"`
}

type FirewallIPSetState struct {
	// IP/CIDR block (multiple blocks supported).
	Cidrs FirewallIPSetCidrArrayInput
	// Arbitrary string annotation.
	Comment pulumi.StringPtrInput
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrInput
	// Network/IP specification in CIDR format.
	Name pulumi.StringPtrInput
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrInput
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrInput
}

func (FirewallIPSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallIPSetState)(nil)).Elem()
}

type firewallIPSetArgs struct {
	// IP/CIDR block (multiple blocks supported).
	Cidrs []FirewallIPSetCidr `pulumi:"cidrs"`
	// Arbitrary string annotation.
	Comment *string `pulumi:"comment"`
	// Container ID. Leave empty for cluster level aliases.
	ContainerId *int `pulumi:"containerId"`
	// Network/IP specification in CIDR format.
	Name *string `pulumi:"name"`
	// Node name. Leave empty for cluster level aliases.
	NodeName *string `pulumi:"nodeName"`
	// VM ID. Leave empty for cluster level aliases.
	VmId *int `pulumi:"vmId"`
}

// The set of arguments for constructing a FirewallIPSet resource.
type FirewallIPSetArgs struct {
	// IP/CIDR block (multiple blocks supported).
	Cidrs FirewallIPSetCidrArrayInput
	// Arbitrary string annotation.
	Comment pulumi.StringPtrInput
	// Container ID. Leave empty for cluster level aliases.
	ContainerId pulumi.IntPtrInput
	// Network/IP specification in CIDR format.
	Name pulumi.StringPtrInput
	// Node name. Leave empty for cluster level aliases.
	NodeName pulumi.StringPtrInput
	// VM ID. Leave empty for cluster level aliases.
	VmId pulumi.IntPtrInput
}

func (FirewallIPSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallIPSetArgs)(nil)).Elem()
}

type FirewallIPSetInput interface {
	pulumi.Input

	ToFirewallIPSetOutput() FirewallIPSetOutput
	ToFirewallIPSetOutputWithContext(ctx context.Context) FirewallIPSetOutput
}

func (*FirewallIPSet) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallIPSet)(nil)).Elem()
}

func (i *FirewallIPSet) ToFirewallIPSetOutput() FirewallIPSetOutput {
	return i.ToFirewallIPSetOutputWithContext(context.Background())
}

func (i *FirewallIPSet) ToFirewallIPSetOutputWithContext(ctx context.Context) FirewallIPSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallIPSetOutput)
}

func (i *FirewallIPSet) ToOutput(ctx context.Context) pulumix.Output[*FirewallIPSet] {
	return pulumix.Output[*FirewallIPSet]{
		OutputState: i.ToFirewallIPSetOutputWithContext(ctx).OutputState,
	}
}

// FirewallIPSetArrayInput is an input type that accepts FirewallIPSetArray and FirewallIPSetArrayOutput values.
// You can construct a concrete instance of `FirewallIPSetArrayInput` via:
//
//	FirewallIPSetArray{ FirewallIPSetArgs{...} }
type FirewallIPSetArrayInput interface {
	pulumi.Input

	ToFirewallIPSetArrayOutput() FirewallIPSetArrayOutput
	ToFirewallIPSetArrayOutputWithContext(context.Context) FirewallIPSetArrayOutput
}

type FirewallIPSetArray []FirewallIPSetInput

func (FirewallIPSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallIPSet)(nil)).Elem()
}

func (i FirewallIPSetArray) ToFirewallIPSetArrayOutput() FirewallIPSetArrayOutput {
	return i.ToFirewallIPSetArrayOutputWithContext(context.Background())
}

func (i FirewallIPSetArray) ToFirewallIPSetArrayOutputWithContext(ctx context.Context) FirewallIPSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallIPSetArrayOutput)
}

func (i FirewallIPSetArray) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallIPSet] {
	return pulumix.Output[[]*FirewallIPSet]{
		OutputState: i.ToFirewallIPSetArrayOutputWithContext(ctx).OutputState,
	}
}

// FirewallIPSetMapInput is an input type that accepts FirewallIPSetMap and FirewallIPSetMapOutput values.
// You can construct a concrete instance of `FirewallIPSetMapInput` via:
//
//	FirewallIPSetMap{ "key": FirewallIPSetArgs{...} }
type FirewallIPSetMapInput interface {
	pulumi.Input

	ToFirewallIPSetMapOutput() FirewallIPSetMapOutput
	ToFirewallIPSetMapOutputWithContext(context.Context) FirewallIPSetMapOutput
}

type FirewallIPSetMap map[string]FirewallIPSetInput

func (FirewallIPSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallIPSet)(nil)).Elem()
}

func (i FirewallIPSetMap) ToFirewallIPSetMapOutput() FirewallIPSetMapOutput {
	return i.ToFirewallIPSetMapOutputWithContext(context.Background())
}

func (i FirewallIPSetMap) ToFirewallIPSetMapOutputWithContext(ctx context.Context) FirewallIPSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallIPSetMapOutput)
}

func (i FirewallIPSetMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallIPSet] {
	return pulumix.Output[map[string]*FirewallIPSet]{
		OutputState: i.ToFirewallIPSetMapOutputWithContext(ctx).OutputState,
	}
}

type FirewallIPSetOutput struct{ *pulumi.OutputState }

func (FirewallIPSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallIPSet)(nil)).Elem()
}

func (o FirewallIPSetOutput) ToFirewallIPSetOutput() FirewallIPSetOutput {
	return o
}

func (o FirewallIPSetOutput) ToFirewallIPSetOutputWithContext(ctx context.Context) FirewallIPSetOutput {
	return o
}

func (o FirewallIPSetOutput) ToOutput(ctx context.Context) pulumix.Output[*FirewallIPSet] {
	return pulumix.Output[*FirewallIPSet]{
		OutputState: o.OutputState,
	}
}

// IP/CIDR block (multiple blocks supported).
func (o FirewallIPSetOutput) Cidrs() FirewallIPSetCidrArrayOutput {
	return o.ApplyT(func(v *FirewallIPSet) FirewallIPSetCidrArrayOutput { return v.Cidrs }).(FirewallIPSetCidrArrayOutput)
}

// Arbitrary string annotation.
func (o FirewallIPSetOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallIPSet) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Container ID. Leave empty for cluster level aliases.
func (o FirewallIPSetOutput) ContainerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallIPSet) pulumi.IntPtrOutput { return v.ContainerId }).(pulumi.IntPtrOutput)
}

// Network/IP specification in CIDR format.
func (o FirewallIPSetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallIPSet) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Node name. Leave empty for cluster level aliases.
func (o FirewallIPSetOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallIPSet) pulumi.StringPtrOutput { return v.NodeName }).(pulumi.StringPtrOutput)
}

// VM ID. Leave empty for cluster level aliases.
func (o FirewallIPSetOutput) VmId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallIPSet) pulumi.IntPtrOutput { return v.VmId }).(pulumi.IntPtrOutput)
}

type FirewallIPSetArrayOutput struct{ *pulumi.OutputState }

func (FirewallIPSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallIPSet)(nil)).Elem()
}

func (o FirewallIPSetArrayOutput) ToFirewallIPSetArrayOutput() FirewallIPSetArrayOutput {
	return o
}

func (o FirewallIPSetArrayOutput) ToFirewallIPSetArrayOutputWithContext(ctx context.Context) FirewallIPSetArrayOutput {
	return o
}

func (o FirewallIPSetArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*FirewallIPSet] {
	return pulumix.Output[[]*FirewallIPSet]{
		OutputState: o.OutputState,
	}
}

func (o FirewallIPSetArrayOutput) Index(i pulumi.IntInput) FirewallIPSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallIPSet {
		return vs[0].([]*FirewallIPSet)[vs[1].(int)]
	}).(FirewallIPSetOutput)
}

type FirewallIPSetMapOutput struct{ *pulumi.OutputState }

func (FirewallIPSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallIPSet)(nil)).Elem()
}

func (o FirewallIPSetMapOutput) ToFirewallIPSetMapOutput() FirewallIPSetMapOutput {
	return o
}

func (o FirewallIPSetMapOutput) ToFirewallIPSetMapOutputWithContext(ctx context.Context) FirewallIPSetMapOutput {
	return o
}

func (o FirewallIPSetMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*FirewallIPSet] {
	return pulumix.Output[map[string]*FirewallIPSet]{
		OutputState: o.OutputState,
	}
}

func (o FirewallIPSetMapOutput) MapIndex(k pulumi.StringInput) FirewallIPSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallIPSet {
		return vs[0].(map[string]*FirewallIPSet)[vs[1].(string)]
	}).(FirewallIPSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallIPSetInput)(nil)).Elem(), &FirewallIPSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallIPSetArrayInput)(nil)).Elem(), FirewallIPSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallIPSetMapInput)(nil)).Elem(), FirewallIPSetMap{})
	pulumi.RegisterOutputType(FirewallIPSetOutput{})
	pulumi.RegisterOutputType(FirewallIPSetArrayOutput{})
	pulumi.RegisterOutputType(FirewallIPSetMapOutput{})
}
