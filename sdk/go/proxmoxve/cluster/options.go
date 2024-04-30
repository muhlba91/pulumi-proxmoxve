// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cluster

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages Proxmox VE Cluster Datacenter options.
//
// ## Import
//
// #!/usr/bin/env sh
//
// Cluster options are global and can be imported using e.g.:
//
// ```sh
// $ pulumi import proxmoxve:Cluster/options:Options options cluster
// ```
type Options struct {
	pulumi.CustomResourceState

	// Clone I/O bandwidth limit in KiB/s.
	BandwidthLimitClone pulumi.IntPtrOutput `pulumi:"bandwidthLimitClone"`
	// Default I/O bandwidth limit in KiB/s.
	BandwidthLimitDefault pulumi.IntPtrOutput `pulumi:"bandwidthLimitDefault"`
	// Migration I/O bandwidth limit in KiB/s.
	BandwidthLimitMigration pulumi.IntPtrOutput `pulumi:"bandwidthLimitMigration"`
	// Move I/O bandwidth limit in KiB/s.
	BandwidthLimitMove pulumi.IntPtrOutput `pulumi:"bandwidthLimitMove"`
	// Restore I/O bandwidth limit in KiB/s.
	BandwidthLimitRestore pulumi.IntPtrOutput `pulumi:"bandwidthLimitRestore"`
	// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
	Console pulumi.StringPtrOutput `pulumi:"console"`
	// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
	CrsHa pulumi.StringOutput `pulumi:"crsHa"`
	// Cluster resource scheduling setting for HA rebalance on start.
	CrsHaRebalanceOnStart pulumi.BoolPtrOutput `pulumi:"crsHaRebalanceOnStart"`
	// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// email address to send notification from (default is root@$hostname).
	EmailFrom pulumi.StringPtrOutput `pulumi:"emailFrom"`
	// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
	HaShutdownPolicy pulumi.StringPtrOutput `pulumi:"haShutdownPolicy"`
	// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
	HttpProxy pulumi.StringPtrOutput `pulumi:"httpProxy"`
	// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
	Keyboard pulumi.StringPtrOutput `pulumi:"keyboard"`
	// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
	Language pulumi.StringPtrOutput `pulumi:"language"`
	// Prefix for autogenerated MAC addresses.
	MacPrefix pulumi.StringOutput `pulumi:"macPrefix"`
	// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
	MaxWorkers pulumi.IntPtrOutput `pulumi:"maxWorkers"`
	// Cluster wide migration network CIDR.
	MigrationCidr pulumi.StringPtrOutput `pulumi:"migrationCidr"`
	// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
	MigrationType pulumi.StringPtrOutput `pulumi:"migrationType"`
	// The ranges for the next free VM ID auto-selection pool.
	NextId OptionsNextIdPtrOutput `pulumi:"nextId"`
	// Cluster-wide notification settings.
	Notify OptionsNotifyPtrOutput `pulumi:"notify"`
}

