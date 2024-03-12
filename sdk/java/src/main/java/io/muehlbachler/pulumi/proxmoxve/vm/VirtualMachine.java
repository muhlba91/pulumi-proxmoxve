// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.VM.VirtualMachineArgs;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.VirtualMachineState;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineAgent;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineAudioDevice;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineCdrom;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineClone;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineCpu;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineDisk;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineEfiDisk;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineHostpci;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineInitialization;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineMemory;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineNetworkDevice;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineOperatingSystem;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineSerialDevice;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineSmbios;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineStartup;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineTpmState;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineUsb;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineVga;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a virtual machine.
 * 
 * &gt; This resource uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
 * 
 * ## Import
 * 
 * Instances can be imported using the `node_name` and the `vm_id`, e.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import proxmoxve:VM/virtualMachine:VirtualMachine ubuntu_vm first-node/4321
 * ```
 * 
 */
@ResourceType(type="proxmoxve:VM/virtualMachine:VirtualMachine")
public class VirtualMachine extends com.pulumi.resources.CustomResource {
    /**
     * Whether to enable ACPI (defaults to `true`).
     * 
     */
    @Export(name="acpi", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> acpi;

    /**
     * @return Whether to enable ACPI (defaults to `true`).
     * 
     */
    public Output<Optional<Boolean>> acpi() {
        return Codegen.optional(this.acpi);
    }
    /**
     * The QEMU agent configuration.
     * 
     */
    @Export(name="agent", refs={VirtualMachineAgent.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineAgent> agent;

    /**
     * @return The QEMU agent configuration.
     * 
     */
    public Output<Optional<VirtualMachineAgent>> agent() {
        return Codegen.optional(this.agent);
    }
    /**
     * An audio device.
     * 
     */
    @Export(name="audioDevice", refs={VirtualMachineAudioDevice.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineAudioDevice> audioDevice;

    /**
     * @return An audio device.
     * 
     */
    public Output<Optional<VirtualMachineAudioDevice>> audioDevice() {
        return Codegen.optional(this.audioDevice);
    }
    /**
     * The BIOS implementation (defaults to `seabios`).
     * 
     */
    @Export(name="bios", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bios;

    /**
     * @return The BIOS implementation (defaults to `seabios`).
     * 
     */
    public Output<Optional<String>> bios() {
        return Codegen.optional(this.bios);
    }
    /**
     * Specify a list of devices to boot from in the order
     * they appear in the list (defaults to `[]`).
     * 
     */
    @Export(name="bootOrders", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> bootOrders;

    /**
     * @return Specify a list of devices to boot from in the order
     * they appear in the list (defaults to `[]`).
     * 
     */
    public Output<Optional<List<String>>> bootOrders() {
        return Codegen.optional(this.bootOrders);
    }
    /**
     * The CDROM configuration.
     * 
     */
    @Export(name="cdrom", refs={VirtualMachineCdrom.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineCdrom> cdrom;

    /**
     * @return The CDROM configuration.
     * 
     */
    public Output<Optional<VirtualMachineCdrom>> cdrom() {
        return Codegen.optional(this.cdrom);
    }
    /**
     * The cloning configuration.
     * 
     */
    @Export(name="clone", refs={VirtualMachineClone.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineClone> clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Output<Optional<VirtualMachineClone>> clone_() {
        return Codegen.optional(this.clone);
    }
    /**
     * The CPU configuration.
     * 
     */
    @Export(name="cpu", refs={VirtualMachineCpu.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineCpu> cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Output<Optional<VirtualMachineCpu>> cpu() {
        return Codegen.optional(this.cpu);
    }
    /**
     * The description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A disk (multiple blocks supported).
     * 
     */
    @Export(name="disks", refs={List.class,VirtualMachineDisk.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineDisk>> disks;

    /**
     * @return A disk (multiple blocks supported).
     * 
     */
    public Output<Optional<List<VirtualMachineDisk>>> disks() {
        return Codegen.optional(this.disks);
    }
    /**
     * The efi disk device (required if `bios` is set
     * to `ovmf`)
     * 
     */
    @Export(name="efiDisk", refs={VirtualMachineEfiDisk.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineEfiDisk> efiDisk;

    /**
     * @return The efi disk device (required if `bios` is set
     * to `ovmf`)
     * 
     */
    public Output<Optional<VirtualMachineEfiDisk>> efiDisk() {
        return Codegen.optional(this.efiDisk);
    }
    /**
     * The identifier for a file containing a hook script (needs to be executable).
     * 
     */
    @Export(name="hookScriptFileId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hookScriptFileId;

    /**
     * @return The identifier for a file containing a hook script (needs to be executable).
     * 
     */
    public Output<Optional<String>> hookScriptFileId() {
        return Codegen.optional(this.hookScriptFileId);
    }
    /**
     * A host PCI device mapping (multiple blocks supported).
     * 
     */
    @Export(name="hostpcis", refs={List.class,VirtualMachineHostpci.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineHostpci>> hostpcis;

    /**
     * @return A host PCI device mapping (multiple blocks supported).
     * 
     */
    public Output<Optional<List<VirtualMachineHostpci>>> hostpcis() {
        return Codegen.optional(this.hostpcis);
    }
    /**
     * The cloud-init configuration.
     * 
     */
    @Export(name="initialization", refs={VirtualMachineInitialization.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineInitialization> initialization;

    /**
     * @return The cloud-init configuration.
     * 
     */
    public Output<Optional<VirtualMachineInitialization>> initialization() {
        return Codegen.optional(this.initialization);
    }
    /**
     * The IPv4 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     * 
     */
    @Export(name="ipv4Addresses", refs={List.class,String.class}, tree="[0,[0,1]]")
    private Output<List<List<String>>> ipv4Addresses;

    /**
     * @return The IPv4 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     * 
     */
    public Output<List<List<String>>> ipv4Addresses() {
        return this.ipv4Addresses;
    }
    /**
     * The IPv6 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     * 
     */
    @Export(name="ipv6Addresses", refs={List.class,String.class}, tree="[0,[0,1]]")
    private Output<List<List<String>>> ipv6Addresses;

    /**
     * @return The IPv6 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     * 
     */
    public Output<List<List<String>>> ipv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * The keyboard layout (defaults to `en-us`).
     * 
     */
    @Export(name="keyboardLayout", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyboardLayout;

    /**
     * @return The keyboard layout (defaults to `en-us`).
     * 
     */
    public Output<Optional<String>> keyboardLayout() {
        return Codegen.optional(this.keyboardLayout);
    }
    /**
     * Arbitrary arguments passed to kvm.
     * 
     */
    @Export(name="kvmArguments", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kvmArguments;

    /**
     * @return Arbitrary arguments passed to kvm.
     * 
     */
    public Output<Optional<String>> kvmArguments() {
        return Codegen.optional(this.kvmArguments);
    }
    /**
     * The MAC addresses published by the QEMU agent with fallback
     * to the network device configuration, if the agent is disabled
     * 
     */
    @Export(name="macAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> macAddresses;

    /**
     * @return The MAC addresses published by the QEMU agent with fallback
     * to the network device configuration, if the agent is disabled
     * 
     */
    public Output<List<String>> macAddresses() {
        return this.macAddresses;
    }
    /**
     * The VM machine type (defaults to `pc`).
     * 
     */
    @Export(name="machine", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> machine;

    /**
     * @return The VM machine type (defaults to `pc`).
     * 
     */
    public Output<Optional<String>> machine() {
        return Codegen.optional(this.machine);
    }
    /**
     * The VGA memory in megabytes (defaults to `16`).
     * 
     */
    @Export(name="memory", refs={VirtualMachineMemory.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineMemory> memory;

    /**
     * @return The VGA memory in megabytes (defaults to `16`).
     * 
     */
    public Output<Optional<VirtualMachineMemory>> memory() {
        return Codegen.optional(this.memory);
    }
    /**
     * Migrate the VM on node change instead of re-creating
     * it (defaults to `false`).
     * 
     */
    @Export(name="migrate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> migrate;

    /**
     * @return Migrate the VM on node change instead of re-creating
     * it (defaults to `false`).
     * 
     */
    public Output<Optional<Boolean>> migrate() {
        return Codegen.optional(this.migrate);
    }
    /**
     * The virtual machine name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The virtual machine name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A network device (multiple blocks supported).
     * 
     */
    @Export(name="networkDevices", refs={List.class,VirtualMachineNetworkDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineNetworkDevice>> networkDevices;

    /**
     * @return A network device (multiple blocks supported).
     * 
     */
    public Output<Optional<List<VirtualMachineNetworkDevice>>> networkDevices() {
        return Codegen.optional(this.networkDevices);
    }
    /**
     * The network interface names published by the QEMU
     * agent (empty list when `agent.enabled` is `false`)
     * 
     */
    @Export(name="networkInterfaceNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> networkInterfaceNames;

    /**
     * @return The network interface names published by the QEMU
     * agent (empty list when `agent.enabled` is `false`)
     * 
     */
    public Output<List<String>> networkInterfaceNames() {
        return this.networkInterfaceNames;
    }
    /**
     * The name of the node to assign the virtual machine
     * to.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return The name of the node to assign the virtual machine
     * to.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * Specifies whether a VM will be started during system
     * boot. (defaults to `true`)
     * 
     */
    @Export(name="onBoot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onBoot;

    /**
     * @return Specifies whether a VM will be started during system
     * boot. (defaults to `true`)
     * 
     */
    public Output<Optional<Boolean>> onBoot() {
        return Codegen.optional(this.onBoot);
    }
    /**
     * The Operating System configuration.
     * 
     */
    @Export(name="operatingSystem", refs={VirtualMachineOperatingSystem.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineOperatingSystem> operatingSystem;

    /**
     * @return The Operating System configuration.
     * 
     */
    public Output<Optional<VirtualMachineOperatingSystem>> operatingSystem() {
        return Codegen.optional(this.operatingSystem);
    }
    /**
     * The identifier for a pool to assign the virtual machine
     * to.
     * 
     */
    @Export(name="poolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> poolId;

    /**
     * @return The identifier for a pool to assign the virtual machine
     * to.
     * 
     */
    public Output<Optional<String>> poolId() {
        return Codegen.optional(this.poolId);
    }
    /**
     * Reboot the VM after initial creation. (defaults
     * to `false`)
     * 
     */
    @Export(name="reboot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> reboot;

    /**
     * @return Reboot the VM after initial creation. (defaults
     * to `false`)
     * 
     */
    public Output<Optional<Boolean>> reboot() {
        return Codegen.optional(this.reboot);
    }
    /**
     * The SCSI hardware type (defaults to
     * `virtio-scsi-pci`).
     * 
     */
    @Export(name="scsiHardware", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scsiHardware;

    /**
     * @return The SCSI hardware type (defaults to
     * `virtio-scsi-pci`).
     * 
     */
    public Output<Optional<String>> scsiHardware() {
        return Codegen.optional(this.scsiHardware);
    }
    /**
     * A serial device (multiple blocks supported).
     * 
     */
    @Export(name="serialDevices", refs={List.class,VirtualMachineSerialDevice.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineSerialDevice>> serialDevices;

    /**
     * @return A serial device (multiple blocks supported).
     * 
     */
    public Output<Optional<List<VirtualMachineSerialDevice>>> serialDevices() {
        return Codegen.optional(this.serialDevices);
    }
    /**
     * The SMBIOS (type1) settings for the VM.
     * 
     */
    @Export(name="smbios", refs={VirtualMachineSmbios.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineSmbios> smbios;

    /**
     * @return The SMBIOS (type1) settings for the VM.
     * 
     */
    public Output<Optional<VirtualMachineSmbios>> smbios() {
        return Codegen.optional(this.smbios);
    }
    /**
     * Whether to start the virtual machine (defaults
     * to `true`).
     * 
     */
    @Export(name="started", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> started;

    /**
     * @return Whether to start the virtual machine (defaults
     * to `true`).
     * 
     */
    public Output<Optional<Boolean>> started() {
        return Codegen.optional(this.started);
    }
    /**
     * Defines startup and shutdown behavior of the VM.
     * 
     */
    @Export(name="startup", refs={VirtualMachineStartup.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineStartup> startup;

    /**
     * @return Defines startup and shutdown behavior of the VM.
     * 
     */
    public Output<Optional<VirtualMachineStartup>> startup() {
        return Codegen.optional(this.startup);
    }
    /**
     * Whether to stop rather than shutdown on VM destroy (defaults to `false`)
     * 
     */
    @Export(name="stopOnDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> stopOnDestroy;

    /**
     * @return Whether to stop rather than shutdown on VM destroy (defaults to `false`)
     * 
     */
    public Output<Optional<Boolean>> stopOnDestroy() {
        return Codegen.optional(this.stopOnDestroy);
    }
    /**
     * Whether to enable the USB tablet device (defaults
     * to `true`).
     * 
     */
    @Export(name="tabletDevice", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tabletDevice;

    /**
     * @return Whether to enable the USB tablet device (defaults
     * to `true`).
     * 
     */
    public Output<Optional<Boolean>> tabletDevice() {
        return Codegen.optional(this.tabletDevice);
    }
    /**
     * A list of tags of the VM. This is only meta information (
     * defaults to `[]`). Note: Proxmox always sorts the VM tags. If the list in
     * template is not sorted, then Proxmox will always report a difference on the
     * resource. You may use the `ignore_changes` lifecycle meta-argument to ignore
     * changes to this attribute.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags of the VM. This is only meta information (
     * defaults to `[]`). Note: Proxmox always sorts the VM tags. If the list in
     * template is not sorted, then Proxmox will always report a difference on the
     * resource. You may use the `ignore_changes` lifecycle meta-argument to ignore
     * changes to this attribute.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether to create a template (defaults to `false`).
     * 
     */
    @Export(name="template", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> template;

    /**
     * @return Whether to create a template (defaults to `false`).
     * 
     */
    public Output<Optional<Boolean>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * Timeout for cloning a VM in seconds (defaults to
     * 1800).
     * 
     */
    @Export(name="timeoutClone", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutClone;

    /**
     * @return Timeout for cloning a VM in seconds (defaults to
     * 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutClone() {
        return Codegen.optional(this.timeoutClone);
    }
    /**
     * Timeout for creating a VM in seconds (defaults to
     * 1800).
     * 
     */
    @Export(name="timeoutCreate", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutCreate;

    /**
     * @return Timeout for creating a VM in seconds (defaults to
     * 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutCreate() {
        return Codegen.optional(this.timeoutCreate);
    }
    /**
     * Timeout for migrating the VM (defaults to
     * 1800).
     * 
     */
    @Export(name="timeoutMigrate", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutMigrate;

    /**
     * @return Timeout for migrating the VM (defaults to
     * 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutMigrate() {
        return Codegen.optional(this.timeoutMigrate);
    }
    /**
     * Timeout for moving the disk of a VM in
     * seconds (defaults to 1800).
     * 
     */
    @Export(name="timeoutMoveDisk", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutMoveDisk;

    /**
     * @return Timeout for moving the disk of a VM in
     * seconds (defaults to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutMoveDisk() {
        return Codegen.optional(this.timeoutMoveDisk);
    }
    /**
     * Timeout for rebooting a VM in seconds (defaults
     * to 1800).
     * 
     */
    @Export(name="timeoutReboot", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutReboot;

    /**
     * @return Timeout for rebooting a VM in seconds (defaults
     * to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutReboot() {
        return Codegen.optional(this.timeoutReboot);
    }
    /**
     * Timeout for shutting down a VM in seconds (
     * defaults to 1800).
     * 
     */
    @Export(name="timeoutShutdownVm", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutShutdownVm;

    /**
     * @return Timeout for shutting down a VM in seconds (
     * defaults to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutShutdownVm() {
        return Codegen.optional(this.timeoutShutdownVm);
    }
    /**
     * Timeout for starting a VM in seconds (defaults
     * to 1800).
     * 
     */
    @Export(name="timeoutStartVm", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutStartVm;

    /**
     * @return Timeout for starting a VM in seconds (defaults
     * to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutStartVm() {
        return Codegen.optional(this.timeoutStartVm);
    }
    /**
     * Timeout for stopping a VM in seconds (defaults
     * to 300).
     * 
     */
    @Export(name="timeoutStopVm", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutStopVm;

    /**
     * @return Timeout for stopping a VM in seconds (defaults
     * to 300).
     * 
     */
    public Output<Optional<Integer>> timeoutStopVm() {
        return Codegen.optional(this.timeoutStopVm);
    }
    /**
     * The TPM state device.
     * 
     */
    @Export(name="tpmState", refs={VirtualMachineTpmState.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineTpmState> tpmState;

    /**
     * @return The TPM state device.
     * 
     */
    public Output<Optional<VirtualMachineTpmState>> tpmState() {
        return Codegen.optional(this.tpmState);
    }
    /**
     * A host USB device mapping (multiple blocks supported).
     * 
     */
    @Export(name="usbs", refs={List.class,VirtualMachineUsb.class}, tree="[0,1]")
    private Output</* @Nullable */ List<VirtualMachineUsb>> usbs;

    /**
     * @return A host USB device mapping (multiple blocks supported).
     * 
     */
    public Output<Optional<List<VirtualMachineUsb>>> usbs() {
        return Codegen.optional(this.usbs);
    }
    /**
     * The VGA configuration.
     * 
     */
    @Export(name="vga", refs={VirtualMachineVga.class}, tree="[0]")
    private Output</* @Nullable */ VirtualMachineVga> vga;

    /**
     * @return The VGA configuration.
     * 
     */
    public Output<Optional<VirtualMachineVga>> vga() {
        return Codegen.optional(this.vga);
    }
    /**
     * The VM identifier.
     * 
     */
    @Export(name="vmId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vmId;

    /**
     * @return The VM identifier.
     * 
     */
    public Output<Integer> vmId() {
        return this.vmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachine(String name) {
        this(name, VirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachine(String name, VirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:VM/virtualMachine:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachine(String name, Output<String> id, @Nullable VirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:VM/virtualMachine:VirtualMachine", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachine get(String name, Output<String> id, @Nullable VirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, state, options);
    }
}
