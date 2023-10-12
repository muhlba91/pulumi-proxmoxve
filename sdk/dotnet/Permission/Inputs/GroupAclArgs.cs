// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission.Inputs
{

    public sealed class GroupAclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The path.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Whether to propagate to child paths.
        /// </summary>
        [Input("propagate")]
        public Input<bool>? Propagate { get; set; }

        /// <summary>
        /// The role identifier.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public GroupAclArgs()
        {
        }
        public static new GroupAclArgs Empty => new GroupAclArgs();
    }
}
