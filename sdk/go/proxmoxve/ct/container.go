// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ct

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a container.
//
// ## Import
//
// Instances can be imported using the `node_name` and the `vm_id`, e.g.,
//
// bash
//
// ```sh
// $ pulumi import proxmoxve:CT/container:Container ubuntu_container first-node/1234
// ```
type Container struct {
	pulumi.CustomResourceState

	// The cloning configuration.
	Clone ContainerClonePtrOutput `pulumi:"clone"`
	// The console configuration.
	Console ContainerConsolePtrOutput `pulumi:"console"`
	// The CPU configuration.
	Cpu ContainerCpuPtrOutput `pulumi:"cpu"`
	// The description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Device to pass through to the container (multiple blocks supported).
	DevicePassthroughs ContainerDevicePassthroughArrayOutput `pulumi:"devicePassthroughs"`
	// The disk configuration.
	Disk ContainerDiskPtrOutput `pulumi:"disk"`
	// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
	Features ContainerFeaturesPtrOutput `pulumi:"features"`
	// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
	HookScriptFileId pulumi.StringPtrOutput `pulumi:"hookScriptFileId"`
	// The initialization configuration.
	Initialization ContainerInitializationPtrOutput `pulumi:"initialization"`
	// The memory configuration.
	Memory ContainerMemoryPtrOutput `pulumi:"memory"`
	// A mount point
	MountPoints ContainerMountPointArrayOutput `pulumi:"mountPoints"`
	// A network interface (multiple blocks
	// supported).
	NetworkInterfaces ContainerNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	// The name of the node to assign the container to.
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// The Operating System configuration.
	OperatingSystem ContainerOperatingSystemPtrOutput `pulumi:"operatingSystem"`
	// The identifier for a pool to assign the container to.
	PoolId pulumi.StringPtrOutput `pulumi:"poolId"`
	// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
	Protection pulumi.BoolPtrOutput `pulumi:"protection"`
	// Automatically start container when the host
	// system boots (defaults to `true`).
	StartOnBoot pulumi.BoolPtrOutput `pulumi:"startOnBoot"`
	// Whether to start the container (defaults to `true`).
	Started pulumi.BoolPtrOutput `pulumi:"started"`
	// Defines startup and shutdown behavior of the container.
	Startup ContainerStartupPtrOutput `pulumi:"startup"`
	// A list of tags the container tags. This is only meta
	// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
	// If the list in template is not sorted, then Proxmox will always report a
	// difference on the resource. You may use the `ignoreChanges` lifecycle
	// meta-argument to ignore changes to this attribute.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Whether to create a template (defaults to `false`).
	Template pulumi.BoolPtrOutput `pulumi:"template"`
	// Timeout for cloning a container in seconds (defaults to 1800).
	TimeoutClone pulumi.IntPtrOutput `pulumi:"timeoutClone"`
	// Timeout for creating a container in seconds (defaults to 1800).
	TimeoutCreate pulumi.IntPtrOutput `pulumi:"timeoutCreate"`
	// Timeout for deleting a container in seconds (defaults to 60).
	TimeoutDelete pulumi.IntPtrOutput `pulumi:"timeoutDelete"`
	// Start container timeout
	//
	// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
	TimeoutStart pulumi.IntPtrOutput `pulumi:"timeoutStart"`
	// Timeout for updating a container in seconds (defaults to 1800).
	TimeoutUpdate pulumi.IntPtrOutput `pulumi:"timeoutUpdate"`
	// Whether the container runs as unprivileged on
	// the host (defaults to `false`).
	Unprivileged pulumi.BoolPtrOutput `pulumi:"unprivileged"`
	// The container identifier
	VmId pulumi.IntOutput `pulumi:"vmId"`
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
	// The cloning configuration.
	Clone *ContainerClone `pulumi:"clone"`
	// The console configuration.
	Console *ContainerConsole `pulumi:"console"`
	// The CPU configuration.
	Cpu *ContainerCpu `pulumi:"cpu"`
	// The description.
	Description *string `pulumi:"description"`
	// Device to pass through to the container (multiple blocks supported).
	DevicePassthroughs []ContainerDevicePassthrough `pulumi:"devicePassthroughs"`
	// The disk configuration.
	Disk *ContainerDisk `pulumi:"disk"`
	// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
	Features *ContainerFeatures `pulumi:"features"`
	// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
	HookScriptFileId *string `pulumi:"hookScriptFileId"`
	// The initialization configuration.
	Initialization *ContainerInitialization `pulumi:"initialization"`
	// The memory configuration.
	Memory *ContainerMemory `pulumi:"memory"`
	// A mount point
	MountPoints []ContainerMountPoint `pulumi:"mountPoints"`
	// A network interface (multiple blocks
	// supported).
	NetworkInterfaces []ContainerNetworkInterface `pulumi:"networkInterfaces"`
	// The name of the node to assign the container to.
	NodeName *string `pulumi:"nodeName"`
	// The Operating System configuration.
	OperatingSystem *ContainerOperatingSystem `pulumi:"operatingSystem"`
	// The identifier for a pool to assign the container to.
	PoolId *string `pulumi:"poolId"`
	// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
	Protection *bool `pulumi:"protection"`
	// Automatically start container when the host
	// system boots (defaults to `true`).
	StartOnBoot *bool `pulumi:"startOnBoot"`
	// Whether to start the container (defaults to `true`).
	Started *bool `pulumi:"started"`
	// Defines startup and shutdown behavior of the container.
	Startup *ContainerStartup `pulumi:"startup"`
	// A list of tags the container tags. This is only meta
	// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
	// If the list in template is not sorted, then Proxmox will always report a
	// difference on the resource. You may use the `ignoreChanges` lifecycle
	// meta-argument to ignore changes to this attribute.
	Tags []string `pulumi:"tags"`
	// Whether to create a template (defaults to `false`).
	Template *bool `pulumi:"template"`
	// Timeout for cloning a container in seconds (defaults to 1800).
	TimeoutClone *int `pulumi:"timeoutClone"`
	// Timeout for creating a container in seconds (defaults to 1800).
	TimeoutCreate *int `pulumi:"timeoutCreate"`
	// Timeout for deleting a container in seconds (defaults to 60).
	TimeoutDelete *int `pulumi:"timeoutDelete"`
	// Start container timeout
	//
	// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
	TimeoutStart *int `pulumi:"timeoutStart"`
	// Timeout for updating a container in seconds (defaults to 1800).
	TimeoutUpdate *int `pulumi:"timeoutUpdate"`
	// Whether the container runs as unprivileged on
	// the host (defaults to `false`).
	Unprivileged *bool `pulumi:"unprivileged"`
	// The container identifier
	VmId *int `pulumi:"vmId"`
}

