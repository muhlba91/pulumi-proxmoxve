// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./getGroup";
export * from "./getGroups";
export * from "./getPool";
export * from "./getPools";
export * from "./getRole";
export * from "./getRoles";
export * from "./getUser";
export * from "./getUsers";
export * from "./group";
export * from "./pool";
export * from "./role";
export * from "./user";

// Import resources to register:
import { Group } from "./group";
import { Pool } from "./pool";
import { Role } from "./role";
import { User } from "./user";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "proxmoxve:Permission/group:Group":
                return new Group(name, <any>undefined, { urn })
            case "proxmoxve:Permission/pool:Pool":
                return new Pool(name, <any>undefined, { urn })
            case "proxmoxve:Permission/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "proxmoxve:Permission/user:User":
                return new User(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("proxmoxve", "Permission/group", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "Permission/pool", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "Permission/role", _module)
pulumi.runtime.registerResourceModule("proxmoxve", "Permission/user", _module)
