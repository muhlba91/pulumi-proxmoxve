// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Inputs
{

    public sealed class ContainerMountPointArgs : global::Pulumi.ResourceArgs
    {
        [Input("acl")]
        public Input<bool>? Acl { get; set; }

        [Input("backup")]
        public Input<bool>? Backup { get; set; }

        [Input("mountOptions")]
        private InputList<string>? _mountOptions;
        public InputList<string> MountOptions
        {
            get => _mountOptions ?? (_mountOptions = new InputList<string>());
            set => _mountOptions = value;
        }

        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        [Input("quota")]
        public Input<bool>? Quota { get; set; }

        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("replicate")]
        public Input<bool>? Replicate { get; set; }

        [Input("shared")]
        public Input<bool>? Shared { get; set; }

        [Input("size")]
        public Input<string>? Size { get; set; }

        [Input("volume", required: true)]
        public Input<string> Volume { get; set; } = null!;

        public ContainerMountPointArgs()
        {
        }
        public static new ContainerMountPointArgs Empty => new ContainerMountPointArgs();
    }
}
