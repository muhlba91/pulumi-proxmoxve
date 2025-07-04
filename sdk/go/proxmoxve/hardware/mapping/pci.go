// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mapping

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a PCI hardware mapping in a Proxmox VE cluster.
//
// ## Import
//
// #!/usr/bin/env sh
//
// A PCI hardware mapping can be imported using their name, e.g.:
//
// ```sh
// $ pulumi import proxmoxve:Hardware/mapping/pci:Pci example example
// ```
type Pci struct {
	pulumi.CustomResourceState

	// The comment of this PCI hardware mapping.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The actual map of devices for the PCI hardware mapping.
	Maps PciMapTypeArrayOutput `pulumi:"maps"`
	// Indicates whether to enable mediated devices.
	MediatedDevices pulumi.BoolOutput `pulumi:"mediatedDevices"`
	// The name of this PCI hardware mapping.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewPci registers a new resource with the given unique name, arguments, and options.
func NewPci(ctx *pulumi.Context,
	name string, args *PciArgs, opts ...pulumi.ResourceOption) (*Pci, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Maps == nil {
		return nil, errors.New("invalid value for required argument 'Maps'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Pci
	err := ctx.RegisterResource("proxmoxve:Hardware/mapping/pci:Pci", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPci gets an existing Pci resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPci(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PciState, opts ...pulumi.ResourceOption) (*Pci, error) {
	var resource Pci
	err := ctx.ReadResource("proxmoxve:Hardware/mapping/pci:Pci", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pci resources.
type pciState struct {
	// The comment of this PCI hardware mapping.
	Comment *string `pulumi:"comment"`
	// The actual map of devices for the PCI hardware mapping.
	Maps []PciMapType `pulumi:"maps"`
	// Indicates whether to enable mediated devices.
	MediatedDevices *bool `pulumi:"mediatedDevices"`
	// The name of this PCI hardware mapping.
	Name *string `pulumi:"name"`
}

type PciState struct {
	// The comment of this PCI hardware mapping.
	Comment pulumi.StringPtrInput
	// The actual map of devices for the PCI hardware mapping.
	Maps PciMapTypeArrayInput
	// Indicates whether to enable mediated devices.
	MediatedDevices pulumi.BoolPtrInput
	// The name of this PCI hardware mapping.
	Name pulumi.StringPtrInput
}

func (PciState) ElementType() reflect.Type {
	return reflect.TypeOf((*pciState)(nil)).Elem()
}

type pciArgs struct {
	// The comment of this PCI hardware mapping.
	Comment *string `pulumi:"comment"`
	// The actual map of devices for the PCI hardware mapping.
	Maps []PciMapType `pulumi:"maps"`
	// Indicates whether to enable mediated devices.
	MediatedDevices *bool `pulumi:"mediatedDevices"`
	// The name of this PCI hardware mapping.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Pci resource.
type PciArgs struct {
	// The comment of this PCI hardware mapping.
	Comment pulumi.StringPtrInput
	// The actual map of devices for the PCI hardware mapping.
	Maps PciMapTypeArrayInput
	// Indicates whether to enable mediated devices.
	MediatedDevices pulumi.BoolPtrInput
	// The name of this PCI hardware mapping.
	Name pulumi.StringPtrInput
}

func (PciArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pciArgs)(nil)).Elem()
}

type PciInput interface {
	pulumi.Input

	ToPciOutput() PciOutput
	ToPciOutputWithContext(ctx context.Context) PciOutput
}

func (*Pci) ElementType() reflect.Type {
	return reflect.TypeOf((**Pci)(nil)).Elem()
}

func (i *Pci) ToPciOutput() PciOutput {
	return i.ToPciOutputWithContext(context.Background())
}

func (i *Pci) ToPciOutputWithContext(ctx context.Context) PciOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PciOutput)
}

// PciArrayInput is an input type that accepts PciArray and PciArrayOutput values.
// You can construct a concrete instance of `PciArrayInput` via:
//
//	PciArray{ PciArgs{...} }
type PciArrayInput interface {
	pulumi.Input

	ToPciArrayOutput() PciArrayOutput
	ToPciArrayOutputWithContext(context.Context) PciArrayOutput
}

type PciArray []PciInput

func (PciArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pci)(nil)).Elem()
}

func (i PciArray) ToPciArrayOutput() PciArrayOutput {
	return i.ToPciArrayOutputWithContext(context.Background())
}

func (i PciArray) ToPciArrayOutputWithContext(ctx context.Context) PciArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PciArrayOutput)
}

// PciMapInput is an input type that accepts PciMap and PciMapOutput values.
// You can construct a concrete instance of `PciMapInput` via:
//
//	PciMap{ "key": PciArgs{...} }
type PciMapInput interface {
	pulumi.Input

	ToPciMapOutput() PciMapOutput
	ToPciMapOutputWithContext(context.Context) PciMapOutput
}

type PciMap map[string]PciInput

func (PciMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pci)(nil)).Elem()
}

func (i PciMap) ToPciMapOutput() PciMapOutput {
	return i.ToPciMapOutputWithContext(context.Background())
}

func (i PciMap) ToPciMapOutputWithContext(ctx context.Context) PciMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PciMapOutput)
}

type PciOutput struct{ *pulumi.OutputState }

func (PciOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Pci)(nil)).Elem()
}

func (o PciOutput) ToPciOutput() PciOutput {
	return o
}

func (o PciOutput) ToPciOutputWithContext(ctx context.Context) PciOutput {
	return o
}

// The comment of this PCI hardware mapping.
func (o PciOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pci) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The actual map of devices for the PCI hardware mapping.
func (o PciOutput) Maps() PciMapTypeArrayOutput {
	return o.ApplyT(func(v *Pci) PciMapTypeArrayOutput { return v.Maps }).(PciMapTypeArrayOutput)
}

// Indicates whether to enable mediated devices.
func (o PciOutput) MediatedDevices() pulumi.BoolOutput {
	return o.ApplyT(func(v *Pci) pulumi.BoolOutput { return v.MediatedDevices }).(pulumi.BoolOutput)
}

// The name of this PCI hardware mapping.
func (o PciOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Pci) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type PciArrayOutput struct{ *pulumi.OutputState }

func (PciArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pci)(nil)).Elem()
}

func (o PciArrayOutput) ToPciArrayOutput() PciArrayOutput {
	return o
}

func (o PciArrayOutput) ToPciArrayOutputWithContext(ctx context.Context) PciArrayOutput {
	return o
}

func (o PciArrayOutput) Index(i pulumi.IntInput) PciOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Pci {
		return vs[0].([]*Pci)[vs[1].(int)]
	}).(PciOutput)
}

type PciMapOutput struct{ *pulumi.OutputState }

func (PciMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pci)(nil)).Elem()
}

func (o PciMapOutput) ToPciMapOutput() PciMapOutput {
	return o
}

func (o PciMapOutput) ToPciMapOutputWithContext(ctx context.Context) PciMapOutput {
	return o
}

func (o PciMapOutput) MapIndex(k pulumi.StringInput) PciOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Pci {
		return vs[0].(map[string]*Pci)[vs[1].(string)]
	}).(PciOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PciInput)(nil)).Elem(), &Pci{})
	pulumi.RegisterInputType(reflect.TypeOf((*PciArrayInput)(nil)).Elem(), PciArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PciMapInput)(nil)).Elem(), PciMap{})
	pulumi.RegisterOutputType(PciOutput{})
	pulumi.RegisterOutputType(PciArrayOutput{})
	pulumi.RegisterOutputType(PciMapOutput{})
}
