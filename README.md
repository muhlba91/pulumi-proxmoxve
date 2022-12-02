# Proxmox VE Resource Provider

[![](https://img.shields.io/github/license/muhlba91/pulumi-proxmoxve?style=for-the-badge)](LICENSE)
[![](https://img.shields.io/github/workflow/status/muhlba91/pulumi-proxmoxve/Release?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/actions)
[![](https://img.shields.io/github/release-date/muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/releases)
[![](https://img.shields.io/pypi/v/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/pypi/dm/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/nuget/v/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/nuget/dt/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/npm/v/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/npm/dm/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
<a href="https://www.buymeacoffee.com/muhlba91" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="28" width="150"></a>

The Proxmox VE Resource Provider lets you manage [Proxmox VE](http://proxmox.com) resources.

The provider is built on https://github.com/bpg/terraform-provider-proxmox.

## Installing

This package is available in many languages in the standard packaging formats.

### Installing the Plugin
1. Download the appropriate archive file from the Releases page:
   `wget https://github.com/muhlba91/pulumi-proxmoxve/releases/download/vX.Y.Z/pulumi-resource-proxmoxve-vX.Y.Z-OPERATING_SYSTEM-ARCH.tar.gz`
2. Add the plugin to Pulumi:
   `pulumi plugin install resource proxmoxve X.Y.Z -f ./pulumi-resource-proxmoxve-vX.Y.Z-OPERATING_SYSTEM-ARCH.tar.gz`

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @muhlba91/pulumi-proxmoxve
```

or `yarn`:

```bash
yarn add @muhlba91/pulumi-proxmoxve
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi-proxmoxve
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/muhlba91/pulumi-proxmoxve/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.ProxmoxVE
```

## Configuration

Unfortunately, configuration via environment variables is not (yet) working.
To configure the provider you must create and pass it through.

Example for *Typescript*:
```typescript
import * as proxmox from '@muhlba91/pulumi-proxmoxve';

const provider = new proxmox.Provider('proxmoxve', {
  virtualEnvironment: {
    endpoint: process.env.PROXMOX_VE_ENDPOINT,
    insecure: process.env.PROXMOX_VE_INSECURE,
    username: process.env.PROXMOX_VE_USERNAME,
    password: process.env.PROXMOX_VE_PASSWORD
  }
});

const args = {};
const vm = new proxmox.vm.VirtualMachine(
  'vm',
  args,
  {
    provider: provider,
  },
);
```

## Reference

For detailed reference documentation, please visit the upstream Terraform provider's documentation at: https://registry.terraform.io/providers/bpg/proxmox/latest.

Some input parameters are required as per the [Proxmox API Viewer](https://pve.proxmox.com/pve-docs/api-viewer/index.html).
Please refer to this documentation for more information regarding required parameters for your Proxmox VE version.
