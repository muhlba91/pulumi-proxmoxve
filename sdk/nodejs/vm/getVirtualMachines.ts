// *** WARNING: this file was generated by pulumi-language-nodejs. ***
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
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const ubuntuVms = proxmoxve.VM.getVirtualMachines({
 *     tags: ["ubuntu"],
 * });
 * const ubuntuTemplates = proxmoxve.VM.getVirtualMachines({
 *     filters: [
 *         {
 *             name: "template",
 *             values: ["true"],
 *         },
 *         {
 *             name: "status",
 *             values: ["stopped"],
 *         },
 *         {
 *             name: "name",
 *             regex: true,
 *             values: ["^ubuntu-20.*$"],
 *         },
 *         {
 *             name: "node_name",
 *             regex: true,
 *             values: [
 *                 "node_us_[1-3]",
 *                 "node_eu_[1-3]",
 *             ],
 *         },
 *     ],
 *     tags: [
 *         "template",
 *         "latest",
 *     ],
 * });
 * ```
 */
export function getVirtualMachines(args?: GetVirtualMachinesArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualMachinesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:VM/getVirtualMachines:getVirtualMachines", {
        "filters": args.filters,
        "nodeName": args.nodeName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualMachines.
 */
export interface GetVirtualMachinesArgs {
    /**
     * Filter blocks. The VM must satisfy all filter blocks to be included in the result.
     */
    filters?: inputs.VM.GetVirtualMachinesFilter[];
    /**
     * The node name. All cluster nodes will be queried in case this is omitted
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
    readonly filters?: outputs.VM.GetVirtualMachinesFilter[];
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
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const ubuntuVms = proxmoxve.VM.getVirtualMachines({
 *     tags: ["ubuntu"],
 * });
 * const ubuntuTemplates = proxmoxve.VM.getVirtualMachines({
 *     filters: [
 *         {
 *             name: "template",
 *             values: ["true"],
 *         },
 *         {
 *             name: "status",
 *             values: ["stopped"],
 *         },
 *         {
 *             name: "name",
 *             regex: true,
 *             values: ["^ubuntu-20.*$"],
 *         },
 *         {
 *             name: "node_name",
 *             regex: true,
 *             values: [
 *                 "node_us_[1-3]",
 *                 "node_eu_[1-3]",
 *             ],
 *         },
 *     ],
 *     tags: [
 *         "template",
 *         "latest",
 *     ],
 * });
 * ```
 */
export function getVirtualMachinesOutput(args?: GetVirtualMachinesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVirtualMachinesResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:VM/getVirtualMachines:getVirtualMachines", {
        "filters": args.filters,
        "nodeName": args.nodeName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualMachines.
 */
export interface GetVirtualMachinesOutputArgs {
    /**
     * Filter blocks. The VM must satisfy all filter blocks to be included in the result.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.VM.GetVirtualMachinesFilterArgs>[]>;
    /**
     * The node name. All cluster nodes will be queried in case this is omitted
     */
    nodeName?: pulumi.Input<string>;
    /**
     * A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
