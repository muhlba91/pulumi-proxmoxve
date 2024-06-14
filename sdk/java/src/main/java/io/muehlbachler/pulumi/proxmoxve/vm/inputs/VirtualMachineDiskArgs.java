// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineDiskSpeedArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineDiskArgs Empty = new VirtualMachineDiskArgs();

    /**
     * The disk AIO mode (defaults to `io_uring`).
     * 
     */
    @Import(name="aio")
    private @Nullable Output<String> aio;

    /**
     * @return The disk AIO mode (defaults to `io_uring`).
     * 
     */
    public Optional<Output<String>> aio() {
        return Optional.ofNullable(this.aio);
    }

    /**
     * Whether the drive should be included when making backups (defaults to `true`).
     * 
     */
    @Import(name="backup")
    private @Nullable Output<Boolean> backup;

    /**
     * @return Whether the drive should be included when making backups (defaults to `true`).
     * 
     */
    public Optional<Output<Boolean>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * The cache type (defaults to `none`).
     * 
     */
    @Import(name="cache")
    private @Nullable Output<String> cache;

    /**
     * @return The cache type (defaults to `none`).
     * 
     */
    public Optional<Output<String>> cache() {
        return Optional.ofNullable(this.cache);
    }

    /**
     * The identifier for the datastore to create
     * the disk in (defaults to `local-lvm`).
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The identifier for the datastore to create
     * the disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * Whether to pass discard/trim requests to the
     * underlying storage. Supported values are `on`/`ignore` (defaults
     * to `ignore`).
     * 
     */
    @Import(name="discard")
    private @Nullable Output<String> discard;

    /**
     * @return Whether to pass discard/trim requests to the
     * underlying storage. Supported values are `on`/`ignore` (defaults
     * to `ignore`).
     * 
     */
    public Optional<Output<String>> discard() {
        return Optional.ofNullable(this.discard);
    }

    /**
     * The file format (defaults to `qcow2`).
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return The file format (defaults to `qcow2`).
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * The file ID for a disk image. The ID format is
     * `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/centos8.img`. Can be also taken from
     * `proxmoxve.Download.File` resource.
     * 
     */
    @Import(name="fileId")
    private @Nullable Output<String> fileId;

    /**
     * @return The file ID for a disk image. The ID format is
     * `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/centos8.img`. Can be also taken from
     * `proxmoxve.Download.File` resource.
     * 
     */
    public Optional<Output<String>> fileId() {
        return Optional.ofNullable(this.fileId);
    }

    /**
     * The disk interface for Proxmox, currently `scsi`,
     * `sata` and `virtio` interfaces are supported. Append the disk index at
     * the end, for example, `virtio0` for the first virtio disk, `virtio1` for
     * the second, etc.
     * 
     */
    @Import(name="interface", required=true)
    private Output<String> interface_;

    /**
     * @return The disk interface for Proxmox, currently `scsi`,
     * `sata` and `virtio` interfaces are supported. Append the disk index at
     * the end, for example, `virtio0` for the first virtio disk, `virtio1` for
     * the second, etc.
     * 
     */
    public Output<String> interface_() {
        return this.interface_;
    }

    /**
     * Whether to use iothreads for this disk (defaults
     * to `false`).
     * 
     */
    @Import(name="iothread")
    private @Nullable Output<Boolean> iothread;

    /**
     * @return Whether to use iothreads for this disk (defaults
     * to `false`).
     * 
     */
    public Optional<Output<Boolean>> iothread() {
        return Optional.ofNullable(this.iothread);
    }

    /**
     * The in-datastore path to the disk image.
     * ***Experimental.***Use to attach another VM&#39;s disks,
     * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
     * See &#34;*Example: Attached disks*&#34;.
     * 
     */
    @Import(name="pathInDatastore")
    private @Nullable Output<String> pathInDatastore;

    /**
     * @return The in-datastore path to the disk image.
     * ***Experimental.***Use to attach another VM&#39;s disks,
     * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
     * See &#34;*Example: Attached disks*&#34;.
     * 
     */
    public Optional<Output<String>> pathInDatastore() {
        return Optional.ofNullable(this.pathInDatastore);
    }

    /**
     * Whether the drive should be considered for replication jobs (defaults to `true`).
     * 
     */
    @Import(name="replicate")
    private @Nullable Output<Boolean> replicate;

    /**
     * @return Whether the drive should be considered for replication jobs (defaults to `true`).
     * 
     */
    public Optional<Output<Boolean>> replicate() {
        return Optional.ofNullable(this.replicate);
    }

    /**
     * The serial number of the disk, up to 20 bytes long.
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return The serial number of the disk, up to 20 bytes long.
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    /**
     * The disk size in gigabytes (defaults to `8`).
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The disk size in gigabytes (defaults to `8`).
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The speed limits.
     * 
     */
    @Import(name="speed")
    private @Nullable Output<VirtualMachineDiskSpeedArgs> speed;

    /**
     * @return The speed limits.
     * 
     */
    public Optional<Output<VirtualMachineDiskSpeedArgs>> speed() {
        return Optional.ofNullable(this.speed);
    }

    /**
     * Whether to use an SSD emulation option for this disk (
     * defaults to `false`). Note that SSD emulation is not supported on VirtIO
     * Block drives.
     * 
     */
    @Import(name="ssd")
    private @Nullable Output<Boolean> ssd;

    /**
     * @return Whether to use an SSD emulation option for this disk (
     * defaults to `false`). Note that SSD emulation is not supported on VirtIO
     * Block drives.
     * 
     */
    public Optional<Output<Boolean>> ssd() {
        return Optional.ofNullable(this.ssd);
    }

    private VirtualMachineDiskArgs() {}

    private VirtualMachineDiskArgs(VirtualMachineDiskArgs $) {
        this.aio = $.aio;
        this.backup = $.backup;
        this.cache = $.cache;
        this.datastoreId = $.datastoreId;
        this.discard = $.discard;
        this.fileFormat = $.fileFormat;
        this.fileId = $.fileId;
        this.interface_ = $.interface_;
        this.iothread = $.iothread;
        this.pathInDatastore = $.pathInDatastore;
        this.replicate = $.replicate;
        this.serial = $.serial;
        this.size = $.size;
        this.speed = $.speed;
        this.ssd = $.ssd;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineDiskArgs $;

        public Builder() {
            $ = new VirtualMachineDiskArgs();
        }

        public Builder(VirtualMachineDiskArgs defaults) {
            $ = new VirtualMachineDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aio The disk AIO mode (defaults to `io_uring`).
         * 
         * @return builder
         * 
         */
        public Builder aio(@Nullable Output<String> aio) {
            $.aio = aio;
            return this;
        }

        /**
         * @param aio The disk AIO mode (defaults to `io_uring`).
         * 
         * @return builder
         * 
         */
        public Builder aio(String aio) {
            return aio(Output.of(aio));
        }

        /**
         * @param backup Whether the drive should be included when making backups (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<Boolean> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup Whether the drive should be included when making backups (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder backup(Boolean backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param cache The cache type (defaults to `none`).
         * 
         * @return builder
         * 
         */
        public Builder cache(@Nullable Output<String> cache) {
            $.cache = cache;
            return this;
        }

        /**
         * @param cache The cache type (defaults to `none`).
         * 
         * @return builder
         * 
         */
        public Builder cache(String cache) {
            return cache(Output.of(cache));
        }

        /**
         * @param datastoreId The identifier for the datastore to create
         * the disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The identifier for the datastore to create
         * the disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param discard Whether to pass discard/trim requests to the
         * underlying storage. Supported values are `on`/`ignore` (defaults
         * to `ignore`).
         * 
         * @return builder
         * 
         */
        public Builder discard(@Nullable Output<String> discard) {
            $.discard = discard;
            return this;
        }

        /**
         * @param discard Whether to pass discard/trim requests to the
         * underlying storage. Supported values are `on`/`ignore` (defaults
         * to `ignore`).
         * 
         * @return builder
         * 
         */
        public Builder discard(String discard) {
            return discard(Output.of(discard));
        }

        /**
         * @param fileFormat The file format (defaults to `qcow2`).
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat The file format (defaults to `qcow2`).
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param fileId The file ID for a disk image. The ID format is
         * `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/centos8.img`. Can be also taken from
         * `proxmoxve.Download.File` resource.
         * 
         * @return builder
         * 
         */
        public Builder fileId(@Nullable Output<String> fileId) {
            $.fileId = fileId;
            return this;
        }

        /**
         * @param fileId The file ID for a disk image. The ID format is
         * `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/centos8.img`. Can be also taken from
         * `proxmoxve.Download.File` resource.
         * 
         * @return builder
         * 
         */
        public Builder fileId(String fileId) {
            return fileId(Output.of(fileId));
        }

        /**
         * @param interface_ The disk interface for Proxmox, currently `scsi`,
         * `sata` and `virtio` interfaces are supported. Append the disk index at
         * the end, for example, `virtio0` for the first virtio disk, `virtio1` for
         * the second, etc.
         * 
         * @return builder
         * 
         */
        public Builder interface_(Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ The disk interface for Proxmox, currently `scsi`,
         * `sata` and `virtio` interfaces are supported. Append the disk index at
         * the end, for example, `virtio0` for the first virtio disk, `virtio1` for
         * the second, etc.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param iothread Whether to use iothreads for this disk (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder iothread(@Nullable Output<Boolean> iothread) {
            $.iothread = iothread;
            return this;
        }

        /**
         * @param iothread Whether to use iothreads for this disk (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder iothread(Boolean iothread) {
            return iothread(Output.of(iothread));
        }

        /**
         * @param pathInDatastore The in-datastore path to the disk image.
         * ***Experimental.***Use to attach another VM&#39;s disks,
         * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
         * See &#34;*Example: Attached disks*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pathInDatastore(@Nullable Output<String> pathInDatastore) {
            $.pathInDatastore = pathInDatastore;
            return this;
        }

        /**
         * @param pathInDatastore The in-datastore path to the disk image.
         * ***Experimental.***Use to attach another VM&#39;s disks,
         * or (as root only) host&#39;s filesystem paths (`datastore_id` empty string).
         * See &#34;*Example: Attached disks*&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pathInDatastore(String pathInDatastore) {
            return pathInDatastore(Output.of(pathInDatastore));
        }

        /**
         * @param replicate Whether the drive should be considered for replication jobs (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder replicate(@Nullable Output<Boolean> replicate) {
            $.replicate = replicate;
            return this;
        }

        /**
         * @param replicate Whether the drive should be considered for replication jobs (defaults to `true`).
         * 
         * @return builder
         * 
         */
        public Builder replicate(Boolean replicate) {
            return replicate(Output.of(replicate));
        }

        /**
         * @param serial The serial number of the disk, up to 20 bytes long.
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial The serial number of the disk, up to 20 bytes long.
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        /**
         * @param size The disk size in gigabytes (defaults to `8`).
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The disk size in gigabytes (defaults to `8`).
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param speed The speed limits.
         * 
         * @return builder
         * 
         */
        public Builder speed(@Nullable Output<VirtualMachineDiskSpeedArgs> speed) {
            $.speed = speed;
            return this;
        }

        /**
         * @param speed The speed limits.
         * 
         * @return builder
         * 
         */
        public Builder speed(VirtualMachineDiskSpeedArgs speed) {
            return speed(Output.of(speed));
        }

        /**
         * @param ssd Whether to use an SSD emulation option for this disk (
         * defaults to `false`). Note that SSD emulation is not supported on VirtIO
         * Block drives.
         * 
         * @return builder
         * 
         */
        public Builder ssd(@Nullable Output<Boolean> ssd) {
            $.ssd = ssd;
            return this;
        }

        /**
         * @param ssd Whether to use an SSD emulation option for this disk (
         * defaults to `false`). Note that SSD emulation is not supported on VirtIO
         * Block drives.
         * 
         * @return builder
         * 
         */
        public Builder ssd(Boolean ssd) {
            return ssd(Output.of(ssd));
        }

        public VirtualMachineDiskArgs build() {
            if ($.interface_ == null) {
                throw new MissingRequiredPropertyException("VirtualMachineDiskArgs", "interface_");
            }
            return $;
        }
    }

}
