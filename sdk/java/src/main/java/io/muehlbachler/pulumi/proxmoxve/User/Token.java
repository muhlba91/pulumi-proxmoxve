// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.User;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.User.TokenArgs;
import io.muehlbachler.pulumi.proxmoxve.User.inputs.TokenState;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * User API tokens.
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
 * import com.pulumi.proxmoxve.Permission.User;
 * import com.pulumi.proxmoxve.Permission.UserArgs;
 * import com.pulumi.proxmoxve.User.Token;
 * import com.pulumi.proxmoxve.User.TokenArgs;
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
 *         // if creating a user token, the user must be created first
 *         var user = new User("user", UserArgs.builder()
 *             .comment("Managed by Terraform")
 *             .email("user{@literal @}pve")
 *             .enabled(true)
 *             .expirationDate("2034-01-01T22:00:00Z")
 *             .userId("user{@literal @}pve")
 *             .build());
 * 
 *         var userToken = new Token("userToken", TokenArgs.builder()
 *             .comment("Managed by Terraform")
 *             .expirationDate("2033-01-01T22:00:00Z")
 *             .tokenName("tk1")
 *             .userId(user.userId())
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
 * #Tokens can be imported using they identifiers in format `user_id!token_name` format, e.g.:
 * 
 * ```sh
 * $ pulumi import proxmoxve:User/token:Token token1 user{@literal @}pve!token1
 * ```
 * 
 */
@ResourceType(type="proxmoxve:User/token:Token")
public class Token extends com.pulumi.resources.CustomResource {
    /**
     * Comment for the token.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment for the token.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Expiration date for the token.
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return Expiration date for the token.
     * 
     */
    public Output<Optional<String>> expirationDate() {
        return Codegen.optional(this.expirationDate);
    }
    /**
     * Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
     * 
     */
    @Export(name="privilegesSeparation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> privilegesSeparation;

    /**
     * @return Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
     * 
     */
    public Output<Boolean> privilegesSeparation() {
        return this.privilegesSeparation;
    }
    /**
     * User-specific token identifier.
     * 
     */
    @Export(name="tokenName", refs={String.class}, tree="[0]")
    private Output<String> tokenName;

    /**
     * @return User-specific token identifier.
     * 
     */
    public Output<String> tokenName() {
        return this.tokenName;
    }
    /**
     * User identifier.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return User identifier.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * API token value used for authentication. It is populated only when creating a new token, and can&#39;t be retrieved at import.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return API token value used for authentication. It is populated only when creating a new token, and can&#39;t be retrieved at import.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Token(String name) {
        this(name, TokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Token(String name, TokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Token(String name, TokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:User/token:Token", name, args == null ? TokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Token(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:User/token:Token", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
            ))
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
    public static Token get(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, state, options);
    }
}
