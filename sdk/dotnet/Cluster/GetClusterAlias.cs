// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Cluster
{
    public static class GetClusterAlias
    {
        public static Task<GetClusterAliasResult> InvokeAsync(GetClusterAliasArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterAliasResult>("proxmoxve:Cluster/getClusterAlias:getClusterAlias", args ?? new GetClusterAliasArgs(), options.WithDefaults());

        public static Output<GetClusterAliasResult> Invoke(GetClusterAliasInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterAliasResult>("proxmoxve:Cluster/getClusterAlias:getClusterAlias", args ?? new GetClusterAliasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterAliasArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAliasArgs()
        {
        }
        public static new GetClusterAliasArgs Empty => new GetClusterAliasArgs();
    }

    public sealed class GetClusterAliasInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterAliasInvokeArgs()
        {
        }
        public static new GetClusterAliasInvokeArgs Empty => new GetClusterAliasInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterAliasResult
    {
        public readonly string Cidr;
        public readonly string Comment;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetClusterAliasResult(
            string cidr,

            string comment,

            string id,

            string name)
        {
            Cidr = cidr;
            Comment = comment;
            Id = id;
            Name = name;
        }
    }
}
