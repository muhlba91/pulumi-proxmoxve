// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE
{
    /// <summary>
    /// The provider type for the proxmoxve package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [ProxmoxVEResourceType("pulumi:providers:proxmoxve")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// The endpoint for the Proxmox Virtual Environment API
        /// </summary>
        [Output("endpoint")]
        public Output<string?> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The one-time password for the Proxmox Virtual Environment API
        /// </summary>
        [Output("otp")]
        public Output<string?> Otp { get; private set; } = null!;

        /// <summary>
        /// The password for the Proxmox Virtual Environment API
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The username for the Proxmox Virtual Environment API
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("proxmoxve", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/muhlba91/pulumi-proxmoxve",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint for the Proxmox Virtual Environment API
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Whether to skip the TLS verification step
        /// </summary>
        [Input("insecure", json: true)]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// The one-time password for the Proxmox Virtual Environment API
        /// </summary>
        [Input("otp")]
        public Input<string>? Otp { get; set; }

        /// <summary>
        /// The password for the Proxmox Virtual Environment API
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The username for the Proxmox Virtual Environment API
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("virtualEnvironment", json: true)]
        public Input<Inputs.ProviderVirtualEnvironmentArgs>? VirtualEnvironment { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
