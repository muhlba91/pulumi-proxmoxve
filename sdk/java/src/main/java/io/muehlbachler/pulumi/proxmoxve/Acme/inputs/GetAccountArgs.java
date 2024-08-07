// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Acme.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    /**
     * The identifier of the ACME account to read.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The identifier of the ACME account to read.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAccountArgs() {}

    private GetAccountArgs(GetAccountArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountArgs $;

        public Builder() {
            $ = new GetAccountArgs();
        }

        public Builder(GetAccountArgs defaults) {
            $ = new GetAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The identifier of the ACME account to read.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier of the ACME account to read.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetAccountArgs build() {
            return $;
        }
    }

}
