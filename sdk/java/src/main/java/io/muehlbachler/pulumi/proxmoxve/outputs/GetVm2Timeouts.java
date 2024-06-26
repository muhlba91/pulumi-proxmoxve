// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVm2Timeouts {
    /**
     * @return A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours). Read operations occur during any refresh or planning operation when refresh is enabled.
     * 
     */
    private @Nullable String read;

    private GetVm2Timeouts() {}
    /**
     * @return A string that can be [parsed as a duration](https://pkg.go.dev/time#ParseDuration) consisting of numbers and unit suffixes, such as &#34;30s&#34; or &#34;2h45m&#34;. Valid time units are &#34;s&#34; (seconds), &#34;m&#34; (minutes), &#34;h&#34; (hours). Read operations occur during any refresh or planning operation when refresh is enabled.
     * 
     */
    public Optional<String> read() {
        return Optional.ofNullable(this.read);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVm2Timeouts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String read;
        public Builder() {}
        public Builder(GetVm2Timeouts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.read = defaults.read;
        }

        @CustomType.Setter
        public Builder read(@Nullable String read) {

            this.read = read;
            return this;
        }
        public GetVm2Timeouts build() {
            final var _resultValue = new GetVm2Timeouts();
            _resultValue.read = read;
            return _resultValue;
        }
    }
}
