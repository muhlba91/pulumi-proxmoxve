// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Acme
{
    public static class GetPlugins
    {
        /// <summary>
        /// Retrieves the list of ACME plugins.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ProxmoxVE.Acme.GetPlugins.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentAcmePlugins"] = example.Apply(getPluginsResult =&gt; getPluginsResult.Plugins),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetPluginsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPluginsResult>("proxmoxve:Acme/getPlugins:getPlugins", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves the list of ACME plugins.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ProxmoxVE.Acme.GetPlugins.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentAcmePlugins"] = example.Apply(getPluginsResult =&gt; getPluginsResult.Plugins),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetPluginsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPluginsResult>("proxmoxve:Acme/getPlugins:getPlugins", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetPluginsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of ACME plugins
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPluginsPluginResult> Plugins;

        [OutputConstructor]
        private GetPluginsResult(
            string id,

            ImmutableArray<Outputs.GetPluginsPluginResult> plugins)
        {
            Id = id;
            Plugins = plugins;
        }
    }
}