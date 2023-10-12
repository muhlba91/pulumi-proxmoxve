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
        /// Whether to enable the VGA device (defaults
        /// to `true`).
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The file ID for a disk image (experimental -
        /// might cause high CPU utilization during import, especially with large
        /// disk images).
        /// </summary>
        public readonly string? FileId;
        /// <summary>
        /// The hardware interface to connect the cloud-init
        /// image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
        /// detected if the setting is missing but a cloud-init image is present,
        /// otherwise defaults to `ide2`.
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
