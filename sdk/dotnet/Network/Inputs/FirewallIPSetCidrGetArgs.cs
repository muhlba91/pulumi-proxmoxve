// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network.Inputs
{

    public sealed class FirewallIPSetCidrGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("nomatch")]
        public Input<bool>? Nomatch { get; set; }

        public FirewallIPSetCidrGetArgs()
        {
        }
        public static new FirewallIPSetCidrGetArgs Empty => new FirewallIPSetCidrGetArgs();
    }
}