// NewOptions registers a new resource with the given unique name, arguments, and options.
func NewOptions(ctx *pulumi.Context,
	name string, args *OptionsArgs, opts ...pulumi.ResourceOption) (*Options, error) {
	if args == nil {
		args = &OptionsArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Options
	err := ctx.RegisterResource("proxmoxve:Cluster/options:Options", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOptions gets an existing Options resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOptions(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OptionsState, opts ...pulumi.ResourceOption) (*Options, error) {
	var resource Options
	err := ctx.ReadResource("proxmoxve:Cluster/options:Options", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Options resources.
type optionsState struct {
	// Clone I/O bandwidth limit in KiB/s.
	BandwidthLimitClone *int `pulumi:"bandwidthLimitClone"`
	// Default I/O bandwidth limit in KiB/s.
	BandwidthLimitDefault *int `pulumi:"bandwidthLimitDefault"`
	// Migration I/O bandwidth limit in KiB/s.
	BandwidthLimitMigration *int `pulumi:"bandwidthLimitMigration"`
	// Move I/O bandwidth limit in KiB/s.
	BandwidthLimitMove *int `pulumi:"bandwidthLimitMove"`
	// Restore I/O bandwidth limit in KiB/s.
	BandwidthLimitRestore *int `pulumi:"bandwidthLimitRestore"`
	// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
	Console *string `pulumi:"console"`
	// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
	CrsHa *string `pulumi:"crsHa"`
	// Cluster resource scheduling setting for HA rebalance on start.
	CrsHaRebalanceOnStart *bool `pulumi:"crsHaRebalanceOnStart"`
	// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
	Description *string `pulumi:"description"`
	// email address to send notification from (default is root@$hostname).
	EmailFrom *string `pulumi:"emailFrom"`
	// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
	HaShutdownPolicy *string `pulumi:"haShutdownPolicy"`
	// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
	HttpProxy *string `pulumi:"httpProxy"`
	// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
	Keyboard *string `pulumi:"keyboard"`
	// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
	Language *string `pulumi:"language"`
	// Prefix for autogenerated MAC addresses.
	MacPrefix *string `pulumi:"macPrefix"`
	// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
	MaxWorkers *int `pulumi:"maxWorkers"`
	// Cluster wide migration network CIDR.
	MigrationCidr *string `pulumi:"migrationCidr"`
	// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
	MigrationType *string `pulumi:"migrationType"`
	// The ranges for the next free VM ID auto-selection pool.
	NextId *OptionsNextId `pulumi:"nextId"`
	// Cluster-wide notification settings.
	Notify *OptionsNotify `pulumi:"notify"`
}

type OptionsState struct {
	// Clone I/O bandwidth limit in KiB/s.
	BandwidthLimitClone pulumi.IntPtrInput
	// Default I/O bandwidth limit in KiB/s.
	BandwidthLimitDefault pulumi.IntPtrInput
	// Migration I/O bandwidth limit in KiB/s.
	BandwidthLimitMigration pulumi.IntPtrInput
	// Move I/O bandwidth limit in KiB/s.
	BandwidthLimitMove pulumi.IntPtrInput
	// Restore I/O bandwidth limit in KiB/s.
	BandwidthLimitRestore pulumi.IntPtrInput
	// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
	Console pulumi.StringPtrInput
	// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
	CrsHa pulumi.StringPtrInput
	// Cluster resource scheduling setting for HA rebalance on start.
	CrsHaRebalanceOnStart pulumi.BoolPtrInput
	// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
	Description pulumi.StringPtrInput
	// email address to send notification from (default is root@$hostname).
	EmailFrom pulumi.StringPtrInput
	// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
	HaShutdownPolicy pulumi.StringPtrInput
	// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
	HttpProxy pulumi.StringPtrInput
	// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
	Keyboard pulumi.StringPtrInput
	// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
	Language pulumi.StringPtrInput
	// Prefix for autogenerated MAC addresses.
	MacPrefix pulumi.StringPtrInput
	// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
	MaxWorkers pulumi.IntPtrInput
	// Cluster wide migration network CIDR.
	MigrationCidr pulumi.StringPtrInput
	// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
	MigrationType pulumi.StringPtrInput
	// The ranges for the next free VM ID auto-selection pool.
	NextId OptionsNextIdPtrInput
	// Cluster-wide notification settings.
	Notify OptionsNotifyPtrInput
}

func (OptionsState) ElementType() reflect.Type {
	return reflect.TypeOf((*optionsState)(nil)).Elem()
}

type optionsArgs struct {
	// Clone I/O bandwidth limit in KiB/s.
	BandwidthLimitClone *int `pulumi:"bandwidthLimitClone"`
	// Default I/O bandwidth limit in KiB/s.
	BandwidthLimitDefault *int `pulumi:"bandwidthLimitDefault"`
	// Migration I/O bandwidth limit in KiB/s.
	BandwidthLimitMigration *int `pulumi:"bandwidthLimitMigration"`
	// Move I/O bandwidth limit in KiB/s.
	BandwidthLimitMove *int `pulumi:"bandwidthLimitMove"`
	// Restore I/O bandwidth limit in KiB/s.
	BandwidthLimitRestore *int `pulumi:"bandwidthLimitRestore"`
	// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
	Console *string `pulumi:"console"`
	// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
	CrsHa *string `pulumi:"crsHa"`
	// Cluster resource scheduling setting for HA rebalance on start.
	CrsHaRebalanceOnStart *bool `pulumi:"crsHaRebalanceOnStart"`
	// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
	Description *string `pulumi:"description"`
	// email address to send notification from (default is root@$hostname).
	EmailFrom *string `pulumi:"emailFrom"`
	// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
	HaShutdownPolicy *string `pulumi:"haShutdownPolicy"`
	// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
	HttpProxy *string `pulumi:"httpProxy"`
	// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
	Keyboard *string `pulumi:"keyboard"`
	// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
	Language *string `pulumi:"language"`
	// Prefix for autogenerated MAC addresses.
	MacPrefix *string `pulumi:"macPrefix"`
	// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
	MaxWorkers *int `pulumi:"maxWorkers"`
	// Cluster wide migration network CIDR.
	MigrationCidr *string `pulumi:"migrationCidr"`
	// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
	MigrationType *string `pulumi:"migrationType"`
	// The ranges for the next free VM ID auto-selection pool.
	NextId *OptionsNextId `pulumi:"nextId"`
	// Cluster-wide notification settings.
	Notify *OptionsNotify `pulumi:"notify"`
}

// The set of arguments for constructing a Options resource.
type OptionsArgs struct {
	// Clone I/O bandwidth limit in KiB/s.
	BandwidthLimitClone pulumi.IntPtrInput
	// Default I/O bandwidth limit in KiB/s.
	BandwidthLimitDefault pulumi.IntPtrInput
	// Migration I/O bandwidth limit in KiB/s.
	BandwidthLimitMigration pulumi.IntPtrInput
	// Move I/O bandwidth limit in KiB/s.
	BandwidthLimitMove pulumi.IntPtrInput
	// Restore I/O bandwidth limit in KiB/s.
	BandwidthLimitRestore pulumi.IntPtrInput
	// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
	Console pulumi.StringPtrInput
	// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
	CrsHa pulumi.StringPtrInput
	// Cluster resource scheduling setting for HA rebalance on start.
	CrsHaRebalanceOnStart pulumi.BoolPtrInput
	// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
	Description pulumi.StringPtrInput
	// email address to send notification from (default is root@$hostname).
	EmailFrom pulumi.StringPtrInput
	// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
	HaShutdownPolicy pulumi.StringPtrInput
	// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
	HttpProxy pulumi.StringPtrInput
	// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
	Keyboard pulumi.StringPtrInput
	// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
	Language pulumi.StringPtrInput
	// Prefix for autogenerated MAC addresses.
	MacPrefix pulumi.StringPtrInput
	// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
	MaxWorkers pulumi.IntPtrInput
	// Cluster wide migration network CIDR.
	MigrationCidr pulumi.StringPtrInput
	// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
	MigrationType pulumi.StringPtrInput
	// The ranges for the next free VM ID auto-selection pool.
	NextId OptionsNextIdPtrInput
	// Cluster-wide notification settings.
	Notify OptionsNotifyPtrInput
}

func (OptionsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*optionsArgs)(nil)).Elem()
}

type OptionsInput interface {
	pulumi.Input

	ToOptionsOutput() OptionsOutput
	ToOptionsOutputWithContext(ctx context.Context) OptionsOutput
}

func (*Options) ElementType() reflect.Type {
	return reflect.TypeOf((**Options)(nil)).Elem()
}

func (i *Options) ToOptionsOutput() OptionsOutput {
	return i.ToOptionsOutputWithContext(context.Background())
}

func (i *Options) ToOptionsOutputWithContext(ctx context.Context) OptionsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionsOutput)
}

// OptionsArrayInput is an input type that accepts OptionsArray and OptionsArrayOutput values.
// You can construct a concrete instance of `OptionsArrayInput` via:
//
//	OptionsArray{ OptionsArgs{...} }
type OptionsArrayInput interface {
	pulumi.Input

	ToOptionsArrayOutput() OptionsArrayOutput
	ToOptionsArrayOutputWithContext(context.Context) OptionsArrayOutput
}

type OptionsArray []OptionsInput

func (OptionsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Options)(nil)).Elem()
}

