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
    public sealed class VirtualMachineSmbios
    {
        public readonly string? Family;
        public readonly string? Manufacturer;
        public readonly string? Product;
        public readonly string? Serial;
        public readonly string? Sku;
        public readonly string? Uuid;
        public readonly string? Version;

        [OutputConstructor]
        private VirtualMachineSmbios(
            string? family,

            string? manufacturer,

            string? product,

            string? serial,

            string? sku,

            string? uuid,

            string? version)
        {
            Family = family;
            Manufacturer = manufacturer;
            Product = product;
            Serial = serial;
            Sku = sku;
            Uuid = uuid;
            Version = version;
        }
    }
}