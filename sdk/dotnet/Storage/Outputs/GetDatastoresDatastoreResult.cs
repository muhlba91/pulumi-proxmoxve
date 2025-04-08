// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Storage.Outputs
{

    [OutputType]
    public sealed class GetDatastoresDatastoreResult
    {
        /// <summary>
        /// Whether the store is active.
        /// </summary>
        public readonly bool? Active;
        /// <summary>
        /// Allowed store content types.
        /// </summary>
        public readonly ImmutableArray<string> ContentTypes;
        /// <summary>
        /// Whether the store is enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The ID of the store.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the node the store is on.
        /// </summary>
        public readonly string NodeName;
        /// <summary>
        /// Shared flag from store configuration.
        /// </summary>
        public readonly bool? Shared;
        /// <summary>
        /// Available store space in bytes.
        /// </summary>
        public readonly int? SpaceAvailable;
        /// <summary>
        /// Total store space in bytes.
        /// </summary>
        public readonly int? SpaceTotal;
        /// <summary>
        /// Used store space in bytes.
        /// </summary>
        public readonly int? SpaceUsed;
        /// <summary>
        /// Used fraction (used/total).
        /// </summary>
        public readonly double? SpaceUsedFraction;
        /// <summary>
        /// Store type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDatastoresDatastoreResult(
            bool? active,

            ImmutableArray<string> contentTypes,

            bool? enabled,

            string id,

            string nodeName,

            bool? shared,

            int? spaceAvailable,

            int? spaceTotal,

            int? spaceUsed,

            double? spaceUsedFraction,

            string type)
        {
            Active = active;
            ContentTypes = contentTypes;
            Enabled = enabled;
            Id = id;
            NodeName = nodeName;
            Shared = shared;
            SpaceAvailable = spaceAvailable;
            SpaceTotal = spaceTotal;
            SpaceUsed = spaceUsed;
            SpaceUsedFraction = spaceUsedFraction;
            Type = type;
        }
    }
}
