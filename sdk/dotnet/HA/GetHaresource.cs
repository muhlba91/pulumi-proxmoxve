// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.HA
{
    public static class GetHAResource
    {
        /// <summary>
        /// Retrieves the list of High Availability resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = ProxmoxVE.HA.GetHAResources.Invoke();
        /// 
        ///     var example = .Select(__value =&gt; 
        ///     {
        ///         return ProxmoxVE.HA.GetHAResource.Invoke(new()
        ///         {
        ///             ResourceId = __value,
        ///         });
        ///     }).ToList();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentHaresourcesFull"] = example,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHAResourceResult> InvokeAsync(GetHAResourceArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHAResourceResult>("proxmoxve:HA/getHAResource:getHAResource", args ?? new GetHAResourceArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the list of High Availability resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = ProxmoxVE.HA.GetHAResources.Invoke();
        /// 
        ///     var example = .Select(__value =&gt; 
        ///     {
        ///         return ProxmoxVE.HA.GetHAResource.Invoke(new()
        ///         {
        ///             ResourceId = __value,
        ///         });
        ///     }).ToList();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentHaresourcesFull"] = example,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHAResourceResult> Invoke(GetHAResourceInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHAResourceResult>("proxmoxve:HA/getHAResource:getHAResource", args ?? new GetHAResourceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHAResourceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The identifier of the Proxmox HA resource to read.
        /// </summary>
        [Input("resourceId", required: true)]
        public string ResourceId { get; set; } = null!;

        public GetHAResourceArgs()
        {
        }
        public static new GetHAResourceArgs Empty => new GetHAResourceArgs();
    }

    public sealed class GetHAResourceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The identifier of the Proxmox HA resource to read.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        public GetHAResourceInvokeArgs()
        {
        }
        public static new GetHAResourceInvokeArgs Empty => new GetHAResourceInvokeArgs();
    }


    [OutputType]
    public sealed class GetHAResourceResult
    {
        /// <summary>
        /// The comment associated with this resource.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The identifier of the High Availability group this resource is a member of.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The unique identifier of this resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The maximal number of relocation attempts.
        /// </summary>
        public readonly int MaxRelocate;
        /// <summary>
        /// The maximal number of restart attempts.
        /// </summary>
        public readonly int MaxRestart;
        /// <summary>
        /// The identifier of the Proxmox HA resource to read.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// The desired state of the resource.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The type of High Availability resource (`vm` or `ct`).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetHAResourceResult(
            string comment,

            string group,

            string id,

            int maxRelocate,

            int maxRestart,

            string resourceId,

            string state,

            string type)
        {
            Comment = comment;
            Group = group;
            Id = id;
            MaxRelocate = maxRelocate;
            MaxRestart = maxRestart;
            ResourceId = resourceId;
            State = state;
            Type = type;
        }
    }
}
