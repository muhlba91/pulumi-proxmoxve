// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission
{
    public static class GetGroup
    {
        public static Task<GetGroupResult> InvokeAsync(GetGroupArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGroupResult>("proxmoxve:Permission/getGroup:getGroup", args ?? new GetGroupArgs(), options.WithVersion());
    }


    public sealed class GetGroupArgs : Pulumi.InvokeArgs
    {
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        public GetGroupArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGroupResult
    {
        public readonly ImmutableArray<Outputs.GetGroupAclResult> Acls;
        public readonly string Comment;
        public readonly string GroupId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Members;

        [OutputConstructor]
        private GetGroupResult(
            ImmutableArray<Outputs.GetGroupAclResult> acls,

            string comment,

            string groupId,

            string id,

            ImmutableArray<string> members)
        {
            Acls = acls;
            Comment = comment;
            GroupId = groupId;
            Id = id;
            Members = members;
        }
    }
}
