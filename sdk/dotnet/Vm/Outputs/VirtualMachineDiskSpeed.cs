// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineDiskSpeed
    {
        /// <summary>
        /// The maximum read speed in megabytes per second.
        /// </summary>
        public readonly int? Read;
        /// <summary>
        /// The maximum burstable read speed in
        /// megabytes per second.
        /// </summary>
        public readonly int? ReadBurstable;
        /// <summary>
        /// The maximum write speed in megabytes per second.
        /// </summary>
        public readonly int? Write;
        /// <summary>
        /// The maximum burstable write speed in
        /// megabytes per second.
        /// </summary>
        public readonly int? WriteBurstable;

        [OutputConstructor]
        private VirtualMachineDiskSpeed(
            int? read,

            int? readBurstable,

            int? write,

            int? writeBurstable)
        {
            Read = read;
            ReadBurstable = readBurstable;
            Write = write;
            WriteBurstable = writeBurstable;
        }
    }
}