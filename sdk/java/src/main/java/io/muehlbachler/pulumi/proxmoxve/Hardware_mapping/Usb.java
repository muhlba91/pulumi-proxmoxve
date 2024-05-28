// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Hardware_mapping;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Hardware_mapping.UsbArgs;
import io.muehlbachler.pulumi.proxmoxve.Hardware_mapping.inputs.UsbState;
import io.muehlbachler.pulumi.proxmoxve.Hardware_mapping.outputs.UsbMap;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a USB hardware mapping in a Proxmox VE cluster.
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
 * import com.pulumi.proxmoxve.Hardware.Usb;
 * import com.pulumi.proxmoxve.Hardware.UsbArgs;
 * import com.pulumi.proxmoxve.Hardware.inputs.UsbMapArgs;
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
 *         var example = new Usb("example", UsbArgs.builder()
 *             .comment("This is a comment")
 *             .maps(UsbMapArgs.builder()
 *                 .comment("This is a device specific comment")
 *                 .id("8087:0a2b")
 *                 .node("pve")
 *                 .path("1-8.2")
 *                 .build())
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
 * A USB hardware mapping can be imported using their name, e.g.:
 * 
 * ```sh
 * $ pulumi import proxmoxve:Hardware/mapping/usb:Usb example example
 * ```
 * 
 */
@ResourceType(type="proxmoxve:Hardware/mapping/usb:Usb")
public class Usb extends com.pulumi.resources.CustomResource {
    /**
     * The comment of this USB hardware mapping.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return The comment of this USB hardware mapping.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The actual map of devices for the hardware mapping.
     * 
     */
    @Export(name="maps", refs={List.class,UsbMap.class}, tree="[0,1]")
    private Output<List<UsbMap>> maps;

    /**
     * @return The actual map of devices for the hardware mapping.
     * 
     */
    public Output<List<UsbMap>> maps() {
        return this.maps;
    }
    /**
     * The name of this hardware mapping.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of this hardware mapping.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Usb(String name) {
        this(name, UsbArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Usb(String name, UsbArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Usb(String name, UsbArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Hardware/mapping/usb:Usb", name, args == null ? UsbArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Usb(String name, Output<String> id, @Nullable UsbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Hardware/mapping/usb:Usb", name, state, makeResourceOptions(options, id));
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
    public static Usb get(String name, Output<String> id, @Nullable UsbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Usb(name, id, state, options);
    }
}
