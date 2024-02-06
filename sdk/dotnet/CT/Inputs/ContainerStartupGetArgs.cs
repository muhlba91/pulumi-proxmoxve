// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Inputs
{

    public sealed class ContainerStartupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A non-negative number defining the delay in seconds before the next container is shut down
        /// </summary>
        [Input("downDelay")]
        public Input<int>? DownDelay { get; set; }

        /// <summary>
        /// A non-negative number defining the general startup
        /// order.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// A non-negative number defining the delay in seconds before the next container is started
        /// </summary>
        [Input("upDelay")]
        public Input<int>? UpDelay { get; set; }

        public ContainerStartupGetArgs()
        {
        }
        public static new ContainerStartupGetArgs Empty => new ContainerStartupGetArgs();
    }
}
