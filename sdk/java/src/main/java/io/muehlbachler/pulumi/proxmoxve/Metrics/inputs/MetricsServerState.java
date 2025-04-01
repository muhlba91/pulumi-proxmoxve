// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Metrics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricsServerState extends com.pulumi.resources.ResourceArgs {

    public static final MetricsServerState Empty = new MetricsServerState();

    /**
     * Set this to `true` to disable this metric server.
     * 
     */
    @Import(name="disable")
    private @Nullable Output<Boolean> disable;

    /**
     * @return Set this to `true` to disable this metric server.
     * 
     */
    public Optional<Output<Boolean>> disable() {
        return Optional.ofNullable(this.disable);
    }

    /**
     * Root graphite path (ex: `proxmox.mycluster.mykey`).
     * 
     */
    @Import(name="graphitePath")
    private @Nullable Output<String> graphitePath;

    /**
     * @return Root graphite path (ex: `proxmox.mycluster.mykey`).
     * 
     */
    public Optional<Output<String>> graphitePath() {
        return Optional.ofNullable(this.graphitePath);
    }

    /**
     * Protocol to send graphite data. Choice is between `udp` | `tcp`. If not set, PVE default is `udp`.
     * 
     */
    @Import(name="graphiteProto")
    private @Nullable Output<String> graphiteProto;

    /**
     * @return Protocol to send graphite data. Choice is between `udp` | `tcp`. If not set, PVE default is `udp`.
     * 
     */
    public Optional<Output<String>> graphiteProto() {
        return Optional.ofNullable(this.graphiteProto);
    }

    /**
     * An API path prefix inserted between `&lt;host&gt;:&lt;port&gt;/` and `/api2/`. Can be useful if the InfluxDB service runs behind a reverse proxy.
     * 
     */
    @Import(name="influxApiPathPrefix")
    private @Nullable Output<String> influxApiPathPrefix;

    /**
     * @return An API path prefix inserted between `&lt;host&gt;:&lt;port&gt;/` and `/api2/`. Can be useful if the InfluxDB service runs behind a reverse proxy.
     * 
     */
    public Optional<Output<String>> influxApiPathPrefix() {
        return Optional.ofNullable(this.influxApiPathPrefix);
    }

    /**
     * The InfluxDB bucket/db. Only necessary when using the http v2 api.
     * 
     */
    @Import(name="influxBucket")
    private @Nullable Output<String> influxBucket;

    /**
     * @return The InfluxDB bucket/db. Only necessary when using the http v2 api.
     * 
     */
    public Optional<Output<String>> influxBucket() {
        return Optional.ofNullable(this.influxBucket);
    }

    /**
     * Protocol for InfluxDB. Choice is between `udp` | `http` | `https`. If not set, PVE default is `udp`.
     * 
     */
    @Import(name="influxDbProto")
    private @Nullable Output<String> influxDbProto;

    /**
     * @return Protocol for InfluxDB. Choice is between `udp` | `http` | `https`. If not set, PVE default is `udp`.
     * 
     */
    public Optional<Output<String>> influxDbProto() {
        return Optional.ofNullable(this.influxDbProto);
    }

    /**
     * InfluxDB max-body-size in bytes. Requests are batched up to this size. If not set, PVE default is `25000000`.
     * 
     */
    @Import(name="influxMaxBodySize")
    private @Nullable Output<Integer> influxMaxBodySize;

    /**
     * @return InfluxDB max-body-size in bytes. Requests are batched up to this size. If not set, PVE default is `25000000`.
     * 
     */
    public Optional<Output<Integer>> influxMaxBodySize() {
        return Optional.ofNullable(this.influxMaxBodySize);
    }

    /**
     * The InfluxDB organization. Only necessary when using the http v2 api. Has no meaning when using v2 compatibility api.
     * 
     */
    @Import(name="influxOrganization")
    private @Nullable Output<String> influxOrganization;

    /**
     * @return The InfluxDB organization. Only necessary when using the http v2 api. Has no meaning when using v2 compatibility api.
     * 
     */
    public Optional<Output<String>> influxOrganization() {
        return Optional.ofNullable(this.influxOrganization);
    }

    /**
     * The InfluxDB access token. Only necessary when using the http v2 api. If the v2 compatibility api is used, use `user:password` instead.
     * 
     */
    @Import(name="influxToken")
    private @Nullable Output<String> influxToken;

    /**
     * @return The InfluxDB access token. Only necessary when using the http v2 api. If the v2 compatibility api is used, use `user:password` instead.
     * 
     */
    public Optional<Output<String>> influxToken() {
        return Optional.ofNullable(this.influxToken);
    }

    /**
     * Set to `false` to disable certificate verification for https endpoints.
     * 
     */
    @Import(name="influxVerify")
    private @Nullable Output<Boolean> influxVerify;

    /**
     * @return Set to `false` to disable certificate verification for https endpoints.
     * 
     */
    public Optional<Output<Boolean>> influxVerify() {
        return Optional.ofNullable(this.influxVerify);
    }

    /**
     * MTU (maximum transmission unit) for metrics transmission over UDP. If not set, PVE default is `1500` (allowed `512` - `65536`).
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return MTU (maximum transmission unit) for metrics transmission over UDP. If not set, PVE default is `1500` (allowed `512` - `65536`).
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * Unique name that will be ID of this metric server in PVE.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name that will be ID of this metric server in PVE.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Server network port.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Server network port.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Server dns name or IP address.
     * 
     */
    @Import(name="server")
    private @Nullable Output<String> server;

    /**
     * @return Server dns name or IP address.
     * 
     */
    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    /**
     * TCP socket timeout in seconds. If not set, PVE default is `1`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return TCP socket timeout in seconds. If not set, PVE default is `1`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Plugin type. Choice is between `graphite` | `influxdb`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Plugin type. Choice is between `graphite` | `influxdb`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private MetricsServerState() {}

    private MetricsServerState(MetricsServerState $) {
        this.disable = $.disable;
        this.graphitePath = $.graphitePath;
        this.graphiteProto = $.graphiteProto;
        this.influxApiPathPrefix = $.influxApiPathPrefix;
        this.influxBucket = $.influxBucket;
        this.influxDbProto = $.influxDbProto;
        this.influxMaxBodySize = $.influxMaxBodySize;
        this.influxOrganization = $.influxOrganization;
        this.influxToken = $.influxToken;
        this.influxVerify = $.influxVerify;
        this.mtu = $.mtu;
        this.name = $.name;
        this.port = $.port;
        this.server = $.server;
        this.timeout = $.timeout;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricsServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricsServerState $;

        public Builder() {
            $ = new MetricsServerState();
        }

        public Builder(MetricsServerState defaults) {
            $ = new MetricsServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param disable Set this to `true` to disable this metric server.
         * 
         * @return builder
         * 
         */
        public Builder disable(@Nullable Output<Boolean> disable) {
            $.disable = disable;
            return this;
        }

        /**
         * @param disable Set this to `true` to disable this metric server.
         * 
         * @return builder
         * 
         */
        public Builder disable(Boolean disable) {
            return disable(Output.of(disable));
        }

        /**
         * @param graphitePath Root graphite path (ex: `proxmox.mycluster.mykey`).
         * 
         * @return builder
         * 
         */
        public Builder graphitePath(@Nullable Output<String> graphitePath) {
            $.graphitePath = graphitePath;
            return this;
        }

        /**
         * @param graphitePath Root graphite path (ex: `proxmox.mycluster.mykey`).
         * 
         * @return builder
         * 
         */
        public Builder graphitePath(String graphitePath) {
            return graphitePath(Output.of(graphitePath));
        }

        /**
         * @param graphiteProto Protocol to send graphite data. Choice is between `udp` | `tcp`. If not set, PVE default is `udp`.
         * 
         * @return builder
         * 
         */
        public Builder graphiteProto(@Nullable Output<String> graphiteProto) {
            $.graphiteProto = graphiteProto;
            return this;
        }

        /**
         * @param graphiteProto Protocol to send graphite data. Choice is between `udp` | `tcp`. If not set, PVE default is `udp`.
         * 
         * @return builder
         * 
         */
        public Builder graphiteProto(String graphiteProto) {
            return graphiteProto(Output.of(graphiteProto));
        }

        /**
         * @param influxApiPathPrefix An API path prefix inserted between `&lt;host&gt;:&lt;port&gt;/` and `/api2/`. Can be useful if the InfluxDB service runs behind a reverse proxy.
         * 
         * @return builder
         * 
         */
        public Builder influxApiPathPrefix(@Nullable Output<String> influxApiPathPrefix) {
            $.influxApiPathPrefix = influxApiPathPrefix;
            return this;
        }

        /**
         * @param influxApiPathPrefix An API path prefix inserted between `&lt;host&gt;:&lt;port&gt;/` and `/api2/`. Can be useful if the InfluxDB service runs behind a reverse proxy.
         * 
         * @return builder
         * 
         */
        public Builder influxApiPathPrefix(String influxApiPathPrefix) {
            return influxApiPathPrefix(Output.of(influxApiPathPrefix));
        }

        /**
         * @param influxBucket The InfluxDB bucket/db. Only necessary when using the http v2 api.
         * 
         * @return builder
         * 
         */
        public Builder influxBucket(@Nullable Output<String> influxBucket) {
            $.influxBucket = influxBucket;
            return this;
        }

        /**
         * @param influxBucket The InfluxDB bucket/db. Only necessary when using the http v2 api.
         * 
         * @return builder
         * 
         */
        public Builder influxBucket(String influxBucket) {
            return influxBucket(Output.of(influxBucket));
        }

        /**
         * @param influxDbProto Protocol for InfluxDB. Choice is between `udp` | `http` | `https`. If not set, PVE default is `udp`.
         * 
         * @return builder
         * 
         */
        public Builder influxDbProto(@Nullable Output<String> influxDbProto) {
            $.influxDbProto = influxDbProto;
            return this;
        }

        /**
         * @param influxDbProto Protocol for InfluxDB. Choice is between `udp` | `http` | `https`. If not set, PVE default is `udp`.
         * 
         * @return builder
         * 
         */
        public Builder influxDbProto(String influxDbProto) {
            return influxDbProto(Output.of(influxDbProto));
        }

        /**
         * @param influxMaxBodySize InfluxDB max-body-size in bytes. Requests are batched up to this size. If not set, PVE default is `25000000`.
         * 
         * @return builder
         * 
         */
        public Builder influxMaxBodySize(@Nullable Output<Integer> influxMaxBodySize) {
            $.influxMaxBodySize = influxMaxBodySize;
            return this;
        }

        /**
         * @param influxMaxBodySize InfluxDB max-body-size in bytes. Requests are batched up to this size. If not set, PVE default is `25000000`.
         * 
         * @return builder
         * 
         */
        public Builder influxMaxBodySize(Integer influxMaxBodySize) {
            return influxMaxBodySize(Output.of(influxMaxBodySize));
        }

        /**
         * @param influxOrganization The InfluxDB organization. Only necessary when using the http v2 api. Has no meaning when using v2 compatibility api.
         * 
         * @return builder
         * 
         */
        public Builder influxOrganization(@Nullable Output<String> influxOrganization) {
            $.influxOrganization = influxOrganization;
            return this;
        }

        /**
         * @param influxOrganization The InfluxDB organization. Only necessary when using the http v2 api. Has no meaning when using v2 compatibility api.
         * 
         * @return builder
         * 
         */
        public Builder influxOrganization(String influxOrganization) {
            return influxOrganization(Output.of(influxOrganization));
        }

        /**
         * @param influxToken The InfluxDB access token. Only necessary when using the http v2 api. If the v2 compatibility api is used, use `user:password` instead.
         * 
         * @return builder
         * 
         */
        public Builder influxToken(@Nullable Output<String> influxToken) {
            $.influxToken = influxToken;
            return this;
        }

        /**
         * @param influxToken The InfluxDB access token. Only necessary when using the http v2 api. If the v2 compatibility api is used, use `user:password` instead.
         * 
         * @return builder
         * 
         */
        public Builder influxToken(String influxToken) {
            return influxToken(Output.of(influxToken));
        }

        /**
         * @param influxVerify Set to `false` to disable certificate verification for https endpoints.
         * 
         * @return builder
         * 
         */
        public Builder influxVerify(@Nullable Output<Boolean> influxVerify) {
            $.influxVerify = influxVerify;
            return this;
        }

        /**
         * @param influxVerify Set to `false` to disable certificate verification for https endpoints.
         * 
         * @return builder
         * 
         */
        public Builder influxVerify(Boolean influxVerify) {
            return influxVerify(Output.of(influxVerify));
        }

        /**
         * @param mtu MTU (maximum transmission unit) for metrics transmission over UDP. If not set, PVE default is `1500` (allowed `512` - `65536`).
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu MTU (maximum transmission unit) for metrics transmission over UDP. If not set, PVE default is `1500` (allowed `512` - `65536`).
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name Unique name that will be ID of this metric server in PVE.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name that will be ID of this metric server in PVE.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port Server network port.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Server network port.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param server Server dns name or IP address.
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Server dns name or IP address.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param timeout TCP socket timeout in seconds. If not set, PVE default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout TCP socket timeout in seconds. If not set, PVE default is `1`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type Plugin type. Choice is between `graphite` | `influxdb`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Plugin type. Choice is between `graphite` | `influxdb`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MetricsServerState build() {
            return $;
        }
    }

}
