// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network
{
    [ProxmoxVEResourceType("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup")]
    public partial class FirewallSecurityGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Security group comment
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Output("containerId")]
        public Output<int?> ContainerId { get; private set; } = null!;

        /// <summary>
        /// Security group name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Output("nodeName")]
        public Output<string?> NodeName { get; private set; } = null!;

        /// <summary>
        /// List of rules
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.FirewallSecurityGroupRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Output("vmId")]
        public Output<int?> VmId { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallSecurityGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallSecurityGroup(string name, FirewallSecurityGroupArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, args ?? new FirewallSecurityGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallSecurityGroup(string name, Input<string> id, FirewallSecurityGroupState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallSecurityGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallSecurityGroup Get(string name, Input<string> id, FirewallSecurityGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallSecurityGroup(name, id, state, options);
        }
    }

    public sealed class FirewallSecurityGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security group comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Input("containerId")]
        public Input<int>? ContainerId { get; set; }

        /// <summary>
        /// Security group name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        [Input("rules", required: true)]
        private InputList<Inputs.FirewallSecurityGroupRuleArgs>? _rules;

        /// <summary>
        /// List of rules
        /// </summary>
        public InputList<Inputs.FirewallSecurityGroupRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.FirewallSecurityGroupRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public FirewallSecurityGroupArgs()
        {
        }
        public static new FirewallSecurityGroupArgs Empty => new FirewallSecurityGroupArgs();
    }

    public sealed class FirewallSecurityGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Security group comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Input("containerId")]
        public Input<int>? ContainerId { get; set; }

        /// <summary>
        /// Security group name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        [Input("rules")]
        private InputList<Inputs.FirewallSecurityGroupRuleGetArgs>? _rules;

        /// <summary>
        /// List of rules
        /// </summary>
        public InputList<Inputs.FirewallSecurityGroupRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.FirewallSecurityGroupRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public FirewallSecurityGroupState()
        {
        }
        public static new FirewallSecurityGroupState Empty => new FirewallSecurityGroupState();
    }
}
