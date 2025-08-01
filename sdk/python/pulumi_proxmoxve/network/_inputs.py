# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'FirewallIPSetCidrArgs',
    'FirewallIPSetCidrArgsDict',
    'FirewallLogRatelimitArgs',
    'FirewallLogRatelimitArgsDict',
    'FirewallRulesRuleArgs',
    'FirewallRulesRuleArgsDict',
    'FirewallSecurityGroupRuleArgs',
    'FirewallSecurityGroupRuleArgsDict',
]

MYPY = False

if not MYPY:
    class FirewallIPSetCidrArgsDict(TypedDict):
        name: pulumi.Input[_builtins.str]
        """
        Network/IP specification in CIDR format.
        """
        comment: NotRequired[pulumi.Input[_builtins.str]]
        """
        Arbitrary string annotation.
        """
        nomatch: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Entries marked as `nomatch` are skipped as if those
        were not added to the set.
        """
elif False:
    FirewallIPSetCidrArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FirewallIPSetCidrArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[_builtins.str],
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 nomatch: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        :param pulumi.Input[_builtins.str] name: Network/IP specification in CIDR format.
        :param pulumi.Input[_builtins.str] comment: Arbitrary string annotation.
        :param pulumi.Input[_builtins.bool] nomatch: Entries marked as `nomatch` are skipped as if those
               were not added to the set.
        """
        pulumi.set(__self__, "name", name)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if nomatch is not None:
            pulumi.set(__self__, "nomatch", nomatch)

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Input[_builtins.str]:
        """
        Network/IP specification in CIDR format.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Arbitrary string annotation.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def nomatch(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Entries marked as `nomatch` are skipped as if those
        were not added to the set.
        """
        return pulumi.get(self, "nomatch")

    @nomatch.setter
    def nomatch(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "nomatch", value)


