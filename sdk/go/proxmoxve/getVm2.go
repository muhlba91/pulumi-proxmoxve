// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **DO NOT USE**
// This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
func GetVm2(ctx *pulumi.Context, args *GetVm2Args, opts ...pulumi.InvokeOption) (*GetVm2Result, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVm2Result
	err := ctx.Invoke("proxmoxve:index/getVm2:getVm2", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVm2.
type GetVm2Args struct {
	// The cloning configuration.
	Clone *GetVm2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu *GetVm2Cpu `pulumi:"cpu"`
	// The description of the VM.
	Description *string `pulumi:"description"`
	// The unique identifier of the VM in the Proxmox cluster.
	Id int `pulumi:"id"`
	// The name of the VM.
	Name *string `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName string `pulumi:"nodeName"`
	// The RNG (Random Number Generator) configuration.
	Rng *GetVm2Rng `pulumi:"rng"`
	// The tags assigned to the VM.
	Tags []string `pulumi:"tags"`
	// Whether the VM is a template.
	Template *bool           `pulumi:"template"`
	Timeouts *GetVm2Timeouts `pulumi:"timeouts"`
	// The VGA configuration.
	Vga *GetVm2Vga `pulumi:"vga"`
}

// A collection of values returned by getVm2.
type GetVm2Result struct {
	// The cloning configuration.
	Clone *GetVm2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu GetVm2Cpu `pulumi:"cpu"`
	// The description of the VM.
	Description *string `pulumi:"description"`
	// The unique identifier of the VM in the Proxmox cluster.
	Id int `pulumi:"id"`
	// The name of the VM.
	Name *string `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName string `pulumi:"nodeName"`
	// The RNG (Random Number Generator) configuration.
	Rng GetVm2Rng `pulumi:"rng"`
	// The tags assigned to the VM.
	Tags []string `pulumi:"tags"`
	// Whether the VM is a template.
	Template *bool           `pulumi:"template"`
	Timeouts *GetVm2Timeouts `pulumi:"timeouts"`
	// The VGA configuration.
	Vga GetVm2Vga `pulumi:"vga"`
}

func GetVm2Output(ctx *pulumi.Context, args GetVm2OutputArgs, opts ...pulumi.InvokeOption) GetVm2ResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVm2ResultOutput, error) {
			args := v.(GetVm2Args)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("proxmoxve:index/getVm2:getVm2", args, GetVm2ResultOutput{}, options).(GetVm2ResultOutput), nil
		}).(GetVm2ResultOutput)
}

// A collection of arguments for invoking getVm2.
type GetVm2OutputArgs struct {
	// The cloning configuration.
	Clone GetVm2ClonePtrInput `pulumi:"clone"`
	// The CPU configuration.
	Cpu GetVm2CpuPtrInput `pulumi:"cpu"`
	// The description of the VM.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// The unique identifier of the VM in the Proxmox cluster.
	Id pulumi.IntInput `pulumi:"id"`
	// The name of the VM.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName pulumi.StringInput `pulumi:"nodeName"`
	// The RNG (Random Number Generator) configuration.
	Rng GetVm2RngPtrInput `pulumi:"rng"`
	// The tags assigned to the VM.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// Whether the VM is a template.
	Template pulumi.BoolPtrInput    `pulumi:"template"`
	Timeouts GetVm2TimeoutsPtrInput `pulumi:"timeouts"`
	// The VGA configuration.
	Vga GetVm2VgaPtrInput `pulumi:"vga"`
}

func (GetVm2OutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVm2Args)(nil)).Elem()
}

// A collection of values returned by getVm2.
type GetVm2ResultOutput struct{ *pulumi.OutputState }

func (GetVm2ResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVm2Result)(nil)).Elem()
}

func (o GetVm2ResultOutput) ToGetVm2ResultOutput() GetVm2ResultOutput {
	return o
}

func (o GetVm2ResultOutput) ToGetVm2ResultOutputWithContext(ctx context.Context) GetVm2ResultOutput {
	return o
}

// The cloning configuration.
func (o GetVm2ResultOutput) Clone() GetVm2ClonePtrOutput {
	return o.ApplyT(func(v GetVm2Result) *GetVm2Clone { return v.Clone }).(GetVm2ClonePtrOutput)
}

// The CPU configuration.
func (o GetVm2ResultOutput) Cpu() GetVm2CpuOutput {
	return o.ApplyT(func(v GetVm2Result) GetVm2Cpu { return v.Cpu }).(GetVm2CpuOutput)
}

// The description of the VM.
func (o GetVm2ResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVm2Result) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The unique identifier of the VM in the Proxmox cluster.
func (o GetVm2ResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetVm2Result) int { return v.Id }).(pulumi.IntOutput)
}

// The name of the VM.
func (o GetVm2ResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVm2Result) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The name of the node where the VM is provisioned.
func (o GetVm2ResultOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v GetVm2Result) string { return v.NodeName }).(pulumi.StringOutput)
}

// The RNG (Random Number Generator) configuration.
func (o GetVm2ResultOutput) Rng() GetVm2RngOutput {
	return o.ApplyT(func(v GetVm2Result) GetVm2Rng { return v.Rng }).(GetVm2RngOutput)
}

// The tags assigned to the VM.
func (o GetVm2ResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVm2Result) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Whether the VM is a template.
func (o GetVm2ResultOutput) Template() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetVm2Result) *bool { return v.Template }).(pulumi.BoolPtrOutput)
}

func (o GetVm2ResultOutput) Timeouts() GetVm2TimeoutsPtrOutput {
	return o.ApplyT(func(v GetVm2Result) *GetVm2Timeouts { return v.Timeouts }).(GetVm2TimeoutsPtrOutput)
}

// The VGA configuration.
func (o GetVm2ResultOutput) Vga() GetVm2VgaOutput {
	return o.ApplyT(func(v GetVm2Result) GetVm2Vga { return v.Vga }).(GetVm2VgaOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVm2ResultOutput{})
}
