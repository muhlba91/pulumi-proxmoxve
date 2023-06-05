// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineHostpciArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineHostpciArgs Empty = new VirtualMachineHostpciArgs();

    @Import(name="device", required=true)
    private Output<String> device;

    public Output<String> device() {
        return this.device;
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="mdev")
    private @Nullable Output<String> mdev;

    public Optional<Output<String>> mdev() {
        return Optional.ofNullable(this.mdev);
    }

    @Import(name="pcie")
    private @Nullable Output<Boolean> pcie;

    public Optional<Output<Boolean>> pcie() {
        return Optional.ofNullable(this.pcie);
    }

    @Import(name="romFile")
    private @Nullable Output<String> romFile;

    public Optional<Output<String>> romFile() {
        return Optional.ofNullable(this.romFile);
    }

    @Import(name="rombar")
    private @Nullable Output<Boolean> rombar;

    public Optional<Output<Boolean>> rombar() {
        return Optional.ofNullable(this.rombar);
    }

    @Import(name="xvga")
    private @Nullable Output<Boolean> xvga;

    public Optional<Output<Boolean>> xvga() {
        return Optional.ofNullable(this.xvga);
    }

    private VirtualMachineHostpciArgs() {}

    private VirtualMachineHostpciArgs(VirtualMachineHostpciArgs $) {
        this.device = $.device;
        this.id = $.id;
        this.mdev = $.mdev;
        this.pcie = $.pcie;
        this.romFile = $.romFile;
        this.rombar = $.rombar;
        this.xvga = $.xvga;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineHostpciArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineHostpciArgs $;

        public Builder() {
            $ = new VirtualMachineHostpciArgs();
        }

        public Builder(VirtualMachineHostpciArgs defaults) {
            $ = new VirtualMachineHostpciArgs(Objects.requireNonNull(defaults));
        }

        public Builder device(Output<String> device) {
            $.device = device;
            return this;
        }

        public Builder device(String device) {
            return device(Output.of(device));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder mdev(@Nullable Output<String> mdev) {
            $.mdev = mdev;
            return this;
        }

        public Builder mdev(String mdev) {
            return mdev(Output.of(mdev));
        }

        public Builder pcie(@Nullable Output<Boolean> pcie) {
            $.pcie = pcie;
            return this;
        }

        public Builder pcie(Boolean pcie) {
            return pcie(Output.of(pcie));
        }

        public Builder romFile(@Nullable Output<String> romFile) {
            $.romFile = romFile;
            return this;
        }

        public Builder romFile(String romFile) {
            return romFile(Output.of(romFile));
        }

        public Builder rombar(@Nullable Output<Boolean> rombar) {
            $.rombar = rombar;
            return this;
        }

        public Builder rombar(Boolean rombar) {
            return rombar(Output.of(rombar));
        }

        public Builder xvga(@Nullable Output<Boolean> xvga) {
            $.xvga = xvga;
            return this;
        }

        public Builder xvga(Boolean xvga) {
            return xvga(Output.of(xvga));
        }

        public VirtualMachineHostpciArgs build() {
            $.device = Objects.requireNonNull($.device, "expected parameter 'device' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
