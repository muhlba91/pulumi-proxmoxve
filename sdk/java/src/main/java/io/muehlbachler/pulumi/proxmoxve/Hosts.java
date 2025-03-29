// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.HostsArgs;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.inputs.HostsState;
import io.muehlbachler.pulumi.proxmoxve.outputs.HostsEntry;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages the host entries on a specific node.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Important Notes
 * 
 * Be careful not to use this resource multiple times for the same node.
 * 
 * ## Import
 * 
 * Instances can be imported using the `node_name`, e.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import proxmoxve:index/hosts:Hosts first_node_host_entries first-node
 * ```
 * 
 */
@ResourceType(type="proxmoxve:index/hosts:Hosts")
public class Hosts extends com.pulumi.resources.CustomResource {
    /**
     * The IP addresses.
     * 
     */
    @Export(name="addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> addresses;

    /**
     * @return The IP addresses.
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }
    /**
     * The SHA1 digest.
     * 
     */
    @Export(name="digest", refs={String.class}, tree="[0]")
    private Output<String> digest;

    /**
     * @return The SHA1 digest.
     * 
     */
    public Output<String> digest() {
        return this.digest;
    }
    /**
     * The host entries (conversion of `addresses` and `hostnames` into
     * objects).
     * 
     */
    @Export(name="entries", refs={List.class,HostsEntry.class}, tree="[0,1]")
    private Output<List<HostsEntry>> entries;

    /**
     * @return The host entries (conversion of `addresses` and `hostnames` into
     * objects).
     * 
     */
    public Output<List<HostsEntry>> entries() {
        return this.entries;
    }
    /**
     * A host entry (multiple blocks supported).
     * 
     */
    @Export(name="entry", refs={List.class,HostsEntry.class}, tree="[0,1]")
    private Output<List<HostsEntry>> entry;

    /**
     * @return A host entry (multiple blocks supported).
     * 
     */
    public Output<List<HostsEntry>> entry() {
        return this.entry;
    }
    /**
     * The hostnames associated with each of the IP addresses.
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,[0,1]]")
    private Output<List<List<String>>> hostnames;

    /**
     * @return The hostnames associated with each of the IP addresses.
     * 
     */
    public Output<List<List<String>>> hostnames() {
        return this.hostnames;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hosts(java.lang.String name) {
        this(name, HostsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hosts(java.lang.String name, HostsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hosts(java.lang.String name, HostsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/hosts:Hosts", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Hosts(java.lang.String name, Output<java.lang.String> id, @Nullable HostsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/hosts:Hosts", name, state, makeResourceOptions(options, id), false);
    }

    private static HostsArgs makeArgs(HostsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HostsArgs.Empty : args;
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
    public static Hosts get(java.lang.String name, Output<java.lang.String> id, @Nullable HostsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Hosts(name, id, state, options);
    }
}
