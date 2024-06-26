// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Cluster.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OptionsNotifyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OptionsNotifyArgs Empty = new OptionsNotifyArgs();

    /**
     * Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
     * 
     */
    @Import(name="haFencingMode")
    private @Nullable Output<String> haFencingMode;

    /**
     * @return Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
     * 
     */
    public Optional<Output<String>> haFencingMode() {
        return Optional.ofNullable(this.haFencingMode);
    }

    /**
     * Cluster-wide notification settings for the HA fencing target.
     * 
     */
    @Import(name="haFencingTarget")
    private @Nullable Output<String> haFencingTarget;

    /**
     * @return Cluster-wide notification settings for the HA fencing target.
     * 
     */
    public Optional<Output<String>> haFencingTarget() {
        return Optional.ofNullable(this.haFencingTarget);
    }

    /**
     * Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
     * 
     */
    @Import(name="packageUpdates")
    private @Nullable Output<String> packageUpdates;

    /**
     * @return Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
     * 
     */
    public Optional<Output<String>> packageUpdates() {
        return Optional.ofNullable(this.packageUpdates);
    }

    /**
     * Cluster-wide notification settings for the package updates target.
     * 
     */
    @Import(name="packageUpdatesTarget")
    private @Nullable Output<String> packageUpdatesTarget;

    /**
     * @return Cluster-wide notification settings for the package updates target.
     * 
     */
    public Optional<Output<String>> packageUpdatesTarget() {
        return Optional.ofNullable(this.packageUpdatesTarget);
    }

    /**
     * Cluster-wide notification settings for replication. Must be `always` | `never`.
     * 
     */
    @Import(name="replication")
    private @Nullable Output<String> replication;

    /**
     * @return Cluster-wide notification settings for replication. Must be `always` | `never`.
     * 
     */
    public Optional<Output<String>> replication() {
        return Optional.ofNullable(this.replication);
    }

    /**
     * Cluster-wide notification settings for the replication target.
     * 
     */
    @Import(name="replicationTarget")
    private @Nullable Output<String> replicationTarget;

    /**
     * @return Cluster-wide notification settings for the replication target.
     * 
     */
    public Optional<Output<String>> replicationTarget() {
        return Optional.ofNullable(this.replicationTarget);
    }

    private OptionsNotifyArgs() {}

    private OptionsNotifyArgs(OptionsNotifyArgs $) {
        this.haFencingMode = $.haFencingMode;
        this.haFencingTarget = $.haFencingTarget;
        this.packageUpdates = $.packageUpdates;
        this.packageUpdatesTarget = $.packageUpdatesTarget;
        this.replication = $.replication;
        this.replicationTarget = $.replicationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OptionsNotifyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OptionsNotifyArgs $;

        public Builder() {
            $ = new OptionsNotifyArgs();
        }

        public Builder(OptionsNotifyArgs defaults) {
            $ = new OptionsNotifyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param haFencingMode Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder haFencingMode(@Nullable Output<String> haFencingMode) {
            $.haFencingMode = haFencingMode;
            return this;
        }

        /**
         * @param haFencingMode Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder haFencingMode(String haFencingMode) {
            return haFencingMode(Output.of(haFencingMode));
        }

        /**
         * @param haFencingTarget Cluster-wide notification settings for the HA fencing target.
         * 
         * @return builder
         * 
         */
        public Builder haFencingTarget(@Nullable Output<String> haFencingTarget) {
            $.haFencingTarget = haFencingTarget;
            return this;
        }

        /**
         * @param haFencingTarget Cluster-wide notification settings for the HA fencing target.
         * 
         * @return builder
         * 
         */
        public Builder haFencingTarget(String haFencingTarget) {
            return haFencingTarget(Output.of(haFencingTarget));
        }

        /**
         * @param packageUpdates Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder packageUpdates(@Nullable Output<String> packageUpdates) {
            $.packageUpdates = packageUpdates;
            return this;
        }

        /**
         * @param packageUpdates Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder packageUpdates(String packageUpdates) {
            return packageUpdates(Output.of(packageUpdates));
        }

        /**
         * @param packageUpdatesTarget Cluster-wide notification settings for the package updates target.
         * 
         * @return builder
         * 
         */
        public Builder packageUpdatesTarget(@Nullable Output<String> packageUpdatesTarget) {
            $.packageUpdatesTarget = packageUpdatesTarget;
            return this;
        }

        /**
         * @param packageUpdatesTarget Cluster-wide notification settings for the package updates target.
         * 
         * @return builder
         * 
         */
        public Builder packageUpdatesTarget(String packageUpdatesTarget) {
            return packageUpdatesTarget(Output.of(packageUpdatesTarget));
        }

        /**
         * @param replication Cluster-wide notification settings for replication. Must be `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder replication(@Nullable Output<String> replication) {
            $.replication = replication;
            return this;
        }

        /**
         * @param replication Cluster-wide notification settings for replication. Must be `always` | `never`.
         * 
         * @return builder
         * 
         */
        public Builder replication(String replication) {
            return replication(Output.of(replication));
        }

        /**
         * @param replicationTarget Cluster-wide notification settings for the replication target.
         * 
         * @return builder
         * 
         */
        public Builder replicationTarget(@Nullable Output<String> replicationTarget) {
            $.replicationTarget = replicationTarget;
            return this;
        }

        /**
         * @param replicationTarget Cluster-wide notification settings for the replication target.
         * 
         * @return builder
         * 
         */
        public Builder replicationTarget(String replicationTarget) {
            return replicationTarget(Output.of(replicationTarget));
        }

        public OptionsNotifyArgs build() {
            return $;
        }
    }

}
