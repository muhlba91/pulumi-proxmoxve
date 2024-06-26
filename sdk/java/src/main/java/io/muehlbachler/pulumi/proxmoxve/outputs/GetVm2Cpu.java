// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVm2Cpu {
    /**
     * @return List of host cores used to execute guest processes, for example: &#39;0,5,8-11&#39;
     * 
     */
    private String affinity;
    /**
     * @return The CPU architecture.
     * 
     */
    private String architecture;
    /**
     * @return The number of CPU cores per socket.
     * 
     */
    private Integer cores;
    /**
     * @return Set of additional CPU flags.
     * 
     */
    private List<String> flags;
    /**
     * @return The number of hotplugged vCPUs.
     * 
     */
    private Integer hotplugged;
    /**
     * @return Limit of CPU usage.
     * 
     */
    private Integer limit;
    /**
     * @return Enable NUMA.
     * 
     */
    private Boolean numa;
    /**
     * @return The number of CPU sockets.
     * 
     */
    private Integer sockets;
    /**
     * @return Emulated CPU type.
     * 
     */
    private String type;
    /**
     * @return CPU weight for a VM
     * 
     */
    private Integer units;

    private GetVm2Cpu() {}
    /**
     * @return List of host cores used to execute guest processes, for example: &#39;0,5,8-11&#39;
     * 
     */
    public String affinity() {
        return this.affinity;
    }
    /**
     * @return The CPU architecture.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return The number of CPU cores per socket.
     * 
     */
    public Integer cores() {
        return this.cores;
    }
    /**
     * @return Set of additional CPU flags.
     * 
     */
    public List<String> flags() {
        return this.flags;
    }
    /**
     * @return The number of hotplugged vCPUs.
     * 
     */
    public Integer hotplugged() {
        return this.hotplugged;
    }
    /**
     * @return Limit of CPU usage.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return Enable NUMA.
     * 
     */
    public Boolean numa() {
        return this.numa;
    }
    /**
     * @return The number of CPU sockets.
     * 
     */
    public Integer sockets() {
        return this.sockets;
    }
    /**
     * @return Emulated CPU type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return CPU weight for a VM
     * 
     */
    public Integer units() {
        return this.units;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVm2Cpu defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String affinity;
        private String architecture;
        private Integer cores;
        private List<String> flags;
        private Integer hotplugged;
        private Integer limit;
        private Boolean numa;
        private Integer sockets;
        private String type;
        private Integer units;
        public Builder() {}
        public Builder(GetVm2Cpu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.architecture = defaults.architecture;
    	      this.cores = defaults.cores;
    	      this.flags = defaults.flags;
    	      this.hotplugged = defaults.hotplugged;
    	      this.limit = defaults.limit;
    	      this.numa = defaults.numa;
    	      this.sockets = defaults.sockets;
    	      this.type = defaults.type;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder affinity(String affinity) {
            if (affinity == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "affinity");
            }
            this.affinity = affinity;
            return this;
        }
        @CustomType.Setter
        public Builder architecture(String architecture) {
            if (architecture == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "architecture");
            }
            this.architecture = architecture;
            return this;
        }
        @CustomType.Setter
        public Builder cores(Integer cores) {
            if (cores == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "cores");
            }
            this.cores = cores;
            return this;
        }
        @CustomType.Setter
        public Builder flags(List<String> flags) {
            if (flags == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "flags");
            }
            this.flags = flags;
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }
        @CustomType.Setter
        public Builder hotplugged(Integer hotplugged) {
            if (hotplugged == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "hotplugged");
            }
            this.hotplugged = hotplugged;
            return this;
        }
        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "limit");
            }
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder numa(Boolean numa) {
            if (numa == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "numa");
            }
            this.numa = numa;
            return this;
        }
        @CustomType.Setter
        public Builder sockets(Integer sockets) {
            if (sockets == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "sockets");
            }
            this.sockets = sockets;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder units(Integer units) {
            if (units == null) {
              throw new MissingRequiredPropertyException("GetVm2Cpu", "units");
            }
            this.units = units;
            return this;
        }
        public GetVm2Cpu build() {
            final var _resultValue = new GetVm2Cpu();
            _resultValue.affinity = affinity;
            _resultValue.architecture = architecture;
            _resultValue.cores = cores;
            _resultValue.flags = flags;
            _resultValue.hotplugged = hotplugged;
            _resultValue.limit = limit;
            _resultValue.numa = numa;
            _resultValue.sockets = sockets;
            _resultValue.type = type;
            _resultValue.units = units;
            return _resultValue;
        }
    }
}
