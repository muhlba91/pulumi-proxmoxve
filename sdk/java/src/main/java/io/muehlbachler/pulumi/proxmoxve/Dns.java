// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.DNSArgs;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.inputs.DNSState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the DNS configuration for a specific node.
 * 
 * ## Import
 * 
 * Instances can be imported using the `node_name`, e.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import proxmoxve:index/dNS:DNS first_node first-node
 * ```
 * 
 */
@ResourceType(type="proxmoxve:index/dNS:DNS")
public class DNS extends com.pulumi.resources.CustomResource {
    /**
     * The DNS search domain.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The DNS search domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * A node name.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return A node name.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * The DNS servers.
     * 
     */
    @Export(name="servers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> servers;

    /**
     * @return The DNS servers.
     * 
     */
    public Output<Optional<List<String>>> servers() {
        return Codegen.optional(this.servers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DNS(java.lang.String name) {
        this(name, DNSArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DNS(java.lang.String name, DNSArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DNS(java.lang.String name, DNSArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/dNS:DNS", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DNS(java.lang.String name, Output<java.lang.String> id, @Nullable DNSState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/dNS:DNS", name, state, makeResourceOptions(options, id), false);
    }

    private static DNSArgs makeArgs(DNSArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DNSArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/muhlba91/pulumi-proxmoxve")
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
    public static DNS get(java.lang.String name, Output<java.lang.String> id, @Nullable DNSState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DNS(name, id, state, options);
    }
}
