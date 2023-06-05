// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineAgentArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineAudioDeviceArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineCdromArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineCloneArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineCpuArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineDiskArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineHostpciArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineInitializationArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineMemoryArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineNetworkDeviceArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineOperatingSystemArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineSerialDeviceArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineVgaArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Whether to enable ACPI
     * 
     */
    @Import(name="acpi")
    private @Nullable Output<Boolean> acpi;

    /**
     * @return Whether to enable ACPI
     * 
     */
    public Optional<Output<Boolean>> acpi() {
        return Optional.ofNullable(this.acpi);
    }

    /**
     * The QEMU agent configuration
     * 
     */
    @Import(name="agent")
    private @Nullable Output<VirtualMachineAgentArgs> agent;

    /**
     * @return The QEMU agent configuration
     * 
     */
    public Optional<Output<VirtualMachineAgentArgs>> agent() {
        return Optional.ofNullable(this.agent);
    }

    /**
     * The audio devices
     * 
     */
    @Import(name="audioDevice")
    private @Nullable Output<VirtualMachineAudioDeviceArgs> audioDevice;

    /**
     * @return The audio devices
     * 
     */
    public Optional<Output<VirtualMachineAudioDeviceArgs>> audioDevice() {
        return Optional.ofNullable(this.audioDevice);
    }

    /**
     * The BIOS implementation
     * 
     */
    @Import(name="bios")
    private @Nullable Output<String> bios;

    /**
     * @return The BIOS implementation
     * 
     */
    public Optional<Output<String>> bios() {
        return Optional.ofNullable(this.bios);
    }

    /**
     * The guest will attempt to boot from devices in the order they appear here
     * 
     */
    @Import(name="bootOrders")
    private @Nullable Output<List<String>> bootOrders;

    /**
     * @return The guest will attempt to boot from devices in the order they appear here
     * 
     */
    public Optional<Output<List<String>>> bootOrders() {
        return Optional.ofNullable(this.bootOrders);
    }

    /**
     * The CDROM drive
     * 
     */
    @Import(name="cdrom")
    private @Nullable Output<VirtualMachineCdromArgs> cdrom;

    /**
     * @return The CDROM drive
     * 
     */
    public Optional<Output<VirtualMachineCdromArgs>> cdrom() {
        return Optional.ofNullable(this.cdrom);
    }

    /**
     * The cloning configuration
     * 
     */
    @Import(name="clone")
    private @Nullable Output<VirtualMachineCloneArgs> clone;

    /**
     * @return The cloning configuration
     * 
     */
    public Optional<Output<VirtualMachineCloneArgs>> clone_() {
        return Optional.ofNullable(this.clone);
    }

    /**
     * The CPU allocation
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<VirtualMachineCpuArgs> cpu;

    /**
     * @return The CPU allocation
     * 
     */
    public Optional<Output<VirtualMachineCpuArgs>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The disk devices
     * 
     */
    @Import(name="disks")
    private @Nullable Output<List<VirtualMachineDiskArgs>> disks;

    /**
     * @return The disk devices
     * 
     */
    public Optional<Output<List<VirtualMachineDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * The Host PCI devices mapped to the VM
     * 
     */
    @Import(name="hostpcis")
    private @Nullable Output<List<VirtualMachineHostpciArgs>> hostpcis;

    /**
     * @return The Host PCI devices mapped to the VM
     * 
     */
    public Optional<Output<List<VirtualMachineHostpciArgs>>> hostpcis() {
        return Optional.ofNullable(this.hostpcis);
    }

    /**
     * The cloud-init configuration
     * 
     */
    @Import(name="initialization")
    private @Nullable Output<VirtualMachineInitializationArgs> initialization;

    /**
     * @return The cloud-init configuration
     * 
     */
    public Optional<Output<VirtualMachineInitializationArgs>> initialization() {
        return Optional.ofNullable(this.initialization);
    }

    /**
     * The keyboard layout
     * 
     */
    @Import(name="keyboardLayout")
    private @Nullable Output<String> keyboardLayout;

    /**
     * @return The keyboard layout
     * 
     */
    public Optional<Output<String>> keyboardLayout() {
        return Optional.ofNullable(this.keyboardLayout);
    }

    /**
     * The args implementation
     * 
     */
    @Import(name="kvmArguments")
    private @Nullable Output<String> kvmArguments;

    /**
     * @return The args implementation
     * 
     */
    public Optional<Output<String>> kvmArguments() {
        return Optional.ofNullable(this.kvmArguments);
    }

    /**
     * The VM machine type, either default i440fx or q35
     * 
     */
    @Import(name="machine")
    private @Nullable Output<String> machine;

    /**
     * @return The VM machine type, either default i440fx or q35
     * 
     */
    public Optional<Output<String>> machine() {
        return Optional.ofNullable(this.machine);
    }

    /**
     * The memory allocation
     * 
     */
    @Import(name="memory")
    private @Nullable Output<VirtualMachineMemoryArgs> memory;

    /**
     * @return The memory allocation
     * 
     */
    public Optional<Output<VirtualMachineMemoryArgs>> memory() {
        return Optional.ofNullable(this.memory);
    }

    /**
     * The name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network devices
     * 
     */
    @Import(name="networkDevices")
    private @Nullable Output<List<VirtualMachineNetworkDeviceArgs>> networkDevices;

    /**
     * @return The network devices
     * 
     */
    public Optional<Output<List<VirtualMachineNetworkDeviceArgs>>> networkDevices() {
        return Optional.ofNullable(this.networkDevices);
    }

    /**
     * The node name
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The node name
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    /**
     * Start VM on Node boot
     * 
     */
    @Import(name="onBoot")
    private @Nullable Output<Boolean> onBoot;

    /**
     * @return Start VM on Node boot
     * 
     */
    public Optional<Output<Boolean>> onBoot() {
        return Optional.ofNullable(this.onBoot);
    }

    /**
     * The operating system configuration
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable Output<VirtualMachineOperatingSystemArgs> operatingSystem;

    /**
     * @return The operating system configuration
     * 
     */
    public Optional<Output<VirtualMachineOperatingSystemArgs>> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * The ID of the pool to assign the virtual machine to
     * 
     */
    @Import(name="poolId")
    private @Nullable Output<String> poolId;

    /**
     * @return The ID of the pool to assign the virtual machine to
     * 
     */
    public Optional<Output<String>> poolId() {
        return Optional.ofNullable(this.poolId);
    }

    /**
     * Whether to reboot vm after creation
     * 
     */
    @Import(name="reboot")
    private @Nullable Output<Boolean> reboot;

    /**
     * @return Whether to reboot vm after creation
     * 
     */
    public Optional<Output<Boolean>> reboot() {
        return Optional.ofNullable(this.reboot);
    }

    /**
     * The SCSI hardware type
     * 
     */
    @Import(name="scsiHardware")
    private @Nullable Output<String> scsiHardware;

    /**
     * @return The SCSI hardware type
     * 
     */
    public Optional<Output<String>> scsiHardware() {
        return Optional.ofNullable(this.scsiHardware);
    }

    /**
     * The serial devices
     * 
     */
    @Import(name="serialDevices")
    private @Nullable Output<List<VirtualMachineSerialDeviceArgs>> serialDevices;

    /**
     * @return The serial devices
     * 
     */
    public Optional<Output<List<VirtualMachineSerialDeviceArgs>>> serialDevices() {
        return Optional.ofNullable(this.serialDevices);
    }

    /**
     * Whether to start the virtual machine
     * 
     */
    @Import(name="started")
    private @Nullable Output<Boolean> started;

    /**
     * @return Whether to start the virtual machine
     * 
     */
    public Optional<Output<Boolean>> started() {
        return Optional.ofNullable(this.started);
    }

    /**
     * Whether to enable the USB tablet device
     * 
     */
    @Import(name="tabletDevice")
    private @Nullable Output<Boolean> tabletDevice;

    /**
     * @return Whether to enable the USB tablet device
     * 
     */
    public Optional<Output<Boolean>> tabletDevice() {
        return Optional.ofNullable(this.tabletDevice);
    }

    /**
     * Tags of the virtual machine. This is only meta information.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags of the virtual machine. This is only meta information.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether to create a template
     * 
     */
    @Import(name="template")
    private @Nullable Output<Boolean> template;

    /**
     * @return Whether to create a template
     * 
     */
    public Optional<Output<Boolean>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * Clone VM timeout
     * 
     */
    @Import(name="timeoutClone")
    private @Nullable Output<Integer> timeoutClone;

    /**
     * @return Clone VM timeout
     * 
     */
    public Optional<Output<Integer>> timeoutClone() {
        return Optional.ofNullable(this.timeoutClone);
    }

    /**
     * MoveDisk timeout
     * 
     */
    @Import(name="timeoutMoveDisk")
    private @Nullable Output<Integer> timeoutMoveDisk;

    /**
     * @return MoveDisk timeout
     * 
     */
    public Optional<Output<Integer>> timeoutMoveDisk() {
        return Optional.ofNullable(this.timeoutMoveDisk);
    }

    /**
     * Reboot timeout
     * 
     */
    @Import(name="timeoutReboot")
    private @Nullable Output<Integer> timeoutReboot;

    /**
     * @return Reboot timeout
     * 
     */
    public Optional<Output<Integer>> timeoutReboot() {
        return Optional.ofNullable(this.timeoutReboot);
    }

    /**
     * Shutdown timeout
     * 
     */
    @Import(name="timeoutShutdownVm")
    private @Nullable Output<Integer> timeoutShutdownVm;

    /**
     * @return Shutdown timeout
     * 
     */
    public Optional<Output<Integer>> timeoutShutdownVm() {
        return Optional.ofNullable(this.timeoutShutdownVm);
    }

    /**
     * Start VM timeout
     * 
     */
    @Import(name="timeoutStartVm")
    private @Nullable Output<Integer> timeoutStartVm;

    /**
     * @return Start VM timeout
     * 
     */
    public Optional<Output<Integer>> timeoutStartVm() {
        return Optional.ofNullable(this.timeoutStartVm);
    }

    /**
     * Stop VM timeout
     * 
     */
    @Import(name="timeoutStopVm")
    private @Nullable Output<Integer> timeoutStopVm;

    /**
     * @return Stop VM timeout
     * 
     */
    public Optional<Output<Integer>> timeoutStopVm() {
        return Optional.ofNullable(this.timeoutStopVm);
    }

    /**
     * The VGA configuration
     * 
     */
    @Import(name="vga")
    private @Nullable Output<VirtualMachineVgaArgs> vga;

    /**
     * @return The VGA configuration
     * 
     */
    public Optional<Output<VirtualMachineVgaArgs>> vga() {
        return Optional.ofNullable(this.vga);
    }

    /**
     * The VM identifier
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<Integer> vmId;

    /**
     * @return The VM identifier
     * 
     */
    public Optional<Output<Integer>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private VirtualMachineArgs() {}

    private VirtualMachineArgs(VirtualMachineArgs $) {
        this.acpi = $.acpi;
        this.agent = $.agent;
        this.audioDevice = $.audioDevice;
        this.bios = $.bios;
        this.bootOrders = $.bootOrders;
        this.cdrom = $.cdrom;
        this.clone = $.clone;
        this.cpu = $.cpu;
        this.description = $.description;
        this.disks = $.disks;
        this.hostpcis = $.hostpcis;
        this.initialization = $.initialization;
        this.keyboardLayout = $.keyboardLayout;
        this.kvmArguments = $.kvmArguments;
        this.machine = $.machine;
        this.memory = $.memory;
        this.name = $.name;
        this.networkDevices = $.networkDevices;
        this.nodeName = $.nodeName;
        this.onBoot = $.onBoot;
        this.operatingSystem = $.operatingSystem;
        this.poolId = $.poolId;
        this.reboot = $.reboot;
        this.scsiHardware = $.scsiHardware;
        this.serialDevices = $.serialDevices;
        this.started = $.started;
        this.tabletDevice = $.tabletDevice;
        this.tags = $.tags;
        this.template = $.template;
        this.timeoutClone = $.timeoutClone;
        this.timeoutMoveDisk = $.timeoutMoveDisk;
        this.timeoutReboot = $.timeoutReboot;
        this.timeoutShutdownVm = $.timeoutShutdownVm;
        this.timeoutStartVm = $.timeoutStartVm;
        this.timeoutStopVm = $.timeoutStopVm;
        this.vga = $.vga;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineArgs $;

        public Builder() {
            $ = new VirtualMachineArgs();
        }

        public Builder(VirtualMachineArgs defaults) {
            $ = new VirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acpi Whether to enable ACPI
         * 
         * @return builder
         * 
         */
        public Builder acpi(@Nullable Output<Boolean> acpi) {
            $.acpi = acpi;
            return this;
        }

        /**
         * @param acpi Whether to enable ACPI
         * 
         * @return builder
         * 
         */
        public Builder acpi(Boolean acpi) {
            return acpi(Output.of(acpi));
        }

        /**
         * @param agent The QEMU agent configuration
         * 
         * @return builder
         * 
         */
        public Builder agent(@Nullable Output<VirtualMachineAgentArgs> agent) {
            $.agent = agent;
            return this;
        }

        /**
         * @param agent The QEMU agent configuration
         * 
         * @return builder
         * 
         */
        public Builder agent(VirtualMachineAgentArgs agent) {
            return agent(Output.of(agent));
        }

        /**
         * @param audioDevice The audio devices
         * 
         * @return builder
         * 
         */
        public Builder audioDevice(@Nullable Output<VirtualMachineAudioDeviceArgs> audioDevice) {
            $.audioDevice = audioDevice;
            return this;
        }

        /**
         * @param audioDevice The audio devices
         * 
         * @return builder
         * 
         */
        public Builder audioDevice(VirtualMachineAudioDeviceArgs audioDevice) {
            return audioDevice(Output.of(audioDevice));
        }

        /**
         * @param bios The BIOS implementation
         * 
         * @return builder
         * 
         */
        public Builder bios(@Nullable Output<String> bios) {
            $.bios = bios;
            return this;
        }

        /**
         * @param bios The BIOS implementation
         * 
         * @return builder
         * 
         */
        public Builder bios(String bios) {
            return bios(Output.of(bios));
        }

        /**
         * @param bootOrders The guest will attempt to boot from devices in the order they appear here
         * 
         * @return builder
         * 
         */
        public Builder bootOrders(@Nullable Output<List<String>> bootOrders) {
            $.bootOrders = bootOrders;
            return this;
        }

        /**
         * @param bootOrders The guest will attempt to boot from devices in the order they appear here
         * 
         * @return builder
         * 
         */
        public Builder bootOrders(List<String> bootOrders) {
            return bootOrders(Output.of(bootOrders));
        }

        /**
         * @param bootOrders The guest will attempt to boot from devices in the order they appear here
         * 
         * @return builder
         * 
         */
        public Builder bootOrders(String... bootOrders) {
            return bootOrders(List.of(bootOrders));
        }

        /**
         * @param cdrom The CDROM drive
         * 
         * @return builder
         * 
         */
        public Builder cdrom(@Nullable Output<VirtualMachineCdromArgs> cdrom) {
            $.cdrom = cdrom;
            return this;
        }

        /**
         * @param cdrom The CDROM drive
         * 
         * @return builder
         * 
         */
        public Builder cdrom(VirtualMachineCdromArgs cdrom) {
            return cdrom(Output.of(cdrom));
        }

        /**
         * @param clone The cloning configuration
         * 
         * @return builder
         * 
         */
        public Builder clone_(@Nullable Output<VirtualMachineCloneArgs> clone) {
            $.clone = clone;
            return this;
        }

        /**
         * @param clone The cloning configuration
         * 
         * @return builder
         * 
         */
        public Builder clone_(VirtualMachineCloneArgs clone) {
            return clone_(Output.of(clone));
        }

        /**
         * @param cpu The CPU allocation
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<VirtualMachineCpuArgs> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The CPU allocation
         * 
         * @return builder
         * 
         */
        public Builder cpu(VirtualMachineCpuArgs cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param description The description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disks The disk devices
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable Output<List<VirtualMachineDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks The disk devices
         * 
         * @return builder
         * 
         */
        public Builder disks(List<VirtualMachineDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        /**
         * @param disks The disk devices
         * 
         * @return builder
         * 
         */
        public Builder disks(VirtualMachineDiskArgs... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param hostpcis The Host PCI devices mapped to the VM
         * 
         * @return builder
         * 
         */
        public Builder hostpcis(@Nullable Output<List<VirtualMachineHostpciArgs>> hostpcis) {
            $.hostpcis = hostpcis;
            return this;
        }

        /**
         * @param hostpcis The Host PCI devices mapped to the VM
         * 
         * @return builder
         * 
         */
        public Builder hostpcis(List<VirtualMachineHostpciArgs> hostpcis) {
            return hostpcis(Output.of(hostpcis));
        }

        /**
         * @param hostpcis The Host PCI devices mapped to the VM
         * 
         * @return builder
         * 
         */
        public Builder hostpcis(VirtualMachineHostpciArgs... hostpcis) {
            return hostpcis(List.of(hostpcis));
        }

        /**
         * @param initialization The cloud-init configuration
         * 
         * @return builder
         * 
         */
        public Builder initialization(@Nullable Output<VirtualMachineInitializationArgs> initialization) {
            $.initialization = initialization;
            return this;
        }

        /**
         * @param initialization The cloud-init configuration
         * 
         * @return builder
         * 
         */
        public Builder initialization(VirtualMachineInitializationArgs initialization) {
            return initialization(Output.of(initialization));
        }

        /**
         * @param keyboardLayout The keyboard layout
         * 
         * @return builder
         * 
         */
        public Builder keyboardLayout(@Nullable Output<String> keyboardLayout) {
            $.keyboardLayout = keyboardLayout;
            return this;
        }

        /**
         * @param keyboardLayout The keyboard layout
         * 
         * @return builder
         * 
         */
        public Builder keyboardLayout(String keyboardLayout) {
            return keyboardLayout(Output.of(keyboardLayout));
        }

        /**
         * @param kvmArguments The args implementation
         * 
         * @return builder
         * 
         */
        public Builder kvmArguments(@Nullable Output<String> kvmArguments) {
            $.kvmArguments = kvmArguments;
            return this;
        }

        /**
         * @param kvmArguments The args implementation
         * 
         * @return builder
         * 
         */
        public Builder kvmArguments(String kvmArguments) {
            return kvmArguments(Output.of(kvmArguments));
        }

        /**
         * @param machine The VM machine type, either default i440fx or q35
         * 
         * @return builder
         * 
         */
        public Builder machine(@Nullable Output<String> machine) {
            $.machine = machine;
            return this;
        }

        /**
         * @param machine The VM machine type, either default i440fx or q35
         * 
         * @return builder
         * 
         */
        public Builder machine(String machine) {
            return machine(Output.of(machine));
        }

        /**
         * @param memory The memory allocation
         * 
         * @return builder
         * 
         */
        public Builder memory(@Nullable Output<VirtualMachineMemoryArgs> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The memory allocation
         * 
         * @return builder
         * 
         */
        public Builder memory(VirtualMachineMemoryArgs memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkDevices The network devices
         * 
         * @return builder
         * 
         */
        public Builder networkDevices(@Nullable Output<List<VirtualMachineNetworkDeviceArgs>> networkDevices) {
            $.networkDevices = networkDevices;
            return this;
        }

        /**
         * @param networkDevices The network devices
         * 
         * @return builder
         * 
         */
        public Builder networkDevices(List<VirtualMachineNetworkDeviceArgs> networkDevices) {
            return networkDevices(Output.of(networkDevices));
        }

        /**
         * @param networkDevices The network devices
         * 
         * @return builder
         * 
         */
        public Builder networkDevices(VirtualMachineNetworkDeviceArgs... networkDevices) {
            return networkDevices(List.of(networkDevices));
        }

        /**
         * @param nodeName The node name
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The node name
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param onBoot Start VM on Node boot
         * 
         * @return builder
         * 
         */
        public Builder onBoot(@Nullable Output<Boolean> onBoot) {
            $.onBoot = onBoot;
            return this;
        }

        /**
         * @param onBoot Start VM on Node boot
         * 
         * @return builder
         * 
         */
        public Builder onBoot(Boolean onBoot) {
            return onBoot(Output.of(onBoot));
        }

        /**
         * @param operatingSystem The operating system configuration
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable Output<VirtualMachineOperatingSystemArgs> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem The operating system configuration
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(VirtualMachineOperatingSystemArgs operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param poolId The ID of the pool to assign the virtual machine to
         * 
         * @return builder
         * 
         */
        public Builder poolId(@Nullable Output<String> poolId) {
            $.poolId = poolId;
            return this;
        }

        /**
         * @param poolId The ID of the pool to assign the virtual machine to
         * 
         * @return builder
         * 
         */
        public Builder poolId(String poolId) {
            return poolId(Output.of(poolId));
        }

        /**
         * @param reboot Whether to reboot vm after creation
         * 
         * @return builder
         * 
         */
        public Builder reboot(@Nullable Output<Boolean> reboot) {
            $.reboot = reboot;
            return this;
        }

        /**
         * @param reboot Whether to reboot vm after creation
         * 
         * @return builder
         * 
         */
        public Builder reboot(Boolean reboot) {
            return reboot(Output.of(reboot));
        }

        /**
         * @param scsiHardware The SCSI hardware type
         * 
         * @return builder
         * 
         */
        public Builder scsiHardware(@Nullable Output<String> scsiHardware) {
            $.scsiHardware = scsiHardware;
            return this;
        }

        /**
         * @param scsiHardware The SCSI hardware type
         * 
         * @return builder
         * 
         */
        public Builder scsiHardware(String scsiHardware) {
            return scsiHardware(Output.of(scsiHardware));
        }

        /**
         * @param serialDevices The serial devices
         * 
         * @return builder
         * 
         */
        public Builder serialDevices(@Nullable Output<List<VirtualMachineSerialDeviceArgs>> serialDevices) {
            $.serialDevices = serialDevices;
            return this;
        }

        /**
         * @param serialDevices The serial devices
         * 
         * @return builder
         * 
         */
        public Builder serialDevices(List<VirtualMachineSerialDeviceArgs> serialDevices) {
            return serialDevices(Output.of(serialDevices));
        }

        /**
         * @param serialDevices The serial devices
         * 
         * @return builder
         * 
         */
        public Builder serialDevices(VirtualMachineSerialDeviceArgs... serialDevices) {
            return serialDevices(List.of(serialDevices));
        }

        /**
         * @param started Whether to start the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder started(@Nullable Output<Boolean> started) {
            $.started = started;
            return this;
        }

        /**
         * @param started Whether to start the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder started(Boolean started) {
            return started(Output.of(started));
        }

        /**
         * @param tabletDevice Whether to enable the USB tablet device
         * 
         * @return builder
         * 
         */
        public Builder tabletDevice(@Nullable Output<Boolean> tabletDevice) {
            $.tabletDevice = tabletDevice;
            return this;
        }

        /**
         * @param tabletDevice Whether to enable the USB tablet device
         * 
         * @return builder
         * 
         */
        public Builder tabletDevice(Boolean tabletDevice) {
            return tabletDevice(Output.of(tabletDevice));
        }

        /**
         * @param tags Tags of the virtual machine. This is only meta information.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags of the virtual machine. This is only meta information.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags of the virtual machine. This is only meta information.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param template Whether to create a template
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<Boolean> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Whether to create a template
         * 
         * @return builder
         * 
         */
        public Builder template(Boolean template) {
            return template(Output.of(template));
        }

        /**
         * @param timeoutClone Clone VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutClone(@Nullable Output<Integer> timeoutClone) {
            $.timeoutClone = timeoutClone;
            return this;
        }

        /**
         * @param timeoutClone Clone VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutClone(Integer timeoutClone) {
            return timeoutClone(Output.of(timeoutClone));
        }

        /**
         * @param timeoutMoveDisk MoveDisk timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutMoveDisk(@Nullable Output<Integer> timeoutMoveDisk) {
            $.timeoutMoveDisk = timeoutMoveDisk;
            return this;
        }

        /**
         * @param timeoutMoveDisk MoveDisk timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutMoveDisk(Integer timeoutMoveDisk) {
            return timeoutMoveDisk(Output.of(timeoutMoveDisk));
        }

        /**
         * @param timeoutReboot Reboot timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutReboot(@Nullable Output<Integer> timeoutReboot) {
            $.timeoutReboot = timeoutReboot;
            return this;
        }

        /**
         * @param timeoutReboot Reboot timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutReboot(Integer timeoutReboot) {
            return timeoutReboot(Output.of(timeoutReboot));
        }

        /**
         * @param timeoutShutdownVm Shutdown timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutShutdownVm(@Nullable Output<Integer> timeoutShutdownVm) {
            $.timeoutShutdownVm = timeoutShutdownVm;
            return this;
        }

        /**
         * @param timeoutShutdownVm Shutdown timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutShutdownVm(Integer timeoutShutdownVm) {
            return timeoutShutdownVm(Output.of(timeoutShutdownVm));
        }

        /**
         * @param timeoutStartVm Start VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutStartVm(@Nullable Output<Integer> timeoutStartVm) {
            $.timeoutStartVm = timeoutStartVm;
            return this;
        }

        /**
         * @param timeoutStartVm Start VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutStartVm(Integer timeoutStartVm) {
            return timeoutStartVm(Output.of(timeoutStartVm));
        }

        /**
         * @param timeoutStopVm Stop VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutStopVm(@Nullable Output<Integer> timeoutStopVm) {
            $.timeoutStopVm = timeoutStopVm;
            return this;
        }

        /**
         * @param timeoutStopVm Stop VM timeout
         * 
         * @return builder
         * 
         */
        public Builder timeoutStopVm(Integer timeoutStopVm) {
            return timeoutStopVm(Output.of(timeoutStopVm));
        }

        /**
         * @param vga The VGA configuration
         * 
         * @return builder
         * 
         */
        public Builder vga(@Nullable Output<VirtualMachineVgaArgs> vga) {
            $.vga = vga;
            return this;
        }

        /**
         * @param vga The VGA configuration
         * 
         * @return builder
         * 
         */
        public Builder vga(VirtualMachineVgaArgs vga) {
            return vga(Output.of(vga));
        }

        /**
         * @param vmId The VM identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The VM identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public VirtualMachineArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
