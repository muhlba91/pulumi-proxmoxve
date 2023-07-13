// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type FirewallIPSetCidr struct {
	Comment *string `pulumi:"comment"`
	Name    string  `pulumi:"name"`
	Nomatch *bool   `pulumi:"nomatch"`
}

// FirewallIPSetCidrInput is an input type that accepts FirewallIPSetCidrArgs and FirewallIPSetCidrOutput values.
// You can construct a concrete instance of `FirewallIPSetCidrInput` via:
//
//	FirewallIPSetCidrArgs{...}
type FirewallIPSetCidrInput interface {
	pulumi.Input

	ToFirewallIPSetCidrOutput() FirewallIPSetCidrOutput
	ToFirewallIPSetCidrOutputWithContext(context.Context) FirewallIPSetCidrOutput
}

type FirewallIPSetCidrArgs struct {
	Comment pulumi.StringPtrInput `pulumi:"comment"`
	Name    pulumi.StringInput    `pulumi:"name"`
	Nomatch pulumi.BoolPtrInput   `pulumi:"nomatch"`
}

func (FirewallIPSetCidrArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallIPSetCidr)(nil)).Elem()
}

func (i FirewallIPSetCidrArgs) ToFirewallIPSetCidrOutput() FirewallIPSetCidrOutput {
	return i.ToFirewallIPSetCidrOutputWithContext(context.Background())
}

func (i FirewallIPSetCidrArgs) ToFirewallIPSetCidrOutputWithContext(ctx context.Context) FirewallIPSetCidrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallIPSetCidrOutput)
}

// FirewallIPSetCidrArrayInput is an input type that accepts FirewallIPSetCidrArray and FirewallIPSetCidrArrayOutput values.
// You can construct a concrete instance of `FirewallIPSetCidrArrayInput` via:
//
//	FirewallIPSetCidrArray{ FirewallIPSetCidrArgs{...} }
type FirewallIPSetCidrArrayInput interface {
	pulumi.Input

	ToFirewallIPSetCidrArrayOutput() FirewallIPSetCidrArrayOutput
	ToFirewallIPSetCidrArrayOutputWithContext(context.Context) FirewallIPSetCidrArrayOutput
}

type FirewallIPSetCidrArray []FirewallIPSetCidrInput

func (FirewallIPSetCidrArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallIPSetCidr)(nil)).Elem()
}

func (i FirewallIPSetCidrArray) ToFirewallIPSetCidrArrayOutput() FirewallIPSetCidrArrayOutput {
	return i.ToFirewallIPSetCidrArrayOutputWithContext(context.Background())
}

func (i FirewallIPSetCidrArray) ToFirewallIPSetCidrArrayOutputWithContext(ctx context.Context) FirewallIPSetCidrArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallIPSetCidrArrayOutput)
}

type FirewallIPSetCidrOutput struct{ *pulumi.OutputState }

func (FirewallIPSetCidrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallIPSetCidr)(nil)).Elem()
}

func (o FirewallIPSetCidrOutput) ToFirewallIPSetCidrOutput() FirewallIPSetCidrOutput {
	return o
}

func (o FirewallIPSetCidrOutput) ToFirewallIPSetCidrOutputWithContext(ctx context.Context) FirewallIPSetCidrOutput {
	return o
}

func (o FirewallIPSetCidrOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallIPSetCidr) *string { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o FirewallIPSetCidrOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v FirewallIPSetCidr) string { return v.Name }).(pulumi.StringOutput)
}

func (o FirewallIPSetCidrOutput) Nomatch() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FirewallIPSetCidr) *bool { return v.Nomatch }).(pulumi.BoolPtrOutput)
}

type FirewallIPSetCidrArrayOutput struct{ *pulumi.OutputState }

func (FirewallIPSetCidrArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallIPSetCidr)(nil)).Elem()
}

func (o FirewallIPSetCidrArrayOutput) ToFirewallIPSetCidrArrayOutput() FirewallIPSetCidrArrayOutput {
	return o
}