func (i OptionsArray) ToOptionsArrayOutput() OptionsArrayOutput {
	return i.ToOptionsArrayOutputWithContext(context.Background())
}

func (i OptionsArray) ToOptionsArrayOutputWithContext(ctx context.Context) OptionsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionsArrayOutput)
}

// OptionsMapInput is an input type that accepts OptionsMap and OptionsMapOutput values.
// You can construct a concrete instance of `OptionsMapInput` via:
//
//	OptionsMap{ "key": OptionsArgs{...} }
type OptionsMapInput interface {
	pulumi.Input

	ToOptionsMapOutput() OptionsMapOutput
	ToOptionsMapOutputWithContext(context.Context) OptionsMapOutput
}

type OptionsMap map[string]OptionsInput

func (OptionsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Options)(nil)).Elem()
}

func (i OptionsMap) ToOptionsMapOutput() OptionsMapOutput {
	return i.ToOptionsMapOutputWithContext(context.Background())
}

func (i OptionsMap) ToOptionsMapOutputWithContext(ctx context.Context) OptionsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OptionsMapOutput)
}

type OptionsOutput struct{ *pulumi.OutputState }

func (OptionsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Options)(nil)).Elem()
}

func (o OptionsOutput) ToOptionsOutput() OptionsOutput {
	return o
}

func (o OptionsOutput) ToOptionsOutputWithContext(ctx context.Context) OptionsOutput {
	return o
}

