// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationDnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DNS search domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("servers")]
        private InputList<string>? _servers;

        /// <summary>
        /// The list of DNS servers.
        /// </summary>
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        public VirtualMachineInitializationDnsArgs()
        {
        }
        public static new VirtualMachineInitializationDnsArgs Empty => new VirtualMachineInitializationDnsArgs();
    }
}