func (o FirewallIPSetCidrArrayOutput) ToFirewallIPSetCidrArrayOutputWithContext(ctx context.Context) FirewallIPSetCidrArrayOutput {
	return o
}

func (o FirewallIPSetCidrArrayOutput) Index(i pulumi.IntInput) FirewallIPSetCidrOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) FirewallIPSetCidr {
		return vs[0].([]FirewallIPSetCidr)[vs[1].(int)]
	}).(FirewallIPSetCidrOutput)
}

type FirewallLogRatelimit struct {
	Burst   *int    `pulumi:"burst"`
	Enabled *bool   `pulumi:"enabled"`
	Rate    *string `pulumi:"rate"`
}

// FirewallLogRatelimitInput is an input type that accepts FirewallLogRatelimitArgs and FirewallLogRatelimitOutput values.
// You can construct a concrete instance of `FirewallLogRatelimitInput` via:
//
//	FirewallLogRatelimitArgs{...}
type FirewallLogRatelimitInput interface {
	pulumi.Input

	ToFirewallLogRatelimitOutput() FirewallLogRatelimitOutput
	ToFirewallLogRatelimitOutputWithContext(context.Context) FirewallLogRatelimitOutput
}

type FirewallLogRatelimitArgs struct {
	Burst   pulumi.IntPtrInput    `pulumi:"burst"`
	Enabled pulumi.BoolPtrInput   `pulumi:"enabled"`
	Rate    pulumi.StringPtrInput `pulumi:"rate"`
}

func (FirewallLogRatelimitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallLogRatelimit)(nil)).Elem()
}

func (i FirewallLogRatelimitArgs) ToFirewallLogRatelimitOutput() FirewallLogRatelimitOutput {
	return i.ToFirewallLogRatelimitOutputWithContext(context.Background())
}

func (i FirewallLogRatelimitArgs) ToFirewallLogRatelimitOutputWithContext(ctx context.Context) FirewallLogRatelimitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallLogRatelimitOutput)
}

func (i FirewallLogRatelimitArgs) ToFirewallLogRatelimitPtrOutput() FirewallLogRatelimitPtrOutput {
	return i.ToFirewallLogRatelimitPtrOutputWithContext(context.Background())
}

func (i FirewallLogRatelimitArgs) ToFirewallLogRatelimitPtrOutputWithContext(ctx context.Context) FirewallLogRatelimitPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallLogRatelimitOutput).ToFirewallLogRatelimitPtrOutputWithContext(ctx)
}

// FirewallLogRatelimitPtrInput is an input type that accepts FirewallLogRatelimitArgs, FirewallLogRatelimitPtr and FirewallLogRatelimitPtrOutput values.
// You can construct a concrete instance of `FirewallLogRatelimitPtrInput` via:
//
//	        FirewallLogRatelimitArgs{...}
//
//	or:
//
//	        nil
type FirewallLogRatelimitPtrInput interface {
	pulumi.Input

	ToFirewallLogRatelimitPtrOutput() FirewallLogRatelimitPtrOutput
	ToFirewallLogRatelimitPtrOutputWithContext(context.Context) FirewallLogRatelimitPtrOutput
}

type firewallLogRatelimitPtrType FirewallLogRatelimitArgs

func FirewallLogRatelimitPtr(v *FirewallLogRatelimitArgs) FirewallLogRatelimitPtrInput {
	return (*firewallLogRatelimitPtrType)(v)
}

func (*firewallLogRatelimitPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallLogRatelimit)(nil)).Elem()
}

func (i *firewallLogRatelimitPtrType) ToFirewallLogRatelimitPtrOutput() FirewallLogRatelimitPtrOutput {
	return i.ToFirewallLogRatelimitPtrOutputWithContext(context.Background())
}

func (i *firewallLogRatelimitPtrType) ToFirewallLogRatelimitPtrOutputWithContext(ctx context.Context) FirewallLogRatelimitPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallLogRatelimitPtrOutput)
}

type FirewallLogRatelimitOutput struct{ *pulumi.OutputState }

func (FirewallLogRatelimitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallLogRatelimit)(nil)).Elem()
}

