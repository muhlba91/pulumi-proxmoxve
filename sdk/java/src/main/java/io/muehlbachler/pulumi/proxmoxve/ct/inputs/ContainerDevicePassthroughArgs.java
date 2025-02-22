// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerDevicePassthroughArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerDevicePassthroughArgs Empty = new ContainerDevicePassthroughArgs();

    /**
     * Deny the container to write to the device (defaults to `false`).
     * 
     */
    @Import(name="denyWrite")
    private @Nullable Output<Boolean> denyWrite;

    /**
     * @return Deny the container to write to the device (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> denyWrite() {
        return Optional.ofNullable(this.denyWrite);
    }

    /**
     * Group ID to be assigned to the device node.
     * 
     */
    @Import(name="gid")
    private @Nullable Output<Integer> gid;

    /**
     * @return Group ID to be assigned to the device node.
     * 
     */
    public Optional<Output<Integer>> gid() {
        return Optional.ofNullable(this.gid);
    }

    /**
     * Access mode to be set on the device node. Must be a
     * 4-digit octal number.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Access mode to be set on the device node. Must be a
     * 4-digit octal number.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Device to pass through to the container (e.g. `/dev/sda`).
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Device to pass through to the container (e.g. `/dev/sda`).
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * User ID to be assigned to the device node.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<Integer> uid;

    /**
     * @return User ID to be assigned to the device node.
     * 
     */
    public Optional<Output<Integer>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private ContainerDevicePassthroughArgs() {}

    private ContainerDevicePassthroughArgs(ContainerDevicePassthroughArgs $) {
        this.denyWrite = $.denyWrite;
        this.gid = $.gid;
        this.mode = $.mode;
        this.path = $.path;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerDevicePassthroughArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerDevicePassthroughArgs $;

        public Builder() {
            $ = new ContainerDevicePassthroughArgs();
        }

        public Builder(ContainerDevicePassthroughArgs defaults) {
            $ = new ContainerDevicePassthroughArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param denyWrite Deny the container to write to the device (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder denyWrite(@Nullable Output<Boolean> denyWrite) {
            $.denyWrite = denyWrite;
            return this;
        }

        /**
         * @param denyWrite Deny the container to write to the device (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder denyWrite(Boolean denyWrite) {
            return denyWrite(Output.of(denyWrite));
        }

        /**
         * @param gid Group ID to be assigned to the device node.
         * 
         * @return builder
         * 
         */
        public Builder gid(@Nullable Output<Integer> gid) {
            $.gid = gid;
            return this;
        }

        /**
         * @param gid Group ID to be assigned to the device node.
         * 
         * @return builder
         * 
         */
        public Builder gid(Integer gid) {
            return gid(Output.of(gid));
        }

        /**
         * @param mode Access mode to be set on the device node. Must be a
         * 4-digit octal number.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Access mode to be set on the device node. Must be a
         * 4-digit octal number.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param path Device to pass through to the container (e.g. `/dev/sda`).
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Device to pass through to the container (e.g. `/dev/sda`).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param uid User ID to be assigned to the device node.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<Integer> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid User ID to be assigned to the device node.
         * 
         * @return builder
         * 
         */
        public Builder uid(Integer uid) {
            return uid(Output.of(uid));
        }

        public ContainerDevicePassthroughArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("ContainerDevicePassthroughArgs", "path");
            }
            return $;
        }
    }

}
