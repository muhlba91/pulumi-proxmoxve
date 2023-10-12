// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineSmbiosArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The family string.
        /// </summary>
        [Input("family")]
        public Input<string>? Family { get; set; }

        /// <summary>
        /// The manufacturer.
        /// </summary>
        [Input("manufacturer")]
        public Input<string>? Manufacturer { get; set; }

        /// <summary>
        /// The product ID.
        /// </summary>
        [Input("product")]
        public Input<string>? Product { get; set; }

        /// <summary>
        /// The serial number.
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// The SKU number.
        /// </summary>
        [Input("sku")]
        public Input<string>? Sku { get; set; }

        /// <summary>
        /// The UUID (defaults to randomly generated UUID).
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// The version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public VirtualMachineSmbiosArgs()
        {
        }
        public static new VirtualMachineSmbiosArgs Empty => new VirtualMachineSmbiosArgs();
    }
}
