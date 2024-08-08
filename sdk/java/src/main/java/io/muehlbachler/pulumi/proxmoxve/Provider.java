// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.ProviderArgs;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the proxmox package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:proxmoxve")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The API token for the Proxmox VE API.
     * 
     */
    @Export(name="apiToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiToken;

    /**
     * @return The API token for the Proxmox VE API.
     * 
     */
    public Output<Optional<String>> apiToken() {
        return Codegen.optional(this.apiToken);
    }
    /**
     * The endpoint for the Proxmox VE API.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return The endpoint for the Proxmox VE API.
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
     * 
     */
    @Export(name="minTls", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minTls;

    /**
     * @return The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
     * 
     */
    public Output<Optional<String>> minTls() {
        return Codegen.optional(this.minTls);
    }
    /**
     * The one-time password for the Proxmox VE API.
     * 
     * @deprecated
     * The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.
     * 
     */
    @Deprecated /* The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead. */
    @Export(name="otp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> otp;

    /**
     * @return The one-time password for the Proxmox VE API.
     * 
     */
    public Output<Optional<String>> otp() {
        return Codegen.optional(this.otp);
    }
    /**
     * The password for the Proxmox VE API.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password for the Proxmox VE API.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The alternative temporary directory.
     * 
     */
    @Export(name="tmpDir", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tmpDir;

    /**
     * @return The alternative temporary directory.
     * 
     */
    public Output<Optional<String>> tmpDir() {
        return Codegen.optional(this.tmpDir);
    }
    /**
     * The username for the Proxmox VE API.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return The username for the Proxmox VE API.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiToken",
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
