// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    [ProxmoxVEResourceType("proxmoxve:Permission/pool:Pool")]
    public partial class Pool : Pulumi.CustomResource
    {
        /// <summary>
        /// The pool comment
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The pool members
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<Outputs.PoolMember>> Members { get; private set; } = null!;

        /// <summary>
        /// The pool id
        /// </summary>
        [Output("poolId")]
        public Output<string> PoolId { get; private set; } = null!;


        /// <summary>
        /// Create a Pool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Pool(string name, PoolArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Permission/pool:Pool", name, args ?? new PoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Pool(string name, Input<string> id, PoolState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Permission/pool:Pool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Pool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Pool Get(string name, Input<string> id, PoolState? state = null, CustomResourceOptions? options = null)
        {
            return new Pool(name, id, state, options);
        }
    }

    public sealed class PoolArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The pool comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The pool id
        /// </summary>
        [Input("poolId", required: true)]
        public Input<string> PoolId { get; set; } = null!;

        public PoolArgs()
        {
        }
    }

    public sealed class PoolState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The pool comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("members")]
        private InputList<Inputs.PoolMemberGetArgs>? _members;

        /// <summary>
        /// The pool members
        /// </summary>
        public InputList<Inputs.PoolMemberGetArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.PoolMemberGetArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The pool id
        /// </summary>
        [Input("poolId")]
        public Input<string>? PoolId { get; set; }

        public PoolState()
        {
        }
    }
}
