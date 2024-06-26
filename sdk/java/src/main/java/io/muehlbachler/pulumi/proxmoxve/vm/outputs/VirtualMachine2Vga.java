// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachine2Vga {
    /**
     * @return Enable a specific clipboard. If not set, depending on the display type the SPICE one will be added. Currently only `vnc` is available. Migration with VNC clipboard is not supported by Proxmox.
     * 
     */
    private @Nullable String clipboard;
    /**
     * @return The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
     * 
     */
    private @Nullable Integer memory;
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    private @Nullable String type;

    private VirtualMachine2Vga() {}
    /**
     * @return Enable a specific clipboard. If not set, depending on the display type the SPICE one will be added. Currently only `vnc` is available. Migration with VNC clipboard is not supported by Proxmox.
     * 
     */
    public Optional<String> clipboard() {
        return Optional.ofNullable(this.clipboard);
    }
    /**
     * @return The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
     * 
     */
    public Optional<Integer> memory() {
        return Optional.ofNullable(this.memory);
    }
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachine2Vga defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clipboard;
        private @Nullable Integer memory;
        private @Nullable String type;
        public Builder() {}
        public Builder(VirtualMachine2Vga defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clipboard = defaults.clipboard;
    	      this.memory = defaults.memory;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder clipboard(@Nullable String clipboard) {

            this.clipboard = clipboard;
            return this;
        }
        @CustomType.Setter
        public Builder memory(@Nullable Integer memory) {

            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public VirtualMachine2Vga build() {
            final var _resultValue = new VirtualMachine2Vga();
            _resultValue.clipboard = clipboard;
            _resultValue.memory = memory;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