func (o FirewallLogRatelimitOutput) ToFirewallLogRatelimitOutput() FirewallLogRatelimitOutput {
	return o
}

func (o FirewallLogRatelimitOutput) ToFirewallLogRatelimitOutputWithContext(ctx context.Context) FirewallLogRatelimitOutput {
	return o
}

func (o FirewallLogRatelimitOutput) ToFirewallLogRatelimitPtrOutput() FirewallLogRatelimitPtrOutput {
	return o.ToFirewallLogRatelimitPtrOutputWithContext(context.Background())
}

func (o FirewallLogRatelimitOutput) ToFirewallLogRatelimitPtrOutputWithContext(ctx context.Context) FirewallLogRatelimitPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v FirewallLogRatelimit) *FirewallLogRatelimit {
		return &v
	}).(FirewallLogRatelimitPtrOutput)
}

func (o FirewallLogRatelimitOutput) Burst() pulumi.IntPtrOutput {
	return o.ApplyT(func(v FirewallLogRatelimit) *int { return v.Burst }).(pulumi.IntPtrOutput)
}

func (o FirewallLogRatelimitOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FirewallLogRatelimit) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

func (o FirewallLogRatelimitOutput) Rate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallLogRatelimit) *string { return v.Rate }).(pulumi.StringPtrOutput)
}

type FirewallLogRatelimitPtrOutput struct{ *pulumi.OutputState }

func (FirewallLogRatelimitPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallLogRatelimit)(nil)).Elem()
}

func (o FirewallLogRatelimitPtrOutput) ToFirewallLogRatelimitPtrOutput() FirewallLogRatelimitPtrOutput {
	return o
}

func (o FirewallLogRatelimitPtrOutput) ToFirewallLogRatelimitPtrOutputWithContext(ctx context.Context) FirewallLogRatelimitPtrOutput {
	return o
}

func (o FirewallLogRatelimitPtrOutput) Elem() FirewallLogRatelimitOutput {
	return o.ApplyT(func(v *FirewallLogRatelimit) FirewallLogRatelimit {
		if v != nil {
			return *v
		}
		var ret FirewallLogRatelimit
		return ret
	}).(FirewallLogRatelimitOutput)
}

func (o FirewallLogRatelimitPtrOutput) Burst() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallLogRatelimit) *int {
		if v == nil {
			return nil
		}
		return v.Burst
	}).(pulumi.IntPtrOutput)
}

func (o FirewallLogRatelimitPtrOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FirewallLogRatelimit) *bool {
		if v == nil {
			return nil
		}
		return v.Enabled
	}).(pulumi.BoolPtrOutput)
}

func (o FirewallLogRatelimitPtrOutput) Rate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallLogRatelimit) *string {
		if v == nil {
			return nil
		}
		return v.Rate
	}).(pulumi.StringPtrOutput)
}

type FirewallRulesRule struct {
	Action        *string `pulumi:"action"`
	Comment       *string `pulumi:"comment"`
	Dest          *string `pulumi:"dest"`
	Dport         *string `pulumi:"dport"`
	Enabled       *bool   `pulumi:"enabled"`
	Iface         *string `pulumi:"iface"`
	Log           *string `pulumi:"log"`
	Macro         *string `pulumi:"macro"`
	Pos           *int    `pulumi:"pos"`
	Proto         *string `pulumi:"proto"`
	SecurityGroup *string `pulumi:"securityGroup"`
	Source        *string `pulumi:"source"`
	Sport         *string `pulumi:"sport"`
	Type          *string `pulumi:"type"`
}

// FirewallRulesRuleInput is an input type that accepts FirewallRulesRuleArgs and FirewallRulesRuleOutput values.
// You can construct a concrete instance of `FirewallRulesRuleInput` via:
//
//	FirewallRulesRuleArgs{...}
type FirewallRulesRuleInput interface {
	pulumi.Input

	ToFirewallRulesRuleOutput() FirewallRulesRuleOutput
	ToFirewallRulesRuleOutputWithContext(context.Context) FirewallRulesRuleOutput
}

