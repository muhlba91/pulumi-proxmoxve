// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT
{
    /// <summary>
    /// Manages a container.
    /// 
    /// ## Import
    /// 
    /// Instances can be imported using the `node_name` and the `vm_id`, e.g.,
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import proxmoxve:CT/container:Container ubuntu_container first-node/1234
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:CT/container:Container")]
    public partial class Container : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Output("clone")]
        public Output<Outputs.ContainerClone?> Clone { get; private set; } = null!;

        /// <summary>
        /// The console configuration.
        /// </summary>
        [Output("console")]
        public Output<Outputs.ContainerConsole?> Console { get; private set; } = null!;

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Output("cpu")]
        public Output<Outputs.ContainerCpu?> Cpu { get; private set; } = null!;

        /// <summary>
        /// The description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Device to pass through to the container (multiple blocks supported).
        /// </summary>
        [Output("devicePassthroughs")]
        public Output<ImmutableArray<Outputs.ContainerDevicePassthrough>> DevicePassthroughs { get; private set; } = null!;

        /// <summary>
        /// The disk configuration.
        /// </summary>
        [Output("disk")]
        public Output<Outputs.ContainerDisk?> Disk { get; private set; } = null!;

        /// <summary>
        /// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
        /// </summary>
        [Output("features")]
        public Output<Outputs.ContainerFeatures?> Features { get; private set; } = null!;

        /// <summary>
        /// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
        /// </summary>
        [Output("hookScriptFileId")]
        public Output<string?> HookScriptFileId { get; private set; } = null!;

        /// <summary>
        /// The initialization configuration.
        /// </summary>
        [Output("initialization")]
        public Output<Outputs.ContainerInitialization?> Initialization { get; private set; } = null!;

        /// <summary>
        /// The map of IPv4 addresses per network devices. Returns the first address for each network device, if multiple addresses are assigned.
        /// </summary>
        [Output("ipv4")]
        public Output<ImmutableDictionary<string, string>> Ipv4 { get; private set; } = null!;

        /// <summary>
        /// The map of IPv6 addresses per network device. Returns the first address for each network device, if multiple addresses are assigned.
        /// </summary>
        [Output("ipv6")]
        public Output<ImmutableDictionary<string, string>> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// The memory configuration.
        /// </summary>
        [Output("memory")]
        public Output<Outputs.ContainerMemory?> Memory { get; private set; } = null!;

        /// <summary>
        /// A mount point
        /// </summary>
        [Output("mountPoints")]
        public Output<ImmutableArray<Outputs.ContainerMountPoint>> MountPoints { get; private set; } = null!;

        /// <summary>
        /// A network interface (multiple blocks
        /// supported).
        /// </summary>
        [Output("networkInterfaces")]
        public Output<ImmutableArray<Outputs.ContainerNetworkInterface>> NetworkInterfaces { get; private set; } = null!;

        /// <summary>
        /// The name of the node to assign the container to.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;

        /// <summary>
        /// The Operating System configuration.
        /// </summary>
        [Output("operatingSystem")]
        public Output<Outputs.ContainerOperatingSystem?> OperatingSystem { get; private set; } = null!;

        /// <summary>
        /// The identifier for a pool to assign the container to.
        /// </summary>
        [Output("poolId")]
        public Output<string?> PoolId { get; private set; } = null!;

        /// <summary>
        /// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
        /// </summary>
        [Output("protection")]
        public Output<bool?> Protection { get; private set; } = null!;

        /// <summary>
        /// Automatically start container when the host
        /// system boots (defaults to `true`).
        /// </summary>
        [Output("startOnBoot")]
        public Output<bool?> StartOnBoot { get; private set; } = null!;

        /// <summary>
        /// Whether to start the container (defaults to `true`).
        /// </summary>
        [Output("started")]
        public Output<bool?> Started { get; private set; } = null!;

        /// <summary>
        /// Defines startup and shutdown behavior of the container.
        /// </summary>
        [Output("startup")]
        public Output<Outputs.ContainerStartup?> Startup { get; private set; } = null!;

        /// <summary>
        /// A list of tags the container tags. This is only meta
        /// information (defaults to `[]`). Note: Proxmox always sorts the container tags and set them to lowercase.
        /// If tag contains capital letters, then Proxmox will always report a
        /// difference on the resource. You may use the `ignore_changes` lifecycle
        /// meta-argument to ignore changes to this attribute.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Whether to create a template (defaults to `false`).
        /// </summary>
        [Output("template")]
        public Output<bool?> Template { get; private set; } = null!;

        /// <summary>
        /// Timeout for cloning a container in seconds (defaults to 1800).
        /// </summary>
        [Output("timeoutClone")]
        public Output<int?> TimeoutClone { get; private set; } = null!;

        /// <summary>
        /// Timeout for creating a container in seconds (defaults to 1800).
        /// </summary>
        [Output("timeoutCreate")]
        public Output<int?> TimeoutCreate { get; private set; } = null!;

        /// <summary>
        /// Timeout for deleting a container in seconds (defaults to 60).
        /// </summary>
        [Output("timeoutDelete")]
        public Output<int?> TimeoutDelete { get; private set; } = null!;

        /// <summary>
        /// Start container timeout
        /// </summary>
        [Output("timeoutStart")]
        public Output<int?> TimeoutStart { get; private set; } = null!;

        /// <summary>
        /// Timeout for updating a container in seconds (defaults to 1800).
        /// </summary>
        [Output("timeoutUpdate")]
        public Output<int?> TimeoutUpdate { get; private set; } = null!;

        /// <summary>
        /// Whether the container runs as unprivileged on the host (defaults to `false`).
        /// </summary>
        [Output("unprivileged")]
        public Output<bool?> Unprivileged { get; private set; } = null!;

        /// <summary>
        /// The container identifier
        /// </summary>
        [Output("vmId")]
        public Output<int> VmId { get; private set; } = null!;


        /// <summary>
        /// Create a Container resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Container(string name, ContainerArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:CT/container:Container", name, args ?? new ContainerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Container(string name, Input<string> id, ContainerState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:CT/container:Container", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/muhlba91/pulumi-proxmoxve",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Container resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Container Get(string name, Input<string> id, ContainerState? state = null, CustomResourceOptions? options = null)
        {
            return new Container(name, id, state, options);
        }
    }

    public sealed class ContainerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.ContainerCloneArgs>? Clone { get; set; }

        /// <summary>
        /// The console configuration.
        /// </summary>
        [Input("console")]
        public Input<Inputs.ContainerConsoleArgs>? Console { get; set; }

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.ContainerCpuArgs>? Cpu { get; set; }

        /// <summary>
        /// The description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("devicePassthroughs")]
        private InputList<Inputs.ContainerDevicePassthroughArgs>? _devicePassthroughs;

        /// <summary>
        /// Device to pass through to the container (multiple blocks supported).
        /// </summary>
        public InputList<Inputs.ContainerDevicePassthroughArgs> DevicePassthroughs
        {
            get => _devicePassthroughs ?? (_devicePassthroughs = new InputList<Inputs.ContainerDevicePassthroughArgs>());
            set => _devicePassthroughs = value;
        }

        /// <summary>
        /// The disk configuration.
        /// </summary>
        [Input("disk")]
        public Input<Inputs.ContainerDiskArgs>? Disk { get; set; }

        /// <summary>
        /// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("features")]
        public Input<Inputs.ContainerFeaturesArgs>? Features { get; set; }

        /// <summary>
        /// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
        /// </summary>
        [Input("hookScriptFileId")]
        public Input<string>? HookScriptFileId { get; set; }

        /// <summary>
        /// The initialization configuration.
        /// </summary>
        [Input("initialization")]
        public Input<Inputs.ContainerInitializationArgs>? Initialization { get; set; }

        /// <summary>
        /// The memory configuration.
        /// </summary>
        [Input("memory")]
        public Input<Inputs.ContainerMemoryArgs>? Memory { get; set; }

        [Input("mountPoints")]
        private InputList<Inputs.ContainerMountPointArgs>? _mountPoints;

        /// <summary>
        /// A mount point
        /// </summary>
        public InputList<Inputs.ContainerMountPointArgs> MountPoints
        {
            get => _mountPoints ?? (_mountPoints = new InputList<Inputs.ContainerMountPointArgs>());
            set => _mountPoints = value;
        }

        [Input("networkInterfaces")]
        private InputList<Inputs.ContainerNetworkInterfaceArgs>? _networkInterfaces;

        /// <summary>
        /// A network interface (multiple blocks
        /// supported).
        /// </summary>
        public InputList<Inputs.ContainerNetworkInterfaceArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ContainerNetworkInterfaceArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The name of the node to assign the container to.
        /// </summary>
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        /// <summary>
        /// The Operating System configuration.
        /// </summary>
        [Input("operatingSystem")]
        public Input<Inputs.ContainerOperatingSystemArgs>? OperatingSystem { get; set; }

        /// <summary>
        /// The identifier for a pool to assign the container to.
        /// </summary>
        [Input("poolId")]
        public Input<string>? PoolId { get; set; }

        /// <summary>
        /// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
        /// </summary>
        [Input("protection")]
        public Input<bool>? Protection { get; set; }

        /// <summary>
        /// Automatically start container when the host
        /// system boots (defaults to `true`).
        /// </summary>
        [Input("startOnBoot")]
        public Input<bool>? StartOnBoot { get; set; }

        /// <summary>
        /// Whether to start the container (defaults to `true`).
        /// </summary>
        [Input("started")]
        public Input<bool>? Started { get; set; }

        /// <summary>
        /// Defines startup and shutdown behavior of the container.
        /// </summary>
        [Input("startup")]
        public Input<Inputs.ContainerStartupArgs>? Startup { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags the container tags. This is only meta
        /// information (defaults to `[]`). Note: Proxmox always sorts the container tags and set them to lowercase.
        /// If tag contains capital letters, then Proxmox will always report a
        /// difference on the resource. You may use the `ignore_changes` lifecycle
        /// meta-argument to ignore changes to this attribute.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether to create a template (defaults to `false`).
        /// </summary>
        [Input("template")]
        public Input<bool>? Template { get; set; }

        /// <summary>
        /// Timeout for cloning a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutClone")]
        public Input<int>? TimeoutClone { get; set; }

        /// <summary>
        /// Timeout for creating a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutCreate")]
        public Input<int>? TimeoutCreate { get; set; }

        /// <summary>
        /// Timeout for deleting a container in seconds (defaults to 60).
        /// </summary>
        [Input("timeoutDelete")]
        public Input<int>? TimeoutDelete { get; set; }

        /// <summary>
        /// Start container timeout
        /// </summary>
        [Input("timeoutStart")]
        public Input<int>? TimeoutStart { get; set; }

        /// <summary>
        /// Timeout for updating a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutUpdate")]
        public Input<int>? TimeoutUpdate { get; set; }

        /// <summary>
        /// Whether the container runs as unprivileged on the host (defaults to `false`).
        /// </summary>
        [Input("unprivileged")]
        public Input<bool>? Unprivileged { get; set; }

        /// <summary>
        /// The container identifier
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public ContainerArgs()
        {
        }
        public static new ContainerArgs Empty => new ContainerArgs();
    }

    public sealed class ContainerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.ContainerCloneGetArgs>? Clone { get; set; }

        /// <summary>
        /// The console configuration.
        /// </summary>
        [Input("console")]
        public Input<Inputs.ContainerConsoleGetArgs>? Console { get; set; }

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.ContainerCpuGetArgs>? Cpu { get; set; }

        /// <summary>
        /// The description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("devicePassthroughs")]
        private InputList<Inputs.ContainerDevicePassthroughGetArgs>? _devicePassthroughs;

        /// <summary>
        /// Device to pass through to the container (multiple blocks supported).
        /// </summary>
        public InputList<Inputs.ContainerDevicePassthroughGetArgs> DevicePassthroughs
        {
            get => _devicePassthroughs ?? (_devicePassthroughs = new InputList<Inputs.ContainerDevicePassthroughGetArgs>());
            set => _devicePassthroughs = value;
        }

        /// <summary>
        /// The disk configuration.
        /// </summary>
        [Input("disk")]
        public Input<Inputs.ContainerDiskGetArgs>? Disk { get; set; }

        /// <summary>
        /// The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("features")]
        public Input<Inputs.ContainerFeaturesGetArgs>? Features { get; set; }

        /// <summary>
        /// The identifier for a file containing a hook script (needs to be executable, e.g. by using the `proxmox_virtual_environment_file.file_mode` attribute).
        /// </summary>
        [Input("hookScriptFileId")]
        public Input<string>? HookScriptFileId { get; set; }

        /// <summary>
        /// The initialization configuration.
        /// </summary>
        [Input("initialization")]
        public Input<Inputs.ContainerInitializationGetArgs>? Initialization { get; set; }

        [Input("ipv4")]
        private InputMap<string>? _ipv4;

        /// <summary>
        /// The map of IPv4 addresses per network devices. Returns the first address for each network device, if multiple addresses are assigned.
        /// </summary>
        public InputMap<string> Ipv4
        {
            get => _ipv4 ?? (_ipv4 = new InputMap<string>());
            set => _ipv4 = value;
        }

        [Input("ipv6")]
        private InputMap<string>? _ipv6;

        /// <summary>
        /// The map of IPv6 addresses per network device. Returns the first address for each network device, if multiple addresses are assigned.
        /// </summary>
        public InputMap<string> Ipv6
        {
            get => _ipv6 ?? (_ipv6 = new InputMap<string>());
            set => _ipv6 = value;
        }

        /// <summary>
        /// The memory configuration.
        /// </summary>
        [Input("memory")]
        public Input<Inputs.ContainerMemoryGetArgs>? Memory { get; set; }

        [Input("mountPoints")]
        private InputList<Inputs.ContainerMountPointGetArgs>? _mountPoints;

        /// <summary>
        /// A mount point
        /// </summary>
        public InputList<Inputs.ContainerMountPointGetArgs> MountPoints
        {
            get => _mountPoints ?? (_mountPoints = new InputList<Inputs.ContainerMountPointGetArgs>());
            set => _mountPoints = value;
        }

        [Input("networkInterfaces")]
        private InputList<Inputs.ContainerNetworkInterfaceGetArgs>? _networkInterfaces;

        /// <summary>
        /// A network interface (multiple blocks
        /// supported).
        /// </summary>
        public InputList<Inputs.ContainerNetworkInterfaceGetArgs> NetworkInterfaces
        {
            get => _networkInterfaces ?? (_networkInterfaces = new InputList<Inputs.ContainerNetworkInterfaceGetArgs>());
            set => _networkInterfaces = value;
        }

        /// <summary>
        /// The name of the node to assign the container to.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// The Operating System configuration.
        /// </summary>
        [Input("operatingSystem")]
        public Input<Inputs.ContainerOperatingSystemGetArgs>? OperatingSystem { get; set; }

        /// <summary>
        /// The identifier for a pool to assign the container to.
        /// </summary>
        [Input("poolId")]
        public Input<string>? PoolId { get; set; }

        /// <summary>
        /// Whether to set the protection flag of the container (defaults to `false`). This will prevent the container itself and its disk for remove/update operations.
        /// </summary>
        [Input("protection")]
        public Input<bool>? Protection { get; set; }

        /// <summary>
        /// Automatically start container when the host
        /// system boots (defaults to `true`).
        /// </summary>
        [Input("startOnBoot")]
        public Input<bool>? StartOnBoot { get; set; }

        /// <summary>
        /// Whether to start the container (defaults to `true`).
        /// </summary>
        [Input("started")]
        public Input<bool>? Started { get; set; }

        /// <summary>
        /// Defines startup and shutdown behavior of the container.
        /// </summary>
        [Input("startup")]
        public Input<Inputs.ContainerStartupGetArgs>? Startup { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags the container tags. This is only meta
        /// information (defaults to `[]`). Note: Proxmox always sorts the container tags and set them to lowercase.
        /// If tag contains capital letters, then Proxmox will always report a
        /// difference on the resource. You may use the `ignore_changes` lifecycle
        /// meta-argument to ignore changes to this attribute.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Whether to create a template (defaults to `false`).
        /// </summary>
        [Input("template")]
        public Input<bool>? Template { get; set; }

        /// <summary>
        /// Timeout for cloning a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutClone")]
        public Input<int>? TimeoutClone { get; set; }

        /// <summary>
        /// Timeout for creating a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutCreate")]
        public Input<int>? TimeoutCreate { get; set; }

        /// <summary>
        /// Timeout for deleting a container in seconds (defaults to 60).
        /// </summary>
        [Input("timeoutDelete")]
        public Input<int>? TimeoutDelete { get; set; }

        /// <summary>
        /// Start container timeout
        /// </summary>
        [Input("timeoutStart")]
        public Input<int>? TimeoutStart { get; set; }

        /// <summary>
        /// Timeout for updating a container in seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutUpdate")]
        public Input<int>? TimeoutUpdate { get; set; }

        /// <summary>
        /// Whether the container runs as unprivileged on the host (defaults to `false`).
        /// </summary>
        [Input("unprivileged")]
        public Input<bool>? Unprivileged { get; set; }

        /// <summary>
        /// The container identifier
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public ContainerState()
        {
        }
        public static new ContainerState Empty => new ContainerState();
    }
}
