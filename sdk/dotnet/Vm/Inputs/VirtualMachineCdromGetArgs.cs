// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineCdromGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable the CD-ROM drive (defaults
        /// to `false`). *Deprecated*. The attribute will be removed in the next version of the provider.
        /// Set `file_id` to `none` to leave the CD-ROM drive empty.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// A file ID for an ISO file (defaults to `cdrom` as
        /// in the physical drive). Use `none` to leave the CD-ROM drive empty.
        /// </summary>
        [Input("fileId")]
        public Input<string>? FileId { get; set; }

        /// <summary>
        /// A hardware interface to connect CD-ROM drive to,
        /// must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
        /// supports `ide0` and `ide2`.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        public VirtualMachineCdromGetArgs()
        {
        }
        public static new VirtualMachineCdromGetArgs Empty => new VirtualMachineCdromGetArgs();
    }
}
