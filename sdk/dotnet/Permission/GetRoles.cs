// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    public static class GetRoles
    {
        /// <summary>
        /// Retrieves information about all the available roles.
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
        ///     var availableRoles = ProxmoxVE.Permission.GetRoles.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetRolesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRolesResult>("proxmoxve:Permission/getRoles:getRoles", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves information about all the available roles.
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
        ///     var availableRoles = ProxmoxVE.Permission.GetRoles.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRolesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("proxmoxve:Permission/getRoles:getRoles", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves information about all the available roles.
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
        ///     var availableRoles = ProxmoxVE.Permission.GetRoles.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetRolesResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRolesResult>("proxmoxve:Permission/getRoles:getRoles", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetRolesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The role privileges.
        /// </summary>
        public readonly ImmutableArray<ImmutableArray<string>> Privileges;
        /// <summary>
        /// The role identifiers.
        /// </summary>
        public readonly ImmutableArray<string> RoleIds;
        /// <summary>
        /// Whether the role is special (built-in).
        /// </summary>
        public readonly ImmutableArray<bool> Specials;

        [OutputConstructor]
        private GetRolesResult(
            string id,

            ImmutableArray<ImmutableArray<string>> privileges,

            ImmutableArray<string> roleIds,

            ImmutableArray<bool> specials)
        {
            Id = id;
            Privileges = privileges;
            RoleIds = roleIds;
            Specials = specials;
        }
    }
}
