// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Apt
{
    public static class GetRepository
    {
        /// <summary>
        /// Retrieves an APT repository from a Proxmox VE cluster.
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
        ///     var example = ProxmoxVE.Apt.GetRepository.Invoke(new()
        ///     {
        ///         FilePath = "/etc/apt/sources.list",
        ///         Index = 0,
        ///         Node = "pve",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentAptRepository"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRepositoryResult> InvokeAsync(GetRepositoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepositoryResult>("proxmoxve:Apt/getRepository:getRepository", args ?? new GetRepositoryArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves an APT repository from a Proxmox VE cluster.
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
        ///     var example = ProxmoxVE.Apt.GetRepository.Invoke(new()
        ///     {
        ///         FilePath = "/etc/apt/sources.list",
        ///         Index = 0,
        ///         Node = "pve",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["proxmoxVirtualEnvironmentAptRepository"] = example,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRepositoryResult> Invoke(GetRepositoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepositoryResult>("proxmoxve:Apt/getRepository:getRepository", args ?? new GetRepositoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepositoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The absolute path of the source list file that contains this repository.
        /// </summary>
        [Input("filePath", required: true)]
        public string FilePath { get; set; } = null!;

        /// <summary>
        /// The index within the defining source list file.
        /// </summary>
        [Input("index", required: true)]
        public int Index { get; set; }

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
        /// The absolute path of the source list file that contains this repository.
        /// </summary>
        [Input("filePath", required: true)]
        public Input<string> FilePath { get; set; } = null!;

        /// <summary>
        /// The index within the defining source list file.
        /// </summary>
        [Input("index", required: true)]
        public Input<int> Index { get; set; } = null!;

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
        /// The associated comment.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// The list of components.
        /// </summary>
        public readonly ImmutableArray<string> Components;
        /// <summary>
        /// Indicates the activation status.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The absolute path of the source list file that contains this repository.
        /// </summary>
        public readonly string FilePath;
        /// <summary>
        /// The format of the defining source list file.
        /// </summary>
        public readonly string FileType;
        /// <summary>
        /// The unique identifier of this APT repository data source.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The index within the defining source list file.
        /// </summary>
        public readonly int Index;
        /// <summary>
        /// The name of the target Proxmox VE node.
        /// </summary>
        public readonly string Node;
        /// <summary>
        /// The list of package types.
        /// </summary>
        public readonly ImmutableArray<string> PackageTypes;
        /// <summary>
        /// The list of package distributions.
        /// </summary>
        public readonly ImmutableArray<string> Suites;
        /// <summary>
        /// The list of repository URIs.
        /// </summary>
        public readonly ImmutableArray<string> Uris;

        [OutputConstructor]
        private GetRepositoryResult(
            string comment,

            ImmutableArray<string> components,

            bool enabled,

            string filePath,

            string fileType,

            string id,

            int index,

            string node,

            ImmutableArray<string> packageTypes,

            ImmutableArray<string> suites,

            ImmutableArray<string> uris)
        {
            Comment = comment;
            Components = components;
            Enabled = enabled;
            FilePath = filePath;
            FileType = fileType;
            Id = id;
            Index = index;
            Node = node;
            PackageTypes = packageTypes;
            Suites = suites;
            Uris = uris;
        }
    }
}