type FirewallRulesRuleArgs struct {
	Action        pulumi.StringPtrInput `pulumi:"action"`
	Comment       pulumi.StringPtrInput `pulumi:"comment"`
	Dest          pulumi.StringPtrInput `pulumi:"dest"`
	Dport         pulumi.StringPtrInput `pulumi:"dport"`
	Enabled       pulumi.BoolPtrInput   `pulumi:"enabled"`
	Iface         pulumi.StringPtrInput `pulumi:"iface"`
	Log           pulumi.StringPtrInput `pulumi:"log"`
	Macro         pulumi.StringPtrInput `pulumi:"macro"`
	Pos           pulumi.IntPtrInput    `pulumi:"pos"`
	Proto         pulumi.StringPtrInput `pulumi:"proto"`
	SecurityGroup pulumi.StringPtrInput `pulumi:"securityGroup"`
	Source        pulumi.StringPtrInput `pulumi:"source"`
	Sport         pulumi.StringPtrInput `pulumi:"sport"`
	Type          pulumi.StringPtrInput `pulumi:"type"`
}

func (FirewallRulesRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallRulesRule)(nil)).Elem()
}

func (i FirewallRulesRuleArgs) ToFirewallRulesRuleOutput() FirewallRulesRuleOutput {
	return i.ToFirewallRulesRuleOutputWithContext(context.Background())
}

func (i FirewallRulesRuleArgs) ToFirewallRulesRuleOutputWithContext(ctx context.Context) FirewallRulesRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallRulesRuleOutput)
}

// FirewallRulesRuleArrayInput is an input type that accepts FirewallRulesRuleArray and FirewallRulesRuleArrayOutput values.
// You can construct a concrete instance of `FirewallRulesRuleArrayInput` via:
//
//	FirewallRulesRuleArray{ FirewallRulesRuleArgs{...} }
type FirewallRulesRuleArrayInput interface {
	pulumi.Input

	ToFirewallRulesRuleArrayOutput() FirewallRulesRuleArrayOutput
	ToFirewallRulesRuleArrayOutputWithContext(context.Context) FirewallRulesRuleArrayOutput
}

type FirewallRulesRuleArray []FirewallRulesRuleInput

func (FirewallRulesRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallRulesRule)(nil)).Elem()
}

func (i FirewallRulesRuleArray) ToFirewallRulesRuleArrayOutput() FirewallRulesRuleArrayOutput {
	return i.ToFirewallRulesRuleArrayOutputWithContext(context.Background())
}

func (i FirewallRulesRuleArray) ToFirewallRulesRuleArrayOutputWithContext(ctx context.Context) FirewallRulesRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallRulesRuleArrayOutput)
}

type FirewallRulesRuleOutput struct{ *pulumi.OutputState }

func (FirewallRulesRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallRulesRule)(nil)).Elem()
}

func (o FirewallRulesRuleOutput) ToFirewallRulesRuleOutput() FirewallRulesRuleOutput {
	return o
}

func (o FirewallRulesRuleOutput) ToFirewallRulesRuleOutputWithContext(ctx context.Context) FirewallRulesRuleOutput {
	return o
}

func (o FirewallRulesRuleOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Action }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Dest() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Dest }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Dport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Dport }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

func (o FirewallRulesRuleOutput) Iface() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Iface }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Log() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Log }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Macro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Macro }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Pos() pulumi.IntPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *int { return v.Pos }).(pulumi.IntPtrOutput)
}

func (o FirewallRulesRuleOutput) Proto() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Proto }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) SecurityGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.SecurityGroup }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Source }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Sport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Sport }).(pulumi.StringPtrOutput)
}

func (o FirewallRulesRuleOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallRulesRule) *string { return v.Type }).(pulumi.StringPtrOutput)
}

type FirewallRulesRuleArrayOutput struct{ *pulumi.OutputState }

func (FirewallRulesRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallRulesRule)(nil)).Elem()
}

func (o FirewallRulesRuleArrayOutput) ToFirewallRulesRuleArrayOutput() FirewallRulesRuleArrayOutput {
	return o
}

func (o FirewallRulesRuleArrayOutput) ToFirewallRulesRuleArrayOutputWithContext(ctx context.Context) FirewallRulesRuleArrayOutput {
	return o
}

