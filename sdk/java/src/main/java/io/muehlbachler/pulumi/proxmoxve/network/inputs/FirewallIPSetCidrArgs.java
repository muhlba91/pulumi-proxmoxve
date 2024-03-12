// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallIPSetCidrArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallIPSetCidrArgs Empty = new FirewallIPSetCidrArgs();

    /**
     * Arbitrary string annotation.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Arbitrary string annotation.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Network/IP specification in CIDR format.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Network/IP specification in CIDR format.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Entries marked as `nomatch` are skipped as if those
     * were not added to the set.
     * 
     */
    @Import(name="nomatch")
    private @Nullable Output<Boolean> nomatch;

    /**
     * @return Entries marked as `nomatch` are skipped as if those
     * were not added to the set.
     * 
     */
    public Optional<Output<Boolean>> nomatch() {
        return Optional.ofNullable(this.nomatch);
    }

    private FirewallIPSetCidrArgs() {}

    private FirewallIPSetCidrArgs(FirewallIPSetCidrArgs $) {
        this.comment = $.comment;
        this.name = $.name;
        this.nomatch = $.nomatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallIPSetCidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallIPSetCidrArgs $;

        public Builder() {
            $ = new FirewallIPSetCidrArgs();
        }

        public Builder(FirewallIPSetCidrArgs defaults) {
            $ = new FirewallIPSetCidrArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Arbitrary string annotation.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Arbitrary string annotation.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name Network/IP specification in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Network/IP specification in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nomatch Entries marked as `nomatch` are skipped as if those
         * were not added to the set.
         * 
         * @return builder
         * 
         */
        public Builder nomatch(@Nullable Output<Boolean> nomatch) {
            $.nomatch = nomatch;
            return this;
        }

        /**
         * @param nomatch Entries marked as `nomatch` are skipped as if those
         * were not added to the set.
         * 
         * @return builder
         * 
         */
        public Builder nomatch(Boolean nomatch) {
            return nomatch(Output.of(nomatch));
        }

        public FirewallIPSetCidrArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("FirewallIPSetCidrArgs", "name");
            }
            return $;
        }
    }

}