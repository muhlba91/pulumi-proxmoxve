// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ct

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v5/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Container struct {
	pulumi.CustomResourceState

	// The cloning configuration
	Clone ContainerClonePtrOutput `pulumi:"clone"`
	// The console configuration
	Console ContainerConsolePtrOutput `pulumi:"console"`
	// The CPU allocation
	Cpu ContainerCpuPtrOutput `pulumi:"cpu"`
	// The description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The disks
	Disk ContainerDiskPtrOutput `pulumi:"disk"`
	// Features
	Features ContainerFeaturesPtrOutput `pulumi:"features"`
	// The initialization configuration
	Initialization ContainerInitializationPtrOutput `pulumi:"initialization"`
	// The memory allocation
	Memory ContainerMemoryPtrOutput `pulumi:"memory"`
	// The network interfaces
	NetworkInterfaces ContainerNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	// The node name
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// The operating system configuration
	OperatingSystem ContainerOperatingSystemPtrOutput `pulumi:"operatingSystem"`
	// The ID of the pool to assign the container to
	PoolId pulumi.StringPtrOutput `pulumi:"poolId"`
	// Whether to start the container
	Started pulumi.BoolPtrOutput `pulumi:"started"`
	// Tags of the container. This is only meta information.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Whether to create a template
	Template pulumi.BoolPtrOutput `pulumi:"template"`
	// Whether the container runs as unprivileged on the host
	Unprivileged pulumi.BoolPtrOutput `pulumi:"unprivileged"`
	// The VM identifier
	VmId pulumi.IntPtrOutput `pulumi:"vmId"`
}

// NewContainer registers a new resource with the given unique name, arguments, and options.
func NewContainer(ctx *pulumi.Context,
	name string, args *ContainerArgs, opts ...pulumi.ResourceOption) (*Container, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Container
	err := ctx.RegisterResource("proxmoxve:CT/container:Container", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContainer gets an existing Container resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContainer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContainerState, opts ...pulumi.ResourceOption) (*Container, error) {
	var resource Container
	err := ctx.ReadResource("proxmoxve:CT/container:Container", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Container resources.
type containerState struct {
	// The cloning configuration
	Clone *ContainerClone `pulumi:"clone"`
	// The console configuration
	Console *ContainerConsole `pulumi:"console"`
	// The CPU allocation
	Cpu *ContainerCpu `pulumi:"cpu"`
	// The description
	Description *string `pulumi:"description"`
	// The disks
	Disk *ContainerDisk `pulumi:"disk"`
	// Features
	Features *ContainerFeatures `pulumi:"features"`
	// The initialization configuration
	Initialization *ContainerInitialization `pulumi:"initialization"`
	// The memory allocation
	Memory *ContainerMemory `pulumi:"memory"`
	// The network interfaces
	NetworkInterfaces []ContainerNetworkInterface `pulumi:"networkInterfaces"`
	// The node name
	NodeName *string `pulumi:"nodeName"`
	// The operating system configuration
	OperatingSystem *ContainerOperatingSystem `pulumi:"operatingSystem"`
	// The ID of the pool to assign the container to
	PoolId *string `pulumi:"poolId"`
	// Whether to start the container
	Started *bool `pulumi:"started"`
	// Tags of the container. This is only meta information.
	Tags []string `pulumi:"tags"`
	// Whether to create a template
	Template *bool `pulumi:"template"`
	// Whether the container runs as unprivileged on the host
	Unprivileged *bool `pulumi:"unprivileged"`
	// The VM identifier
	VmId *int `pulumi:"vmId"`
}

type ContainerState struct {
	// The cloning configuration
	Clone ContainerClonePtrInput
	// The console configuration
	Console ContainerConsolePtrInput
	// The CPU allocation
	Cpu ContainerCpuPtrInput
	// The description
	Description pulumi.StringPtrInput
	// The disks
	Disk ContainerDiskPtrInput
	// Features
	Features ContainerFeaturesPtrInput
	// The initialization configuration
	Initialization ContainerInitializationPtrInput
	// The memory allocation
	Memory ContainerMemoryPtrInput
	// The network interfaces
	NetworkInterfaces ContainerNetworkInterfaceArrayInput
	// The node name
	NodeName pulumi.StringPtrInput
	// The operating system configuration
	OperatingSystem ContainerOperatingSystemPtrInput
	// The ID of the pool to assign the container to
	PoolId pulumi.StringPtrInput
	// Whether to start the container
	Started pulumi.BoolPtrInput
	// Tags of the container. This is only meta information.
	Tags pulumi.StringArrayInput
	// Whether to create a template
	Template pulumi.BoolPtrInput
	// Whether the container runs as unprivileged on the host
	Unprivileged pulumi.BoolPtrInput
	// The VM identifier
	VmId pulumi.IntPtrInput
}

func (ContainerState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerState)(nil)).Elem()
}

type containerArgs struct {
	// The cloning configuration
	Clone *ContainerClone `pulumi:"clone"`
	// The console configuration
	Console *ContainerConsole `pulumi:"console"`
	// The CPU allocation
	Cpu *ContainerCpu `pulumi:"cpu"`
	// The description
	Description *string `pulumi:"description"`
	// The disks
	Disk *ContainerDisk `pulumi:"disk"`
	// Features
	Features *ContainerFeatures `pulumi:"features"`
	// The initialization configuration
	Initialization *ContainerInitialization `pulumi:"initialization"`
	// The memory allocation
	Memory *ContainerMemory `pulumi:"memory"`
	// The network interfaces
	NetworkInterfaces []ContainerNetworkInterface `pulumi:"networkInterfaces"`
	// The node name
	NodeName string `pulumi:"nodeName"`
	// The operating system configuration
	OperatingSystem *ContainerOperatingSystem `pulumi:"operatingSystem"`
	// The ID of the pool to assign the container to
	PoolId *string `pulumi:"poolId"`
	// Whether to start the container
	Started *bool `pulumi:"started"`
	// Tags of the container. This is only meta information.
	Tags []string `pulumi:"tags"`
	// Whether to create a template
	Template *bool `pulumi:"template"`
	// Whether the container runs as unprivileged on the host
	Unprivileged *bool `pulumi:"unprivileged"`
	// The VM identifier
	VmId *int `pulumi:"vmId"`
}

// The set of arguments for constructing a Container resource.
type ContainerArgs struct {
	// The cloning configuration
	Clone ContainerClonePtrInput
	// The console configuration
	Console ContainerConsolePtrInput
	// The CPU allocation
	Cpu ContainerCpuPtrInput
	// The description
	Description pulumi.StringPtrInput
	// The disks
	Disk ContainerDiskPtrInput
	// Features
	Features ContainerFeaturesPtrInput
	// The initialization configuration
	Initialization ContainerInitializationPtrInput
	// The memory allocation
	Memory ContainerMemoryPtrInput
	// The network interfaces
	NetworkInterfaces ContainerNetworkInterfaceArrayInput
	// The node name
	NodeName pulumi.StringInput
	// The operating system configuration
	OperatingSystem ContainerOperatingSystemPtrInput
	// The ID of the pool to assign the container to
	PoolId pulumi.StringPtrInput
	// Whether to start the container
	Started pulumi.BoolPtrInput
	// Tags of the container. This is only meta information.
	Tags pulumi.StringArrayInput
	// Whether to create a template
	Template pulumi.BoolPtrInput
	// Whether the container runs as unprivileged on the host
	Unprivileged pulumi.BoolPtrInput
	// The VM identifier
	VmId pulumi.IntPtrInput
}

func (ContainerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*containerArgs)(nil)).Elem()
}