func (o FirewallRulesRuleArrayOutput) Index(i pulumi.IntInput) FirewallRulesRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) FirewallRulesRule {
		return vs[0].([]FirewallRulesRule)[vs[1].(int)]
	}).(FirewallRulesRuleOutput)
}

type FirewallSecurityGroupRule struct {
	Action        *string `pulumi:"action"`
	Comment       *string `pulumi:"comment"`
	Dest          *string `pulumi:"dest"`
	Dport         *string `pulumi:"dport"`
	Enabled       *bool   `pulumi:"enabled"`
	Iface         *string `pulumi:"iface"`
	Log           *string `pulumi:"log"`
	Macro         *string `pulumi:"macro"`
	Pos           *int    `pulumi:"pos"`
	Proto         *string `pulumi:"proto"`
	SecurityGroup *string `pulumi:"securityGroup"`
	Source        *string `pulumi:"source"`
	Sport         *string `pulumi:"sport"`
	Type          *string `pulumi:"type"`
}

// FirewallSecurityGroupRuleInput is an input type that accepts FirewallSecurityGroupRuleArgs and FirewallSecurityGroupRuleOutput values.
// You can construct a concrete instance of `FirewallSecurityGroupRuleInput` via:
//
//	FirewallSecurityGroupRuleArgs{...}
type FirewallSecurityGroupRuleInput interface {
	pulumi.Input

	ToFirewallSecurityGroupRuleOutput() FirewallSecurityGroupRuleOutput
	ToFirewallSecurityGroupRuleOutputWithContext(context.Context) FirewallSecurityGroupRuleOutput
}

type FirewallSecurityGroupRuleArgs struct {
	Action        pulumi.StringPtrInput `pulumi:"action"`
	Comment       pulumi.StringPtrInput `pulumi:"comment"`
	Dest          pulumi.StringPtrInput `pulumi:"dest"`
	Dport         pulumi.StringPtrInput `pulumi:"dport"`
	Enabled       pulumi.BoolPtrInput   `pulumi:"enabled"`
	Iface         pulumi.StringPtrInput `pulumi:"iface"`
	Log           pulumi.StringPtrInput `pulumi:"log"`
	Macro         pulumi.StringPtrInput `pulumi:"macro"`
	Pos           pulumi.IntPtrInput    `pulumi:"pos"`
	Proto         pulumi.StringPtrInput `pulumi:"proto"`
	SecurityGroup pulumi.StringPtrInput `pulumi:"securityGroup"`
	Source        pulumi.StringPtrInput `pulumi:"source"`
	Sport         pulumi.StringPtrInput `pulumi:"sport"`
	Type          pulumi.StringPtrInput `pulumi:"type"`
}

func (FirewallSecurityGroupRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallSecurityGroupRule)(nil)).Elem()
}

func (i FirewallSecurityGroupRuleArgs) ToFirewallSecurityGroupRuleOutput() FirewallSecurityGroupRuleOutput {
	return i.ToFirewallSecurityGroupRuleOutputWithContext(context.Background())
}

func (i FirewallSecurityGroupRuleArgs) ToFirewallSecurityGroupRuleOutputWithContext(ctx context.Context) FirewallSecurityGroupRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallSecurityGroupRuleOutput)
}

// FirewallSecurityGroupRuleArrayInput is an input type that accepts FirewallSecurityGroupRuleArray and FirewallSecurityGroupRuleArrayOutput values.
// You can construct a concrete instance of `FirewallSecurityGroupRuleArrayInput` via:
//
//	FirewallSecurityGroupRuleArray{ FirewallSecurityGroupRuleArgs{...} }
type FirewallSecurityGroupRuleArrayInput interface {
	pulumi.Input

	ToFirewallSecurityGroupRuleArrayOutput() FirewallSecurityGroupRuleArrayOutput
	ToFirewallSecurityGroupRuleArrayOutputWithContext(context.Context) FirewallSecurityGroupRuleArrayOutput
}

type FirewallSecurityGroupRuleArray []FirewallSecurityGroupRuleInput