type ContainerState struct {
	// The cloning configuration.
	Clone ContainerClonePtrInput
	// The console configuration.
	Console ContainerConsolePtrInput
	// The CPU configuration.
	Cpu ContainerCpuPtrInput
	// The description.
	Description pulumi.StringPtrInput
	// Device to pass through to the container (multiple blocks supported).
	DevicePassthroughs ContainerDevicePassthroughArrayInput
	// The disk configuration.
	Disk ContainerDiskPtrInput
	// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
	Features ContainerFeaturesPtrInput
	// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
	HookScriptFileId pulumi.StringPtrInput
	// The initialization configuration.
	Initialization ContainerInitializationPtrInput
	// The memory configuration.
	Memory ContainerMemoryPtrInput
	// A mount point
	MountPoints ContainerMountPointArrayInput
	// A network interface (multiple blocks
	// supported).
	NetworkInterfaces ContainerNetworkInterfaceArrayInput
	// The name of the node to assign the container to.
	NodeName pulumi.StringPtrInput
	// The Operating System configuration.
	OperatingSystem ContainerOperatingSystemPtrInput
	// The identifier for a pool to assign the container to.
	PoolId pulumi.StringPtrInput
	// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
	Protection pulumi.BoolPtrInput
	// Automatically start container when the host
	// system boots (defaults to `true`).
	StartOnBoot pulumi.BoolPtrInput
	// Whether to start the container (defaults to `true`).
	Started pulumi.BoolPtrInput
	// Defines startup and shutdown behavior of the container.
	Startup ContainerStartupPtrInput
	// A list of tags the container tags. This is only meta
	// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
	// If the list in template is not sorted, then Proxmox will always report a
	// difference on the resource. You may use the `ignoreChanges` lifecycle
	// meta-argument to ignore changes to this attribute.
	Tags pulumi.StringArrayInput
	// Whether to create a template (defaults to `false`).
	Template pulumi.BoolPtrInput
	// Timeout for cloning a container in seconds (defaults to 1800).
	TimeoutClone pulumi.IntPtrInput
	// Timeout for creating a container in seconds (defaults to 1800).
	TimeoutCreate pulumi.IntPtrInput
	// Timeout for deleting a container in seconds (defaults to 60).
	TimeoutDelete pulumi.IntPtrInput
	// Start container timeout
	//
	// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
	TimeoutStart pulumi.IntPtrInput
	// Timeout for updating a container in seconds (defaults to 1800).
	TimeoutUpdate pulumi.IntPtrInput
	// Whether the container runs as unprivileged on
	// the host (defaults to `false`).
	Unprivileged pulumi.BoolPtrInput
	// The container identifier
	VmId pulumi.IntPtrInput
}

