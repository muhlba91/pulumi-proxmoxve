// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineTpmStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineTpmStateArgs Empty = new VirtualMachineTpmStateArgs();

    /**
     * The identifier for the datastore to create
     * the disk in (defaults to `local-lvm`).
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The identifier for the datastore to create
     * the disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * TPM state device version. Can be `v1.2` or `v2.0`.
     * (defaults to `v2.0`).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return TPM state device version. Can be `v1.2` or `v2.0`.
     * (defaults to `v2.0`).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private VirtualMachineTpmStateArgs() {}

    private VirtualMachineTpmStateArgs(VirtualMachineTpmStateArgs $) {
        this.datastoreId = $.datastoreId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineTpmStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineTpmStateArgs $;

        public Builder() {
            $ = new VirtualMachineTpmStateArgs();
        }

        public Builder(VirtualMachineTpmStateArgs defaults) {
            $ = new VirtualMachineTpmStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId The identifier for the datastore to create
         * the disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The identifier for the datastore to create
         * the disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param version TPM state device version. Can be `v1.2` or `v2.0`.
         * (defaults to `v2.0`).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version TPM state device version. Can be `v1.2` or `v2.0`.
         * (defaults to `v2.0`).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public VirtualMachineTpmStateArgs build() {
            return $;
        }
    }

}
