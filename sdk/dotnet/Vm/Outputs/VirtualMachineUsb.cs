// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineUsb
    {
        /// <summary>
        /// The Host USB device or port or the value `spice`. Use either this or `mapping`.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// The cluster-wide resource mapping name of the device, for example "usbdevice". Use either this or `host`.
        /// </summary>
        public readonly string? Mapping;
        /// <summary>
        /// Makes the USB device a USB3 device for the VM
        /// (defaults to `false`).
        /// </summary>
        public readonly bool? Usb3;

        [OutputConstructor]
        private VirtualMachineUsb(
            string? host,

            string? mapping,

            bool? usb3)
        {
            Host = host;
            Mapping = mapping;
            Usb3 = usb3;
        }
    }
}
