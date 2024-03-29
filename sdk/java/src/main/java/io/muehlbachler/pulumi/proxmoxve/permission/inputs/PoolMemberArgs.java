// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolMemberArgs Empty = new PoolMemberArgs();

    /**
     * The datastore identifier.
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The datastore identifier.
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * The member identifier.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The member identifier.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The node name.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return The node name.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * The member type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The member type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The virtual machine identifier.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<Integer> vmId;

    /**
     * @return The virtual machine identifier.
     * 
     */
    public Optional<Output<Integer>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private PoolMemberArgs() {}

    private PoolMemberArgs(PoolMemberArgs $) {
        this.datastoreId = $.datastoreId;
        this.id = $.id;
        this.nodeName = $.nodeName;
        this.type = $.type;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolMemberArgs $;

        public Builder() {
            $ = new PoolMemberArgs();
        }

        public Builder(PoolMemberArgs defaults) {
            $ = new PoolMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId The datastore identifier.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The datastore identifier.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param id The member identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The member identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param nodeName The node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param type The member type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The member type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vmId The virtual machine identifier.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The virtual machine identifier.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public PoolMemberArgs build() {
            return $;
        }
    }

}
