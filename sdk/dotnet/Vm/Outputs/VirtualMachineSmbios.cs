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
    public sealed class VirtualMachineSmbios
    {
        /// <summary>
        /// The family string.
        /// </summary>
        public readonly string? Family;
        /// <summary>
        /// The manufacturer.
        /// </summary>
        public readonly string? Manufacturer;
        /// <summary>
        /// The product ID.
        /// </summary>
        public readonly string? Product;
        /// <summary>
        /// The serial number.
        /// </summary>
        public readonly string? Serial;
        /// <summary>
        /// The SKU number.
        /// </summary>
        public readonly string? Sku;
        /// <summary>
        /// The UUID (defaults to randomly generated UUID).
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// The version.
        /// </summary>
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
