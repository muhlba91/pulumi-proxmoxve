// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **DO NOT USE**
 * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
 */
export function getVm2(args: GetVm2Args, opts?: pulumi.InvokeOptions): Promise<GetVm2Result> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:index/getVm2:getVm2", {
        "clone": args.clone,
        "cpu": args.cpu,
        "description": args.description,
        "id": args.id,
        "name": args.name,
        "nodeName": args.nodeName,
        "rng": args.rng,
        "tags": args.tags,
        "template": args.template,
        "timeouts": args.timeouts,
        "vga": args.vga,
    }, opts);
}

/**
 * A collection of arguments for invoking getVm2.
 */
export interface GetVm2Args {
    /**
     * The cloning configuration.
     */
    clone?: inputs.GetVm2Clone;
    /**
     * The CPU configuration.
     */
    cpu?: inputs.GetVm2Cpu;
    /**
     * The description of the VM.
     */
    description?: string;
    /**
     * The unique identifier of the VM in the Proxmox cluster.
     */
    id: number;
    /**
     * The name of the VM.
     */
    name?: string;
    /**
     * The name of the node where the VM is provisioned.
     */
    nodeName: string;
    /**
     * The RNG (Random Number Generator) configuration.
     */
    rng?: inputs.GetVm2Rng;
    /**
     * The tags assigned to the VM.
     */
    tags?: string[];
    /**
     * Whether the VM is a template.
     */
    template?: boolean;
    timeouts?: inputs.GetVm2Timeouts;
    /**
     * The VGA configuration.
     */
    vga?: inputs.GetVm2Vga;
}

/**
 * A collection of values returned by getVm2.
 */
export interface GetVm2Result {
    /**
     * The cloning configuration.
     */
    readonly clone?: outputs.GetVm2Clone;
    /**
     * The CPU configuration.
     */
    readonly cpu: outputs.GetVm2Cpu;
    /**
     * The description of the VM.
     */
    readonly description?: string;
    /**
     * The unique identifier of the VM in the Proxmox cluster.
     */
    readonly id: number;
    /**
     * The name of the VM.
     */
    readonly name?: string;
    /**
     * The name of the node where the VM is provisioned.
     */
    readonly nodeName: string;
    /**
     * The RNG (Random Number Generator) configuration.
     */
    readonly rng: outputs.GetVm2Rng;
    /**
     * The tags assigned to the VM.
     */
    readonly tags: string[];
    /**
     * Whether the VM is a template.
     */
    readonly template?: boolean;
    readonly timeouts?: outputs.GetVm2Timeouts;
    /**
     * The VGA configuration.
     */
    readonly vga: outputs.GetVm2Vga;
}
/**
 * !> **DO NOT USE**
 * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
 */
export function getVm2Output(args: GetVm2OutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVm2Result> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:index/getVm2:getVm2", {
        "clone": args.clone,
        "cpu": args.cpu,
        "description": args.description,
        "id": args.id,
        "name": args.name,
        "nodeName": args.nodeName,
        "rng": args.rng,
        "tags": args.tags,
        "template": args.template,
        "timeouts": args.timeouts,
        "vga": args.vga,
    }, opts);
}

/**
 * A collection of arguments for invoking getVm2.
 */
export interface GetVm2OutputArgs {
    /**
     * The cloning configuration.
     */
    clone?: pulumi.Input<inputs.GetVm2CloneArgs>;
    /**
     * The CPU configuration.
     */
    cpu?: pulumi.Input<inputs.GetVm2CpuArgs>;
    /**
     * The description of the VM.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique identifier of the VM in the Proxmox cluster.
     */
    id: pulumi.Input<number>;
    /**
     * The name of the VM.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node where the VM is provisioned.
     */
    nodeName: pulumi.Input<string>;
    /**
     * The RNG (Random Number Generator) configuration.
     */
    rng?: pulumi.Input<inputs.GetVm2RngArgs>;
    /**
     * The tags assigned to the VM.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the VM is a template.
     */
    template?: pulumi.Input<boolean>;
    timeouts?: pulumi.Input<inputs.GetVm2TimeoutsArgs>;
    /**
     * The VGA configuration.
     */
    vga?: pulumi.Input<inputs.GetVm2VgaArgs>;
}
