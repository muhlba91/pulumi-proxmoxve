// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineSmbiosArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineSmbiosArgs Empty = new VirtualMachineSmbiosArgs();

    /**
     * The family string.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The family string.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The manufacturer.
     * 
     */
    @Import(name="manufacturer")
    private @Nullable Output<String> manufacturer;

    /**
     * @return The manufacturer.
     * 
     */
    public Optional<Output<String>> manufacturer() {
        return Optional.ofNullable(this.manufacturer);
    }

    /**
     * The product ID.
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return The product ID.
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * The serial number.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return The serial number.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * The SKU number.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return The SKU number.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The UUID (defaults to randomly generated UUID).
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return The UUID (defaults to randomly generated UUID).
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * The version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private VirtualMachineSmbiosArgs() {}

    private VirtualMachineSmbiosArgs(VirtualMachineSmbiosArgs $) {
        this.family = $.family;
        this.manufacturer = $.manufacturer;
        this.product = $.product;
        this.serial = $.serial;
        this.sku = $.sku;
        this.uuid = $.uuid;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineSmbiosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineSmbiosArgs $;

        public Builder() {
            $ = new VirtualMachineSmbiosArgs();
        }

        public Builder(VirtualMachineSmbiosArgs defaults) {
            $ = new VirtualMachineSmbiosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param family The family string.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The family string.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param manufacturer The manufacturer.
         * 
         * @return builder
         * 
         */
        public Builder manufacturer(@Nullable Output<String> manufacturer) {
            $.manufacturer = manufacturer;
            return this;
        }

        /**
         * @param manufacturer The manufacturer.
         * 
         * @return builder
         * 
         */
        public Builder manufacturer(String manufacturer) {
            return manufacturer(Output.of(manufacturer));
        }

        /**
         * @param product The product ID.
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product The product ID.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param serial The serial number.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial The serial number.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param sku The SKU number.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU number.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param uuid The UUID (defaults to randomly generated UUID).
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid The UUID (defaults to randomly generated UUID).
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param version The version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public VirtualMachineSmbiosArgs build() {
            return $;
        }
    }

}
