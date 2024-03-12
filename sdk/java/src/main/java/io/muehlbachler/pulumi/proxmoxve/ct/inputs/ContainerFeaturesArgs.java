// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerFeaturesArgs Empty = new ContainerFeaturesArgs();

    /**
     * Whether the container supports FUSE mounts (defaults
     * to `false`)
     * 
     */
    @Import(name="fuse")
    private @Nullable Output<Boolean> fuse;

    /**
     * @return Whether the container supports FUSE mounts (defaults
     * to `false`)
     * 
     */
    public Optional<Output<Boolean>> fuse() {
        return Optional.ofNullable(this.fuse);
    }

    /**
     * Whether the container supports `keyctl()` system
     * call (defaults to `false`)
     * 
     */
    @Import(name="keyctl")
    private @Nullable Output<Boolean> keyctl;

    /**
     * @return Whether the container supports `keyctl()` system
     * call (defaults to `false`)
     * 
     */
    public Optional<Output<Boolean>> keyctl() {
        return Optional.ofNullable(this.keyctl);
    }

    /**
     * List of allowed mount types (`cifs` or `nfs`)
     * 
     */
    @Import(name="mounts")
    private @Nullable Output<List<String>> mounts;

    /**
     * @return List of allowed mount types (`cifs` or `nfs`)
     * 
     */
    public Optional<Output<List<String>>> mounts() {
        return Optional.ofNullable(this.mounts);
    }

    /**
     * Whether the container is nested (defaults
     * to `false`)
     * 
     */
    @Import(name="nesting")
    private @Nullable Output<Boolean> nesting;

    /**
     * @return Whether the container is nested (defaults
     * to `false`)
     * 
     */
    public Optional<Output<Boolean>> nesting() {
        return Optional.ofNullable(this.nesting);
    }

    private ContainerFeaturesArgs() {}

    private ContainerFeaturesArgs(ContainerFeaturesArgs $) {
        this.fuse = $.fuse;
        this.keyctl = $.keyctl;
        this.mounts = $.mounts;
        this.nesting = $.nesting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerFeaturesArgs $;

        public Builder() {
            $ = new ContainerFeaturesArgs();
        }

        public Builder(ContainerFeaturesArgs defaults) {
            $ = new ContainerFeaturesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fuse Whether the container supports FUSE mounts (defaults
         * to `false`)
         * 
         * @return builder
         * 
         */
        public Builder fuse(@Nullable Output<Boolean> fuse) {
            $.fuse = fuse;
            return this;
        }

        /**
         * @param fuse Whether the container supports FUSE mounts (defaults
         * to `false`)
         * 
         * @return builder
         * 
         */
        public Builder fuse(Boolean fuse) {
            return fuse(Output.of(fuse));
        }

        /**
         * @param keyctl Whether the container supports `keyctl()` system
         * call (defaults to `false`)
         * 
         * @return builder
         * 
         */
        public Builder keyctl(@Nullable Output<Boolean> keyctl) {
            $.keyctl = keyctl;
            return this;
        }

        /**
         * @param keyctl Whether the container supports `keyctl()` system
         * call (defaults to `false`)
         * 
         * @return builder
         * 
         */
        public Builder keyctl(Boolean keyctl) {
            return keyctl(Output.of(keyctl));
        }

        /**
         * @param mounts List of allowed mount types (`cifs` or `nfs`)
         * 
         * @return builder
         * 
         */
        public Builder mounts(@Nullable Output<List<String>> mounts) {
            $.mounts = mounts;
            return this;
        }

        /**
         * @param mounts List of allowed mount types (`cifs` or `nfs`)
         * 
         * @return builder
         * 
         */
        public Builder mounts(List<String> mounts) {
            return mounts(Output.of(mounts));
        }

        /**
         * @param mounts List of allowed mount types (`cifs` or `nfs`)
         * 
         * @return builder
         * 
         */
        public Builder mounts(String... mounts) {
            return mounts(List.of(mounts));
        }

        /**
         * @param nesting Whether the container is nested (defaults
         * to `false`)
         * 
         * @return builder
         * 
         */
        public Builder nesting(@Nullable Output<Boolean> nesting) {
            $.nesting = nesting;
            return this;
        }

        /**
         * @param nesting Whether the container is nested (defaults
         * to `false`)
         * 
         * @return builder
         * 
         */
        public Builder nesting(Boolean nesting) {
            return nesting(Output.of(nesting));
        }

        public ContainerFeaturesArgs build() {
            return $;
        }
    }

}