func (FirewallSecurityGroupRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallSecurityGroupRule)(nil)).Elem()
}

func (i FirewallSecurityGroupRuleArray) ToFirewallSecurityGroupRuleArrayOutput() FirewallSecurityGroupRuleArrayOutput {
	return i.ToFirewallSecurityGroupRuleArrayOutputWithContext(context.Background())
}

func (i FirewallSecurityGroupRuleArray) ToFirewallSecurityGroupRuleArrayOutputWithContext(ctx context.Context) FirewallSecurityGroupRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallSecurityGroupRuleArrayOutput)
}

type FirewallSecurityGroupRuleOutput struct{ *pulumi.OutputState }

func (FirewallSecurityGroupRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FirewallSecurityGroupRule)(nil)).Elem()
}

func (o FirewallSecurityGroupRuleOutput) ToFirewallSecurityGroupRuleOutput() FirewallSecurityGroupRuleOutput {
	return o
}

func (o FirewallSecurityGroupRuleOutput) ToFirewallSecurityGroupRuleOutputWithContext(ctx context.Context) FirewallSecurityGroupRuleOutput {
	return o
}

func (o FirewallSecurityGroupRuleOutput) Action() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Action }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Dest() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Dest }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Dport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Dport }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Iface() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Iface }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Log() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Log }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Macro() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Macro }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Pos() pulumi.IntPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *int { return v.Pos }).(pulumi.IntPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Proto() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Proto }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) SecurityGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.SecurityGroup }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Source }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Sport() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Sport }).(pulumi.StringPtrOutput)
}

func (o FirewallSecurityGroupRuleOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FirewallSecurityGroupRule) *string { return v.Type }).(pulumi.StringPtrOutput)
}

type FirewallSecurityGroupRuleArrayOutput struct{ *pulumi.OutputState }

func (FirewallSecurityGroupRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]FirewallSecurityGroupRule)(nil)).Elem()
}

func (o FirewallSecurityGroupRuleArrayOutput) ToFirewallSecurityGroupRuleArrayOutput() FirewallSecurityGroupRuleArrayOutput {
	return o
}

func (o FirewallSecurityGroupRuleArrayOutput) ToFirewallSecurityGroupRuleArrayOutputWithContext(ctx context.Context) FirewallSecurityGroupRuleArrayOutput {
	return o
}

func (o FirewallSecurityGroupRuleArrayOutput) Index(i pulumi.IntInput) FirewallSecurityGroupRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) FirewallSecurityGroupRule {
		return vs[0].([]FirewallSecurityGroupRule)[vs[1].(int)]
	}).(FirewallSecurityGroupRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallIPSetCidrInput)(nil)).Elem(), FirewallIPSetCidrArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallIPSetCidrArrayInput)(nil)).Elem(), FirewallIPSetCidrArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallLogRatelimitInput)(nil)).Elem(), FirewallLogRatelimitArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallLogRatelimitPtrInput)(nil)).Elem(), FirewallLogRatelimitArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallRulesRuleInput)(nil)).Elem(), FirewallRulesRuleArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallRulesRuleArrayInput)(nil)).Elem(), FirewallRulesRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallSecurityGroupRuleInput)(nil)).Elem(), FirewallSecurityGroupRuleArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallSecurityGroupRuleArrayInput)(nil)).Elem(), FirewallSecurityGroupRuleArray{})
	pulumi.RegisterOutputType(FirewallIPSetCidrOutput{})
	pulumi.RegisterOutputType(FirewallIPSetCidrArrayOutput{})
	pulumi.RegisterOutputType(FirewallLogRatelimitOutput{})
	pulumi.RegisterOutputType(FirewallLogRatelimitPtrOutput{})
	pulumi.RegisterOutputType(FirewallRulesRuleOutput{})
	pulumi.RegisterOutputType(FirewallRulesRuleArrayOutput{})
	pulumi.RegisterOutputType(FirewallSecurityGroupRuleOutput{})
	pulumi.RegisterOutputType(FirewallSecurityGroupRuleArrayOutput{})
}
