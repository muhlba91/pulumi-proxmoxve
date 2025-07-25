// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network.Inputs
{

    public sealed class FirewallIPSetCidrArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Arbitrary string annotation.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Network/IP specification in CIDR format.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Entries marked as `nomatch` are skipped as if those
        /// were not added to the set.
        /// </summary>
        [Input("nomatch")]
        public Input<bool>? Nomatch { get; set; }

        public FirewallIPSetCidrArgs()
        {
        }
        public static new FirewallIPSetCidrArgs Empty => new FirewallIPSetCidrArgs();
    }
}
