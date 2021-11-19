// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export class Container extends pulumi.CustomResource {
    /**
     * Get an existing Container resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ContainerState, opts?: pulumi.CustomResourceOptions): Container {
        return new Container(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:CT/container:Container';

    /**
     * Returns true if the given object is an instance of Container.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Container {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Container.__pulumiType;
    }

    /**
     * The cloning configuration
     */
    public readonly clone!: pulumi.Output<outputs.CT.ContainerClone | undefined>;
    /**
     * The console configuration
     */
    public readonly console!: pulumi.Output<outputs.CT.ContainerConsole | undefined>;
    /**
     * The CPU allocation
     */
    public readonly cpu!: pulumi.Output<outputs.CT.ContainerCpu | undefined>;
    /**
     * The description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The disks
     */
    public readonly disk!: pulumi.Output<outputs.CT.ContainerDisk | undefined>;
    /**
     * The initialization configuration
     */
    public readonly initialization!: pulumi.Output<outputs.CT.ContainerInitialization | undefined>;
    /**
     * The memory allocation
     */
    public readonly memory!: pulumi.Output<outputs.CT.ContainerMemory | undefined>;
    /**
     * The network interfaces
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.CT.ContainerNetworkInterface[] | undefined>;
    /**
     * The node name
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * The operating system configuration
     */
    public readonly operatingSystem!: pulumi.Output<outputs.CT.ContainerOperatingSystem | undefined>;
    /**
     * The ID of the pool to assign the container to
     */
    public readonly poolId!: pulumi.Output<string | undefined>;
    /**
     * Whether to start the container
     */
    public readonly started!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to create a template
     */
    public readonly template!: pulumi.Output<boolean | undefined>;
    /**
     * The VM identifier
     */
    public readonly vmId!: pulumi.Output<number | undefined>;

    /**
     * Create a Container resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ContainerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ContainerArgs | ContainerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ContainerState | undefined;
            inputs["clone"] = state ? state.clone : undefined;
            inputs["console"] = state ? state.console : undefined;
            inputs["cpu"] = state ? state.cpu : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["disk"] = state ? state.disk : undefined;
            inputs["initialization"] = state ? state.initialization : undefined;
            inputs["memory"] = state ? state.memory : undefined;
            inputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            inputs["nodeName"] = state ? state.nodeName : undefined;
            inputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            inputs["poolId"] = state ? state.poolId : undefined;
            inputs["started"] = state ? state.started : undefined;
            inputs["template"] = state ? state.template : undefined;
            inputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as ContainerArgs | undefined;
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            inputs["clone"] = args ? args.clone : undefined;
            inputs["console"] = args ? args.console : undefined;
            inputs["cpu"] = args ? args.cpu : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["disk"] = args ? args.disk : undefined;
            inputs["initialization"] = args ? args.initialization : undefined;
            inputs["memory"] = args ? args.memory : undefined;
            inputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            inputs["nodeName"] = args ? args.nodeName : undefined;
            inputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            inputs["poolId"] = args ? args.poolId : undefined;
            inputs["started"] = args ? args.started : undefined;
            inputs["template"] = args ? args.template : undefined;
            inputs["vmId"] = args ? args.vmId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Container.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Container resources.
 */
export interface ContainerState {
    /**
     * The cloning configuration
     */
    clone?: pulumi.Input<inputs.CT.ContainerClone>;
    /**
     * The console configuration
     */
    console?: pulumi.Input<inputs.CT.ContainerConsole>;
    /**
     * The CPU allocation
     */
    cpu?: pulumi.Input<inputs.CT.ContainerCpu>;
    /**
     * The description
     */
    description?: pulumi.Input<string>;
    /**
     * The disks
     */
    disk?: pulumi.Input<inputs.CT.ContainerDisk>;
    /**
     * The initialization configuration
     */
    initialization?: pulumi.Input<inputs.CT.ContainerInitialization>;
    /**
     * The memory allocation
     */
    memory?: pulumi.Input<inputs.CT.ContainerMemory>;
    /**
     * The network interfaces
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.CT.ContainerNetworkInterface>[]>;
    /**
     * The node name
     */
    nodeName?: pulumi.Input<string>;
    /**
     * The operating system configuration
     */
    operatingSystem?: pulumi.Input<inputs.CT.ContainerOperatingSystem>;
    /**
     * The ID of the pool to assign the container to
     */
    poolId?: pulumi.Input<string>;
    /**
     * Whether to start the container
     */
    started?: pulumi.Input<boolean>;
    /**
     * Whether to create a template
     */
    template?: pulumi.Input<boolean>;
    /**
     * The VM identifier
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Container resource.
 */
export interface ContainerArgs {
    /**
     * The cloning configuration
     */
    clone?: pulumi.Input<inputs.CT.ContainerClone>;
    /**
     * The console configuration
     */
    console?: pulumi.Input<inputs.CT.ContainerConsole>;
    /**
     * The CPU allocation
     */
    cpu?: pulumi.Input<inputs.CT.ContainerCpu>;
    /**
     * The description
     */
    description?: pulumi.Input<string>;
    /**
     * The disks
     */
    disk?: pulumi.Input<inputs.CT.ContainerDisk>;
    /**
     * The initialization configuration
     */
    initialization?: pulumi.Input<inputs.CT.ContainerInitialization>;
    /**
     * The memory allocation
     */
    memory?: pulumi.Input<inputs.CT.ContainerMemory>;
    /**
     * The network interfaces
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.CT.ContainerNetworkInterface>[]>;
    /**
     * The node name
     */
    nodeName: pulumi.Input<string>;
    /**
     * The operating system configuration
     */
    operatingSystem?: pulumi.Input<inputs.CT.ContainerOperatingSystem>;
    /**
     * The ID of the pool to assign the container to
     */
    poolId?: pulumi.Input<string>;
    /**
     * Whether to start the container
     */
    started?: pulumi.Input<boolean>;
    /**
     * Whether to create a template
     */
    template?: pulumi.Input<boolean>;
    /**
     * The VM identifier
     */
    vmId?: pulumi.Input<number>;
}
