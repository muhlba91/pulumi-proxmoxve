// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network.Outputs
{

    [OutputType]
    public sealed class FirewallSecurityGroupRule
    {
        /// <summary>
        /// Rule action (`ACCEPT`, `DROP`, `REJECT`).
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Rule comment.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Restrict packet destination address. This can refer to
        /// a single IP address, an IP set ('+ipsetname') or an IP alias
        /// definition. You can also specify an address range like
        /// `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks
        /// (entries are separated by comma). Please do not mix IPv4 and IPv6
        /// addresses inside such lists.
        /// </summary>
        public readonly string? Dest;
        /// <summary>
        /// Restrict TCP/UDP destination port. You can use
        /// service names or simple numbers (0-65535), as defined in '/etc/
        /// services'. Port ranges can be specified with '\d+:\d+', for example
        /// `80:85`, and you can use comma separated list to match several ports or
        /// ranges.
        /// </summary>
        public readonly string? Dport;
        /// <summary>
        /// Enable rule
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Network interface name. You have to use network
        /// configuration key names for VMs and containers ('net\d+'). Host related
        /// rules can use arbitrary strings.
        /// </summary>
        public readonly string? Iface;
        /// <summary>
        /// Log level for this rule (`emerg`, `alert`, `crit`,
        /// `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
        /// </summary>
        public readonly string? Log;
        /// <summary>
        /// Macro name. Use predefined standard macro
        /// from &lt;https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions&gt;
        /// </summary>
        public readonly string? Macro;
        /// <summary>
        /// Position of the rule in the list.
        /// </summary>
        public readonly int? Pos;
        /// <summary>
        /// Restrict packet protocol. You can use protocol names
        /// as defined in '/etc/protocols'.
        /// </summary>
        public readonly string? Proto;
        /// <summary>
        /// Security group name
        /// </summary>
        public readonly string? SecurityGroup;
        /// <summary>
        /// Restrict packet source address. This can refer
        /// to a single IP address, an IP set ('+ipsetname') or an IP alias
        /// definition. You can also specify an address range like
        /// `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
        /// entries are separated by comma). Please do not mix IPv4 and IPv6
        /// addresses inside such lists.
        /// </summary>
        public readonly string? Source;
        /// <summary>
        /// Restrict TCP/UDP source port. You can use
        /// service names or simple numbers (0-65535), as defined in '/etc/
        /// services'. Port ranges can be specified with '\d+:\d+', for example
        /// `80:85`, and you can use comma separated list to match several ports or
        /// ranges.
        /// </summary>
        public readonly string? Sport;
        /// <summary>
        /// Rule type (`in`, `out`).
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private FirewallSecurityGroupRule(
            string? action,

            string? comment,

            string? dest,

            string? dport,

            bool? enabled,

            string? iface,

            string? log,

            string? macro,

            int? pos,

            string? proto,

            string? securityGroup,

            string? source,

            string? sport,

            string? type)
        {
            Action = action;
            Comment = comment;
            Dest = dest;
            Dport = dport;
            Enabled = enabled;
            Iface = iface;
            Log = log;
            Macro = macro;
            Pos = pos;
            Proto = proto;
            SecurityGroup = securityGroup;
            Source = source;
            Sport = sport;
            Type = type;
        }
    }
}
