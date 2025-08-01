// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationIpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 configuration.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.VirtualMachineInitializationIpConfigIpv4GetArgs>? Ipv4 { get; set; }

        /// <summary>
        /// The IPv6 configuration.
        /// </summary>
        [Input("ipv6")]
        public Input<Inputs.VirtualMachineInitializationIpConfigIpv6GetArgs>? Ipv6 { get; set; }

        public VirtualMachineInitializationIpConfigGetArgs()
        {
        }
        public static new VirtualMachineInitializationIpConfigGetArgs Empty => new VirtualMachineInitializationIpConfigGetArgs();
    }
}
