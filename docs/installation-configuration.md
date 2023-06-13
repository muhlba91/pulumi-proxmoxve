---
title: Proxmox Virtual Environment (Proxmox VE) Installation & Configuration
meta_desc: Provides an overview on how to setup the Proxmox VE Provider for Pulumi.
layout: package
---

## Installation

The Proxmox Virtual Environment (Proxmox VE) provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@muhlba91/pulumi-proxmoxve`](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
* Python: [`pulumi-proxmoxve`](https://pypi.org/project/pulumi-proxmoxve/)
* Go: [`github.com/muhlba91/pulumi-proxmoxve/sdk/vX/go/proxmoxve`](https://github.com/muhlba91/pulumi-proxmoxve)
* .NET: [`Pulumi.ProxmoxVE`](https://www.nuget.org/packages/Pulumi.ProxmoxVE)

## Configuring Credentials

Pulumi relies on the Proxmox VE API to authenticate requests from your computer to Proxmox VE. Your credentials are never sent to pulumi.com.
The Pulumi Proxmox VE Provider needs to be configured with Proxmox VE credentials before it can be used to create resources.

The Proxmox VE Terraform provider uses a nested configuration not currently supported by Pulumi.
In fact, we need to set the credentials using the following work-around:

1. Set the environment variables `PROXMOX_VE_ENDPOINT`, `PROXMOX_VE_PASSWORD`, `PROXMOX_VE_USERNAME`, and `PROXMOX_VE_INSECURE`:

    ```bash
    export PROXMOX_VE_ENDPOINT=XXXXXXXXXXXX
    export PROXMOX_VE_PASSWORD=YYYYYYYYYYYY
    export PROXMOX_VE_USERNAME=ZZZZZZZZZZZZ
    export PROXMOX_VE_INSECURE=AAAAAAAAAAAA
    ```

2. Configure the provider, e.g. in Typescript:

   ```typescript
   const provider = new proxmox.Provider('proxmoxve', {
     endpoint: process.env.PROXMOX_VE_ENDPOINT,
     insecure: process.env.PROXMOX_VE_INSECURE,
     username: process.env.PROXMOX_VE_USERNAME,
     password: process.env.PROXMOX_VE_PASSWORD
   });
   ```

3. Pass the provider when creating a resource, e.g. in Typescript:

   ```typescript
   const server = new proxmox.vm.VirtualMachine('vm',
      ...,
      {
        provider: provider,
      }
   );
   ```
