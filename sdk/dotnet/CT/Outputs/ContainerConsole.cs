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
        public readonly bool? Enabled;
        public readonly int? TtyCount;
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
