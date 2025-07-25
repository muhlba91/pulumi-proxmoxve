// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineInitializationIpConfigIpv4
    {
        /// <summary>
        /// The IPv4 address in CIDR notation
        /// (e.g. 192.168.2.2/24). Alternatively, set this to `dhcp` for
        /// autodiscovery.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// The IPv4 gateway (must be omitted
        /// when `dhcp` is used as the address).
        /// </summary>
        public readonly string? Gateway;

        [OutputConstructor]
        private VirtualMachineInitializationIpConfigIpv4(
            string? address,

            string? gateway)
        {
            Address = address;
            Gateway = gateway;
        }
    }
}
