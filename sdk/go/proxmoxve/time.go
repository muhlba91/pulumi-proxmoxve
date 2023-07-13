// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Time struct {
	pulumi.CustomResourceState

	// The local timestamp
	LocalTime pulumi.StringOutput `pulumi:"localTime"`
	// The node name
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// The time zone
	TimeZone pulumi.StringOutput `pulumi:"timeZone"`
	// The UTC timestamp
	UtcTime pulumi.StringOutput `pulumi:"utcTime"`
}

// NewTime registers a new resource with the given unique name, arguments, and options.
func NewTime(ctx *pulumi.Context,
	name string, args *TimeArgs, opts ...pulumi.ResourceOption) (*Time, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	if args.TimeZone == nil {
		return nil, errors.New("invalid value for required argument 'TimeZone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Time
	err := ctx.RegisterResource("proxmoxve:index/time:Time", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTime gets an existing Time resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTime(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TimeState, opts ...pulumi.ResourceOption) (*Time, error) {
	var resource Time
	err := ctx.ReadResource("proxmoxve:index/time:Time", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Time resources.
type timeState struct {
	// The local timestamp
	LocalTime *string `pulumi:"localTime"`
	// The node name
	NodeName *string `pulumi:"nodeName"`
	// The time zone
	TimeZone *string `pulumi:"timeZone"`
	// The UTC timestamp
	UtcTime *string `pulumi:"utcTime"`
}

type TimeState struct {
	// The local timestamp
	LocalTime pulumi.StringPtrInput
	// The node name
	NodeName pulumi.StringPtrInput
	// The time zone
	TimeZone pulumi.StringPtrInput
	// The UTC timestamp
	UtcTime pulumi.StringPtrInput
}

func (TimeState) ElementType() reflect.Type {
	return reflect.TypeOf((*timeState)(nil)).Elem()
}

type timeArgs struct {
	// The node name
	NodeName string `pulumi:"nodeName"`
	// The time zone
	TimeZone string `pulumi:"timeZone"`
}

// The set of arguments for constructing a Time resource.
type TimeArgs struct {
	// The node name
	NodeName pulumi.StringInput
	// The time zone
	TimeZone pulumi.StringInput
}

func (TimeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*timeArgs)(nil)).Elem()
}

type TimeInput interface {
	pulumi.Input

	ToTimeOutput() TimeOutput
	ToTimeOutputWithContext(ctx context.Context) TimeOutput
}

func (*Time) ElementType() reflect.Type {
	return reflect.TypeOf((**Time)(nil)).Elem()
}

func (i *Time) ToTimeOutput() TimeOutput {
	return i.ToTimeOutputWithContext(context.Background())
}

func (i *Time) ToTimeOutputWithContext(ctx context.Context) TimeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TimeOutput)
}

// TimeArrayInput is an input type that accepts TimeArray and TimeArrayOutput values.
// You can construct a concrete instance of `TimeArrayInput` via:
//
//	TimeArray{ TimeArgs{...} }
type TimeArrayInput interface {
	pulumi.Input

	ToTimeArrayOutput() TimeArrayOutput
	ToTimeArrayOutputWithContext(context.Context) TimeArrayOutput
}

type TimeArray []TimeInput

func (TimeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Time)(nil)).Elem()
}

func (i TimeArray) ToTimeArrayOutput() TimeArrayOutput {
	return i.ToTimeArrayOutputWithContext(context.Background())
}

func (i TimeArray) ToTimeArrayOutputWithContext(ctx context.Context) TimeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TimeArrayOutput)
}

// TimeMapInput is an input type that accepts TimeMap and TimeMapOutput values.
// You can construct a concrete instance of `TimeMapInput` via:
//
//	TimeMap{ "key": TimeArgs{...} }
type TimeMapInput interface {
	pulumi.Input

	ToTimeMapOutput() TimeMapOutput
	ToTimeMapOutputWithContext(context.Context) TimeMapOutput
}

type TimeMap map[string]TimeInput

func (TimeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Time)(nil)).Elem()
}

func (i TimeMap) ToTimeMapOutput() TimeMapOutput {
	return i.ToTimeMapOutputWithContext(context.Background())
}

func (i TimeMap) ToTimeMapOutputWithContext(ctx context.Context) TimeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TimeMapOutput)
}

type TimeOutput struct{ *pulumi.OutputState }

func (TimeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Time)(nil)).Elem()
}

func (o TimeOutput) ToTimeOutput() TimeOutput {
	return o
}

func (o TimeOutput) ToTimeOutputWithContext(ctx context.Context) TimeOutput {
	return o
}

// The local timestamp
func (o TimeOutput) LocalTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Time) pulumi.StringOutput { return v.LocalTime }).(pulumi.StringOutput)
}

// The node name
func (o TimeOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Time) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// The time zone
func (o TimeOutput) TimeZone() pulumi.StringOutput {
	return o.ApplyT(func(v *Time) pulumi.StringOutput { return v.TimeZone }).(pulumi.StringOutput)
}

// The UTC timestamp
func (o TimeOutput) UtcTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Time) pulumi.StringOutput { return v.UtcTime }).(pulumi.StringOutput)
}

type TimeArrayOutput struct{ *pulumi.OutputState }

func (TimeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Time)(nil)).Elem()
}

func (o TimeArrayOutput) ToTimeArrayOutput() TimeArrayOutput {
	return o
}

func (o TimeArrayOutput) ToTimeArrayOutputWithContext(ctx context.Context) TimeArrayOutput {
	return o
}

func (o TimeArrayOutput) Index(i pulumi.IntInput) TimeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Time {
		return vs[0].([]*Time)[vs[1].(int)]
	}).(TimeOutput)
}

type TimeMapOutput struct{ *pulumi.OutputState }

func (TimeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Time)(nil)).Elem()
}

func (o TimeMapOutput) ToTimeMapOutput() TimeMapOutput {
	return o
}

func (o TimeMapOutput) ToTimeMapOutputWithContext(ctx context.Context) TimeMapOutput {
	return o
}

func (o TimeMapOutput) MapIndex(k pulumi.StringInput) TimeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Time {
		return vs[0].(map[string]*Time)[vs[1].(string)]
	}).(TimeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TimeInput)(nil)).Elem(), &Time{})
	pulumi.RegisterInputType(reflect.TypeOf((*TimeArrayInput)(nil)).Elem(), TimeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TimeMapInput)(nil)).Elem(), TimeMap{})
	pulumi.RegisterOutputType(TimeOutput{})
	pulumi.RegisterOutputType(TimeArrayOutput{})
	pulumi.RegisterOutputType(TimeMapOutput{})
}
