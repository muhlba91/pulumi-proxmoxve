// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Apt.Standard
{
    public static class GetRepository
    {
        /// <summary>
        /// Retrieves an APT standard repository from a Proxmox VE cluster.
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
        ///     var example = ProxmoxVE.Apt.Standard.GetRepository.Invoke(new()
        ///     {
        ///         Handle = "no-subscription",
        ///         Node = "pve",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentAptStandardRepository"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRepositoryResult> InvokeAsync(GetRepositoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepositoryResult>("proxmoxve:Apt/standard/getRepository:getRepository", args ?? new GetRepositoryArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves an APT standard repository from a Proxmox VE cluster.
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
        ///     var example = ProxmoxVE.Apt.Standard.GetRepository.Invoke(new()
        ///     {
        ///         Handle = "no-subscription",
        ///         Node = "pve",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentAptStandardRepository"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRepositoryResult> Invoke(GetRepositoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepositoryResult>("proxmoxve:Apt/standard/getRepository:getRepository", args ?? new GetRepositoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepositoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The handle of the APT standard repository.
        /// </summary>
        [Input("handle", required: true)]
        public string Handle { get; set; } = null!;

        /// <summary>
        /// The name of the target Proxmox VE node.
        /// </summary>
        [Input("node", required: true)]
        public string Node { get; set; } = null!;

        public GetRepositoryArgs()
        {
        }
        public static new GetRepositoryArgs Empty => new GetRepositoryArgs();
    }

    public sealed class GetRepositoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The handle of the APT standard repository.
        /// </summary>
        [Input("handle", required: true)]
        public Input<string> Handle { get; set; } = null!;

        /// <summary>
        /// The name of the target Proxmox VE node.
        /// </summary>
        [Input("node", required: true)]
        public Input<string> Node { get; set; } = null!;

        public GetRepositoryInvokeArgs()
        {
        }
        public static new GetRepositoryInvokeArgs Empty => new GetRepositoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetRepositoryResult
    {
        /// <summary>
        /// The description of the APT standard repository.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The absolute path of the source list file that contains this standard repository.
        /// </summary>
        public readonly string FilePath;
        /// <summary>
        /// The handle of the APT standard repository.
        /// </summary>
        public readonly string Handle;
        /// <summary>
        /// The unique identifier of this APT standard repository data source.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The index within the defining source list file.
        /// </summary>
        public readonly int Index;
        /// <summary>
        /// The name of the APT standard repository.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the target Proxmox VE node.
        /// </summary>
        public readonly string Node;
        /// <summary>
        /// Indicates the activation status.
        /// </summary>
        public readonly int Status;

        [OutputConstructor]
        private GetRepositoryResult(
            string description,

            string filePath,

            string handle,

            string id,

            int index,

            string name,

            string node,

            int status)
        {
            Description = description;
            FilePath = filePath;
            Handle = handle;
            Id = id;
            Index = index;
            Name = name;
            Node = node;
            Status = status;
        }
    }
}
