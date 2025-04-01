# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .acl import *
from .acme_account import *
from .acme_dns_plugin import *
from .certifi import *
from .dns import *
from .get_container import *
from .get_node import *
from .get_vm2 import *
from .hosts import *
from .provider import *
from .time import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_proxmoxve.acme as __acme
    acme = __acme
    import pulumi_proxmoxve.apt as __apt
    apt = __apt
    import pulumi_proxmoxve.cluster as __cluster
    cluster = __cluster
    import pulumi_proxmoxve.config as __config
    config = __config
    import pulumi_proxmoxve.ct as __ct
    ct = __ct
    import pulumi_proxmoxve.download as __download
    download = __download
    import pulumi_proxmoxve.ha as __ha
    ha = __ha
    import pulumi_proxmoxve.hardware as __hardware
    hardware = __hardware
    import pulumi_proxmoxve.metrics as __metrics
    metrics = __metrics
    import pulumi_proxmoxve.network as __network
    network = __network
    import pulumi_proxmoxve.permission as __permission
    permission = __permission
    import pulumi_proxmoxve.storage as __storage
    storage = __storage
    import pulumi_proxmoxve.user as __user
    user = __user
    import pulumi_proxmoxve.vm as __vm
    vm = __vm
else:
    acme = _utilities.lazy_import('pulumi_proxmoxve.acme')
    apt = _utilities.lazy_import('pulumi_proxmoxve.apt')
    cluster = _utilities.lazy_import('pulumi_proxmoxve.cluster')
    config = _utilities.lazy_import('pulumi_proxmoxve.config')
    ct = _utilities.lazy_import('pulumi_proxmoxve.ct')
    download = _utilities.lazy_import('pulumi_proxmoxve.download')
    ha = _utilities.lazy_import('pulumi_proxmoxve.ha')
    hardware = _utilities.lazy_import('pulumi_proxmoxve.hardware')
    metrics = _utilities.lazy_import('pulumi_proxmoxve.metrics')
    network = _utilities.lazy_import('pulumi_proxmoxve.network')
    permission = _utilities.lazy_import('pulumi_proxmoxve.permission')
    storage = _utilities.lazy_import('pulumi_proxmoxve.storage')
    user = _utilities.lazy_import('pulumi_proxmoxve.user')
    vm = _utilities.lazy_import('pulumi_proxmoxve.vm')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "proxmoxve",
  "mod": "Apt/repository",
  "fqn": "pulumi_proxmoxve.apt",
  "classes": {
   "proxmoxve:Apt/repository:Repository": "Repository"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Apt/standard/repository",
  "fqn": "pulumi_proxmoxve.apt.standard",
  "classes": {
   "proxmoxve:Apt/standard/repository:Repository": "Repository"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "CT/container",
  "fqn": "pulumi_proxmoxve.ct",
  "classes": {
   "proxmoxve:CT/container:Container": "Container"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Cluster/options",
  "fqn": "pulumi_proxmoxve.cluster",
  "classes": {
   "proxmoxve:Cluster/options:Options": "Options"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Download/file",
  "fqn": "pulumi_proxmoxve.download",
  "classes": {
   "proxmoxve:Download/file:File": "File"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "HA/hAGroup",
  "fqn": "pulumi_proxmoxve.ha",
  "classes": {
   "proxmoxve:HA/hAGroup:HAGroup": "HAGroup"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "HA/hAResource",
  "fqn": "pulumi_proxmoxve.ha",
  "classes": {
   "proxmoxve:HA/hAResource:HAResource": "HAResource"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Hardware/mapping/pci",
  "fqn": "pulumi_proxmoxve.hardware.mapping",
  "classes": {
   "proxmoxve:Hardware/mapping/pci:Pci": "Pci"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Hardware/mapping/usb",
  "fqn": "pulumi_proxmoxve.hardware.mapping",
  "classes": {
   "proxmoxve:Hardware/mapping/usb:Usb": "Usb"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Metrics/metricsServer",
  "fqn": "pulumi_proxmoxve.metrics",
  "classes": {
   "proxmoxve:Metrics/metricsServer:MetricsServer": "MetricsServer"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewall",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewall:Firewall": "Firewall"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewallAlias",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewallAlias:FirewallAlias": "FirewallAlias"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewallIPSet",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewallIPSet:FirewallIPSet": "FirewallIPSet"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewallOptions",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewallOptions:FirewallOptions": "FirewallOptions"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewallRules",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewallRules:FirewallRules": "FirewallRules"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/firewallSecurityGroup",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup": "FirewallSecurityGroup"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/networkBridge",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/networkBridge:NetworkBridge": "NetworkBridge"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Network/networkVlan",
  "fqn": "pulumi_proxmoxve.network",
  "classes": {
   "proxmoxve:Network/networkVlan:NetworkVlan": "NetworkVlan"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Permission/group",
  "fqn": "pulumi_proxmoxve.permission",
  "classes": {
   "proxmoxve:Permission/group:Group": "Group"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Permission/pool",
  "fqn": "pulumi_proxmoxve.permission",
  "classes": {
   "proxmoxve:Permission/pool:Pool": "Pool"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Permission/role",
  "fqn": "pulumi_proxmoxve.permission",
  "classes": {
   "proxmoxve:Permission/role:Role": "Role"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Permission/user",
  "fqn": "pulumi_proxmoxve.permission",
  "classes": {
   "proxmoxve:Permission/user:User": "User"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "Storage/file",
  "fqn": "pulumi_proxmoxve.storage",
  "classes": {
   "proxmoxve:Storage/file:File": "File"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "User/token",
  "fqn": "pulumi_proxmoxve.user",
  "classes": {
   "proxmoxve:User/token:Token": "Token"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "VM/virtualMachine",
  "fqn": "pulumi_proxmoxve.vm",
  "classes": {
   "proxmoxve:VM/virtualMachine:VirtualMachine": "VirtualMachine"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "VM/virtualMachine2",
  "fqn": "pulumi_proxmoxve.vm",
  "classes": {
   "proxmoxve:VM/virtualMachine2:VirtualMachine2": "VirtualMachine2"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/acl",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/acl:Acl": "Acl"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/acmeAccount",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/acmeAccount:AcmeAccount": "AcmeAccount"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/acmeDnsPlugin",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/acmeDnsPlugin:AcmeDnsPlugin": "AcmeDnsPlugin"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/certifi",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/certifi:Certifi": "Certifi"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/dNS",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/dNS:DNS": "DNS"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/hosts",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/hosts:Hosts": "Hosts"
  }
 },
 {
  "pkg": "proxmoxve",
  "mod": "index/time",
  "fqn": "pulumi_proxmoxve",
  "classes": {
   "proxmoxve:index/time:Time": "Time"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "proxmoxve",
  "token": "pulumi:providers:proxmoxve",
  "fqn": "pulumi_proxmoxve",
  "class": "Provider"
 }
]
"""
)
