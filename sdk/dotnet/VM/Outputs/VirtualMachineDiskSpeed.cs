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
        public readonly int? Read;
        public readonly int? ReadBurstable;
        public readonly int? Write;
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
