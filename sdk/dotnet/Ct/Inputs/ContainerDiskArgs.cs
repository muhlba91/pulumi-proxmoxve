// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Inputs
{

    public sealed class ContainerDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// disk in (defaults to `local`).
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        /// <summary>
        /// The size of the root filesystem in gigabytes (defaults
        /// to `4`). When set to 0 a directory or zfs/btrfs subvolume will be created.
        /// Requires `datastore_id` to be set.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        public ContainerDiskArgs()
        {
        }
        public static new ContainerDiskArgs Empty => new ContainerDiskArgs();
    }
}
