// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.ProxmoxVE
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("proxmoxve");

        private static readonly __Value<string?> _apiToken = new __Value<string?>(() => __config.Get("apiToken"));
        /// <summary>
        /// The API token for the Proxmox Virtual Environment API
        /// </summary>
        public static string? ApiToken
        {
            get => _apiToken.Get();
            set => _apiToken.Set(value);
        }

        private static readonly __Value<string?> _endpoint = new __Value<string?>(() => __config.Get("endpoint"));
        /// <summary>
        /// The endpoint for the Proxmox Virtual Environment API
        /// </summary>
        public static string? Endpoint
        {
            get => _endpoint.Get();
            set => _endpoint.Set(value);
        }

        private static readonly __Value<bool?> _insecure = new __Value<bool?>(() => __config.GetBoolean("insecure"));
        /// <summary>
        /// Whether to skip the TLS verification step
        /// </summary>
        public static bool? Insecure
        {
            get => _insecure.Get();
            set => _insecure.Set(value);
        }

        private static readonly __Value<string?> _otp = new __Value<string?>(() => __config.Get("otp"));
        /// <summary>
        /// The one-time password for the Proxmox Virtual Environment API
        /// </summary>
        public static string? Otp
        {
            get => _otp.Get();
            set => _otp.Set(value);
        }

        private static readonly __Value<string?> _password = new __Value<string?>(() => __config.Get("password"));
        /// <summary>
        /// The password for the Proxmox Virtual Environment API
        /// </summary>
        public static string? Password
        {
            get => _password.Get();
            set => _password.Set(value);
        }

        private static readonly __Value<Pulumi.ProxmoxVE.Config.Types.Ssh?> _ssh = new __Value<Pulumi.ProxmoxVE.Config.Types.Ssh?>(() => __config.GetObject<Pulumi.ProxmoxVE.Config.Types.Ssh>("ssh"));
        /// <summary>
        /// The SSH connection configuration to a Proxmox node
        /// </summary>
        public static Pulumi.ProxmoxVE.Config.Types.Ssh? Ssh
        {
            get => _ssh.Get();
            set => _ssh.Set(value);
        }

        private static readonly __Value<string?> _username = new __Value<string?>(() => __config.Get("username"));
        /// <summary>
        /// The username for the Proxmox Virtual Environment API
        /// </summary>
        public static string? Username
        {
            get => _username.Get();
            set => _username.Set(value);
        }

        private static readonly __Value<Pulumi.ProxmoxVE.Config.Types.VirtualEnvironment?> _virtualEnvironment = new __Value<Pulumi.ProxmoxVE.Config.Types.VirtualEnvironment?>(() => __config.GetObject<Pulumi.ProxmoxVE.Config.Types.VirtualEnvironment>("virtualEnvironment"));
        public static Pulumi.ProxmoxVE.Config.Types.VirtualEnvironment? VirtualEnvironment
        {
            get => _virtualEnvironment.Get();
            set => _virtualEnvironment.Set(value);
        }

        public static class Types
        {

             public class Ssh
             {
                public bool? Agent { get; set; }
                public string? AgentSocket { get; set; } = null!;
                public Pulumi.ProxmoxVE.Config.Types.SshNode? Node { get; set; } = null!;
                public string? Password { get; set; } = null!;
                public string? Username { get; set; } = null!;
            }

             public class SshNode
             {
                public string Address { get; set; }
                public string Name { get; set; }
            }

             public class VirtualEnvironment
             {
                public string? ApiToken { get; set; } = null!;
                public string? Endpoint { get; set; } = null!;
                public bool? Insecure { get; set; }
                public string? Otp { get; set; } = null!;
                public string? Password { get; set; } = null!;
                public Pulumi.ProxmoxVE.Config.Types.VirtualEnvironmentSsh? Ssh { get; set; } = null!;
                public string? Username { get; set; } = null!;
            }

             public class VirtualEnvironmentSsh
             {
                public bool? Agent { get; set; }
                public string? AgentSocket { get; set; } = null!;
                public Pulumi.ProxmoxVE.Config.Types.VirtualEnvironmentSshNode? Node { get; set; } = null!;
                public string? Password { get; set; } = null!;
                public string? Username { get; set; } = null!;
            }

             public class VirtualEnvironmentSshNode
             {
                public string Address { get; set; }
                public string Name { get; set; }
            }
        }
    }
}