// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineDiskSpeed;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineDisk {
    /**
     * @return The disk AIO mode (defaults to `io_uring`).
     * 
     */
    private @Nullable String aio;
    /**
     * @return Whether the drive should be included when making backups (defaults to `true`).
     * 
     */
    private @Nullable Boolean backup;
    /**
     * @return The cache type (defaults to `none`).
     * 
     */
    private @Nullable String cache;
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    private @Nullable String datastoreId;
    /**
     * @return Whether to pass discard/trim requests to the
     * underlying storage. Supported values are `on`/`ignore` (defaults
     * to `ignore`).
     * 
     */
    private @Nullable String discard;
    /**
     * @return The file format.
     * 
     */
    private @Nullable String fileFormat;
    /**
     * @return The file ID for a disk image (experimental -
     * might cause high CPU utilization during import, especially with large
     * disk images).
     * 
     */
    private @Nullable String fileId;
    /**
     * @return The hardware interface to connect the cloud-init
     * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
     * detected if the setting is missing but a cloud-init image is present,
     * otherwise defaults to `ide2`.
     * 
     */
    private String interface_;
    /**
     * @return Whether to use iothreads for this disk (defaults
     * to `false`).
     * 
     */
    private @Nullable Boolean iothread;
    /**
     * @return The in-datastore path to the disk image.
     * ***Experimental.***Use to attach another VM&#39;s disks,
     * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
     * See &#34;*Example: Attached disks*&#34;.
     * 
     */
    private @Nullable String pathInDatastore;
    /**
     * @return Whether the drive should be considered for replication jobs (defaults to `true`).
     * 
     */
    private @Nullable Boolean replicate;
    /**
     * @return The disk size in gigabytes (defaults to `8`).
     * 
     */
    private @Nullable Integer size;
    /**
     * @return The speed limits.
     * 
     */
    private @Nullable VirtualMachineDiskSpeed speed;
    /**
     * @return Whether to use an SSD emulation option for this disk (
     * defaults to `false`). Note that SSD emulation is not supported on VirtIO
     * Block drives.
     * 
     */
    private @Nullable Boolean ssd;

    private VirtualMachineDisk() {}
    /**
     * @return The disk AIO mode (defaults to `io_uring`).
     * 
     */
    public Optional<String> aio() {
        return Optional.ofNullable(this.aio);
    }
    /**
     * @return Whether the drive should be included when making backups (defaults to `true`).
     * 
     */
    public Optional<Boolean> backup() {
        return Optional.ofNullable(this.backup);
    }
    /**
     * @return The cache type (defaults to `none`).
     * 
     */
    public Optional<String> cache() {
        return Optional.ofNullable(this.cache);
    }
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * @return Whether to pass discard/trim requests to the
     * underlying storage. Supported values are `on`/`ignore` (defaults
     * to `ignore`).
     * 
     */
    public Optional<String> discard() {
        return Optional.ofNullable(this.discard);
    }
    /**
     * @return The file format.
     * 
     */
    public Optional<String> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }
    /**
     * @return The file ID for a disk image (experimental -
     * might cause high CPU utilization during import, especially with large
     * disk images).
     * 
     */
    public Optional<String> fileId() {
        return Optional.ofNullable(this.fileId);
    }
    /**
     * @return The hardware interface to connect the cloud-init
     * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
     * detected if the setting is missing but a cloud-init image is present,
     * otherwise defaults to `ide2`.
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Whether to use iothreads for this disk (defaults
     * to `false`).
     * 
     */
    public Optional<Boolean> iothread() {
        return Optional.ofNullable(this.iothread);
    }
    /**
     * @return The in-datastore path to the disk image.
     * ***Experimental.***Use to attach another VM&#39;s disks,
     * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
     * See &#34;*Example: Attached disks*&#34;.
     * 
     */
    public Optional<String> pathInDatastore() {
        return Optional.ofNullable(this.pathInDatastore);
    }
    /**
     * @return Whether the drive should be considered for replication jobs (defaults to `true`).
     * 
     */
    public Optional<Boolean> replicate() {
        return Optional.ofNullable(this.replicate);
    }
    /**
     * @return The disk size in gigabytes (defaults to `8`).
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The speed limits.
     * 
     */
    public Optional<VirtualMachineDiskSpeed> speed() {
        return Optional.ofNullable(this.speed);
    }
    /**
     * @return Whether to use an SSD emulation option for this disk (
     * defaults to `false`). Note that SSD emulation is not supported on VirtIO
     * Block drives.
     * 
     */
    public Optional<Boolean> ssd() {
        return Optional.ofNullable(this.ssd);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aio;
        private @Nullable Boolean backup;
        private @Nullable String cache;
        private @Nullable String datastoreId;
        private @Nullable String discard;
        private @Nullable String fileFormat;
        private @Nullable String fileId;
        private String interface_;
        private @Nullable Boolean iothread;
        private @Nullable String pathInDatastore;
        private @Nullable Boolean replicate;
        private @Nullable Integer size;
        private @Nullable VirtualMachineDiskSpeed speed;
        private @Nullable Boolean ssd;
        public Builder() {}
        public Builder(VirtualMachineDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aio = defaults.aio;
    	      this.backup = defaults.backup;
    	      this.cache = defaults.cache;
    	      this.datastoreId = defaults.datastoreId;
    	      this.discard = defaults.discard;
    	      this.fileFormat = defaults.fileFormat;
    	      this.fileId = defaults.fileId;
    	      this.interface_ = defaults.interface_;
    	      this.iothread = defaults.iothread;
    	      this.pathInDatastore = defaults.pathInDatastore;
    	      this.replicate = defaults.replicate;
    	      this.size = defaults.size;
    	      this.speed = defaults.speed;
    	      this.ssd = defaults.ssd;
        }

        @CustomType.Setter
        public Builder aio(@Nullable String aio) {

            this.aio = aio;
            return this;
        }
        @CustomType.Setter
        public Builder backup(@Nullable Boolean backup) {

            this.backup = backup;
            return this;
        }
        @CustomType.Setter
        public Builder cache(@Nullable String cache) {

            this.cache = cache;
            return this;
        }
        @CustomType.Setter
        public Builder datastoreId(@Nullable String datastoreId) {

            this.datastoreId = datastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder discard(@Nullable String discard) {

            this.discard = discard;
            return this;
        }
        @CustomType.Setter
        public Builder fileFormat(@Nullable String fileFormat) {

            this.fileFormat = fileFormat;
            return this;
        }
        @CustomType.Setter
        public Builder fileId(@Nullable String fileId) {

            this.fileId = fileId;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("VirtualMachineDisk", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder iothread(@Nullable Boolean iothread) {

            this.iothread = iothread;
            return this;
        }
        @CustomType.Setter
        public Builder pathInDatastore(@Nullable String pathInDatastore) {

            this.pathInDatastore = pathInDatastore;
            return this;
        }
        @CustomType.Setter
        public Builder replicate(@Nullable Boolean replicate) {

            this.replicate = replicate;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {

            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder speed(@Nullable VirtualMachineDiskSpeed speed) {

            this.speed = speed;
            return this;
        }
        @CustomType.Setter
        public Builder ssd(@Nullable Boolean ssd) {

            this.ssd = ssd;
            return this;
        }
        public VirtualMachineDisk build() {
            final var _resultValue = new VirtualMachineDisk();
            _resultValue.aio = aio;
            _resultValue.backup = backup;
            _resultValue.cache = cache;
            _resultValue.datastoreId = datastoreId;
            _resultValue.discard = discard;
            _resultValue.fileFormat = fileFormat;
            _resultValue.fileId = fileId;
            _resultValue.interface_ = interface_;
            _resultValue.iothread = iothread;
            _resultValue.pathInDatastore = pathInDatastore;
            _resultValue.replicate = replicate;
            _resultValue.size = size;
            _resultValue.speed = speed;
            _resultValue.ssd = ssd;
            return _resultValue;
        }
    }
}
