// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineAudioDevice
    {
        public readonly string? Device;
        public readonly string? Driver;
        public readonly bool? Enabled;

        [OutputConstructor]
        private VirtualMachineAudioDevice(
            string? device,

            string? driver,

            bool? enabled)
        {
            Device = device;
            Driver = driver;
            Enabled = enabled;
        }
    }
}
