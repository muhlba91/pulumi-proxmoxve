// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetVirtualMachineArgs, GetVirtualMachineResult, GetVirtualMachineOutputArgs } from "./getVirtualMachine";
export const getVirtualMachine: typeof import("./getVirtualMachine").getVirtualMachine = null as any;
export const getVirtualMachineOutput: typeof import("./getVirtualMachine").getVirtualMachineOutput = null as any;
utilities.lazyLoad(exports, ["getVirtualMachine","getVirtualMachineOutput"], () => require("./getVirtualMachine"));

export { GetVirtualMachinesArgs, GetVirtualMachinesResult, GetVirtualMachinesOutputArgs } from "./getVirtualMachines";
export const getVirtualMachines: typeof import("./getVirtualMachines").getVirtualMachines = null as any;
export const getVirtualMachinesOutput: typeof import("./getVirtualMachines").getVirtualMachinesOutput = null as any;
utilities.lazyLoad(exports, ["getVirtualMachines","getVirtualMachinesOutput"], () => require("./getVirtualMachines"));

export { VirtualMachineArgs, VirtualMachineState } from "./virtualMachine";
export type VirtualMachine = import("./virtualMachine").VirtualMachine;
export const VirtualMachine: typeof import("./virtualMachine").VirtualMachine = null as any;
utilities.lazyLoad(exports, ["VirtualMachine"], () => require("./virtualMachine"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "proxmoxve:VM/virtualMachine:VirtualMachine":
                return new VirtualMachine(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("proxmoxve", "VM/virtualMachine", _module)
