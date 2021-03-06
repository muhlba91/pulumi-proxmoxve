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
    public sealed class VirtualMachineDisk
    {
        public readonly string? DatastoreId;
        public readonly string? FileFormat;
        public readonly string? FileId;
        public readonly string Interface;
        public readonly int? Size;
        public readonly Outputs.VirtualMachineDiskSpeed? Speed;

        [OutputConstructor]
        private VirtualMachineDisk(
            string? datastoreId,

            string? fileFormat,

            string? fileId,

            string @interface,

            int? size,

            Outputs.VirtualMachineDiskSpeed? speed)
        {
            DatastoreId = datastoreId;
            FileFormat = fileFormat;
            FileId = fileId;
            Interface = @interface;
            Size = size;
            Speed = speed;
        }
    }
}
