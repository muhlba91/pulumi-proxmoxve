// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.HA
{
    public static class GetHAGroups
    {
        /// <summary>
        /// Retrieves the list of High Availability groups.
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
        ///     var example = ProxmoxVE.HA.GetHAGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentHagroups"] = example.Apply(getHAGroupsResult =&gt; getHAGroupsResult.GroupIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetHAGroupsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHAGroupsResult>("proxmoxve:HA/getHAGroups:getHAGroups", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves the list of High Availability groups.
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
        ///     var example = ProxmoxVE.HA.GetHAGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentHagroups"] = example.Apply(getHAGroupsResult =&gt; getHAGroupsResult.GroupIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHAGroupsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHAGroupsResult>("proxmoxve:HA/getHAGroups:getHAGroups", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves the list of High Availability groups.
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
        ///     var example = ProxmoxVE.HA.GetHAGroups.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentHagroups"] = example.Apply(getHAGroupsResult =&gt; getHAGroupsResult.GroupIds),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetHAGroupsResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHAGroupsResult>("proxmoxve:HA/getHAGroups:getHAGroups", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetHAGroupsResult
    {
        /// <summary>
        /// The identifiers of the High Availability groups.
        /// </summary>
        public readonly ImmutableArray<string> GroupIds;
        /// <summary>
        /// The unique identifier of this resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetHAGroupsResult(
            ImmutableArray<string> groupIds,

            string id)
        {
            GroupIds = groupIds;
            Id = id;
        }
    }
}
