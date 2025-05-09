// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Permission.UserArgs;
import io.muehlbachler.pulumi.proxmoxve.Permission.inputs.UserState;
import io.muehlbachler.pulumi.proxmoxve.Permission.outputs.UserAcl;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a user.
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
 * import io.muehlbachler.pulumi.proxmoxve.Permission.Role;
 * import io.muehlbachler.pulumi.proxmoxve.Permission.RoleArgs;
 * import io.muehlbachler.pulumi.proxmoxve.Permission.User;
 * import io.muehlbachler.pulumi.proxmoxve.Permission.UserArgs;
 * import com.pulumi.proxmoxve.Permission.inputs.UserAclArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var operationsMonitoring = new Role("operationsMonitoring", RoleArgs.builder()
 *             .roleId("operations-monitoring")
 *             .privileges("VM.Monitor")
 *             .build());
 * 
 *         var operationsAutomation = new User("operationsAutomation", UserArgs.builder()
 *             .acls(UserAclArgs.builder()
 *                 .path("/vms/1234")
 *                 .propagate(true)
 *                 .roleId(operationsMonitoring.roleId())
 *                 .build())
 *             .comment("Managed by Pulumi")
 *             .password("a-strong-password")
 *             .userId("operations-automation}{@literal @}{@code pve")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Instances can be imported using the `user_id`, e.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import proxmoxve:Permission/user:User operations_automation operations-automation{@literal @}pve
 * ```
 * 
 */
@ResourceType(type="proxmoxve:Permission/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * The access control list (multiple blocks supported).
     * 
     */
    @Export(name="acls", refs={List.class,UserAcl.class}, tree="[0,1]")
    private Output</* @Nullable */ List<UserAcl>> acls;

    /**
     * @return The access control list (multiple blocks supported).
     * 
     */
    public Output<Optional<List<UserAcl>>> acls() {
        return Codegen.optional(this.acls);
    }
    /**
     * The user comment.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return The user comment.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The user&#39;s email address.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return The user&#39;s email address.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * Whether the user account is enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the user account is enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The user account&#39;s expiration date (RFC 3339).
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expirationDate;

    /**
     * @return The user account&#39;s expiration date (RFC 3339).
     * 
     */
    public Output<Optional<String>> expirationDate() {
        return Codegen.optional(this.expirationDate);
    }
    /**
     * The user&#39;s first name.
     * 
     */
    @Export(name="firstName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstName;

    /**
     * @return The user&#39;s first name.
     * 
     */
    public Output<Optional<String>> firstName() {
        return Codegen.optional(this.firstName);
    }
    /**
     * The user&#39;s groups.
     * 
     */
    @Export(name="groups", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groups;

    /**
     * @return The user&#39;s groups.
     * 
     */
    public Output<Optional<List<String>>> groups() {
        return Codegen.optional(this.groups);
    }
    /**
     * The user&#39;s keys.
     * 
     */
    @Export(name="keys", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keys;

    /**
     * @return The user&#39;s keys.
     * 
     */
    public Output<Optional<String>> keys() {
        return Codegen.optional(this.keys);
    }
    /**
     * The user&#39;s last name.
     * 
     */
    @Export(name="lastName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastName;

    /**
     * @return The user&#39;s last name.
     * 
     */
    public Output<Optional<String>> lastName() {
        return Codegen.optional(this.lastName);
    }
    /**
     * The user&#39;s password. Required for PVE or PAM realms.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The user&#39;s password. Required for PVE or PAM realms.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The user identifier.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The user identifier.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(java.lang.String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(java.lang.String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(java.lang.String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Permission/user:User", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private User(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Permission/user:User", name, state, makeResourceOptions(options, id), false);
    }

    private static UserArgs makeArgs(UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/muhlba91/pulumi-proxmoxve")
            .additionalSecretOutputs(List.of(
                "password"
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
    public static User get(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