if not MYPY:
    class FirewallLogRatelimitArgsDict(TypedDict):
        burst: NotRequired[pulumi.Input[_builtins.int]]
        """
        Initial burst of packages which will always get
        logged before the rate is applied (defaults to `5`).
        """
        enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enable or disable the log rate limit.
        """
        rate: NotRequired[pulumi.Input[_builtins.str]]
        """
        Frequency with which the burst bucket gets refilled
        (defaults to `1/second`).
        """
elif False:
    FirewallLogRatelimitArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FirewallLogRatelimitArgs:
    def __init__(__self__, *,
                 burst: Optional[pulumi.Input[_builtins.int]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 rate: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.int] burst: Initial burst of packages which will always get
               logged before the rate is applied (defaults to `5`).
        :param pulumi.Input[_builtins.bool] enabled: Enable or disable the log rate limit.
        :param pulumi.Input[_builtins.str] rate: Frequency with which the burst bucket gets refilled
               (defaults to `1/second`).
        """
        if burst is not None:
            pulumi.set(__self__, "burst", burst)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if rate is not None:
            pulumi.set(__self__, "rate", rate)

    @_builtins.property
    @pulumi.getter
    def burst(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Initial burst of packages which will always get
        logged before the rate is applied (defaults to `5`).
        """
        return pulumi.get(self, "burst")

    @burst.setter
    def burst(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "burst", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable or disable the log rate limit.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def rate(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Frequency with which the burst bucket gets refilled
        (defaults to `1/second`).
        """
        return pulumi.get(self, "rate")

    @rate.setter
    def rate(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "rate", value)


if not MYPY:
    class FirewallRulesRuleArgsDict(TypedDict):
        action: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule action (`ACCEPT`, `DROP`, `REJECT`).
        """
        comment: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule comment.
        """
        dest: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet destination address. This can
        refer to a single IP address, an IP set ('+ipsetname') or an IP
        alias definition. You can also specify an address range
        like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
        networks (entries are separated by comma). Please do not mix IPv4
        and IPv6 addresses inside such lists.
        """
        dport: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict TCP/UDP destination port. You can use
        service names or simple numbers (0-65535), as defined
        in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
        example `80:85`, and you can use comma separated list to match
        several ports or ranges.
        """
        enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enable this rule. Defaults to `true`.
        """
        iface: NotRequired[pulumi.Input[_builtins.str]]
        """
        Network interface name. You have to use network
        configuration key names for VMs and containers ('net\\d+'). Host
        related rules can use arbitrary strings.
        """
        log: NotRequired[pulumi.Input[_builtins.str]]
        """
        Log level for this rule (`emerg`, `alert`, `crit`,
        `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        macro: NotRequired[pulumi.Input[_builtins.str]]
        """
        Macro name. Use predefined standard macro
        from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        """
        pos: NotRequired[pulumi.Input[_builtins.int]]
        """
        Position of the rule in the list.
        """
        proto: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet protocol. You can use protocol
        names as defined in '/etc/protocols'.
        """
        security_group: NotRequired[pulumi.Input[_builtins.str]]
        """
        Security group name.
        """
        source: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet source address. This can refer
        to a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range
        like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
        networks (entries are separated by comma). Please do not mix IPv4
        and IPv6 addresses inside such lists.
        """
        sport: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict TCP/UDP source port. You can use
        service names or simple numbers (0-65535), as defined
        in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
        example `80:85`, and you can use comma separated list to match
        several ports or ranges.
        - a security group insertion block, which includes the following arguments:
        """
        type: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule type (`in`, `out`).
        """
elif False:
    FirewallRulesRuleArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FirewallRulesRuleArgs:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 dest: Optional[pulumi.Input[_builtins.str]] = None,
                 dport: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 iface: Optional[pulumi.Input[_builtins.str]] = None,
                 log: Optional[pulumi.Input[_builtins.str]] = None,
                 macro: Optional[pulumi.Input[_builtins.str]] = None,
                 pos: Optional[pulumi.Input[_builtins.int]] = None,
                 proto: Optional[pulumi.Input[_builtins.str]] = None,
                 security_group: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 sport: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] action: Rule action (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[_builtins.str] comment: Rule comment.
        :param pulumi.Input[_builtins.str] dest: Restrict packet destination address. This can
               refer to a single IP address, an IP set ('+ipsetname') or an IP
               alias definition. You can also specify an address range
               like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
               networks (entries are separated by comma). Please do not mix IPv4
               and IPv6 addresses inside such lists.
        :param pulumi.Input[_builtins.str] dport: Restrict TCP/UDP destination port. You can use
               service names or simple numbers (0-65535), as defined
               in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
               example `80:85`, and you can use comma separated list to match
               several ports or ranges.
        :param pulumi.Input[_builtins.bool] enabled: Enable this rule. Defaults to `true`.
        :param pulumi.Input[_builtins.str] iface: Network interface name. You have to use network
               configuration key names for VMs and containers ('net\\d+'). Host
               related rules can use arbitrary strings.
        :param pulumi.Input[_builtins.str] log: Log level for this rule (`emerg`, `alert`, `crit`,
               `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[_builtins.str] macro: Macro name. Use predefined standard macro
               from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        :param pulumi.Input[_builtins.int] pos: Position of the rule in the list.
        :param pulumi.Input[_builtins.str] proto: Restrict packet protocol. You can use protocol
               names as defined in '/etc/protocols'.
        :param pulumi.Input[_builtins.str] security_group: Security group name.
        :param pulumi.Input[_builtins.str] source: Restrict packet source address. This can refer
               to a single IP address, an IP set ('+ipsetname') or an IP alias
               definition. You can also specify an address range
               like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
               networks (entries are separated by comma). Please do not mix IPv4
               and IPv6 addresses inside such lists.
        :param pulumi.Input[_builtins.str] sport: Restrict TCP/UDP source port. You can use
               service names or simple numbers (0-65535), as defined
               in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
               example `80:85`, and you can use comma separated list to match
               several ports or ranges.
               - a security group insertion block, which includes the following arguments:
        :param pulumi.Input[_builtins.str] type: Rule type (`in`, `out`).
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if dest is not None:
            pulumi.set(__self__, "dest", dest)
        if dport is not None:
            pulumi.set(__self__, "dport", dport)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if iface is not None:
            pulumi.set(__self__, "iface", iface)
        if log is not None:
            pulumi.set(__self__, "log", log)
        if macro is not None:
            pulumi.set(__self__, "macro", macro)
        if pos is not None:
            pulumi.set(__self__, "pos", pos)
        if proto is not None:
            pulumi.set(__self__, "proto", proto)
        if security_group is not None:
            pulumi.set(__self__, "security_group", security_group)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if sport is not None:
            pulumi.set(__self__, "sport", sport)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule action (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule comment.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def dest(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet destination address. This can
        refer to a single IP address, an IP set ('+ipsetname') or an IP
        alias definition. You can also specify an address range
        like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
        networks (entries are separated by comma). Please do not mix IPv4
        and IPv6 addresses inside such lists.
        """
        return pulumi.get(self, "dest")

    @dest.setter
    def dest(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dest", value)

    @_builtins.property
    @pulumi.getter
    def dport(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict TCP/UDP destination port. You can use
        service names or simple numbers (0-65535), as defined
        in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
        example `80:85`, and you can use comma separated list to match
        several ports or ranges.
        """
        return pulumi.get(self, "dport")

    @dport.setter
    def dport(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dport", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable this rule. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def iface(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Network interface name. You have to use network
        configuration key names for VMs and containers ('net\\d+'). Host
        related rules can use arbitrary strings.
        """
        return pulumi.get(self, "iface")

    @iface.setter
    def iface(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "iface", value)

    @_builtins.property
    @pulumi.getter
    def log(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Log level for this rule (`emerg`, `alert`, `crit`,
        `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log")

    @log.setter
    def log(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "log", value)

    @_builtins.property
    @pulumi.getter
    def macro(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Macro name. Use predefined standard macro
        from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        """
        return pulumi.get(self, "macro")

    @macro.setter
    def macro(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "macro", value)

    @_builtins.property
    @pulumi.getter
    def pos(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Position of the rule in the list.
        """
        return pulumi.get(self, "pos")

    @pos.setter
    def pos(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "pos", value)

    @_builtins.property
    @pulumi.getter
    def proto(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet protocol. You can use protocol
        names as defined in '/etc/protocols'.
        """
        return pulumi.get(self, "proto")

    @proto.setter
    def proto(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "proto", value)

    @_builtins.property
    @pulumi.getter(name="securityGroup")
    def security_group(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Security group name.
        """
        return pulumi.get(self, "security_group")

    @security_group.setter
    def security_group(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "security_group", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet source address. This can refer
        to a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range
        like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
        networks (entries are separated by comma). Please do not mix IPv4
        and IPv6 addresses inside such lists.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source", value)

    @_builtins.property
    @pulumi.getter
    def sport(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict TCP/UDP source port. You can use
        service names or simple numbers (0-65535), as defined
        in `/etc/services`. Port ranges can be specified with '\\d+:\\d+', for
        example `80:85`, and you can use comma separated list to match
        several ports or ranges.
        - a security group insertion block, which includes the following arguments:
        """
        return pulumi.get(self, "sport")

    @sport.setter
    def sport(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "sport", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule type (`in`, `out`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


if not MYPY:
    class FirewallSecurityGroupRuleArgsDict(TypedDict):
        action: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule action (`ACCEPT`, `DROP`, `REJECT`).
        """
        comment: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule comment.
        """
        dest: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet destination address. This can refer to
        a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range like
        `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks
        (entries are separated by comma). Please do not mix IPv4 and IPv6
        addresses inside such lists.
        """
        dport: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict TCP/UDP destination port. You can use
        service names or simple numbers (0-65535), as defined in '/etc/
        services'. Port ranges can be specified with '\\d+:\\d+', for example
        `80:85`, and you can use comma separated list to match several ports or
        ranges.
        """
        enabled: NotRequired[pulumi.Input[_builtins.bool]]
        """
        Enable this rule. Defaults to `true`.
        """
        iface: NotRequired[pulumi.Input[_builtins.str]]
        """
        Network interface name. You have to use network
        configuration key names for VMs and containers ('net\\d+'). Host related
        rules can use arbitrary strings.
        """
        log: NotRequired[pulumi.Input[_builtins.str]]
        """
        Log level for this rule (`emerg`, `alert`, `crit`,
        `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        macro: NotRequired[pulumi.Input[_builtins.str]]
        """
        Macro name. Use predefined standard macro
        from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        """
        pos: NotRequired[pulumi.Input[_builtins.int]]
        """
        Position of the rule in the list.
        """
        proto: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet protocol. You can use protocol names
        as defined in '/etc/protocols'.
        """
        security_group: NotRequired[pulumi.Input[_builtins.str]]
        """
        Security group name
        """
        source: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict packet source address. This can refer
        to a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range like
        `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
        entries are separated by comma). Please do not mix IPv4 and IPv6
        addresses inside such lists.
        """
        sport: NotRequired[pulumi.Input[_builtins.str]]
        """
        Restrict TCP/UDP source port. You can use
        service names or simple numbers (0-65535), as defined in '/etc/
        services'. Port ranges can be specified with '\\d+:\\d+', for example
        `80:85`, and you can use comma separated list to match several ports or
        ranges.
        """
        type: NotRequired[pulumi.Input[_builtins.str]]
        """
        Rule type (`in`, `out`).
        """
elif False:
    FirewallSecurityGroupRuleArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class FirewallSecurityGroupRuleArgs:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 dest: Optional[pulumi.Input[_builtins.str]] = None,
                 dport: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 iface: Optional[pulumi.Input[_builtins.str]] = None,
                 log: Optional[pulumi.Input[_builtins.str]] = None,
                 macro: Optional[pulumi.Input[_builtins.str]] = None,
                 pos: Optional[pulumi.Input[_builtins.int]] = None,
                 proto: Optional[pulumi.Input[_builtins.str]] = None,
                 security_group: Optional[pulumi.Input[_builtins.str]] = None,
                 source: Optional[pulumi.Input[_builtins.str]] = None,
                 sport: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        :param pulumi.Input[_builtins.str] action: Rule action (`ACCEPT`, `DROP`, `REJECT`).
        :param pulumi.Input[_builtins.str] comment: Rule comment.
        :param pulumi.Input[_builtins.str] dest: Restrict packet destination address. This can refer to
               a single IP address, an IP set ('+ipsetname') or an IP alias
               definition. You can also specify an address range like
               `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks
               (entries are separated by comma). Please do not mix IPv4 and IPv6
               addresses inside such lists.
        :param pulumi.Input[_builtins.str] dport: Restrict TCP/UDP destination port. You can use
               service names or simple numbers (0-65535), as defined in '/etc/
               services'. Port ranges can be specified with '\\d+:\\d+', for example
               `80:85`, and you can use comma separated list to match several ports or
               ranges.
        :param pulumi.Input[_builtins.bool] enabled: Enable this rule. Defaults to `true`.
        :param pulumi.Input[_builtins.str] iface: Network interface name. You have to use network
               configuration key names for VMs and containers ('net\\d+'). Host related
               rules can use arbitrary strings.
        :param pulumi.Input[_builtins.str] log: Log level for this rule (`emerg`, `alert`, `crit`,
               `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        :param pulumi.Input[_builtins.str] macro: Macro name. Use predefined standard macro
               from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        :param pulumi.Input[_builtins.int] pos: Position of the rule in the list.
        :param pulumi.Input[_builtins.str] proto: Restrict packet protocol. You can use protocol names
               as defined in '/etc/protocols'.
        :param pulumi.Input[_builtins.str] security_group: Security group name
        :param pulumi.Input[_builtins.str] source: Restrict packet source address. This can refer
               to a single IP address, an IP set ('+ipsetname') or an IP alias
               definition. You can also specify an address range like
               `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
               entries are separated by comma). Please do not mix IPv4 and IPv6
               addresses inside such lists.
        :param pulumi.Input[_builtins.str] sport: Restrict TCP/UDP source port. You can use
               service names or simple numbers (0-65535), as defined in '/etc/
               services'. Port ranges can be specified with '\\d+:\\d+', for example
               `80:85`, and you can use comma separated list to match several ports or
               ranges.
        :param pulumi.Input[_builtins.str] type: Rule type (`in`, `out`).
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if dest is not None:
            pulumi.set(__self__, "dest", dest)
        if dport is not None:
            pulumi.set(__self__, "dport", dport)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if iface is not None:
            pulumi.set(__self__, "iface", iface)
        if log is not None:
            pulumi.set(__self__, "log", log)
        if macro is not None:
            pulumi.set(__self__, "macro", macro)
        if pos is not None:
            pulumi.set(__self__, "pos", pos)
        if proto is not None:
            pulumi.set(__self__, "proto", proto)
        if security_group is not None:
            pulumi.set(__self__, "security_group", security_group)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if sport is not None:
            pulumi.set(__self__, "sport", sport)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule action (`ACCEPT`, `DROP`, `REJECT`).
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule comment.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def dest(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet destination address. This can refer to
        a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range like
        `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks
        (entries are separated by comma). Please do not mix IPv4 and IPv6
        addresses inside such lists.
        """
        return pulumi.get(self, "dest")

    @dest.setter
    def dest(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dest", value)

    @_builtins.property
    @pulumi.getter
    def dport(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict TCP/UDP destination port. You can use
        service names or simple numbers (0-65535), as defined in '/etc/
        services'. Port ranges can be specified with '\\d+:\\d+', for example
        `80:85`, and you can use comma separated list to match several ports or
        ranges.
        """
        return pulumi.get(self, "dport")

    @dport.setter
    def dport(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "dport", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Enable this rule. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def iface(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Network interface name. You have to use network
        configuration key names for VMs and containers ('net\\d+'). Host related
        rules can use arbitrary strings.
        """
        return pulumi.get(self, "iface")

    @iface.setter
    def iface(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "iface", value)

    @_builtins.property
    @pulumi.getter
    def log(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Log level for this rule (`emerg`, `alert`, `crit`,
        `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        """
        return pulumi.get(self, "log")

    @log.setter
    def log(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "log", value)

    @_builtins.property
    @pulumi.getter
    def macro(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Macro name. Use predefined standard macro
        from <https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions>
        """
        return pulumi.get(self, "macro")

    @macro.setter
    def macro(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "macro", value)

    @_builtins.property
    @pulumi.getter
    def pos(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Position of the rule in the list.
        """
        return pulumi.get(self, "pos")

    @pos.setter
    def pos(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "pos", value)

    @_builtins.property
    @pulumi.getter
    def proto(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet protocol. You can use protocol names
        as defined in '/etc/protocols'.
        """
        return pulumi.get(self, "proto")

    @proto.setter
    def proto(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "proto", value)

    @_builtins.property
    @pulumi.getter(name="securityGroup")
    def security_group(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Security group name
        """
        return pulumi.get(self, "security_group")

    @security_group.setter
    def security_group(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "security_group", value)

    @_builtins.property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict packet source address. This can refer
        to a single IP address, an IP set ('+ipsetname') or an IP alias
        definition. You can also specify an address range like
        `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
        entries are separated by comma). Please do not mix IPv4 and IPv6
        addresses inside such lists.
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source", value)

    @_builtins.property
    @pulumi.getter
    def sport(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Restrict TCP/UDP source port. You can use
        service names or simple numbers (0-65535), as defined in '/etc/
        services'. Port ranges can be specified with '\\d+:\\d+', for example
        `80:85`, and you can use comma separated list to match several ports or
        ranges.
        """
        return pulumi.get(self, "sport")

    @sport.setter
    def sport(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "sport", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Rule type (`in`, `out`).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


