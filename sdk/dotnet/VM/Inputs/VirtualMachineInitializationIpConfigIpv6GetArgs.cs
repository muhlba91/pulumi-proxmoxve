// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationIpConfigIpv6GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv6 address (use `dhcp` for
        /// autodiscovery).
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The IPv6 gateway (must be omitted
        /// when `dhcp` is used as the address).
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        public VirtualMachineInitializationIpConfigIpv6GetArgs()
        {
        }
        public static new VirtualMachineInitializationIpConfigIpv6GetArgs Empty => new VirtualMachineInitializationIpConfigIpv6GetArgs();
    }
}
