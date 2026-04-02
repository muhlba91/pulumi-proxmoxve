# Pulumi Proxmox VE Provider

[![](https://img.shields.io/github/license/muhlba91/pulumi-proxmoxve?style=for-the-badge)](LICENSE)
[![](https://img.shields.io/github/actions/workflow/status/muhlba91/pulumi-proxmoxve/verify.yml?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/actions/workflows/verify.yml)
[![](https://api.scorecard.dev/projects/github.com/muhlba91/pulumi-proxmoxve/badge?style=for-the-badge)](https://scorecard.dev/viewer/?uri=github.com/muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/github/release-date/muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/releases)
[![](https://img.shields.io/pypi/v/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/pypi/dm/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/nuget/v/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/nuget/dt/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/npm/v/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/npm/dm/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/github/all-contributors/muhlba91/pulumi-proxmoxve?color=ee8449&style=for-the-badge)](#contributors)
<a href="https://www.buymeacoffee.com/muhlba91" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="28" width="150"></a>

A [Pulumi](https://www.pulumi.com) package to manage [Proxmox Virtual Environment](http://proxmox.com) (Proxmox VE) resources. This provider is built on the [Terraform Proxmox Provider](https://github.com/bpg/terraform-provider-proxmox).

## Installation

This package is available for multiple programming languages. Install using your preferred package manager:

### Node.js (JavaScript/TypeScript)

```bash
npm install @muhlba91/pulumi-proxmoxve
# or
yarn add @muhlba91/pulumi-proxmoxve
```

### Python

```bash
pip install pulumi-proxmoxve
```

### Go

```bash
go get github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve
```

### .NET

```bash
dotnet add package Pulumi.ProxmoxVE
```

## Configuration

You must configure the provider with your Proxmox VE API credentials. Currently, you must explicitly pass configuration values to the provider constructor. You can use environment variables to manage these secrets:

| Variable               | Description                                                                       |
|------------------------|-----------------------------------------------------------------------------------|
| `PROXMOX_VE_ENDPOINT`  | The API endpoint of your Proxmox VE server (e.g., `https://pve.example.com:8006`) |
| `PROXMOX_VE_USERNAME`  | Your Proxmox VE username                                                          |
| `PROXMOX_VE_PASSWORD`  | Your Proxmox VE password or API token                                             |
| `PROXMOX_VE_INSECURE`  | Set to `true` to skip TLS certificate verification                                |

## Example Usage

### TypeScript

```typescript
import * as pulumi from '@pulumi/pulumi';
import * as proxmox from '@muhlba91/pulumi-proxmoxve';

// Initialize the Proxmox provider
const provider = new proxmox.Provider('proxmoxve', {
  endpoint: process.env.PROXMOX_VE_ENDPOINT,
  username: process.env.PROXMOX_VE_USERNAME,
  password: process.env.PROXMOX_VE_PASSWORD,
  insecure: process.env.PROXMOX_VE_INSECURE === 'true',
});

// Create a Virtual Machine
const vm = new proxmox.vm.VirtualMachine('my-vm', {
  nodeName: 'pve-node-1',
  // ... further configuration
}, { provider });
```

## Migration

### v7 to v8 (Breaking Changes)

Version 8 introduces a breaking change in how resources are named to align with the upstream Terraform provider's transition to the modern provider framework.

- **Standardized Resource Names**: Due to the upstream provider introducing the `proxmox_` prefix and standardizing resource identification, custom resource name and ID changes have been deprecated.
- **Legacy Namespacing**: Resources that previously started with `proxmox_virtual_environment_` have been moved to a `Legacy` naming format (e.g., `proxmoxve:VM/virtualMachine:VirtualMachine` is now `proxmoxve:index/vmLegacy:VmLegacy`).

You can migrate your existing stack by exporting the state, updating the resource tokens, and re-importing:

```bash
pulumi stack export > stack.json
# Example: updating the VirtualMachine resource token
sed -i 's/proxmoxve:VM\/virtualMachine:VirtualMachine/proxmoxve:index\/vmLegacy:VmLegacy/g' stack.json
pulumi stack import < stack.json
```

## Reference

- **Upstream Provider Reference**: [Terraform Proxmox Provider Documentation](https://registry.terraform.io/providers/bpg/proxmox/latest/docs)
- **Proxmox API**: [Proxmox VE API Viewer](https://pve.proxmox.com/pve-docs/api-viewer/index.html)
- **Official Documentation**: [Proxmox VE Documentation](https://pve.proxmox.com/pve-docs/)

## Contributors

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://muehlbachler.io/"><img src="https://avatars.githubusercontent.com/u/653739?v=4?s=100" width="100px;" alt="Daniel Mühlbachler-Pietrzykowski"/><br /><sub><b>Daniel Mühlbachler-Pietrzykowski</b></sub></a><br /><a href="#maintenance-muhlba91" title="Maintenance">🚧</a> <a href="https://github.com/muhlba91/pulumi-proxmoxve/commits?author=muhlba91" title="Code">💻</a> <a href="https://github.com/muhlba91/pulumi-proxmoxve/commits?author=muhlba91" title="Documentation">📖</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/NCMartins"><img src="https://avatars.githubusercontent.com/u/11583533?v=4?s=100" width="100px;" alt="Nelson Costa Martins"/><br /><sub><b>Nelson Costa Martins</b></sub></a><br /><a href="#example-NCMartins" title="Examples">💡</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/guineveresaenger"><img src="https://avatars.githubusercontent.com/u/13116240?v=4?s=100" width="100px;" alt="Guinevere Saenger"/><br /><sub><b>Guinevere Saenger</b></sub></a><br /><a href="https://github.com/muhlba91/pulumi-proxmoxve/commits?author=guineveresaenger" title="Documentation">📖</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/susanev"><img src="https://avatars.githubusercontent.com/u/5489125?v=4?s=100" width="100px;" alt="Susan Evans"/><br /><sub><b>Susan Evans</b></sub></a><br /><a href="https://github.com/muhlba91/pulumi-proxmoxve/commits?author=susanev" title="Documentation">📖</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/zamrih"><img src="https://avatars.githubusercontent.com/u/1061718?v=4?s=100" width="100px;" alt="zamrih"/><br /><sub><b>zamrih</b></sub></a><br /><a href="https://github.com/muhlba91/pulumi-proxmoxve/commits?author=zamrih" title="Code">💻</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!