// Clone I/O bandwidth limit in KiB/s.
func (o OptionsOutput) BandwidthLimitClone() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.BandwidthLimitClone }).(pulumi.IntPtrOutput)
}

// Default I/O bandwidth limit in KiB/s.
func (o OptionsOutput) BandwidthLimitDefault() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.BandwidthLimitDefault }).(pulumi.IntPtrOutput)
}

// Migration I/O bandwidth limit in KiB/s.
func (o OptionsOutput) BandwidthLimitMigration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.BandwidthLimitMigration }).(pulumi.IntPtrOutput)
}

// Move I/O bandwidth limit in KiB/s.
func (o OptionsOutput) BandwidthLimitMove() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.BandwidthLimitMove }).(pulumi.IntPtrOutput)
}

// Restore I/O bandwidth limit in KiB/s.
func (o OptionsOutput) BandwidthLimitRestore() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.BandwidthLimitRestore }).(pulumi.IntPtrOutput)
}

// Select the default Console viewer. Must be `applet` | `vv`| `html5` | `xtermjs`. You can either use the builtin java applet (VNC; deprecated and maps to html5), an external virt-viewer compatible application (SPICE), an HTML5 based vnc viewer (noVNC), or an HTML5 based console client (xtermjs). If the selected viewer is not available (e.g. SPICE not activated for the VM), the fallback is noVNC.
func (o OptionsOutput) Console() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.Console }).(pulumi.StringPtrOutput)
}

// Cluster resource scheduling setting for HA. Must be `static` | `basic` (default is `basic`).
func (o OptionsOutput) CrsHa() pulumi.StringOutput {
	return o.ApplyT(func(v *Options) pulumi.StringOutput { return v.CrsHa }).(pulumi.StringOutput)
}

// Cluster resource scheduling setting for HA rebalance on start.
func (o OptionsOutput) CrsHaRebalanceOnStart() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.BoolPtrOutput { return v.CrsHaRebalanceOnStart }).(pulumi.BoolPtrOutput)
}

// Datacenter description. Shown in the web-interface datacenter notes panel. This is saved as comment inside the configuration file.
func (o OptionsOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// email address to send notification from (default is root@$hostname).
func (o OptionsOutput) EmailFrom() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.EmailFrom }).(pulumi.StringPtrOutput)
}

// Cluster wide HA shutdown policy (). Must be `freeze` | `failover` | `migrate` | `conditional` (default is `conditional`).
func (o OptionsOutput) HaShutdownPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.HaShutdownPolicy }).(pulumi.StringPtrOutput)
}

