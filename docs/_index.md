---
title: Proxmox Virtual Environment (Proxmox VE)
meta_desc: Provides an overview of the Proxmox VE Provider for Pulumi.
layout: overview
---

The Proxmox Virtual Environment (Proxmox VE) provider for Pulumi can be used to provision virtual machines and
containers using [Proxmox VE](https://www.proxmox.com/en/proxmox-ve).

## Example

{{< chooser language "javascript,typescript,python,csharp" >}}

{{% choosable language javascript %}}

```javascript
const proxmox = require("@muhlba91/pulumi-proxmoxve")

const virtualMachine = new proxmox.vm.VirtualMachine('vm', {
    nodeName: 'pve1',
    agent: {
        enabled: false, // toggles checking for ip addresses through qemu-guest-agent
        trim: true,
        type: 'virtio',
    },
    bios: 'seabios',
    cpu: {
        cores: 1,
        sockets: 1,
    },
    clone: {
        nodeName: 'pve1',
        vmId: 9000,
        full: true,
    },
    disks: [
        {
            interface: 'scsi0',
            datastoreId: 'local-lvm',
            size: 32,
            fileFormat: 'qcow2',
        },
    ],
    memory: {
        dedicated: 1024,
    },
    name: 'proxmox-vm',
    networkDevices: [
        {
            bridge: 'vmbr0',
            model: 'virtio',
        },
    ],
    onBoot: true,
    operatingSystem: {
        type: 'l26',
    },
    initialization: {
        type: 'nocloud',
        datastoreId: 'local-lvm',
        dns: {
            domain: 'example.com',
            server: '1.1.1.1 1.0.0.1',
        },
        ipConfigs: [
            {
                ipv4: {
                    address: '10.0.0.10/24',
                    gateway: '10.0.0.1',
                },
                ipv6: {
                    address: 'fd91:0812:a17f:6194::10/64',
                    gateway: 'fd91:0812:a17f:6194::1',
                },
            },
        ],
        userAccount: {
            username: 'proxmox',
            password: 'password',
            keys: ['SSH_PUBLIC_KEY'],
        },
    },
})
```

{{% /choosable %}} {{% choosable language typescript %}}

```typescript
import * as proxmox from "@muhlba91/pulumi-proxmoxve";

const virtualMachine = new proxmox.vm.VirtualMachine('vm', {
    nodeName: 'pve1',
    agent: {
        enabled: false, // toggles checking for ip addresses through qemu-guest-agent
        trim: true,
        type: 'virtio',
    },
    bios: 'seabios',
    cpu: {
        cores: 1,
        sockets: 1,
    },
    clone: {
        nodeName: 'pve1',
        vmId: 9000,
        full: true,
    },
    disks: [
        {
            interface: 'scsi0',
            datastoreId: 'local-lvm',
            size: 32,
            fileFormat: 'qcow2',
        },
    ],
    memory: {
        dedicated: 1024,
    },
    name: 'proxmox-vm',
    networkDevices: [
        {
            bridge: 'vmbr0',
            model: 'virtio',
        },
    ],
    onBoot: true,
    operatingSystem: {
        type: 'l26',
    },
    initialization: {
        type: 'nocloud',
        datastoreId: 'local-lvm',
        dns: {
            domain: 'example.com',
            server: '1.1.1.1 1.0.0.1',
        },
        ipConfigs: [
            {
                ipv4: {
                    address: '10.0.0.10/24',
                    gateway: '10.0.0.1',
                },
                ipv6: {
                    address: 'fd91:0812:a17f:6194::10/64',
                    gateway: 'fd91:0812:a17f:6194::1',
                },
            },
        ],
        userAccount: {
            username: 'proxmox',
            password: 'password',
            keys: ['SSH_PUBLIC_KEY'],
        },
    },
})
```

{{% /choosable %}} {{% choosable language python %}}

```python
import pulumi_proxmoxve as proxmox

virtual_machine = proxmox.vm.VirtualMachine(
    resource_name="vm",
    node_name="pve1",
    agent=proxmox.vm.VirtualMachineAgentArgs(
        enabled=False, # toggles checking for ip addresses through qemu-guest-agent
        trim=True,
        type="virtio"
    ),
    bios="seabios",
    cpu=proxmox.vm.VirtualMachineCpuArgs(
        cores=1,
        sockets=1
    ),
    clone=proxmox.vm.VirtualMachineCloneArgs(
        node_name="pve1",
        vm_id=9000,
        full=True
    ),
    disks=[
        proxmox.vm.VirtualMachineDiskArgs(
            interface="scsi0",
            datastore_id="local-lvm",
            size=32,
            file_format="qcow2"
        )
    ],
    memory=proxmox.vm.VirtualMachineMemoryArgs(
        dedicated=1024
    ),
    name="proxmox-vm",
    network_devices=[
        proxmox.vm.VirtualMachineNetworkDeviceArgs(
            bridge="vmbr0",
            model="virtio"
        )
    ],
    on_boot=True,
    operating_system=proxmox.vm.VirtualMachineOperatingSystemArgs(type="l26"),
    initialization=proxmox.vm.VirtualMachineInitializationArgs(
        type="nocloud",
        datastore_id="local-lvm",
        dns=proxmox.vm.VirtualMachineInitializationDnsArgs(
            domain="example.com",
            server="1.1.1.1 1.0.0.1"
        ),
        ip_configs=[
            proxmox.vm.VirtualMachineInitializationIpConfigArgs(
                ipv4=proxmox.vm.VirtualMachineInitializationIpConfigIpv4Args(
                    address="10.0.0.10/24",
                    gateway="10.0.0.1"
                ),
                ipv6=proxmox.vm.VirtualMachineInitializationIpConfigIpv6Args(
                    address="fd91:0812:a17f:6194::10/64",
                    gateway="fd91:0812:a17f:6194::1"
                )
            )
        ],
        user_account=proxmox.vm.VirtualMachineInitializationUserAccountArgs(
            username="proxmox",
            password="password",
            keys=["SSH_PUBLIC_KEY"]
        )
    )
)
```

{{% /choosable %}} {{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using System.Threading.Tasks;
using Pulumi;
using Pulumi.ProxmoxVE.VM;
using Pulumi.ProxmoxVE.VM.Inputs;

class Program
{
    static Task Main() =>
        Deployment.Run(() => {
            var virtualMachine = new VirtualMachine("vm", new VirtualMachineArgs
            {
                NodeName="pve1",
                Agent=new VirtualMachineAgentArgs{
                    enabled=false, // toggles checking for ip addresses through qemu-guest-agent
                    trim=true,
                    type="virtio"
                },
                Bios="seabios",
                Cpu=new VirtualMachineCpuArgs{
                    Cores=1,
                    Sockets=1
                },
                Clone=new VirtualMachineCloneArgs{
                    NodeName="pve1",
                    VmId=9000,
                    Full=true
                },
                Disks: [
                    new VirtualMachineDiskArgs{
                        Interface="scsi0",
                        DatastoreId="local-lvm",
                        Size=32,
                        FileFormat="qcow2"
                    }
                ],
                Memory: new VirtualMachineMemoryArgs{
                    Dedicated=1024
                },
                Name="proxmox-vm",
                NetworkDevices: [
                    new VirtualMachineNetworkDeviceArgs{
                        Bridge="vmbr0",
                        Model="virtio"
                    }
                ],
                OnBoot=true,
                OperatingSystem=new VirtualMachineOperatingSystemArgs{
                    type="l26"
                },
                Initialization=new VirtualMachineInitializationArgs{
                    Type="nocloud",
                    DatastoreId="local-lvm",
                    Dns: new VirtualMachineInitializationDnsArgs{
                        Domain="example.com",
                        Server="1.1.1.1 1.0.0.1"
                    },
                    IpConfigs: [
                        new VirtualMachineInitializationIpConfigArgs{
                            Ipv4=new VirtualMachineInitializationIpConfigIpv4Args{
                                Address="10.0.0.10/24",
                                Gateway="10.0.0.1"
                            },
                            Ipv6=new VirtualMachineInitializationIpConfigIpv6Args{
                                Address="fd91:0812:a17f:6194::10/64",
                                Gateway="fd91:0812:a17f:6194::1"
                            }
                        }
                    ],
                    UserAccount: new VirtualMachineInitializationUserAccountArgs{
                        Username="proxmox",
                        Password="password",
                        Keys=["SSH_PUBLIC_KEY"]
                    }
                }
            });
        });
}
```

{{% /choosable %}}

{{< /chooser >}}
