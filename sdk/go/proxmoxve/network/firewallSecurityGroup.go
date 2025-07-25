// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A security group is a collection of rules, defined at cluster level, which can
// be used in all VMs' rules. For example, you can define a group named “webserver”
// with rules to open the http and https ports.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/network"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := network.NewFirewallSecurityGroup(ctx, "webserver", &network.FirewallSecurityGroupArgs{
//				Comment: pulumi.String("Managed by Pulumi"),
//				Rules: network.FirewallSecurityGroupRuleArray{
//					&network.FirewallSecurityGroupRuleArgs{
//						Action:  pulumi.String("ACCEPT"),
//						Comment: pulumi.String("Allow HTTP"),
//						Dest:    pulumi.String("192.168.1.5"),
//						Dport:   pulumi.String("80"),
//						Log:     pulumi.String("info"),
//						Proto:   pulumi.String("tcp"),
//						Type:    pulumi.String("in"),
//					},
//					&network.FirewallSecurityGroupRuleArgs{
//						Action:  pulumi.String("ACCEPT"),
//						Comment: pulumi.String("Allow HTTPS"),
//						Dest:    pulumi.String("192.168.1.5"),
//						Dport:   pulumi.String("443"),
//						Log:     pulumi.String("info"),
//						Proto:   pulumi.String("tcp"),
//						Type:    pulumi.String("in"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Instances can be imported using the `name`, e.g.,
//
// bash
//
// ```sh
// $ pulumi import proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup webserver webserver
// ```
type FirewallSecurityGroup struct {
	pulumi.CustomResourceState

	// Security group comment.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The ID of the container to manage the firewall for.
	ContainerId pulumi.IntPtrOutput `pulumi:"containerId"`
	// Security group name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the node.
	NodeName pulumi.StringPtrOutput `pulumi:"nodeName"`
	// Firewall rule block (multiple blocks supported).
	Rules FirewallSecurityGroupRuleArrayOutput `pulumi:"rules"`
	// The ID of the VM to manage the firewall for.
	VmId pulumi.IntPtrOutput `pulumi:"vmId"`
}

// NewFirewallSecurityGroup registers a new resource with the given unique name, arguments, and options.
func NewFirewallSecurityGroup(ctx *pulumi.Context,
	name string, args *FirewallSecurityGroupArgs, opts ...pulumi.ResourceOption) (*FirewallSecurityGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirewallSecurityGroup
	err := ctx.RegisterResource("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallSecurityGroup gets an existing FirewallSecurityGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallSecurityGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallSecurityGroupState, opts ...pulumi.ResourceOption) (*FirewallSecurityGroup, error) {
	var resource FirewallSecurityGroup
	err := ctx.ReadResource("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallSecurityGroup resources.
type firewallSecurityGroupState struct {
	// Security group comment.
	Comment *string `pulumi:"comment"`
	// The ID of the container to manage the firewall for.
	ContainerId *int `pulumi:"containerId"`
	// Security group name.
	Name *string `pulumi:"name"`
	// The name of the node.
	NodeName *string `pulumi:"nodeName"`
	// Firewall rule block (multiple blocks supported).
	Rules []FirewallSecurityGroupRule `pulumi:"rules"`
	// The ID of the VM to manage the firewall for.
	VmId *int `pulumi:"vmId"`
}

type FirewallSecurityGroupState struct {
	// Security group comment.
	Comment pulumi.StringPtrInput
	// The ID of the container to manage the firewall for.
	ContainerId pulumi.IntPtrInput
	// Security group name.
	Name pulumi.StringPtrInput
	// The name of the node.
	NodeName pulumi.StringPtrInput
	// Firewall rule block (multiple blocks supported).
	Rules FirewallSecurityGroupRuleArrayInput
	// The ID of the VM to manage the firewall for.
	VmId pulumi.IntPtrInput
}

func (FirewallSecurityGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallSecurityGroupState)(nil)).Elem()
}

type firewallSecurityGroupArgs struct {
	// Security group comment.
	Comment *string `pulumi:"comment"`
	// The ID of the container to manage the firewall for.
	ContainerId *int `pulumi:"containerId"`
	// Security group name.
	Name *string `pulumi:"name"`
	// The name of the node.
	NodeName *string `pulumi:"nodeName"`
	// Firewall rule block (multiple blocks supported).
	Rules []FirewallSecurityGroupRule `pulumi:"rules"`
	// The ID of the VM to manage the firewall for.
	VmId *int `pulumi:"vmId"`
}

// The set of arguments for constructing a FirewallSecurityGroup resource.
type FirewallSecurityGroupArgs struct {
	// Security group comment.
	Comment pulumi.StringPtrInput
	// The ID of the container to manage the firewall for.
	ContainerId pulumi.IntPtrInput
	// Security group name.
	Name pulumi.StringPtrInput
	// The name of the node.
	NodeName pulumi.StringPtrInput
	// Firewall rule block (multiple blocks supported).
	Rules FirewallSecurityGroupRuleArrayInput
	// The ID of the VM to manage the firewall for.
	VmId pulumi.IntPtrInput
}

func (FirewallSecurityGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallSecurityGroupArgs)(nil)).Elem()
}

