// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationIpConfigIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv6 address in CIDR notation
        /// (e.g. fd1c:000:0000::0000:000:7334/64). Alternatively, set this
        /// to `dhcp` for autodiscovery.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The IPv6 gateway (must be omitted
        /// when `dhcp` is used as the address).
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        public VirtualMachineInitializationIpConfigIpv6Args()
        {
        }
        public static new VirtualMachineInitializationIpConfigIpv6Args Empty => new VirtualMachineInitializationIpConfigIpv6Args();
    }
}
