// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network
{
    /// <summary>
    /// Manages a Linux Bridge network interface in a Proxmox VE node.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ProxmoxVE = Pulumi.ProxmoxVE;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var vmbr99 = new ProxmoxVE.Network.NetworkBridge("vmbr99", new()
    ///     {
    ///         NodeName = "pve",
    ///         Address = "99.99.99.99/16",
    ///         Comment = "vmbr99 comment",
    ///         Ports = new[]
    ///         {
    ///             "ens18.99",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             proxmox_virtual_environment_network_linux_vlan.Vlan99,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// #!/usr/bin/env sh
    /// 
    ///  #Interfaces can be imported using the `node_name:iface` format, e.g.
    /// 
    /// ```sh
    /// $ pulumi import proxmoxve:Network/networkBridge:NetworkBridge vmbr99 pve:vmbr99
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:Network/networkBridge:NetworkBridge")]
    public partial class NetworkBridge : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The interface IPv4/CIDR address.
        /// </summary>
        [Output("address")]
        public Output<string?> Address { get; private set; } = null!;

        /// <summary>
        /// The interface IPv6/CIDR address.
        /// </summary>
        [Output("address6")]
        public Output<string?> Address6 { get; private set; } = null!;

        /// <summary>
        /// Automatically start interface on boot (defaults to `true`).
        /// </summary>
        [Output("autostart")]
        public Output<bool> Autostart { get; private set; } = null!;

        /// <summary>
        /// Comment for the interface.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Default gateway address.
        /// </summary>
        [Output("gateway")]
        public Output<string?> Gateway { get; private set; } = null!;

        /// <summary>
        /// Default IPv6 gateway address.
        /// </summary>
        [Output("gateway6")]
        public Output<string?> Gateway6 { get; private set; } = null!;

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Output("mtu")]
        public Output<int?> Mtu { get; private set; } = null!;

        /// <summary>
        /// The interface name. Must be `vmbrN`, where N is a number between 0 and 9999.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;

        /// <summary>
        /// The interface bridge ports.
        /// </summary>
        [Output("ports")]
        public Output<ImmutableArray<string>> Ports { get; private set; } = null!;

        /// <summary>
        /// Whether the interface bridge is VLAN aware (defaults to `false`).
        /// </summary>
        [Output("vlanAware")]
        public Output<bool> VlanAware { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkBridge resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkBridge(string name, NetworkBridgeArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/networkBridge:NetworkBridge", name, args ?? new NetworkBridgeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkBridge(string name, Input<string> id, NetworkBridgeState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/networkBridge:NetworkBridge", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkBridge resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkBridge Get(string name, Input<string> id, NetworkBridgeState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkBridge(name, id, state, options);
        }
    }

    public sealed class NetworkBridgeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The interface IPv4/CIDR address.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The interface IPv6/CIDR address.
        /// </summary>
        [Input("address6")]
        public Input<string>? Address6 { get; set; }

        /// <summary>
        /// Automatically start interface on boot (defaults to `true`).
        /// </summary>
        [Input("autostart")]
        public Input<bool>? Autostart { get; set; }

        /// <summary>
        /// Comment for the interface.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Default gateway address.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Default IPv6 gateway address.
        /// </summary>
        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The interface name. Must be `vmbrN`, where N is a number between 0 and 9999.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        [Input("ports")]
        private InputList<string>? _ports;

        /// <summary>
        /// The interface bridge ports.
        /// </summary>
        public InputList<string> Ports
        {
            get => _ports ?? (_ports = new InputList<string>());
            set => _ports = value;
        }

        /// <summary>
        /// Whether the interface bridge is VLAN aware (defaults to `false`).
        /// </summary>
        [Input("vlanAware")]
        public Input<bool>? VlanAware { get; set; }

        public NetworkBridgeArgs()
        {
        }
        public static new NetworkBridgeArgs Empty => new NetworkBridgeArgs();
    }

    public sealed class NetworkBridgeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The interface IPv4/CIDR address.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The interface IPv6/CIDR address.
        /// </summary>
        [Input("address6")]
        public Input<string>? Address6 { get; set; }

        /// <summary>
        /// Automatically start interface on boot (defaults to `true`).
        /// </summary>
        [Input("autostart")]
        public Input<bool>? Autostart { get; set; }

        /// <summary>
        /// Comment for the interface.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Default gateway address.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Default IPv6 gateway address.
        /// </summary>
        [Input("gateway6")]
        public Input<string>? Gateway6 { get; set; }

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The interface name. Must be `vmbrN`, where N is a number between 0 and 9999.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        [Input("ports")]
        private InputList<string>? _ports;

        /// <summary>
        /// The interface bridge ports.
        /// </summary>
        public InputList<string> Ports
        {
            get => _ports ?? (_ports = new InputList<string>());
            set => _ports = value;
        }

        /// <summary>
        /// Whether the interface bridge is VLAN aware (defaults to `false`).
        /// </summary>
        [Input("vlanAware")]
        public Input<bool>? VlanAware { get; set; }

        public NetworkBridgeState()
        {
        }
        public static new NetworkBridgeState Empty => new NetworkBridgeState();
    }
}
