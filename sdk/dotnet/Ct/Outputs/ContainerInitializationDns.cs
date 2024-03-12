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
    public sealed class ContainerInitializationDns
    {
        /// <summary>
        /// The DNS search domain.
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// The DNS server. The `server` attribute is
        /// deprecated and will be removed in a future release. Please use
        /// the `servers` attribute instead.
        /// </summary>
        public readonly string? Server;
        /// <summary>
        /// The list of DNS servers.
        /// </summary>
        public readonly ImmutableArray<string> Servers;

        [OutputConstructor]
        private ContainerInitializationDns(
            string? domain,

            string? server,

            ImmutableArray<string> servers)
        {
            Domain = domain;
            Server = server;
            Servers = servers;
        }
    }
}