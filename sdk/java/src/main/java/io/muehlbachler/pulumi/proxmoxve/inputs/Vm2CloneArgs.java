// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Vm2CloneArgs extends com.pulumi.resources.ResourceArgs {

    public static final Vm2CloneArgs Empty = new Vm2CloneArgs();

    /**
     * The ID of the VM to clone.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the VM to clone.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * The number of retries to perform when cloning the VM (default: 3).
     * 
     */
    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    /**
     * @return The number of retries to perform when cloning the VM (default: 3).
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    private Vm2CloneArgs() {}

    private Vm2CloneArgs(Vm2CloneArgs $) {
        this.id = $.id;
        this.retries = $.retries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Vm2CloneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Vm2CloneArgs $;

        public Builder() {
            $ = new Vm2CloneArgs();
        }

        public Builder(Vm2CloneArgs defaults) {
            $ = new Vm2CloneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the VM to clone.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the VM to clone.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param retries The number of retries to perform when cloning the VM (default: 3).
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries The number of retries to perform when cloning the VM (default: 3).
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        public Vm2CloneArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("Vm2CloneArgs", "id");
            }
            return $;
        }
    }

}
