// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineCdrom {
    /**
     * @return Whether to enable the CDROM drive (defaults
     * to `false`).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return A file ID for an ISO file (defaults to `cdrom` as
     * in the physical drive). Use `none` to leave the CDROM drive empty.
     * 
     */
    private @Nullable String fileId;
    /**
     * @return A hardware interface to connect CDROM drive to,
     * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
     * supports `ide0` and `ide2`.
     * 
     */
    private @Nullable String interface_;

    private VirtualMachineCdrom() {}
    /**
     * @return Whether to enable the CDROM drive (defaults
     * to `false`).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return A file ID for an ISO file (defaults to `cdrom` as
     * in the physical drive). Use `none` to leave the CDROM drive empty.
     * 
     */
    public Optional<String> fileId() {
        return Optional.ofNullable(this.fileId);
    }
    /**
     * @return A hardware interface to connect CDROM drive to,
     * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
     * supports `ide0` and `ide2`.
     * 
     */
    public Optional<String> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineCdrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String fileId;
        private @Nullable String interface_;
        public Builder() {}
        public Builder(VirtualMachineCdrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.fileId = defaults.fileId;
    	      this.interface_ = defaults.interface_;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder fileId(@Nullable String fileId) {

            this.fileId = fileId;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable String interface_) {

            this.interface_ = interface_;
            return this;
        }
        public VirtualMachineCdrom build() {
            final var _resultValue = new VirtualMachineCdrom();
            _resultValue.enabled = enabled;
            _resultValue.fileId = fileId;
            _resultValue.interface_ = interface_;
            return _resultValue;
        }
    }
}
