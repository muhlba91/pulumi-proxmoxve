// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineInitializationIpConfigIpv6Args extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineInitializationIpConfigIpv6Args Empty = new VirtualMachineInitializationIpConfigIpv6Args();

    /**
     * The IPv6 address in CIDR notation
     * (e.g. fd1c:000:0000::0000:000:7334/64). Alternatively, set this
     * to `dhcp` for autodiscovery.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IPv6 address in CIDR notation
     * (e.g. fd1c:000:0000::0000:000:7334/64). Alternatively, set this
     * to `dhcp` for autodiscovery.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The IPv6 gateway (must be omitted
     * when `dhcp` is used as the address).
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return The IPv6 gateway (must be omitted
     * when `dhcp` is used as the address).
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    private VirtualMachineInitializationIpConfigIpv6Args() {}

    private VirtualMachineInitializationIpConfigIpv6Args(VirtualMachineInitializationIpConfigIpv6Args $) {
        this.address = $.address;
        this.gateway = $.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineInitializationIpConfigIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineInitializationIpConfigIpv6Args $;

        public Builder() {
            $ = new VirtualMachineInitializationIpConfigIpv6Args();
        }

        public Builder(VirtualMachineInitializationIpConfigIpv6Args defaults) {
            $ = new VirtualMachineInitializationIpConfigIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv6 address in CIDR notation
         * (e.g. fd1c:000:0000::0000:000:7334/64). Alternatively, set this
         * to `dhcp` for autodiscovery.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IPv6 address in CIDR notation
         * (e.g. fd1c:000:0000::0000:000:7334/64). Alternatively, set this
         * to `dhcp` for autodiscovery.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param gateway The IPv6 gateway (must be omitted
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
         * @param gateway The IPv6 gateway (must be omitted
         * when `dhcp` is used as the address).
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public VirtualMachineInitializationIpConfigIpv6Args build() {
            return $;
        }
    }

}