type ContainerInput interface {
	pulumi.Input

	ToContainerOutput() ContainerOutput
	ToContainerOutputWithContext(ctx context.Context) ContainerOutput
}

func (*Container) ElementType() reflect.Type {
	return reflect.TypeOf((**Container)(nil)).Elem()
}

func (i *Container) ToContainerOutput() ContainerOutput {
	return i.ToContainerOutputWithContext(context.Background())
}

func (i *Container) ToContainerOutputWithContext(ctx context.Context) ContainerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerOutput)
}

// ContainerArrayInput is an input type that accepts ContainerArray and ContainerArrayOutput values.
// You can construct a concrete instance of `ContainerArrayInput` via:
//
//	ContainerArray{ ContainerArgs{...} }
type ContainerArrayInput interface {
	pulumi.Input

	ToContainerArrayOutput() ContainerArrayOutput
	ToContainerArrayOutputWithContext(context.Context) ContainerArrayOutput
}

type ContainerArray []ContainerInput

func (ContainerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Container)(nil)).Elem()
}

func (i ContainerArray) ToContainerArrayOutput() ContainerArrayOutput {
	return i.ToContainerArrayOutputWithContext(context.Background())
}

func (i ContainerArray) ToContainerArrayOutputWithContext(ctx context.Context) ContainerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerArrayOutput)
}

// ContainerMapInput is an input type that accepts ContainerMap and ContainerMapOutput values.
// You can construct a concrete instance of `ContainerMapInput` via:
//
//	ContainerMap{ "key": ContainerArgs{...} }
type ContainerMapInput interface {
	pulumi.Input

	ToContainerMapOutput() ContainerMapOutput
	ToContainerMapOutputWithContext(context.Context) ContainerMapOutput
}

type ContainerMap map[string]ContainerInput

func (ContainerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Container)(nil)).Elem()
}

func (i ContainerMap) ToContainerMapOutput() ContainerMapOutput {
	return i.ToContainerMapOutputWithContext(context.Background())
}

func (i ContainerMap) ToContainerMapOutputWithContext(ctx context.Context) ContainerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContainerMapOutput)
}

