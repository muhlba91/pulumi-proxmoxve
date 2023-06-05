// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerConsoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerConsoleArgs Empty = new ContainerConsoleArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="ttyCount")
    private @Nullable Output<Integer> ttyCount;

    public Optional<Output<Integer>> ttyCount() {
        return Optional.ofNullable(this.ttyCount);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ContainerConsoleArgs() {}

    private ContainerConsoleArgs(ContainerConsoleArgs $) {
        this.enabled = $.enabled;
        this.ttyCount = $.ttyCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerConsoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerConsoleArgs $;

        public Builder() {
            $ = new ContainerConsoleArgs();
        }

        public Builder(ContainerConsoleArgs defaults) {
            $ = new ContainerConsoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder ttyCount(@Nullable Output<Integer> ttyCount) {
            $.ttyCount = ttyCount;
            return this;
        }

        public Builder ttyCount(Integer ttyCount) {
            return ttyCount(Output.of(ttyCount));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ContainerConsoleArgs build() {
            return $;
        }
    }

}
