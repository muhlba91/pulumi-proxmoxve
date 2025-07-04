// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.User
{
    /// <summary>
    /// User API tokens.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ProxmoxVE = Pulumi.ProxmoxVE;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // if creating a user token, the user must be created first
    ///     var user = new ProxmoxVE.Permission.User("user", new()
    ///     {
    ///         Comment = "Managed by Pulumi",
    ///         Email = "user@pve",
    ///         Enabled = true,
    ///         ExpirationDate = "2034-01-01T22:00:00Z",
    ///         UserId = "user@pve",
    ///     });
    /// 
    ///     var userToken = new ProxmoxVE.User.Token("userToken", new()
    ///     {
    ///         Comment = "Managed by Pulumi",
    ///         ExpirationDate = "2033-01-01T22:00:00Z",
    ///         TokenName = "tk1",
    ///         UserId = user.UserId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// #!/usr/bin/env sh
    /// 
    /// #Tokens can be imported using they identifiers in format `user_id!token_name` format, e.g.:
    /// 
    /// ```sh
    /// $ pulumi import proxmoxve:User/token:Token token1 user@pve!token1
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:User/token:Token")]
    public partial class Token : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Comment for the token.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Expiration date for the token.
        /// </summary>
        [Output("expirationDate")]
        public Output<string?> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
        /// </summary>
        [Output("privilegesSeparation")]
        public Output<bool> PrivilegesSeparation { get; private set; } = null!;

        /// <summary>
        /// User-specific token identifier.
        /// </summary>
        [Output("tokenName")]
        public Output<string> TokenName { get; private set; } = null!;

        /// <summary>
        /// User identifier.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;

        /// <summary>
        /// API token value used for authentication. It is populated only when creating a new token, and can't be retrieved at import.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a Token resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Token(string name, TokenArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:User/token:Token", name, args ?? new TokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Token(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:User/token:Token", name, state, MakeResourceOptions(options, id))
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
                    "value",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Token resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Token Get(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
        {
            return new Token(name, id, state, options);
        }
    }

    public sealed class TokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment for the token.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Expiration date for the token.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
        /// </summary>
        [Input("privilegesSeparation")]
        public Input<bool>? PrivilegesSeparation { get; set; }

        /// <summary>
        /// User-specific token identifier.
        /// </summary>
        [Input("tokenName", required: true)]
        public Input<string> TokenName { get; set; } = null!;

        /// <summary>
        /// User identifier.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public TokenArgs()
        {
        }
        public static new TokenArgs Empty => new TokenArgs();
    }

    public sealed class TokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Comment for the token.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Expiration date for the token.
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
        /// </summary>
        [Input("privilegesSeparation")]
        public Input<bool>? PrivilegesSeparation { get; set; }

        /// <summary>
        /// User-specific token identifier.
        /// </summary>
        [Input("tokenName")]
        public Input<string>? TokenName { get; set; }

        /// <summary>
        /// User identifier.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        [Input("value")]
        private Input<string>? _value;

        /// <summary>
        /// API token value used for authentication. It is populated only when creating a new token, and can't be retrieved at import.
        /// </summary>
        public Input<string>? Value
        {
            get => _value;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _value = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TokenState()
        {
        }
        public static new TokenState Empty => new TokenState();
    }
}
