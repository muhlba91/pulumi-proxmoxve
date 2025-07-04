// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE
{
    /// <summary>
    /// The provider type for the proxmox package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [ProxmoxVEResourceType("pulumi:providers:proxmoxve")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// The API token for the Proxmox VE API.
        /// </summary>
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        /// <summary>
        /// The pre-authenticated Ticket for the Proxmox VE API.
        /// </summary>
        [Output("authTicket")]
        public Output<string?> AuthTicket { get; private set; } = null!;

        /// <summary>
        /// The pre-authenticated CSRF Prevention Token for the Proxmox VE API.
        /// </summary>
        [Output("csrfPreventionToken")]
        public Output<string?> CsrfPreventionToken { get; private set; } = null!;

        /// <summary>
        /// The endpoint for the Proxmox VE API.
        /// </summary>
        [Output("endpoint")]
        public Output<string?> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
        /// </summary>
        [Output("minTls")]
        public Output<string?> MinTls { get; private set; } = null!;

        /// <summary>
        /// The one-time password for the Proxmox VE API.
        /// </summary>
        [Output("otp")]
        public Output<string?> Otp { get; private set; } = null!;

        /// <summary>
        /// The password for the Proxmox VE API.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The alternative temporary directory.
        /// </summary>
        [Output("tmpDir")]
        public Output<string?> TmpDir { get; private set; } = null!;

        /// <summary>
        /// The username for the Proxmox VE API.
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
                AdditionalSecretOutputs =
                {
                    "apiToken",
                    "authTicket",
                    "csrfPreventionToken",
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }

        /// <summary>
        /// This function returns a Terraform config object with terraform-namecased keys,to be used with the Terraform Module Provider.
        /// </summary>
        public global::Pulumi.Output<ProviderTerraformConfigResult> TerraformConfig()
            => global::Pulumi.Deployment.Instance.Call<ProviderTerraformConfigResult>("pulumi:providers:proxmoxve/terraformConfig", CallArgs.Empty, this);
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiToken")]
        private Input<string>? _apiToken;

        /// <summary>
        /// The API token for the Proxmox VE API.
        /// </summary>
        public Input<string>? ApiToken
        {
            get => _apiToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("authTicket")]
        private Input<string>? _authTicket;

        /// <summary>
        /// The pre-authenticated Ticket for the Proxmox VE API.
        /// </summary>
        public Input<string>? AuthTicket
        {
            get => _authTicket;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authTicket = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("csrfPreventionToken")]
        private Input<string>? _csrfPreventionToken;

        /// <summary>
        /// The pre-authenticated CSRF Prevention Token for the Proxmox VE API.
        /// </summary>
        public Input<string>? CsrfPreventionToken
        {
            get => _csrfPreventionToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _csrfPreventionToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The endpoint for the Proxmox VE API.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// Whether to skip the TLS verification step.
        /// </summary>
        [Input("insecure", json: true)]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
        /// </summary>
        [Input("minTls")]
        public Input<string>? MinTls { get; set; }

        /// <summary>
        /// The one-time password for the Proxmox VE API.
        /// </summary>
        [Input("otp")]
        public Input<string>? Otp { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Proxmox VE API.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The ending number for random VM / Container IDs.
        /// </summary>
        [Input("randomVmIdEnd", json: true)]
        public Input<int>? RandomVmIdEnd { get; set; }

        /// <summary>
        /// The starting number for random VM / Container IDs.
        /// </summary>
        [Input("randomVmIdStart", json: true)]
        public Input<int>? RandomVmIdStart { get; set; }

        /// <summary>
        /// Whether to generate random VM / Container IDs.
        /// </summary>
        [Input("randomVmIds", json: true)]
        public Input<bool>? RandomVmIds { get; set; }

        /// <summary>
        /// The SSH configuration for the Proxmox nodes.
        /// </summary>
        [Input("ssh", json: true)]
        public Input<Inputs.ProviderSshArgs>? Ssh { get; set; }

        /// <summary>
        /// The alternative temporary directory.
        /// </summary>
        [Input("tmpDir")]
        public Input<string>? TmpDir { get; set; }

        /// <summary>
        /// The username for the Proxmox VE API.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }

    /// <summary>
    /// The results of the <see cref="Provider.TerraformConfig"/> method.
    /// </summary>
    [OutputType]
    public sealed class ProviderTerraformConfigResult
    {
        public readonly ImmutableDictionary<string, object> Result;

        [OutputConstructor]
        private ProviderTerraformConfigResult(ImmutableDictionary<string, object> result)
        {
            Result = result;
        }
    }
}
