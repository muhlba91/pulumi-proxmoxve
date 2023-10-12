// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Retrieves information about all VMs in the Proxmox cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const ubuntuVms = proxmoxve.VM.getVirtualMachines({
 *     tags: ["ubuntu"],
 * });
 * ```
 */
export function getVirtualMachines(args?: GetVirtualMachinesArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualMachinesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:VM/getVirtualMachines:getVirtualMachines", {
        "nodeName": args.nodeName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualMachines.
 */
export interface GetVirtualMachinesArgs {
    /**
     * The node name.
     */
    nodeName?: string;
    /**
     * A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     */
    tags?: string[];
}

/**
 * A collection of values returned by getVirtualMachines.
 */
export interface GetVirtualMachinesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The node name.
     */
    readonly nodeName?: string;
    /**
     * A list of tags of the VM.
     */
    readonly tags?: string[];
    /**
     * The VMs list.
     */
    readonly vms: outputs.VM.GetVirtualMachinesVm[];
}
/**
 * Retrieves information about all VMs in the Proxmox cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const ubuntuVms = proxmoxve.VM.getVirtualMachines({
 *     tags: ["ubuntu"],
 * });
 * ```
 */
export function getVirtualMachinesOutput(args?: GetVirtualMachinesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualMachinesResult> {
    return pulumi.output(args).apply((a: any) => getVirtualMachines(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualMachines.
 */
export interface GetVirtualMachinesOutputArgs {
    /**
     * The node name.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