type ContainerOutput struct{ *pulumi.OutputState }

func (ContainerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Container)(nil)).Elem()
}

func (o ContainerOutput) ToContainerOutput() ContainerOutput {
	return o
}

func (o ContainerOutput) ToContainerOutputWithContext(ctx context.Context) ContainerOutput {
	return o
}

// The cloning configuration
func (o ContainerOutput) Clone() ContainerClonePtrOutput {
	return o.ApplyT(func(v *Container) ContainerClonePtrOutput { return v.Clone }).(ContainerClonePtrOutput)
}

// The console configuration
func (o ContainerOutput) Console() ContainerConsolePtrOutput {
	return o.ApplyT(func(v *Container) ContainerConsolePtrOutput { return v.Console }).(ContainerConsolePtrOutput)
}

// The CPU allocation
func (o ContainerOutput) Cpu() ContainerCpuPtrOutput {
	return o.ApplyT(func(v *Container) ContainerCpuPtrOutput { return v.Cpu }).(ContainerCpuPtrOutput)
}

// The description
func (o ContainerOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The disks
func (o ContainerOutput) Disk() ContainerDiskPtrOutput {
	return o.ApplyT(func(v *Container) ContainerDiskPtrOutput { return v.Disk }).(ContainerDiskPtrOutput)
}

// Features
func (o ContainerOutput) Features() ContainerFeaturesPtrOutput {
	return o.ApplyT(func(v *Container) ContainerFeaturesPtrOutput { return v.Features }).(ContainerFeaturesPtrOutput)
}

// The initialization configuration
func (o ContainerOutput) Initialization() ContainerInitializationPtrOutput {
	return o.ApplyT(func(v *Container) ContainerInitializationPtrOutput { return v.Initialization }).(ContainerInitializationPtrOutput)
}

// The memory allocation
func (o ContainerOutput) Memory() ContainerMemoryPtrOutput {
	return o.ApplyT(func(v *Container) ContainerMemoryPtrOutput { return v.Memory }).(ContainerMemoryPtrOutput)
}

// The network interfaces
func (o ContainerOutput) NetworkInterfaces() ContainerNetworkInterfaceArrayOutput {
	return o.ApplyT(func(v *Container) ContainerNetworkInterfaceArrayOutput { return v.NetworkInterfaces }).(ContainerNetworkInterfaceArrayOutput)
}

// The node name
func (o ContainerOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Container) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// The operating system configuration
func (o ContainerOutput) OperatingSystem() ContainerOperatingSystemPtrOutput {
	return o.ApplyT(func(v *Container) ContainerOperatingSystemPtrOutput { return v.OperatingSystem }).(ContainerOperatingSystemPtrOutput)
}

// The ID of the pool to assign the container to
func (o ContainerOutput) PoolId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.StringPtrOutput { return v.PoolId }).(pulumi.StringPtrOutput)
}

// Whether to start the container
func (o ContainerOutput) Started() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Started }).(pulumi.BoolPtrOutput)
}

// Tags of the container. This is only meta information.
func (o ContainerOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Container) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Whether to create a template
func (o ContainerOutput) Template() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Template }).(pulumi.BoolPtrOutput)
}

// Whether the container runs as unprivileged on the host
func (o ContainerOutput) Unprivileged() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Unprivileged }).(pulumi.BoolPtrOutput)
}

// The VM identifier
func (o ContainerOutput) VmId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.VmId }).(pulumi.IntPtrOutput)
}

type ContainerArrayOutput struct{ *pulumi.OutputState }

func (ContainerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Container)(nil)).Elem()
}

func (o ContainerArrayOutput) ToContainerArrayOutput() ContainerArrayOutput {
	return o
}

func (o ContainerArrayOutput) ToContainerArrayOutputWithContext(ctx context.Context) ContainerArrayOutput {
	return o
}

func (o ContainerArrayOutput) Index(i pulumi.IntInput) ContainerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Container {
		return vs[0].([]*Container)[vs[1].(int)]
	}).(ContainerOutput)
}

type ContainerMapOutput struct{ *pulumi.OutputState }

func (ContainerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Container)(nil)).Elem()
}

func (o ContainerMapOutput) ToContainerMapOutput() ContainerMapOutput {
	return o
}

func (o ContainerMapOutput) ToContainerMapOutputWithContext(ctx context.Context) ContainerMapOutput {
	return o
}

func (o ContainerMapOutput) MapIndex(k pulumi.StringInput) ContainerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Container {
		return vs[0].(map[string]*Container)[vs[1].(string)]
	}).(ContainerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerInput)(nil)).Elem(), &Container{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerArrayInput)(nil)).Elem(), ContainerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContainerMapInput)(nil)).Elem(), ContainerMap{})
	pulumi.RegisterOutputType(ContainerOutput{})
	pulumi.RegisterOutputType(ContainerArrayOutput{})
	pulumi.RegisterOutputType(ContainerMapOutput{})
}