func (ContainerState) ElementType() reflect.Type {
	return reflect.TypeOf((*containerState)(nil)).Elem()
}

type containerArgs struct {
	// The cloning configuration.
	Clone *ContainerClone `pulumi:"clone"`
	// The console configuration.
	Console *ContainerConsole `pulumi:"console"`
	// The CPU configuration.
	Cpu *ContainerCpu `pulumi:"cpu"`
	// The description.
	Description *string `pulumi:"description"`
	// Device to pass through to the container (multiple blocks supported).
	DevicePassthroughs []ContainerDevicePassthrough `pulumi:"devicePassthroughs"`
	// The disk configuration.
	Disk *ContainerDisk `pulumi:"disk"`
	// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
	Features *ContainerFeatures `pulumi:"features"`
	// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
	HookScriptFileId *string `pulumi:"hookScriptFileId"`
	// The initialization configuration.
	Initialization *ContainerInitialization `pulumi:"initialization"`
	// The memory configuration.
	Memory *ContainerMemory `pulumi:"memory"`
	// A mount point
	MountPoints []ContainerMountPoint `pulumi:"mountPoints"`
	// A network interface (multiple blocks
	// supported).
	NetworkInterfaces []ContainerNetworkInterface `pulumi:"networkInterfaces"`
	// The name of the node to assign the container to.
	NodeName string `pulumi:"nodeName"`
	// The Operating System configuration.
	OperatingSystem *ContainerOperatingSystem `pulumi:"operatingSystem"`
	// The identifier for a pool to assign the container to.
	PoolId *string `pulumi:"poolId"`
	// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
	Protection *bool `pulumi:"protection"`
	// Automatically start container when the host
	// system boots (defaults to `true`).
	StartOnBoot *bool `pulumi:"startOnBoot"`
	// Whether to start the container (defaults to `true`).
	Started *bool `pulumi:"started"`
	// Defines startup and shutdown behavior of the container.
	Startup *ContainerStartup `pulumi:"startup"`
	// A list of tags the container tags. This is only meta
	// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
	// If the list in template is not sorted, then Proxmox will always report a
	// difference on the resource. You may use the `ignoreChanges` lifecycle
	// meta-argument to ignore changes to this attribute.
	Tags []string `pulumi:"tags"`
	// Whether to create a template (defaults to `false`).
	Template *bool `pulumi:"template"`
	// Timeout for cloning a container in seconds (defaults to 1800).
	TimeoutClone *int `pulumi:"timeoutClone"`
	// Timeout for creating a container in seconds (defaults to 1800).
	TimeoutCreate *int `pulumi:"timeoutCreate"`
	// Timeout for deleting a container in seconds (defaults to 60).
	TimeoutDelete *int `pulumi:"timeoutDelete"`
	// Start container timeout
	//
	// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
	TimeoutStart *int `pulumi:"timeoutStart"`
	// Timeout for updating a container in seconds (defaults to 1800).
	TimeoutUpdate *int `pulumi:"timeoutUpdate"`
	// Whether the container runs as unprivileged on
	// the host (defaults to `false`).
	Unprivileged *bool `pulumi:"unprivileged"`
	// The container identifier
	VmId *int `pulumi:"vmId"`
}

