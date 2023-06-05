// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineDiskSpeedArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineDiskArgs Empty = new VirtualMachineDiskArgs();

    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    @Import(name="discard")
    private @Nullable Output<String> discard;

    public Optional<Output<String>> discard() {
        return Optional.ofNullable(this.discard);
    }

    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    @Import(name="fileId")
    private @Nullable Output<String> fileId;

    public Optional<Output<String>> fileId() {
        return Optional.ofNullable(this.fileId);
    }

    @Import(name="interface", required=true)
    private Output<String> interface_;

    public Output<String> interface_() {
        return this.interface_;
    }

    @Import(name="iothread")
    private @Nullable Output<Boolean> iothread;

    public Optional<Output<Boolean>> iothread() {
        return Optional.ofNullable(this.iothread);
    }

    @Import(name="size")
    private @Nullable Output<Integer> size;

    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="speed")
    private @Nullable Output<VirtualMachineDiskSpeedArgs> speed;

    public Optional<Output<VirtualMachineDiskSpeedArgs>> speed() {
        return Optional.ofNullable(this.speed);
    }

    @Import(name="ssd")
    private @Nullable Output<Boolean> ssd;

    public Optional<Output<Boolean>> ssd() {
        return Optional.ofNullable(this.ssd);
    }

    private VirtualMachineDiskArgs() {}

    private VirtualMachineDiskArgs(VirtualMachineDiskArgs $) {
        this.datastoreId = $.datastoreId;
        this.discard = $.discard;
        this.fileFormat = $.fileFormat;
        this.fileId = $.fileId;
        this.interface_ = $.interface_;
        this.iothread = $.iothread;
        this.size = $.size;
        this.speed = $.speed;
        this.ssd = $.ssd;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineDiskArgs $;

        public Builder() {
            $ = new VirtualMachineDiskArgs();
        }

        public Builder(VirtualMachineDiskArgs defaults) {
            $ = new VirtualMachineDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        public Builder discard(@Nullable Output<String> discard) {
            $.discard = discard;
            return this;
        }

        public Builder discard(String discard) {
            return discard(Output.of(discard));
        }

        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        public Builder fileId(@Nullable Output<String> fileId) {
            $.fileId = fileId;
            return this;
        }

        public Builder fileId(String fileId) {
            return fileId(Output.of(fileId));
        }

        public Builder interface_(Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public Builder iothread(@Nullable Output<Boolean> iothread) {
            $.iothread = iothread;
            return this;
        }

        public Builder iothread(Boolean iothread) {
            return iothread(Output.of(iothread));
        }

        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public Builder speed(@Nullable Output<VirtualMachineDiskSpeedArgs> speed) {
            $.speed = speed;
            return this;
        }

        public Builder speed(VirtualMachineDiskSpeedArgs speed) {
            return speed(Output.of(speed));
        }

        public Builder ssd(@Nullable Output<Boolean> ssd) {
            $.ssd = ssd;
            return this;
        }

        public Builder ssd(Boolean ssd) {
            return ssd(Output.of(ssd));
        }

        public VirtualMachineDiskArgs build() {
            $.interface_ = Objects.requireNonNull($.interface_, "expected parameter 'interface' to be non-null");
            return $;
        }
    }

}
