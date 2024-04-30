// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Cluster;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Cluster.inputs.OptionsNextIdArgs;
import io.muehlbachler.pulumi.proxmoxve.Cluster.inputs.OptionsNotifyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OptionsArgs Empty = new OptionsArgs();

    /**
     * Clone I/O bandwidth limit in KiB/s.
     * 
     */
    @Import(name="bandwidthLimitClone")
    private @Nullable Output<Integer> bandwidthLimitClone;

    /**
     * @return Clone I/O bandwidth limit in KiB/s.
     * 
     */
    public Optional<Output<Integer>> bandwidthLimitClone() {
        return Optional.ofNullable(this.bandwidthLimitClone);
    }

    /**
     * Default I/O bandwidth limit in KiB/s.
     * 
     */
    @Import(name="bandwidthLimitDefault")
    private @Nullable Output<Integer> bandwidthLimitDefault;

    /**
     * @return Default I/O bandwidth limit in KiB/s.
     * 
     */
    public Optional<Output<Integer>> bandwidthLimitDefault() {
        return Optional.ofNullable(this.bandwidthLimitDefault);
    }

    /**
     * Migration I/O bandwidth limit in KiB/s.
     * 
     */
    @Import(name="bandwidthLimitMigration")
    private @Nullable Output<Integer> bandwidthLimitMigration;

    /**
     * @return Migration I/O bandwidth limit in KiB/s.
     * 
     */
    public Optional<Output<Integer>> bandwidthLimitMigration() {
        return Optional.ofNullable(this.bandwidthLimitMigration);
    }

    /**
     * Move I/O bandwidth limit in KiB/s.
     * 
     */
    @Import(name="bandwidthLimitMove")
    private @Nullable Output<Integer> bandwidthLimitMove;

    /**
     * @return Move I/O bandwidth limit in KiB/s.
     * 
     */
    public Optional<Output<Integer>> bandwidthLimitMove() {
        return Optional.ofNullable(this.bandwidthLimitMove);
    }

    /**
     * Restore I/O bandwidth limit in KiB/s.
     * 
     */
    @Import(name="bandwidthLimitRestore")
    private @Nullable Output<Integer> bandwidthLimitRestore;

    /**
     * @return Restore I/O bandwidth limit in KiB/s.
     * 
     */
    public Optional<Output<Integer>> bandwidthLimitRestore() {
        return Optional.ofNullable(this.bandwidthLimitRestore);
    }

    /**
     * Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
     * 
     */
    @Import(name="console")
    private @Nullable Output<String> console;

    /**
     * @return Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
     * 
     */
    public Optional<Output<String>> console() {
        return Optional.ofNullable(this.console);
    }

    /**
     * Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
     * 
     */
    @Import(name="crsHa")
    private @Nullable Output<String> crsHa;

    /**
     * @return Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
     * 
     */
    public Optional<Output<String>> crsHa() {
        return Optional.ofNullable(this.crsHa);
    }

    /**
     * Cluster resource scheduling setting for HA rebalance on start.
     * 
     */
    @Import(name="crsHaRebalanceOnStart")
    private @Nullable Output<Boolean> crsHaRebalanceOnStart;

    /**
     * @return Cluster resource scheduling setting for HA rebalance on start.
     * 
     */
    public Optional<Output<Boolean>> crsHaRebalanceOnStart() {
        return Optional.ofNullable(this.crsHaRebalanceOnStart);
    }

    /**
     * Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * email address to send notification from (default is root@$hostname).
     * 
     */
    @Import(name="emailFrom")
    private @Nullable Output<String> emailFrom;

    /**
     * @return email address to send notification from (default is root@$hostname).
     * 
     */
    public Optional<Output<String>> emailFrom() {
        return Optional.ofNullable(this.emailFrom);
    }

    /**
     * Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
     * 
     */
    @Import(name="haShutdownPolicy")
    private @Nullable Output<String> haShutdownPolicy;

    /**
     * @return Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
     * 
     */
    public Optional<Output<String>> haShutdownPolicy() {
        return Optional.ofNullable(this.haShutdownPolicy);
    }

    /**
     * Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
     * 
     */
    @Import(name="httpProxy")
    private @Nullable Output<String> httpProxy;

    /**
     * @return Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
     * 
     */
    public Optional<Output<String>> httpProxy() {
        return Optional.ofNullable(this.httpProxy);
    }

    /**
     * Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
     * 
     */
    @Import(name="keyboard")
    private @Nullable Output<String> keyboard;

    /**
     * @return Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
     * 
     */
    public Optional<Output<String>> keyboard() {
        return Optional.ofNullable(this.keyboard);
    }

    /**
     * Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * Prefix for autogenerated MAC addresses.
     * 
     */
    @Import(name="macPrefix")
    private @Nullable Output<String> macPrefix;

    /**
     * @return Prefix for autogenerated MAC addresses.
     * 
     */
    public Optional<Output<String>> macPrefix() {
        return Optional.ofNullable(this.macPrefix);
    }

    /**
     * Defines how many workers (per node) are maximal started on actions like &#39;stopall VMs&#39; or task from the ha-manager.
     * 
     */
    @Import(name="maxWorkers")
    private @Nullable Output<Integer> maxWorkers;

    /**
     * @return Defines how many workers (per node) are maximal started on actions like &#39;stopall VMs&#39; or task from the ha-manager.
     * 
     */
    public Optional<Output<Integer>> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    /**
     * Cluster wide migration network CIDR.
     * 
     */
    @Import(name="migrationCidr")
    private @Nullable Output<String> migrationCidr;

    /**
     * @return Cluster wide migration network CIDR.
     * 
     */
    public Optional<Output<String>> migrationCidr() {
        return Optional.ofNullable(this.migrationCidr);
    }

    /**
     * Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
     * 
     */
    @Import(name="migrationType")
    private @Nullable Output<String> migrationType;

    /**
     * @return Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
     * 
     */
    public Optional<Output<String>> migrationType() {
        return Optional.ofNullable(this.migrationType);
    }

    /**
     * The ranges for the next free VM ID auto-selection pool.
     * 
     */
    @Import(name="nextId")
    private @Nullable Output<OptionsNextIdArgs> nextId;

    /**
     * @return The ranges for the next free VM ID auto-selection pool.
     * 
     */
    public Optional<Output<OptionsNextIdArgs>> nextId() {
        return Optional.ofNullable(this.nextId);
    }

    /**
     * Cluster-wide notification settings.
     * 
     */
    @Import(name="notify")
    private @Nullable Output<OptionsNotifyArgs> notify;

    /**
     * @return Cluster-wide notification settings.
     * 
     */
    public Optional<Output<OptionsNotifyArgs>> notify_() {
        return Optional.ofNullable(this.notify);
    }

    private OptionsArgs() {}

    private OptionsArgs(OptionsArgs $) {
        this.bandwidthLimitClone = $.bandwidthLimitClone;
        this.bandwidthLimitDefault = $.bandwidthLimitDefault;
        this.bandwidthLimitMigration = $.bandwidthLimitMigration;
        this.bandwidthLimitMove = $.bandwidthLimitMove;
        this.bandwidthLimitRestore = $.bandwidthLimitRestore;
        this.console = $.console;
        this.crsHa = $.crsHa;
        this.crsHaRebalanceOnStart = $.crsHaRebalanceOnStart;
        this.description = $.description;
        this.emailFrom = $.emailFrom;
        this.haShutdownPolicy = $.haShutdownPolicy;
        this.httpProxy = $.httpProxy;
        this.keyboard = $.keyboard;
        this.language = $.language;
        this.macPrefix = $.macPrefix;
        this.maxWorkers = $.maxWorkers;
        this.migrationCidr = $.migrationCidr;
        this.migrationType = $.migrationType;
        this.nextId = $.nextId;
        this.notify = $.notify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OptionsArgs $;

        public Builder() {
            $ = new OptionsArgs();
        }

        public Builder(OptionsArgs defaults) {
            $ = new OptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthLimitClone Clone I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitClone(@Nullable Output<Integer> bandwidthLimitClone) {
            $.bandwidthLimitClone = bandwidthLimitClone;
            return this;
        }

        /**
         * @param bandwidthLimitClone Clone I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitClone(Integer bandwidthLimitClone) {
            return bandwidthLimitClone(Output.of(bandwidthLimitClone));
        }

        /**
         * @param bandwidthLimitDefault Default I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitDefault(@Nullable Output<Integer> bandwidthLimitDefault) {
            $.bandwidthLimitDefault = bandwidthLimitDefault;
            return this;
        }

        /**
         * @param bandwidthLimitDefault Default I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitDefault(Integer bandwidthLimitDefault) {
            return bandwidthLimitDefault(Output.of(bandwidthLimitDefault));
        }

        /**
         * @param bandwidthLimitMigration Migration I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitMigration(@Nullable Output<Integer> bandwidthLimitMigration) {
            $.bandwidthLimitMigration = bandwidthLimitMigration;
            return this;
        }

        /**
         * @param bandwidthLimitMigration Migration I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitMigration(Integer bandwidthLimitMigration) {
            return bandwidthLimitMigration(Output.of(bandwidthLimitMigration));
        }

        /**
         * @param bandwidthLimitMove Move I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitMove(@Nullable Output<Integer> bandwidthLimitMove) {
            $.bandwidthLimitMove = bandwidthLimitMove;
            return this;
        }

        /**
         * @param bandwidthLimitMove Move I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitMove(Integer bandwidthLimitMove) {
            return bandwidthLimitMove(Output.of(bandwidthLimitMove));
        }

        /**
         * @param bandwidthLimitRestore Restore I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitRestore(@Nullable Output<Integer> bandwidthLimitRestore) {
            $.bandwidthLimitRestore = bandwidthLimitRestore;
            return this;
        }

        /**
         * @param bandwidthLimitRestore Restore I/O bandwidth limit in KiB/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimitRestore(Integer bandwidthLimitRestore) {
            return bandwidthLimitRestore(Output.of(bandwidthLimitRestore));
        }

        /**
         * @param console Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
         * 
         * @return builder
         * 
         */
        public Builder console(@Nullable Output<String> console) {
            $.console = console;
            return this;
        }

        /**
         * @param console Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
         * 
         * @return builder
         * 
         */
        public Builder console(String console) {
            return console(Output.of(console));
        }

        /**
         * @param crsHa Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
         * 
         * @return builder
         * 
         */
        public Builder crsHa(@Nullable Output<String> crsHa) {
            $.crsHa = crsHa;
            return this;
        }

        /**
         * @param crsHa Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
         * 
         * @return builder
         * 
         */
        public Builder crsHa(String crsHa) {
            return crsHa(Output.of(crsHa));
        }

        /**
         * @param crsHaRebalanceOnStart Cluster resource scheduling setting for HA rebalance on start.
         * 
         * @return builder
         * 
         */
        public Builder crsHaRebalanceOnStart(@Nullable Output<Boolean> crsHaRebalanceOnStart) {
            $.crsHaRebalanceOnStart = crsHaRebalanceOnStart;
            return this;
        }

        /**
         * @param crsHaRebalanceOnStart Cluster resource scheduling setting for HA rebalance on start.
         * 
         * @return builder
         * 
         */
        public Builder crsHaRebalanceOnStart(Boolean crsHaRebalanceOnStart) {
            return crsHaRebalanceOnStart(Output.of(crsHaRebalanceOnStart));
        }

        /**
         * @param description Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param emailFrom email address to send notification from (default is root@$hostname).
         * 
         * @return builder
         * 
         */
        public Builder emailFrom(@Nullable Output<String> emailFrom) {
            $.emailFrom = emailFrom;
            return this;
        }

        /**
         * @param emailFrom email address to send notification from (default is root@$hostname).
         * 
         * @return builder
         * 
         */
        public Builder emailFrom(String emailFrom) {
            return emailFrom(Output.of(emailFrom));
        }

        /**
         * @param haShutdownPolicy Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
         * 
         * @return builder
         * 
         */
        public Builder haShutdownPolicy(@Nullable Output<String> haShutdownPolicy) {
            $.haShutdownPolicy = haShutdownPolicy;
            return this;
        }

        /**
         * @param haShutdownPolicy Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
         * 
         * @return builder
         * 
         */
        public Builder haShutdownPolicy(String haShutdownPolicy) {
            return haShutdownPolicy(Output.of(haShutdownPolicy));
        }

        /**
         * @param httpProxy Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
         * 
         * @return builder
         * 
         */
        public Builder httpProxy(@Nullable Output<String> httpProxy) {
            $.httpProxy = httpProxy;
            return this;
        }

        /**
         * @param httpProxy Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
         * 
         * @return builder
         * 
         */
        public Builder httpProxy(String httpProxy) {
            return httpProxy(Output.of(httpProxy));
        }

        /**
         * @param keyboard Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
         * 
         * @return builder
         * 
         */
        public Builder keyboard(@Nullable Output<String> keyboard) {
            $.keyboard = keyboard;
            return this;
        }

        /**
         * @param keyboard Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
         * 
         * @return builder
         * 
         */
        public Builder keyboard(String keyboard) {
            return keyboard(Output.of(keyboard));
        }

        /**
         * @param language Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param macPrefix Prefix for autogenerated MAC addresses.
         * 
         * @return builder
         * 
         */
        public Builder macPrefix(@Nullable Output<String> macPrefix) {
            $.macPrefix = macPrefix;
            return this;
        }

        /**
         * @param macPrefix Prefix for autogenerated MAC addresses.
         * 
         * @return builder
         * 
         */
        public Builder macPrefix(String macPrefix) {
            return macPrefix(Output.of(macPrefix));
        }

        /**
         * @param maxWorkers Defines how many workers (per node) are maximal started on actions like &#39;stopall VMs&#39; or task from the ha-manager.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        /**
         * @param maxWorkers Defines how many workers (per node) are maximal started on actions like &#39;stopall VMs&#39; or task from the ha-manager.
         * 
         * @return builder
         * 
         */
        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        /**
         * @param migrationCidr Cluster wide migration network CIDR.
         * 
         * @return builder
         * 
         */
        public Builder migrationCidr(@Nullable Output<String> migrationCidr) {
            $.migrationCidr = migrationCidr;
            return this;
        }

        /**
         * @param migrationCidr Cluster wide migration network CIDR.
         * 
         * @return builder
         * 
         */
        public Builder migrationCidr(String migrationCidr) {
            return migrationCidr(Output.of(migrationCidr));
        }

        /**
         * @param migrationType Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
         * 
         * @return builder
         * 
         */
        public Builder migrationType(@Nullable Output<String> migrationType) {
            $.migrationType = migrationType;
            return this;
        }

        /**
         * @param migrationType Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
         * 
         * @return builder
         * 
         */
        public Builder migrationType(String migrationType) {
            return migrationType(Output.of(migrationType));
        }

        /**
         * @param nextId The ranges for the next free VM ID auto-selection pool.
         * 
         * @return builder
         * 
         */
        public Builder nextId(@Nullable Output<OptionsNextIdArgs> nextId) {
            $.nextId = nextId;
            return this;
        }

        /**
         * @param nextId The ranges for the next free VM ID auto-selection pool.
         * 
         * @return builder
         * 
         */
        public Builder nextId(OptionsNextIdArgs nextId) {
            return nextId(Output.of(nextId));
        }

        /**
         * @param notify Cluster-wide notification settings.
         * 
         * @return builder
         * 
         */
        public Builder notify_(@Nullable Output<OptionsNotifyArgs> notify) {
            $.notify = notify;
            return this;
        }

        /**
         * @param notify Cluster-wide notification settings.
         * 
         * @return builder
         * 
         */
        public Builder notify_(OptionsNotifyArgs notify) {
            return notify_(Output.of(notify));
        }

        public OptionsArgs build() {
            return $;
        }
    }

}
