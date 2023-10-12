// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallRulesRuleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRulesArgs Empty = new FirewallRulesArgs();

    /**
     * Container ID. Leave empty for cluster level
     * rules.
     * 
     */
    @Import(name="containerId")
    private @Nullable Output<Integer> containerId;

    /**
     * @return Container ID. Leave empty for cluster level
     * rules.
     * 
     */
    public Optional<Output<Integer>> containerId() {
        return Optional.ofNullable(this.containerId);
    }

    /**
     * Node name. Leave empty for cluster level rules.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return Node name. Leave empty for cluster level rules.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * Firewall rule block (multiple blocks supported).
     * The provider supports two types of the `rule` blocks:
     * - a rule definition block, which includes the following arguments:
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<FirewallRulesRuleArgs>> rules;

    /**
     * @return Firewall rule block (multiple blocks supported).
     * The provider supports two types of the `rule` blocks:
     * - a rule definition block, which includes the following arguments:
     * 
     */
    public Output<List<FirewallRulesRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * VM ID. Leave empty for cluster level rules.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<Integer> vmId;

    /**
     * @return VM ID. Leave empty for cluster level rules.
     * 
     */
    public Optional<Output<Integer>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private FirewallRulesArgs() {}

    private FirewallRulesArgs(FirewallRulesArgs $) {
        this.containerId = $.containerId;
        this.nodeName = $.nodeName;
        this.rules = $.rules;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRulesArgs $;

        public Builder() {
            $ = new FirewallRulesArgs();
        }

        public Builder(FirewallRulesArgs defaults) {
            $ = new FirewallRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerId Container ID. Leave empty for cluster level
         * rules.
         * 
         * @return builder
         * 
         */
        public Builder containerId(@Nullable Output<Integer> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId Container ID. Leave empty for cluster level
         * rules.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Integer containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param nodeName Node name. Leave empty for cluster level rules.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName Node name. Leave empty for cluster level rules.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * The provider supports two types of the `rule` blocks:
         * - a rule definition block, which includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<FirewallRulesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * The provider supports two types of the `rule` blocks:
         * - a rule definition block, which includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FirewallRulesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * The provider supports two types of the `rule` blocks:
         * - a rule definition block, which includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder rules(FirewallRulesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param vmId VM ID. Leave empty for cluster level rules.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId VM ID. Leave empty for cluster level rules.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public FirewallRulesArgs build() {
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
