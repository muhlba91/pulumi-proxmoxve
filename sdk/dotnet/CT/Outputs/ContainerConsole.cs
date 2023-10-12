// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Outputs
{

    [OutputType]
    public sealed class ContainerConsole
    {
        /// <summary>
        /// Whether to enable the network device (defaults
        /// to `true`).
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The number of available TTY (defaults to `2`).
        /// </summary>
        public readonly int? TtyCount;
        /// <summary>
        /// The type (defaults to `unmanaged`).
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ContainerConsole(
            bool? enabled,

            int? ttyCount,

            string? type)
        {
            Enabled = enabled;
            TtyCount = ttyCount;
            Type = type;
        }
    }
}
