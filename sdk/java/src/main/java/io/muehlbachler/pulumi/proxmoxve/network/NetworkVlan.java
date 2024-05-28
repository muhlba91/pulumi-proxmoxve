// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Network.NetworkVlanArgs;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.NetworkVlanState;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linux VLAN network interface in a Proxmox VE node.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.proxmoxve.Network.NetworkVlan;
 * import com.pulumi.proxmoxve.Network.NetworkVlanArgs;
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
 *         // using VLAN tag
 *         var vlan99 = new NetworkVlan("vlan99", NetworkVlanArgs.builder()
 *             .comment("VLAN 99")
 *             .nodeName("pve")
 *             .build());
 * 
 *         // using custom network interface name
 *         var vlan98 = new NetworkVlan("vlan98", NetworkVlanArgs.builder()
 *             .comment("VLAN 98")
 *             .interface_("eno0")
 *             .nodeName("pve")
 *             .vlan(98)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * #!/usr/bin/env sh
 * 
 * #Interfaces can be imported using the `node_name:iface` format, e.g.
 * 
 * ```sh
 * $ pulumi import proxmoxve:Network/networkVlan:NetworkVlan vlan99 pve:vlan99
 * ```
 * 
 */
@ResourceType(type="proxmoxve:Network/networkVlan:NetworkVlan")
public class NetworkVlan extends com.pulumi.resources.CustomResource {
    /**
     * The interface IPv4/CIDR address.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> address;

    /**
     * @return The interface IPv4/CIDR address.
     * 
     */
    public Output<Optional<String>> address() {
        return Codegen.optional(this.address);
    }
    /**
     * The interface IPv6/CIDR address.
     * 
     */
    @Export(name="address6", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> address6;

    /**
     * @return The interface IPv6/CIDR address.
     * 
     */
    public Output<Optional<String>> address6() {
        return Codegen.optional(this.address6);
    }
    /**
     * Automatically start interface on boot (defaults to `true`).
     * 
     */
    @Export(name="autostart", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> autostart;

    /**
     * @return Automatically start interface on boot (defaults to `true`).
     * 
     */
    public Output<Boolean> autostart() {
        return this.autostart;
    }
    /**
     * Comment for the interface.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment for the interface.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Default gateway address.
     * 
     */
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gateway;

    /**
     * @return Default gateway address.
     * 
     */
    public Output<Optional<String>> gateway() {
        return Codegen.optional(this.gateway);
    }
    /**
     * Default IPv6 gateway address.
     * 
     */
    @Export(name="gateway6", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gateway6;

    /**
     * @return Default IPv6 gateway address.
     * 
     */
    public Output<Optional<String>> gateway6() {
        return Codegen.optional(this.gateway6);
    }
    /**
     * The VLAN raw device. See also `name`.
     * 
     */
    @Export(name="interface", refs={String.class}, tree="[0]")
    private Output<String> interface_;

    /**
     * @return The VLAN raw device. See also `name`.
     * 
     */
    public Output<String> interface_() {
        return this.interface_;
    }
    /**
     * The interface MTU.
     * 
     */
    @Export(name="mtu", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> mtu;

    /**
     * @return The interface MTU.
     * 
     */
    public Output<Optional<Integer>> mtu() {
        return Codegen.optional(this.mtu);
    }
    /**
     * The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
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
    private Output<String> nodeName;

    /**
     * @return The name of the node.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * The VLAN tag. See also `name`.
     * 
     */
    @Export(name="vlan", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlan;

    /**
     * @return The VLAN tag. See also `name`.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkVlan(String name) {
        this(name, NetworkVlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkVlan(String name, NetworkVlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkVlan(String name, NetworkVlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/networkVlan:NetworkVlan", name, args == null ? NetworkVlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkVlan(String name, Output<String> id, @Nullable NetworkVlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/networkVlan:NetworkVlan", name, state, makeResourceOptions(options, id));
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
    public static NetworkVlan get(String name, Output<String> id, @Nullable NetworkVlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkVlan(name, id, state, options);
    }
}
