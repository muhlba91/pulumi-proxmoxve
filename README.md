# Proxmox VE Resource Provider

[![](https://img.shields.io/github/license/muhlba91/pulumi-proxmoxve?style=for-the-badge)](LICENSE)
[![](https://img.shields.io/github/actions/workflow/status/muhlba91/pulumi-proxmoxve/verify.yml?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/actions/workflows/verify.yml)
[![](https://img.shields.io/github/release-date/muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://github.com/muhlba91/pulumi-proxmoxve/releases)
[![](https://img.shields.io/pypi/v/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/pypi/dm/pulumi-proxmoxve?style=for-the-badge)](https://pypi.org/project/pulumi-proxmoxve/)
[![](https://img.shields.io/nuget/v/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/nuget/dt/Pulumi.ProxmoxVE?style=for-the-badge)](https://www.nuget.org/packages/Pulumi.ProxmoxVE/)
[![](https://img.shields.io/npm/v/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/npm/dm/@muhlba91/pulumi-proxmoxve?style=for-the-badge)](https://www.npmjs.com/package/@muhlba91/pulumi-proxmoxve)
[![](https://img.shields.io/github/all-contributors/muhlba91/pulumi-proxmoxve?color=ee8449&style=for-the-badge)](#contributors)
<a href="https://www.buymeacoffee.com/muhlba91" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/default-orange.png" alt="Buy Me A Coffee" height="28" width="150"></a>

The Proxmox VE Resource Provider for [Pulumi](https://www.pulumi.com) lets you manage [Proxmox VE](http://proxmox.com) resources.

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
  endpoint: process.env.PROXMOX_VE_ENDPOINT,
  insecure: process.env.PROXMOX_VE_INSECURE,
  username: process.env.PROXMOX_VE_USERNAME,
  password: process.env.PROXMOX_VE_PASSWORD
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
