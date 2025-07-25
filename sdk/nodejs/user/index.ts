// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { TokenArgs, TokenState } from "./token";
export type Token = import("./token").Token;
export const Token: typeof import("./token").Token = null as any;
utilities.lazyLoad(exports, ["Token"], () => require("./token"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "proxmoxve:User/token:Token":
                return new Token(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("proxmoxve", "User/token", _module)
