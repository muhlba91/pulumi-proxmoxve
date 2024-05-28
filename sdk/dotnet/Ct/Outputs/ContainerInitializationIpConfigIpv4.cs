// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Outputs
{

    [OutputType]
    public sealed class ContainerInitializationIpConfigIpv4
    {
        /// <summary>
        /// The IPv4 address (use `dhcp` for
        /// autodiscovery).
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// The IPv4 gateway (must be omitted
        /// when `dhcp` is used as the address).
        /// </summary>
        public readonly string? Gateway;

        [OutputConstructor]
        private ContainerInitializationIpConfigIpv4(
            string? address,

            string? gateway)
        {
            Address = address;
            Gateway = gateway;
        }
    }
}
