// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.ProxmoxVE.Cluster
{
    public static class GetClusterAlias
    {
        public static Task<GetClusterAliasResult> InvokeAsync(GetClusterAliasArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClusterAliasResult>("proxmoxve:Cluster/getClusterAlias:getClusterAlias", args ?? new GetClusterAliasArgs(), options.WithVersion());

        public static Output<GetClusterAliasResult> Invoke(GetClusterAliasInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetClusterAliasResult>("proxmoxve:Cluster/getClusterAlias:getClusterAlias", args ?? new GetClusterAliasInvokeArgs(), options.WithVersion());
    }


    public sealed class GetClusterAliasArgs : Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetClusterAliasArgs()
        {
        }
    }

    public sealed class GetClusterAliasInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetClusterAliasInvokeArgs()
        {
        }
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
