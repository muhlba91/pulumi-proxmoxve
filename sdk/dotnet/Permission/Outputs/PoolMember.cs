// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Permission.Outputs
{

    [OutputType]
    public sealed class PoolMember
    {
        public readonly string? DatastoreId;
        public readonly string? Id;
        public readonly string? NodeName;
        public readonly string? Type;
        public readonly int? VmId;

        [OutputConstructor]
        private PoolMember(
            string? datastoreId,

            string? id,

            string? nodeName,

            string? type,

            int? vmId)
        {
            DatastoreId = datastoreId;
            Id = id;
            NodeName = nodeName;
            Type = type;
            VmId = vmId;
        }
    }
}
