// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationUserAccountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("keys")]
        private InputList<string>? _keys;

        /// <summary>
        /// The SSH keys.
        /// </summary>
        public InputList<string> Keys
        {
            get => _keys ?? (_keys = new InputList<string>());
            set => _keys = value;
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The SSH password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The SSH username.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public VirtualMachineInitializationUserAccountGetArgs()
        {
        }
        public static new VirtualMachineInitializationUserAccountGetArgs Empty => new VirtualMachineInitializationUserAccountGetArgs();
    }
}
