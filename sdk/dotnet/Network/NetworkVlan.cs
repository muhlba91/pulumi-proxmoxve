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
    /// Manages a Linux VLAN network interface in a Proxmox VE node.
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
    ///     // using VLAN tag
    ///     var vlan99 = new ProxmoxVE.Network.NetworkVlan("vlan99", new()
    ///     {
    ///         Comment = "VLAN 99",
    ///         NodeName = "pve",
    ///     });
    /// 
    ///     // using custom network interface name
    ///     var vlan98 = new ProxmoxVE.Network.NetworkVlan("vlan98", new()
    ///     {
    ///         Comment = "VLAN 98",
    ///         Interface = "eno0",
    ///         NodeName = "pve",
    ///         Vlan = 98,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// #!/usr/bin/env sh #Interfaces can be imported using the `node_name:iface` format, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import proxmoxve:Network/networkVlan:NetworkVlan vlan99 pve:vlan99
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:Network/networkVlan:NetworkVlan")]
    public partial class NetworkVlan : global::Pulumi.CustomResource
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
        /// The VLAN raw device. See also `name`.
        /// </summary>
        [Output("interface")]
        public Output<string> Interface { get; private set; } = null!;

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Output("mtu")]
        public Output<int?> Mtu { get; private set; } = null!;

        /// <summary>
        /// The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;

        /// <summary>
        /// The VLAN tag. See also `name`.
        /// </summary>
        [Output("vlan")]
        public Output<int> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkVlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkVlan(string name, NetworkVlanArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/networkVlan:NetworkVlan", name, args ?? new NetworkVlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkVlan(string name, Input<string> id, NetworkVlanState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/networkVlan:NetworkVlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkVlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkVlan Get(string name, Input<string> id, NetworkVlanState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkVlan(name, id, state, options);
        }
    }

    public sealed class NetworkVlanArgs : global::Pulumi.ResourceArgs
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
        /// The VLAN raw device. See also `name`.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        /// <summary>
        /// The VLAN tag. See also `name`.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public NetworkVlanArgs()
        {
        }
        public static new NetworkVlanArgs Empty => new NetworkVlanArgs();
    }

    public sealed class NetworkVlanState : global::Pulumi.ResourceArgs
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
        /// The VLAN raw device. See also `name`.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// The interface MTU.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// The VLAN tag. See also `name`.
        /// </summary>
        [Input("vlan")]
        public Input<int>? Vlan { get; set; }

        public NetworkVlanState()
        {
        }
        public static new NetworkVlanState Empty => new NetworkVlanState();
    }
}
