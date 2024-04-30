// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages Proxmox VE Cluster Datacenter options.
 *
 * ## Import
 *
 * #!/usr/bin/env sh
 *
 * Cluster options are global and can be imported using e.g.:
 *
 * ```sh
 * $ pulumi import proxmoxve:Cluster/options:Options options cluster
 * ```
 */
export class Options extends pulumi.CustomResource {
    /**
     * Get an existing Options resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OptionsState, opts?: pulumi.CustomResourceOptions): Options {
        return new Options(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Cluster/options:Options';

    /**
     * Returns true if the given object is an instance of Options.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Options {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Options.__pulumiType;
    }

    /**
     * Clone I/O bandwidth limit in KiB/s.
     */
    public readonly bandwidthLimitClone!: pulumi.Output<number | undefined>;
    /**
     * Default I/O bandwidth limit in KiB/s.
     */
    public readonly bandwidthLimitDefault!: pulumi.Output<number | undefined>;
    /**
     * Migration I/O bandwidth limit in KiB/s.
     */
    public readonly bandwidthLimitMigration!: pulumi.Output<number | undefined>;
    /**
     * Move I/O bandwidth limit in KiB/s.
     */
    public readonly bandwidthLimitMove!: pulumi.Output<number | undefined>;
    /**
     * Restore I/O bandwidth limit in KiB/s.
     */
    public readonly bandwidthLimitRestore!: pulumi.Output<number | undefined>;
    /**
     * Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
     */
    public readonly console!: pulumi.Output<string | undefined>;
    /**
     * Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
     */
    public readonly crsHa!: pulumi.Output<string>;
    /**
     * Cluster resource scheduling setting for HA rebalance on start.
     */
    public readonly crsHaRebalanceOnStart!: pulumi.Output<boolean | undefined>;
    /**
     * Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * email address to send notification from (default is root@$hostname).
     */
    public readonly emailFrom!: pulumi.Output<string | undefined>;
    /**
     * Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
     */
    public readonly haShutdownPolicy!: pulumi.Output<string | undefined>;
    /**
     * Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
     */
    public readonly httpProxy!: pulumi.Output<string | undefined>;
    /**
     * Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
     */
    public readonly keyboard!: pulumi.Output<string | undefined>;
    /**
     * Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
     */
    public readonly language!: pulumi.Output<string | undefined>;
    /**
     * Prefix for autogenerated MAC addresses.
     */
    public readonly macPrefix!: pulumi.Output<string>;
    /**
     * Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
     */
    public readonly maxWorkers!: pulumi.Output<number | undefined>;
    /**
     * Cluster wide migration network CIDR.
     */
    public readonly migrationCidr!: pulumi.Output<string | undefined>;
    /**
     * Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
     */
    public readonly migrationType!: pulumi.Output<string | undefined>;
    /**
     * The ranges for the next free VM ID auto-selection pool.
     */
    public readonly nextId!: pulumi.Output<outputs.Cluster.OptionsNextId | undefined>;
    /**
     * Cluster-wide notification settings.
     */
    public readonly notify!: pulumi.Output<outputs.Cluster.OptionsNotify | undefined>;