type FirewallSecurityGroupInput interface {
	pulumi.Input

	ToFirewallSecurityGroupOutput() FirewallSecurityGroupOutput
	ToFirewallSecurityGroupOutputWithContext(ctx context.Context) FirewallSecurityGroupOutput
}

func (*FirewallSecurityGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallSecurityGroup)(nil)).Elem()
}

func (i *FirewallSecurityGroup) ToFirewallSecurityGroupOutput() FirewallSecurityGroupOutput {
	return i.ToFirewallSecurityGroupOutputWithContext(context.Background())
}

func (i *FirewallSecurityGroup) ToFirewallSecurityGroupOutputWithContext(ctx context.Context) FirewallSecurityGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallSecurityGroupOutput)
}

// FirewallSecurityGroupArrayInput is an input type that accepts FirewallSecurityGroupArray and FirewallSecurityGroupArrayOutput values.
// You can construct a concrete instance of `FirewallSecurityGroupArrayInput` via:
//
//	FirewallSecurityGroupArray{ FirewallSecurityGroupArgs{...} }
type FirewallSecurityGroupArrayInput interface {
	pulumi.Input

	ToFirewallSecurityGroupArrayOutput() FirewallSecurityGroupArrayOutput
	ToFirewallSecurityGroupArrayOutputWithContext(context.Context) FirewallSecurityGroupArrayOutput
}

type FirewallSecurityGroupArray []FirewallSecurityGroupInput

func (FirewallSecurityGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallSecurityGroup)(nil)).Elem()
}

func (i FirewallSecurityGroupArray) ToFirewallSecurityGroupArrayOutput() FirewallSecurityGroupArrayOutput {
	return i.ToFirewallSecurityGroupArrayOutputWithContext(context.Background())
}

func (i FirewallSecurityGroupArray) ToFirewallSecurityGroupArrayOutputWithContext(ctx context.Context) FirewallSecurityGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallSecurityGroupArrayOutput)
}

// FirewallSecurityGroupMapInput is an input type that accepts FirewallSecurityGroupMap and FirewallSecurityGroupMapOutput values.
// You can construct a concrete instance of `FirewallSecurityGroupMapInput` via:
//
//	FirewallSecurityGroupMap{ "key": FirewallSecurityGroupArgs{...} }
type FirewallSecurityGroupMapInput interface {
	pulumi.Input

	ToFirewallSecurityGroupMapOutput() FirewallSecurityGroupMapOutput
	ToFirewallSecurityGroupMapOutputWithContext(context.Context) FirewallSecurityGroupMapOutput
}

type FirewallSecurityGroupMap map[string]FirewallSecurityGroupInput

func (FirewallSecurityGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallSecurityGroup)(nil)).Elem()
}

