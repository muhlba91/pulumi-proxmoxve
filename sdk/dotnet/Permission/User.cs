// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    /// <summary>
    /// Manages a user.
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
    ///     var operationsMonitoring = new ProxmoxVE.Permission.Role("operationsMonitoring", new()
    ///     {
    ///         RoleId = "operations-monitoring",
    ///         Privileges = new[]
    ///         {
    ///             "VM.Monitor",
    ///         },
    ///     });
    /// 
    ///     var operationsAutomation = new ProxmoxVE.Permission.User("operationsAutomation", new()
    ///     {
    ///         Acls = new[]
    ///         {
    ///             new ProxmoxVE.Permission.Inputs.UserAclArgs
    ///             {
    ///                 Path = "/vms/1234",
    ///                 Propagate = true,
    ///                 RoleId = operationsMonitoring.RoleId,
    ///             },
    ///         },
    ///         Comment = "Managed by Pulumi",
    ///         Password = "a-strong-password",
    ///         UserId = "operations-automation@pve",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Instances can be imported using the `user_id`, e.g.,
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import proxmoxve:Permission/user:User operations_automation operations-automation@pve
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:Permission/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The access control list (multiple blocks supported).
        /// </summary>
        [Output("acls")]
        public Output<ImmutableArray<Outputs.UserAcl>> Acls { get; private set; } = null!;

        /// <summary>
        /// The user comment.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The user's email address.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// Whether the user account is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The user account's expiration date (RFC 3339).
        /// </summary>
        [Output("expirationDate")]
        public Output<string?> ExpirationDate { get; private set; } = null!;

        /// <summary>
        /// The user's first name.
        /// </summary>
        [Output("firstName")]
        public Output<string?> FirstName { get; private set; } = null!;

        /// <summary>
        /// The user's groups.
        /// </summary>
        [Output("groups")]
        public Output<ImmutableArray<string>> Groups { get; private set; } = null!;

        /// <summary>
        /// The user's keys.
        /// </summary>
        [Output("keys")]
        public Output<string?> Keys { get; private set; } = null!;

        /// <summary>
        /// The user's last name.
        /// </summary>
        [Output("lastName")]
        public Output<string?> LastName { get; private set; } = null!;

        /// <summary>
        /// The user's password. Required for PVE or PAM realms.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// The user identifier.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Permission/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Permission/user:User", name, state, MakeResourceOptions(options, id))
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
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        [Input("acls")]
        private InputList<Inputs.UserAclArgs>? _acls;

        /// <summary>
        /// The access control list (multiple blocks supported).
        /// </summary>
        public InputList<Inputs.UserAclArgs> Acls
        {
            get => _acls ?? (_acls = new InputList<Inputs.UserAclArgs>());
            set => _acls = value;
        }

        /// <summary>
        /// The user comment.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The user's email address.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Whether the user account is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The user account's expiration date (RFC 3339).
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// The user's first name.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// The user's groups.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// The user's keys.
        /// </summary>
        [Input("keys")]
        public Input<string>? Keys { get; set; }

        /// <summary>
        /// The user's last name.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The user's password. Required for PVE or PAM realms.
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
        /// The user identifier.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        [Input("acls")]
        private InputList<Inputs.UserAclGetArgs>? _acls;

        /// <summary>
        /// The access control list (multiple blocks supported).
        /// </summary>
        public InputList<Inputs.UserAclGetArgs> Acls
        {
            get => _acls ?? (_acls = new InputList<Inputs.UserAclGetArgs>());
            set => _acls = value;
        }

        /// <summary>
        /// The user comment.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The user's email address.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Whether the user account is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The user account's expiration date (RFC 3339).
        /// </summary>
        [Input("expirationDate")]
        public Input<string>? ExpirationDate { get; set; }

        /// <summary>
        /// The user's first name.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// The user's groups.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        /// <summary>
        /// The user's keys.
        /// </summary>
        [Input("keys")]
        public Input<string>? Keys { get; set; }

        /// <summary>
        /// The user's last name.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The user's password. Required for PVE or PAM realms.
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
        /// The user identifier.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
