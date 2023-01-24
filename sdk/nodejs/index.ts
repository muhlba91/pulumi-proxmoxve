// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { CertifiArgs, CertifiState } from "./certifi";
export type Certifi = import("./certifi").Certifi;
export const Certifi: typeof import("./certifi").Certifi = null as any;
utilities.lazyLoad(exports, ["Certifi"], () => require("./certifi"));

export { DNSArgs, DNSState } from "./dns";
export type DNS = import("./dns").DNS;
export const DNS: typeof import("./dns").DNS = null as any;
utilities.lazyLoad(exports, ["DNS"], () => require("./dns"));

export { GetDNSArgs, GetDNSResult, GetDNSOutputArgs } from "./getDNS";
export const getDNS: typeof import("./getDNS").getDNS = null as any;
export const getDNSOutput: typeof import("./getDNS").getDNSOutput = null as any;
utilities.lazyLoad(exports, ["getDNS","getDNSOutput"], () => require("./getDNS"));

export { GetHostsArgs, GetHostsResult, GetHostsOutputArgs } from "./getHosts";
export const getHosts: typeof import("./getHosts").getHosts = null as any;
export const getHostsOutput: typeof import("./getHosts").getHostsOutput = null as any;
utilities.lazyLoad(exports, ["getHosts","getHostsOutput"], () => require("./getHosts"));

export { GetTimeArgs, GetTimeResult, GetTimeOutputArgs } from "./getTime";
export const getTime: typeof import("./getTime").getTime = null as any;
export const getTimeOutput: typeof import("./getTime").getTimeOutput = null as any;
utilities.lazyLoad(exports, ["getTime","getTimeOutput"], () => require("./getTime"));

export { GetVersionResult } from "./getVersion";
export const getVersion: typeof import("./getVersion").getVersion = null as any;
utilities.lazyLoad(exports, ["getVersion"], () => require("./getVersion"));

export { HostsArgs, HostsState } from "./hosts";
export type Hosts = import("./hosts").Hosts;
export const Hosts: typeof import("./hosts").Hosts = null as any;
utilities.lazyLoad(exports, ["Hosts"], () => require("./hosts"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { TimeArgs, TimeState } from "./time";
export type Time = import("./time").Time;
export const Time: typeof import("./time").Time = null as any;
utilities.lazyLoad(exports, ["Time"], () => require("./time"));


// Export sub-modules:
import * as cluster from "./cluster";
import * as config from "./config";
import * as ct from "./ct";
import * as permission from "./permission";
import * as storage from "./storage";
import * as types from "./types";
import * as vm from "./vm";

export {
    cluster,
    config,
    ct,
    permission,
    storage,
    types,
    vm,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "proxmoxve:index/certifi:Certifi":
                return new Certifi(name, <any>undefined, { urn })
            case "proxmoxve:index/dNS:DNS":
                return new DNS(name, <any>undefined, { urn })
            case "proxmoxve:index/hosts:Hosts":
                return new Hosts(name, <any>undefined, { urn })
            case "proxmoxve:index/time:Time":
                return new Time(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("proxmoxve", "index/certifi", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/dNS", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/hosts", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/time", _module)
pulumi.runtime.registerResourcePackage("proxmoxve", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:proxmoxve") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