// The set of arguments for constructing a Container resource.
type ContainerArgs struct {
	// The cloning configuration.
	Clone ContainerClonePtrInput
	// The console configuration.
	Console ContainerConsolePtrInput
	// The CPU configuration.
	Cpu ContainerCpuPtrInput
	// The description.
	Description pulumi.StringPtrInput
	// Device to pass through to the container (multiple blocks supported).
	DevicePassthroughs ContainerDevicePassthroughArrayInput
	// The disk configuration.
	Disk ContainerDiskPtrInput
	// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
	Features ContainerFeaturesPtrInput
	// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
	HookScriptFileId pulumi.StringPtrInput
	// The initialization configuration.
	Initialization ContainerInitializationPtrInput
	// The memory configuration.
	Memory ContainerMemoryPtrInput
	// A mount point
	MountPoints ContainerMountPointArrayInput
	// A network interface (multiple blocks
	// supported).
	NetworkInterfaces ContainerNetworkInterfaceArrayInput
	// The name of the node to assign the container to.
	NodeName pulumi.StringInput
	// The Operating System configuration.
	OperatingSystem ContainerOperatingSystemPtrInput
	// The identifier for a pool to assign the container to.
	PoolId pulumi.StringPtrInput
	// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
	Protection pulumi.BoolPtrInput
	// Automatically start container when the host
	// system boots (defaults to `true`).
	StartOnBoot pulumi.BoolPtrInput
	// Whether to start the container (defaults to `true`).
	Started pulumi.BoolPtrInput
	// Defines startup and shutdown behavior of the container.
	Startup ContainerStartupPtrInput
	// A list of tags the container tags. This is only meta
	// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
	// If the list in template is not sorted, then Proxmox will always report a
	// difference on the resource. You may use the `ignoreChanges` lifecycle
	// meta-argument to ignore changes to this attribute.
	Tags pulumi.StringArrayInput
	// Whether to create a template (defaults to `false`).
	Template pulumi.BoolPtrInput
	// Timeout for cloning a container in seconds (defaults to 1800).
	TimeoutClone pulumi.IntPtrInput
	// Timeout for creating a container in seconds (defaults to 1800).
	TimeoutCreate pulumi.IntPtrInput
	// Timeout for deleting a container in seconds (defaults to 60).
	TimeoutDelete pulumi.IntPtrInput
	// Start container timeout
	//
	// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
	TimeoutStart pulumi.IntPtrInput
	// Timeout for updating a container in seconds (defaults to 1800).
	TimeoutUpdate pulumi.IntPtrInput
	// Whether the container runs as unprivileged on
	// the host (defaults to `false`).
	Unprivileged pulumi.BoolPtrInput
	// The container identifier
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

// The cloning configuration.
func (o ContainerOutput) Clone() ContainerClonePtrOutput {
	return o.ApplyT(func(v *Container) ContainerClonePtrOutput { return v.Clone }).(ContainerClonePtrOutput)
}

// The console configuration.
func (o ContainerOutput) Console() ContainerConsolePtrOutput {
	return o.ApplyT(func(v *Container) ContainerConsolePtrOutput { return v.Console }).(ContainerConsolePtrOutput)
}

// The CPU configuration.
func (o ContainerOutput) Cpu() ContainerCpuPtrOutput {
	return o.ApplyT(func(v *Container) ContainerCpuPtrOutput { return v.Cpu }).(ContainerCpuPtrOutput)
}

// The description.
func (o ContainerOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Device to pass through to the container (multiple blocks supported).
func (o ContainerOutput) DevicePassthroughs() ContainerDevicePassthroughArrayOutput {
	return o.ApplyT(func(v *Container) ContainerDevicePassthroughArrayOutput { return v.DevicePassthroughs }).(ContainerDevicePassthroughArrayOutput)
}

// The disk configuration.
func (o ContainerOutput) Disk() ContainerDiskPtrOutput {
	return o.ApplyT(func(v *Container) ContainerDiskPtrOutput { return v.Disk }).(ContainerDiskPtrOutput)
}

// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
func (o ContainerOutput) Features() ContainerFeaturesPtrOutput {
	return o.ApplyT(func(v *Container) ContainerFeaturesPtrOutput { return v.Features }).(ContainerFeaturesPtrOutput)
}

// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
func (o ContainerOutput) HookScriptFileId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.StringPtrOutput { return v.HookScriptFileId }).(pulumi.StringPtrOutput)
}

