// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerInitializationIpConfigIpv4Args extends com.pulumi.resources.ResourceArgs {

    public static final ContainerInitializationIpConfigIpv4Args Empty = new ContainerInitializationIpConfigIpv4Args();

    /**
     * The IPv4 address (use `dhcp` for
     * autodiscovery).
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IPv4 address (use `dhcp` for
     * autodiscovery).
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The IPv4 gateway (must be omitted
     * when `dhcp` is used as the address).
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return The IPv4 gateway (must be omitted
     * when `dhcp` is used as the address).
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    private ContainerInitializationIpConfigIpv4Args() {}

    private ContainerInitializationIpConfigIpv4Args(ContainerInitializationIpConfigIpv4Args $) {
        this.address = $.address;
        this.gateway = $.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerInitializationIpConfigIpv4Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerInitializationIpConfigIpv4Args $;

        public Builder() {
            $ = new ContainerInitializationIpConfigIpv4Args();
        }

        public Builder(ContainerInitializationIpConfigIpv4Args defaults) {
            $ = new ContainerInitializationIpConfigIpv4Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv4 address (use `dhcp` for
         * autodiscovery).
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IPv4 address (use `dhcp` for
         * autodiscovery).
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param gateway The IPv4 gateway (must be omitted
         * when `dhcp` is used as the address).
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway The IPv4 gateway (must be omitted
         * when `dhcp` is used as the address).
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public ContainerInitializationIpConfigIpv4Args build() {
            return $;
        }
    }

}
