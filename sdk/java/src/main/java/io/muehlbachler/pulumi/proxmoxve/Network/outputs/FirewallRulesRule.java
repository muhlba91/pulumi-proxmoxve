// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallRulesRule {
    private @Nullable String action;
    private @Nullable String comment;
    private @Nullable String dest;
    private @Nullable String dport;
    private @Nullable Boolean enabled;
    private @Nullable String iface;
    private @Nullable String log;
    private @Nullable String macro;
    private @Nullable Integer pos;
    private @Nullable String proto;
    private @Nullable String securityGroup;
    private @Nullable String source;
    private @Nullable String sport;
    private @Nullable String type;

    private FirewallRulesRule() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> dest() {
        return Optional.ofNullable(this.dest);
    }
    public Optional<String> dport() {
        return Optional.ofNullable(this.dport);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> iface() {
        return Optional.ofNullable(this.iface);
    }
    public Optional<String> log() {
        return Optional.ofNullable(this.log);
    }
    public Optional<String> macro() {
        return Optional.ofNullable(this.macro);
    }
    public Optional<Integer> pos() {
        return Optional.ofNullable(this.pos);
    }
    public Optional<String> proto() {
        return Optional.ofNullable(this.proto);
    }
    public Optional<String> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> sport() {
        return Optional.ofNullable(this.sport);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable String comment;
        private @Nullable String dest;
        private @Nullable String dport;
        private @Nullable Boolean enabled;
        private @Nullable String iface;
        private @Nullable String log;
        private @Nullable String macro;
        private @Nullable Integer pos;
        private @Nullable String proto;
        private @Nullable String securityGroup;
        private @Nullable String source;
        private @Nullable String sport;
        private @Nullable String type;
        public Builder() {}
        public Builder(FirewallRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.comment = defaults.comment;
    	      this.dest = defaults.dest;
    	      this.dport = defaults.dport;
    	      this.enabled = defaults.enabled;
    	      this.iface = defaults.iface;
    	      this.log = defaults.log;
    	      this.macro = defaults.macro;
    	      this.pos = defaults.pos;
    	      this.proto = defaults.proto;
    	      this.securityGroup = defaults.securityGroup;
    	      this.source = defaults.source;
    	      this.sport = defaults.sport;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder dest(@Nullable String dest) {
            this.dest = dest;
            return this;
        }
        @CustomType.Setter
        public Builder dport(@Nullable String dport) {
            this.dport = dport;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder iface(@Nullable String iface) {
            this.iface = iface;
            return this;
        }
        @CustomType.Setter
        public Builder log(@Nullable String log) {
            this.log = log;
            return this;
        }
        @CustomType.Setter
        public Builder macro(@Nullable String macro) {
            this.macro = macro;
            return this;
        }
        @CustomType.Setter
        public Builder pos(@Nullable Integer pos) {
            this.pos = pos;
            return this;
        }
        @CustomType.Setter
        public Builder proto(@Nullable String proto) {
            this.proto = proto;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroup(@Nullable String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder sport(@Nullable String sport) {
            this.sport = sport;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public FirewallRulesRule build() {
            final var o = new FirewallRulesRule();
            o.action = action;
            o.comment = comment;
            o.dest = dest;
            o.dport = dport;
            o.enabled = enabled;
            o.iface = iface;
            o.log = log;
            o.macro = macro;
            o.pos = pos;
            o.proto = proto;
            o.securityGroup = securityGroup;
            o.source = source;
            o.sport = sport;
            o.type = type;
            return o;
        }
    }
}
