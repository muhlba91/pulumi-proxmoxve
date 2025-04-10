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
    public sealed class VirtualMachineCdrom
    {
        /// <summary>
        /// Whether to enable the CD-ROM drive (defaults
        /// to `false`). *Deprecated*. The attribute will be removed in the next version of the provider.
        /// Set `file_id` to `none` to leave the CD-ROM drive empty.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// A file ID for an ISO file (defaults to `cdrom` as
        /// in the physical drive). Use `none` to leave the CD-ROM drive empty.
        /// </summary>
        public readonly string? FileId;
        /// <summary>
        /// A hardware interface to connect CD-ROM drive to,
        /// must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
        /// supports `ide0` and `ide2`.
        /// </summary>
        public readonly string? Interface;

        [OutputConstructor]
        private VirtualMachineCdrom(
            bool? enabled,

            string? fileId,

            string? @interface)
        {
            Enabled = enabled;
            FileId = fileId;
            Interface = @interface;
        }
    }
}
