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
    public sealed class VirtualMachineInitializationDns
    {
        /// <summary>
        /// The DNS search domain.
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// The DNS server.
        /// </summary>
        public readonly string? Server;

        [OutputConstructor]
        private VirtualMachineInitializationDns(
            string? domain,

            string? server)
        {
            Domain = domain;
            Server = server;
        }
    }
}
