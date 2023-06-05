// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM
{
    public static class GetVirtualMachine
    {
        public static Task<GetVirtualMachineResult> InvokeAsync(GetVirtualMachineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVirtualMachineResult>("proxmoxve:VM/getVirtualMachine:getVirtualMachine", args ?? new GetVirtualMachineArgs(), options.WithDefaults());

        public static Output<GetVirtualMachineResult> Invoke(GetVirtualMachineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVirtualMachineResult>("proxmoxve:VM/getVirtualMachine:getVirtualMachine", args ?? new GetVirtualMachineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVirtualMachineArgs : global::Pulumi.InvokeArgs
    {
        [Input("nodeName", required: true)]
        public string NodeName { get; set; } = null!;

        [Input("vmId", required: true)]
        public int VmId { get; set; }

        public GetVirtualMachineArgs()
        {
        }
        public static new GetVirtualMachineArgs Empty => new GetVirtualMachineArgs();
    }

    public sealed class GetVirtualMachineInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        [Input("vmId", required: true)]
        public Input<int> VmId { get; set; } = null!;

        public GetVirtualMachineInvokeArgs()
        {
        }
        public static new GetVirtualMachineInvokeArgs Empty => new GetVirtualMachineInvokeArgs();
    }


    [OutputType]
    public sealed class GetVirtualMachineResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string NodeName;
        public readonly ImmutableArray<string> Tags;
        public readonly int VmId;

        [OutputConstructor]
        private GetVirtualMachineResult(
            string id,

            string name,

            string nodeName,

            ImmutableArray<string> tags,

            int vmId)
        {
            Id = id;
            Name = name;
            NodeName = nodeName;
            Tags = tags;
            VmId = vmId;
        }
    }
}
