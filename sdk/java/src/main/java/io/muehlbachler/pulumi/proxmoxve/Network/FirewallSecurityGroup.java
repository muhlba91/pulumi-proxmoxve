// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Network.FirewallSecurityGroupArgs;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallSecurityGroupState;
import io.muehlbachler.pulumi.proxmoxve.Network.outputs.FirewallSecurityGroupRule;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup")
public class FirewallSecurityGroup extends com.pulumi.resources.CustomResource {
    /**
     * Security group comment
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Security group comment
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The ID of the container to manage the firewall for.
     * 
     */
    @Export(name="containerId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> containerId;

    /**
     * @return The ID of the container to manage the firewall for.
     * 
     */
    public Output<Optional<Integer>> containerId() {
        return Codegen.optional(this.containerId);
    }
    /**
     * Security group name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Security group name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the node.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeName;

    /**
     * @return The name of the node.
     * 
     */
    public Output<Optional<String>> nodeName() {
        return Codegen.optional(this.nodeName);
    }
    /**
     * List of rules
     * 
     */
    @Export(name="rules", refs={List.class,FirewallSecurityGroupRule.class}, tree="[0,1]")
    private Output<List<FirewallSecurityGroupRule>> rules;

    /**
     * @return List of rules
     * 
     */
    public Output<List<FirewallSecurityGroupRule>> rules() {
        return this.rules;
    }
    /**
     * The ID of the VM to manage the firewall for.
     * 
     */
    @Export(name="vmId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vmId;

    /**
     * @return The ID of the VM to manage the firewall for.
     * 
     */
    public Output<Optional<Integer>> vmId() {
        return Codegen.optional(this.vmId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallSecurityGroup(String name) {
        this(name, FirewallSecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallSecurityGroup(String name, FirewallSecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallSecurityGroup(String name, FirewallSecurityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, args == null ? FirewallSecurityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallSecurityGroup(String name, Output<String> id, @Nullable FirewallSecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup", name, state, makeResourceOptions(options, id));
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
    public static FirewallSecurityGroup get(String name, Output<String> id, @Nullable FirewallSecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallSecurityGroup(name, id, state, options);
    }
}