func (i FirewallSecurityGroupMap) ToFirewallSecurityGroupMapOutput() FirewallSecurityGroupMapOutput {
	return i.ToFirewallSecurityGroupMapOutputWithContext(context.Background())
}

func (i FirewallSecurityGroupMap) ToFirewallSecurityGroupMapOutputWithContext(ctx context.Context) FirewallSecurityGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallSecurityGroupMapOutput)
}

type FirewallSecurityGroupOutput struct{ *pulumi.OutputState }

func (FirewallSecurityGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallSecurityGroup)(nil)).Elem()
}

func (o FirewallSecurityGroupOutput) ToFirewallSecurityGroupOutput() FirewallSecurityGroupOutput {
	return o
}

func (o FirewallSecurityGroupOutput) ToFirewallSecurityGroupOutputWithContext(ctx context.Context) FirewallSecurityGroupOutput {
	return o
}

// Security group comment.
func (o FirewallSecurityGroupOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The ID of the container to manage the firewall for.
func (o FirewallSecurityGroupOutput) ContainerId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) pulumi.IntPtrOutput { return v.ContainerId }).(pulumi.IntPtrOutput)
}

// Security group name.
func (o FirewallSecurityGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the node.
func (o FirewallSecurityGroupOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) pulumi.StringPtrOutput { return v.NodeName }).(pulumi.StringPtrOutput)
}

// Firewall rule block (multiple blocks supported).
func (o FirewallSecurityGroupOutput) Rules() FirewallSecurityGroupRuleArrayOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) FirewallSecurityGroupRuleArrayOutput { return v.Rules }).(FirewallSecurityGroupRuleArrayOutput)
}

// The ID of the VM to manage the firewall for.
func (o FirewallSecurityGroupOutput) VmId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallSecurityGroup) pulumi.IntPtrOutput { return v.VmId }).(pulumi.IntPtrOutput)
}

type FirewallSecurityGroupArrayOutput struct{ *pulumi.OutputState }

func (FirewallSecurityGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallSecurityGroup)(nil)).Elem()
}

func (o FirewallSecurityGroupArrayOutput) ToFirewallSecurityGroupArrayOutput() FirewallSecurityGroupArrayOutput {
	return o
}

func (o FirewallSecurityGroupArrayOutput) ToFirewallSecurityGroupArrayOutputWithContext(ctx context.Context) FirewallSecurityGroupArrayOutput {
	return o
}

func (o FirewallSecurityGroupArrayOutput) Index(i pulumi.IntInput) FirewallSecurityGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallSecurityGroup {
		return vs[0].([]*FirewallSecurityGroup)[vs[1].(int)]
	}).(FirewallSecurityGroupOutput)
}

type FirewallSecurityGroupMapOutput struct{ *pulumi.OutputState }

func (FirewallSecurityGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallSecurityGroup)(nil)).Elem()
}

func (o FirewallSecurityGroupMapOutput) ToFirewallSecurityGroupMapOutput() FirewallSecurityGroupMapOutput {
	return o
}

func (o FirewallSecurityGroupMapOutput) ToFirewallSecurityGroupMapOutputWithContext(ctx context.Context) FirewallSecurityGroupMapOutput {
	return o
}

func (o FirewallSecurityGroupMapOutput) MapIndex(k pulumi.StringInput) FirewallSecurityGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallSecurityGroup {
		return vs[0].(map[string]*FirewallSecurityGroup)[vs[1].(string)]
	}).(FirewallSecurityGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallSecurityGroupInput)(nil)).Elem(), &FirewallSecurityGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallSecurityGroupArrayInput)(nil)).Elem(), FirewallSecurityGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallSecurityGroupMapInput)(nil)).Elem(), FirewallSecurityGroupMap{})
	pulumi.RegisterOutputType(FirewallSecurityGroupOutput{})
	pulumi.RegisterOutputType(FirewallSecurityGroupArrayOutput{})
	pulumi.RegisterOutputType(FirewallSecurityGroupMapOutput{})
}
