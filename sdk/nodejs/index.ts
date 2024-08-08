// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { AclArgs, AclState } from "./acl";
export type Acl = import("./acl").Acl;
export const Acl: typeof import("./acl").Acl = null as any;
utilities.lazyLoad(exports, ["Acl"], () => require("./acl"));

export { AcmeAccountArgs, AcmeAccountState } from "./acmeAccount";
export type AcmeAccount = import("./acmeAccount").AcmeAccount;
export const AcmeAccount: typeof import("./acmeAccount").AcmeAccount = null as any;
utilities.lazyLoad(exports, ["AcmeAccount"], () => require("./acmeAccount"));

export { CertifiArgs, CertifiState } from "./certifi";
export type Certifi = import("./certifi").Certifi;
export const Certifi: typeof import("./certifi").Certifi = null as any;
utilities.lazyLoad(exports, ["Certifi"], () => require("./certifi"));

export { DNSArgs, DNSState } from "./dns";
export type DNS = import("./dns").DNS;
export const DNS: typeof import("./dns").DNS = null as any;
utilities.lazyLoad(exports, ["DNS"], () => require("./dns"));

export { GetNodeArgs, GetNodeResult, GetNodeOutputArgs } from "./getNode";
export const getNode: typeof import("./getNode").getNode = null as any;
export const getNodeOutput: typeof import("./getNode").getNodeOutput = null as any;
utilities.lazyLoad(exports, ["getNode","getNodeOutput"], () => require("./getNode"));

export { GetVm2Args, GetVm2Result, GetVm2OutputArgs } from "./getVm2";
export const getVm2: typeof import("./getVm2").getVm2 = null as any;
export const getVm2Output: typeof import("./getVm2").getVm2Output = null as any;
utilities.lazyLoad(exports, ["getVm2","getVm2Output"], () => require("./getVm2"));

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

export { Vm2Args, Vm2State } from "./vm2";
export type Vm2 = import("./vm2").Vm2;
export const Vm2: typeof import("./vm2").Vm2 = null as any;
utilities.lazyLoad(exports, ["Vm2"], () => require("./vm2"));


// Export sub-modules:
import * as acme from "./acme";
import * as apt from "./apt";
import * as cluster from "./cluster";
import * as config from "./config";
import * as ct from "./ct";
import * as download from "./download";
import * as ha from "./ha";
import * as hardware from "./hardware";
import * as network from "./network";
import * as permission from "./permission";
import * as storage from "./storage";
import * as types from "./types";
import * as user from "./user";
import * as vm from "./vm";

export {
    acme,
    apt,
    cluster,
    config,
    ct,
    download,
    ha,
    hardware,
    network,
    permission,
    storage,
    types,
    user,
    vm,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "proxmoxve:index/acl:Acl":
                return new Acl(name, <any>undefined, { urn })
            case "proxmoxve:index/acmeAccount:AcmeAccount":
                return new AcmeAccount(name, <any>undefined, { urn })
            case "proxmoxve:index/certifi:Certifi":
                return new Certifi(name, <any>undefined, { urn })
            case "proxmoxve:index/dNS:DNS":
                return new DNS(name, <any>undefined, { urn })
            case "proxmoxve:index/hosts:Hosts":
                return new Hosts(name, <any>undefined, { urn })
            case "proxmoxve:index/time:Time":
                return new Time(name, <any>undefined, { urn })
            case "proxmoxve:index/vm2:Vm2":
                return new Vm2(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("proxmoxve", "index/acl", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/acmeAccount", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/certifi", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/dNS", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/hosts", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/time", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "index/vm2", _module)
pulumi.runtime.registerResourcePackage("proxmoxve", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:proxmoxve") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