// The initialization configuration.
func (o ContainerOutput) Initialization() ContainerInitializationPtrOutput {
	return o.ApplyT(func(v *Container) ContainerInitializationPtrOutput { return v.Initialization }).(ContainerInitializationPtrOutput)
}

// The memory configuration.
func (o ContainerOutput) Memory() ContainerMemoryPtrOutput {
	return o.ApplyT(func(v *Container) ContainerMemoryPtrOutput { return v.Memory }).(ContainerMemoryPtrOutput)
}

// A mount point
func (o ContainerOutput) MountPoints() ContainerMountPointArrayOutput {
	return o.ApplyT(func(v *Container) ContainerMountPointArrayOutput { return v.MountPoints }).(ContainerMountPointArrayOutput)
}

// A network interface (multiple blocks
// supported).
func (o ContainerOutput) NetworkInterfaces() ContainerNetworkInterfaceArrayOutput {
	return o.ApplyT(func(v *Container) ContainerNetworkInterfaceArrayOutput { return v.NetworkInterfaces }).(ContainerNetworkInterfaceArrayOutput)
}

// The name of the node to assign the container to.
func (o ContainerOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Container) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// The Operating System configuration.
func (o ContainerOutput) OperatingSystem() ContainerOperatingSystemPtrOutput {
	return o.ApplyT(func(v *Container) ContainerOperatingSystemPtrOutput { return v.OperatingSystem }).(ContainerOperatingSystemPtrOutput)
}

// The identifier for a pool to assign the container to.
func (o ContainerOutput) PoolId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.StringPtrOutput { return v.PoolId }).(pulumi.StringPtrOutput)
}

// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
func (o ContainerOutput) Protection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Protection }).(pulumi.BoolPtrOutput)
}

// Automatically start container when the host
// system boots (defaults to `true`).
func (o ContainerOutput) StartOnBoot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.StartOnBoot }).(pulumi.BoolPtrOutput)
}

// Whether to start the container (defaults to `true`).
func (o ContainerOutput) Started() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Started }).(pulumi.BoolPtrOutput)
}

// Defines startup and shutdown behavior of the container.
func (o ContainerOutput) Startup() ContainerStartupPtrOutput {
	return o.ApplyT(func(v *Container) ContainerStartupPtrOutput { return v.Startup }).(ContainerStartupPtrOutput)
}

// A list of tags the container tags. This is only meta
// information (defaults to `[]`). Note: Proxmox always sorts the container tags.
// If the list in template is not sorted, then Proxmox will always report a
// difference on the resource. You may use the `ignoreChanges` lifecycle
// meta-argument to ignore changes to this attribute.
func (o ContainerOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Container) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Whether to create a template (defaults to `false`).
func (o ContainerOutput) Template() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Template }).(pulumi.BoolPtrOutput)
}

// Timeout for cloning a container in seconds (defaults to 1800).
func (o ContainerOutput) TimeoutClone() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.TimeoutClone }).(pulumi.IntPtrOutput)
}

// Timeout for creating a container in seconds (defaults to 1800).
func (o ContainerOutput) TimeoutCreate() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.TimeoutCreate }).(pulumi.IntPtrOutput)
}

// Timeout for deleting a container in seconds (defaults to 60).
func (o ContainerOutput) TimeoutDelete() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.TimeoutDelete }).(pulumi.IntPtrOutput)
}

// Start container timeout
//
// Deprecated: This field is deprecated and will be removed in a future release. An overall operation timeout (`timeoutCreate` / `timeoutClone`) is used instead.
func (o ContainerOutput) TimeoutStart() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.TimeoutStart }).(pulumi.IntPtrOutput)
}

// Timeout for updating a container in seconds (defaults to 1800).
func (o ContainerOutput) TimeoutUpdate() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.IntPtrOutput { return v.TimeoutUpdate }).(pulumi.IntPtrOutput)
}

// Whether the container runs as unprivileged on
// the host (defaults to `false`).
func (o ContainerOutput) Unprivileged() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Container) pulumi.BoolPtrOutput { return v.Unprivileged }).(pulumi.BoolPtrOutput)
}

// The container identifier
func (o ContainerOutput) VmId() pulumi.IntOutput {
	return o.ApplyT(func(v *Container) pulumi.IntOutput { return v.VmId }).(pulumi.IntOutput)
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