// Specify external http proxy which is used for downloads (example: `http://username:password@host:port/`).
func (o OptionsOutput) HttpProxy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.HttpProxy }).(pulumi.StringPtrOutput)
}

// Default keyboard layout for vnc server. Must be `de` | `de-ch` | `da` | `en-gb` | `en-us` | `es` | `fi` | `fr` | `fr-be` | `fr-ca` | `fr-ch` | `hu` | `is` | `it` | `ja` | `lt` | `mk` | `nl` | `no` | `pl` | `pt` | `pt-br` | `sv` | `sl` | `tr`.
func (o OptionsOutput) Keyboard() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.Keyboard }).(pulumi.StringPtrOutput)
}

// Default GUI language. Must be `ca` | `da` | `de` | `en` | `es` | `eu` | `fa` | `fr` | `he` | `it` | `ja` | `nb` | `nn` | `pl` | `pt_BR` | `ru` | `sl` | `sv` | `tr` | `zh_CN` | `zh_TW`.
func (o OptionsOutput) Language() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.Language }).(pulumi.StringPtrOutput)
}

// Prefix for autogenerated MAC addresses.
func (o OptionsOutput) MacPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *Options) pulumi.StringOutput { return v.MacPrefix }).(pulumi.StringOutput)
}

// Defines how many workers (per node) are maximal started on actions like 'stopall VMs' or task from the ha-manager.
func (o OptionsOutput) MaxWorkers() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.IntPtrOutput { return v.MaxWorkers }).(pulumi.IntPtrOutput)
}

// Cluster wide migration network CIDR.
func (o OptionsOutput) MigrationCidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.MigrationCidr }).(pulumi.StringPtrOutput)
}

// Cluster wide migration type. Must be `secure` | `unsecure` (default is `secure`).
func (o OptionsOutput) MigrationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Options) pulumi.StringPtrOutput { return v.MigrationType }).(pulumi.StringPtrOutput)
}

// The ranges for the next free VM ID auto-selection pool.
func (o OptionsOutput) NextId() OptionsNextIdPtrOutput {
	return o.ApplyT(func(v *Options) OptionsNextIdPtrOutput { return v.NextId }).(OptionsNextIdPtrOutput)
}

// Cluster-wide notification settings.
func (o OptionsOutput) Notify() OptionsNotifyPtrOutput {
	return o.ApplyT(func(v *Options) OptionsNotifyPtrOutput { return v.Notify }).(OptionsNotifyPtrOutput)
}

type OptionsArrayOutput struct{ *pulumi.OutputState }

func (OptionsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Options)(nil)).Elem()
}

func (o OptionsArrayOutput) ToOptionsArrayOutput() OptionsArrayOutput {
	return o
}

func (o OptionsArrayOutput) ToOptionsArrayOutputWithContext(ctx context.Context) OptionsArrayOutput {
	return o
}

func (o OptionsArrayOutput) Index(i pulumi.IntInput) OptionsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Options {
		return vs[0].([]*Options)[vs[1].(int)]
	}).(OptionsOutput)
}

type OptionsMapOutput struct{ *pulumi.OutputState }

func (OptionsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Options)(nil)).Elem()
}

func (o OptionsMapOutput) ToOptionsMapOutput() OptionsMapOutput {
	return o
}

func (o OptionsMapOutput) ToOptionsMapOutputWithContext(ctx context.Context) OptionsMapOutput {
	return o
}

func (o OptionsMapOutput) MapIndex(k pulumi.StringInput) OptionsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Options {
		return vs[0].(map[string]*Options)[vs[1].(string)]
	}).(OptionsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OptionsInput)(nil)).Elem(), &Options{})
	pulumi.RegisterInputType(reflect.TypeOf((*OptionsArrayInput)(nil)).Elem(), OptionsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OptionsMapInput)(nil)).Elem(), OptionsMap{})
	pulumi.RegisterOutputType(OptionsOutput{})
	pulumi.RegisterOutputType(OptionsArrayOutput{})
	pulumi.RegisterOutputType(OptionsMapOutput{})
}
