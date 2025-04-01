// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Inputs
{

    public sealed class GetVm2RngInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum bytes of entropy allowed to get injected into the guest every period.
        /// </summary>
        [Input("maxBytes", required: true)]
        public Input<int> MaxBytes { get; set; } = null!;

        /// <summary>
        /// Period in milliseconds to limit entropy injection to the guest.
        /// </summary>
        [Input("period", required: true)]
        public Input<int> Period { get; set; } = null!;

        /// <summary>
        /// The entropy source for the RNG device.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public GetVm2RngInputArgs()
        {
        }
        public static new GetVm2RngInputArgs Empty => new GetVm2RngInputArgs();
    }
}
