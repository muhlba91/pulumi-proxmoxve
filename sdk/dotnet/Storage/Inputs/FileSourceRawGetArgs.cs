// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Storage.Inputs
{

    public sealed class FileSourceRawGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The raw data.
        /// </summary>
        [Input("data", required: true)]
        public Input<string> Data { get; set; } = null!;

        /// <summary>
        /// The file name.
        /// </summary>
        [Input("fileName", required: true)]
        public Input<string> FileName { get; set; } = null!;

        /// <summary>
        /// The number of bytes to resize the file to.
        /// </summary>
        [Input("resize")]
        public Input<int>? Resize { get; set; }

        public FileSourceRawGetArgs()
        {
        }
        public static new FileSourceRawGetArgs Empty => new FileSourceRawGetArgs();
    }
}
