// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Cluster.Outputs
{

    [OutputType]
    public sealed class OptionsNotify
    {
        /// <summary>
        /// Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
        /// </summary>
        public readonly string? HaFencingMode;
        /// <summary>
        /// Cluster-wide notification settings for the HA fencing target.
        /// </summary>
        public readonly string? HaFencingTarget;
        /// <summary>
        /// Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
        /// </summary>
        public readonly string? PackageUpdates;
        /// <summary>
        /// Cluster-wide notification settings for the package updates target.
        /// </summary>
        public readonly string? PackageUpdatesTarget;
        /// <summary>
        /// Cluster-wide notification settings for replication. Must be `always` | `never`.
        /// </summary>
        public readonly string? Replication;
        /// <summary>
        /// Cluster-wide notification settings for the replication target.
        /// </summary>
        public readonly string? ReplicationTarget;

        [OutputConstructor]
        private OptionsNotify(
            string? haFencingMode,

            string? haFencingTarget,

            string? packageUpdates,

            string? packageUpdatesTarget,

            string? replication,

            string? replicationTarget)
        {
            HaFencingMode = haFencingMode;
            HaFencingTarget = haFencingTarget;
            PackageUpdates = packageUpdates;
            PackageUpdatesTarget = packageUpdatesTarget;
            Replication = replication;
            ReplicationTarget = replicationTarget;
        }
    }
}