    /**
     * Create a Options resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: OptionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OptionsArgs | OptionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OptionsState | undefined;
            resourceInputs["bandwidthLimitClone"] = state ? state.bandwidthLimitClone : undefined;
            resourceInputs["bandwidthLimitDefault"] = state ? state.bandwidthLimitDefault : undefined;
            resourceInputs["bandwidthLimitMigration"] = state ? state.bandwidthLimitMigration : undefined;
            resourceInputs["bandwidthLimitMove"] = state ? state.bandwidthLimitMove : undefined;
            resourceInputs["bandwidthLimitRestore"] = state ? state.bandwidthLimitRestore : undefined;
            resourceInputs["console"] = state ? state.console : undefined;
            resourceInputs["crsHa"] = state ? state.crsHa : undefined;
            resourceInputs["crsHaRebalanceOnStart"] = state ? state.crsHaRebalanceOnStart : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["emailFrom"] = state ? state.emailFrom : undefined;
            resourceInputs["haShutdownPolicy"] = state ? state.haShutdownPolicy : undefined;
            resourceInputs["httpProxy"] = state ? state.httpProxy : undefined;
            resourceInputs["keyboard"] = state ? state.keyboard : undefined;
            resourceInputs["language"] = state ? state.language : undefined;
            resourceInputs["macPrefix"] = state ? state.macPrefix : undefined;
            resourceInputs["maxWorkers"] = state ? state.maxWorkers : undefined;
            resourceInputs["migrationCidr"] = state ? state.migrationCidr : undefined;
            resourceInputs["migrationType"] = state ? state.migrationType : undefined;
            resourceInputs["nextId"] = state ? state.nextId : undefined;
            resourceInputs["notify"] = state ? state.notify : undefined;
        } else {
            const args = argsOrState as OptionsArgs | undefined;
            resourceInputs["bandwidthLimitClone"] = args ? args.bandwidthLimitClone : undefined;
            resourceInputs["bandwidthLimitDefault"] = args ? args.bandwidthLimitDefault : undefined;
            resourceInputs["bandwidthLimitMigration"] = args ? args.bandwidthLimitMigration : undefined;
            resourceInputs["bandwidthLimitMove"] = args ? args.bandwidthLimitMove : undefined;
            resourceInputs["bandwidthLimitRestore"] = args ? args.bandwidthLimitRestore : undefined;
            resourceInputs["console"] = args ? args.console : undefined;
            resourceInputs["crsHa"] = args ? args.crsHa : undefined;
            resourceInputs["crsHaRebalanceOnStart"] = args ? args.crsHaRebalanceOnStart : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["emailFrom"] = args ? args.emailFrom : undefined;
            resourceInputs["haShutdownPolicy"] = args ? args.haShutdownPolicy : undefined;
            resourceInputs["httpProxy"] = args ? args.httpProxy : undefined;
            resourceInputs["keyboard"] = args ? args.keyboard : undefined;
            resourceInputs["language"] = args ? args.language : undefined;
            resourceInputs["macPrefix"] = args ? args.macPrefix : undefined;
            resourceInputs["maxWorkers"] = args ? args.maxWorkers : undefined;
            resourceInputs["migrationCidr"] = args ? args.migrationCidr : undefined;
            resourceInputs["migrationType"] = args ? args.migrationType : undefined;
            resourceInputs["nextId"] = args ? args.nextId : undefined;
            resourceInputs["notify"] = args ? args.notify : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Options.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Options resources.
 */
export interface OptionsState {
    /**
     * Clone I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitClone?: pulumi.Input<number>;
    /**
     * Default I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitDefault?: pulumi.Input<number>;
    /**
     * Migration I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitMigration?: pulumi.Input<number>;
    /**
     * Move I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitMove?: pulumi.Input<number>;
    /**
     * Restore I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitRestore?: pulumi.Input<number>;
    /**
     * Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
     */
    console?: pulumi.Input<string>;
    /**
     * Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
     */
    crsHa?: pulumi.Input<string>;
    /**
     * Cluster resource scheduling setting for HA rebalance on start.
     */
    crsHaRebalanceOnStart?: pulumi.Input<boolean>;
    /**
     * Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
     */
    description?: pulumi.Input<string>;
    /**
     * email address to send notification from (default is root@$hostname).
     */
    emailFrom?: pulumi.Input<string>;
    /**
     * Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
     */
    haShutdownPolicy?: pulumi.Input<string>;
    /**
     * Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
     */
    httpProxy?: pulumi.Input<string>;
    /**
     * Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
     */
    keyboard?: pulumi.Input<string>;
    /**
     * Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
     */
    language?: pulumi.Input<string>;
    /**
     * Prefix for autogenerated MAC addresses.
     */
    macPrefix?: pulumi.Input<string>;
    /**
     * Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
     */
    maxWorkers?: pulumi.Input<number>;
    /**
     * Cluster wide migration network CIDR.
     */
    migrationCidr?: pulumi.Input<string>;
    /**
     * Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
     */
    migrationType?: pulumi.Input<string>;
    /**
     * The ranges for the next free VM ID auto-selection pool.
     */
    nextId?: pulumi.Input<inputs.Cluster.OptionsNextId>;
    /**
     * Cluster-wide notification settings.
     */
    notify?: pulumi.Input<inputs.Cluster.OptionsNotify>;
}

/**
 * The set of arguments for constructing a Options resource.
 */
export interface OptionsArgs {
    /**
     * Clone I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitClone?: pulumi.Input<number>;
    /**
     * Default I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitDefault?: pulumi.Input<number>;
    /**
     * Migration I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitMigration?: pulumi.Input<number>;
    /**
     * Move I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitMove?: pulumi.Input<number>;
    /**
     * Restore I/O bandwidth limit in KiB/s.
     */
    bandwidthLimitRestore?: pulumi.Input<number>;
    /**
     * Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
     */
    console?: pulumi.Input<string>;
    /**
     * Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
     */
    crsHa?: pulumi.Input<string>;
    /**
     * Cluster resource scheduling setting for HA rebalance on start.
     */
    crsHaRebalanceOnStart?: pulumi.Input<boolean>;
    /**
     * Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
     */
    description?: pulumi.Input<string>;
    /**
     * email address to send notification from (default is root@$hostname).
     */
    emailFrom?: pulumi.Input<string>;
    /**
     * Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
     */
    haShutdownPolicy?: pulumi.Input<string>;
    /**
     * Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
     */
    httpProxy?: pulumi.Input<string>;
    /**
     * Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
     */
    keyboard?: pulumi.Input<string>;
    /**
     * Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
     */
    language?: pulumi.Input<string>;
    /**
     * Prefix for autogenerated MAC addresses.
     */
    macPrefix?: pulumi.Input<string>;
    /**
     * Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
     */
    maxWorkers?: pulumi.Input<number>;
    /**
     * Cluster wide migration network CIDR.
     */
    migrationCidr?: pulumi.Input<string>;
    /**
     * Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
     */
    migrationType?: pulumi.Input<string>;
    /**
     * The ranges for the next free VM ID auto-selection pool.
     */
    nextId?: pulumi.Input<inputs.Cluster.OptionsNextId>;
    /**
     * Cluster-wide notification settings.
     */
    notify?: pulumi.Input<inputs.Cluster.OptionsNotify>;
}
