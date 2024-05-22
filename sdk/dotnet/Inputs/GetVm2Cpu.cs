// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Inputs
{

    public sealed class GetVm2CpuArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// List of host cores used to execute guest processes, for example: '0,5,8-11'
        /// </summary>
        [Input("affinity", required: true)]
        public string Affinity { get; set; } = null!;

        /// <summary>
        /// The CPU architecture.
        /// </summary>
        [Input("architecture", required: true)]
        public string Architecture { get; set; } = null!;

        /// <summary>
        /// The number of CPU cores per socket.
        /// </summary>
        [Input("cores", required: true)]
        public int Cores { get; set; }

        [Input("flags", required: true)]
        private List<string>? _flags;

        /// <summary>
        /// Set of additional CPU flags.
        /// </summary>
        public List<string> Flags
        {
            get => _flags ?? (_flags = new List<string>());
            set => _flags = value;
        }

        /// <summary>
        /// The number of hotplugged vCPUs.
        /// </summary>
        [Input("hotplugged", required: true)]
        public int Hotplugged { get; set; }

        /// <summary>
        /// Limit of CPU usage.
        /// </summary>
        [Input("limit", required: true)]
        public int Limit { get; set; }

        /// <summary>
        /// Enable NUMA.
        /// </summary>
        [Input("numa", required: true)]
        public bool Numa { get; set; }

        /// <summary>
        /// The number of CPU sockets.
        /// </summary>
        [Input("sockets", required: true)]
        public int Sockets { get; set; }

        /// <summary>
        /// Emulated CPU type.
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// CPU weight for a VM
        /// </summary>
        [Input("units", required: true)]
        public int Units { get; set; }

        public GetVm2CpuArgs()
        {
        }
        public static new GetVm2CpuArgs Empty => new GetVm2CpuArgs();
    }
}
