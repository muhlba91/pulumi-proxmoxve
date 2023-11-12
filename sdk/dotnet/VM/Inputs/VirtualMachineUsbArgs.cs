// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineUsbArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The USB device ID. Use either this or `mapping`.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// The resource mapping name of the device, for
        /// example usbdevice. Use either this or `id`.
        /// </summary>
        [Input("mapping")]
        public Input<string>? Mapping { get; set; }

        /// <summary>
        /// Makes the USB device a USB3 device for the VM (defaults
        /// to `false`).
        /// </summary>
        [Input("usb3")]
        public Input<bool>? Usb3 { get; set; }

        public VirtualMachineUsbArgs()
        {
        }
        public static new VirtualMachineUsbArgs Empty => new VirtualMachineUsbArgs();
    }
}