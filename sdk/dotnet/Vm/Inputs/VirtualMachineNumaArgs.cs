// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineNumaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CPU cores to assign to the NUMA node (format is `0-7;16-31`).
        /// </summary>
        [Input("cpus", required: true)]
        public Input<string> Cpus { get; set; } = null!;

        /// <summary>
        /// The device (defaults to `socket`).
        /// - `/dev/*` - A host serial device.
        /// </summary>
        [Input("device", required: true)]
        public Input<string> Device { get; set; } = null!;

        /// <summary>
        /// The NUMA host nodes.
        /// </summary>
        [Input("hostnodes")]
        public Input<string>? Hostnodes { get; set; }

        /// <summary>
        /// The VGA memory in megabytes (defaults to `16`).
        /// </summary>
        [Input("memory", required: true)]
        public Input<int> Memory { get; set; } = null!;

        /// <summary>
        /// The NUMA policy (defaults to `preferred`).
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public VirtualMachineNumaArgs()
        {
        }
        public static new VirtualMachineNumaArgs Empty => new VirtualMachineNumaArgs();
    }
}
