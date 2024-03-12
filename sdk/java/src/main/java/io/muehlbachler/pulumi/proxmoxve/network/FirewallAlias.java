// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Network.FirewallAliasArgs;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallAliasState;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Aliases are used to see what devices or group of devices are affected by a rule.
 * We can create aliases to identify an IP address or a network. Aliases can be
 * created on the cluster level, on VM / Container level.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.proxmoxve.Network.FirewallAlias;
 * import com.pulumi.proxmoxve.Network.FirewallAliasArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var localNetwork = new FirewallAlias(&#34;localNetwork&#34;, FirewallAliasArgs.builder()        
 *             .nodeName(proxmox_virtual_environment_vm.example().node_name())
 *             .vmId(proxmox_virtual_environment_vm.example().vm_id())
 *             .cidr(&#34;192.168.0.0/23&#34;)
 *             .comment(&#34;Managed by Terraform&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(proxmox_virtual_environment_vm.example())
 *                 .build());
 * 
 *         var ubuntuVm = new FirewallAlias(&#34;ubuntuVm&#34;, FirewallAliasArgs.builder()        
 *             .cidr(&#34;192.168.0.1&#34;)
 *             .comment(&#34;Managed by Terraform&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="proxmoxve:Network/firewallAlias:FirewallAlias")
public class FirewallAlias extends com.pulumi.resources.CustomResource {
    /**
     * Network/IP specification in CIDR format.
     * 
     */
    @Export(name="cidr", refs={String.class}, tree="[0]")
    private Output<String> cidr;

    /**
     * @return Network/IP specification in CIDR format.
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * Alias comment.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Alias comment.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Container ID. Leave empty for cluster level aliases.
     * 
     */
    @Export(name="containerId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> containerId;

    /**
     * @return Container ID. Leave empty for cluster level aliases.
     * 
     */
    public Output<Optional<Integer>> containerId() {
        return Codegen.optional(this.containerId);
    }
    /**
     * Alias name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Alias name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Node name. Leave empty for cluster level aliases.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeName;

    /**
     * @return Node name. Leave empty for cluster level aliases.
     * 
     */
    public Output<Optional<String>> nodeName() {
        return Codegen.optional(this.nodeName);
    }
    /**
     * VM ID. Leave empty for cluster level aliases.
     * 
     */
    @Export(name="vmId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vmId;

    /**
     * @return VM ID. Leave empty for cluster level aliases.
     * 
     */
    public Output<Optional<Integer>> vmId() {
        return Codegen.optional(this.vmId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallAlias(String name) {
        this(name, FirewallAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallAlias(String name, FirewallAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallAlias(String name, FirewallAliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallAlias:FirewallAlias", name, args == null ? FirewallAliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallAlias(String name, Output<String> id, @Nullable FirewallAliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallAlias:FirewallAlias", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirewallAlias get(String name, Output<String> id, @Nullable FirewallAliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallAlias(name, id, state, options);
    }
}
