// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apt

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an APT repository of a Proxmox VE node.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/apt"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := apt.NewRepository(ctx, "example", &apt.RepositoryArgs{
//				Enabled:  pulumi.Bool(true),
//				FilePath: pulumi.String("/etc/apt/sources.list"),
//				Index:    pulumi.Int(0),
//				Node:     pulumi.String("pve"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// #!/usr/bin/env sh
//
// An APT repository can be imported using a comma-separated list consisting of the name of the Proxmox VE node,
//
// the absolute source list file path, and the index in the exact same order, e.g.:
//
// ```sh
// $ pulumi import proxmoxve:Apt/repository:Repository example pve,/etc/apt/sources.list,0
// ```
type Repository struct {
	pulumi.CustomResourceState

	// The associated comment.
	Comment pulumi.StringOutput `pulumi:"comment"`
	// The list of components.
	Components pulumi.StringArrayOutput `pulumi:"components"`
	// Indicates the activation status.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The absolute path of the source list file that contains this repository.
	FilePath pulumi.StringOutput `pulumi:"filePath"`
	// The format of the defining source list file.
	FileType pulumi.StringOutput `pulumi:"fileType"`
	// The index within the defining source list file.
	Index pulumi.IntOutput `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node pulumi.StringOutput `pulumi:"node"`
	// The list of package types.
	PackageTypes pulumi.StringArrayOutput `pulumi:"packageTypes"`
	// The list of package distributions.
	Suites pulumi.StringArrayOutput `pulumi:"suites"`
	// The list of repository URIs.
	Uris pulumi.StringArrayOutput `pulumi:"uris"`
}

// NewRepository registers a new resource with the given unique name, arguments, and options.
func NewRepository(ctx *pulumi.Context,
	name string, args *RepositoryArgs, opts ...pulumi.ResourceOption) (*Repository, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FilePath == nil {
		return nil, errors.New("invalid value for required argument 'FilePath'")
	}
	if args.Index == nil {
		return nil, errors.New("invalid value for required argument 'Index'")
	}
	if args.Node == nil {
		return nil, errors.New("invalid value for required argument 'Node'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Repository
	err := ctx.RegisterResource("proxmoxve:Apt/repository:Repository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepository gets an existing Repository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryState, opts ...pulumi.ResourceOption) (*Repository, error) {
	var resource Repository
	err := ctx.ReadResource("proxmoxve:Apt/repository:Repository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Repository resources.
type repositoryState struct {
	// The associated comment.
	Comment *string `pulumi:"comment"`
	// The list of components.
	Components []string `pulumi:"components"`
	// Indicates the activation status.
	Enabled *bool `pulumi:"enabled"`
	// The absolute path of the source list file that contains this repository.
	FilePath *string `pulumi:"filePath"`
	// The format of the defining source list file.
	FileType *string `pulumi:"fileType"`
	// The index within the defining source list file.
	Index *int `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node *string `pulumi:"node"`
	// The list of package types.
	PackageTypes []string `pulumi:"packageTypes"`
	// The list of package distributions.
	Suites []string `pulumi:"suites"`
	// The list of repository URIs.
	Uris []string `pulumi:"uris"`
}

type RepositoryState struct {
	// The associated comment.
	Comment pulumi.StringPtrInput
	// The list of components.
	Components pulumi.StringArrayInput
	// Indicates the activation status.
	Enabled pulumi.BoolPtrInput
	// The absolute path of the source list file that contains this repository.
	FilePath pulumi.StringPtrInput
	// The format of the defining source list file.
	FileType pulumi.StringPtrInput
	// The index within the defining source list file.
	Index pulumi.IntPtrInput
	// The name of the target Proxmox VE node.
	Node pulumi.StringPtrInput
	// The list of package types.
	PackageTypes pulumi.StringArrayInput
	// The list of package distributions.
	Suites pulumi.StringArrayInput
	// The list of repository URIs.
	Uris pulumi.StringArrayInput
}

func (RepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryState)(nil)).Elem()
}

type repositoryArgs struct {
	// Indicates the activation status.
	Enabled *bool `pulumi:"enabled"`
	// The absolute path of the source list file that contains this repository.
	FilePath string `pulumi:"filePath"`
	// The index within the defining source list file.
	Index int `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node string `pulumi:"node"`
}

// The set of arguments for constructing a Repository resource.
type RepositoryArgs struct {
	// Indicates the activation status.
	Enabled pulumi.BoolPtrInput
	// The absolute path of the source list file that contains this repository.
	FilePath pulumi.StringInput
	// The index within the defining source list file.
	Index pulumi.IntInput
	// The name of the target Proxmox VE node.
	Node pulumi.StringInput
}

func (RepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryArgs)(nil)).Elem()
}

type RepositoryInput interface {
	pulumi.Input

	ToRepositoryOutput() RepositoryOutput
	ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput
}

func (*Repository) ElementType() reflect.Type {
	return reflect.TypeOf((**Repository)(nil)).Elem()
}

func (i *Repository) ToRepositoryOutput() RepositoryOutput {
	return i.ToRepositoryOutputWithContext(context.Background())
}

func (i *Repository) ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryOutput)
}

// RepositoryArrayInput is an input type that accepts RepositoryArray and RepositoryArrayOutput values.
// You can construct a concrete instance of `RepositoryArrayInput` via:
//
//	RepositoryArray{ RepositoryArgs{...} }
type RepositoryArrayInput interface {
	pulumi.Input

	ToRepositoryArrayOutput() RepositoryArrayOutput
	ToRepositoryArrayOutputWithContext(context.Context) RepositoryArrayOutput
}

type RepositoryArray []RepositoryInput

func (RepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repository)(nil)).Elem()
}

func (i RepositoryArray) ToRepositoryArrayOutput() RepositoryArrayOutput {
	return i.ToRepositoryArrayOutputWithContext(context.Background())
}

func (i RepositoryArray) ToRepositoryArrayOutputWithContext(ctx context.Context) RepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryArrayOutput)
}

// RepositoryMapInput is an input type that accepts RepositoryMap and RepositoryMapOutput values.
// You can construct a concrete instance of `RepositoryMapInput` via:
//
//	RepositoryMap{ "key": RepositoryArgs{...} }
type RepositoryMapInput interface {
	pulumi.Input

	ToRepositoryMapOutput() RepositoryMapOutput
	ToRepositoryMapOutputWithContext(context.Context) RepositoryMapOutput
}

type RepositoryMap map[string]RepositoryInput

func (RepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repository)(nil)).Elem()
}

func (i RepositoryMap) ToRepositoryMapOutput() RepositoryMapOutput {
	return i.ToRepositoryMapOutputWithContext(context.Background())
}

func (i RepositoryMap) ToRepositoryMapOutputWithContext(ctx context.Context) RepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryMapOutput)
}

type RepositoryOutput struct{ *pulumi.OutputState }

func (RepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Repository)(nil)).Elem()
}

func (o RepositoryOutput) ToRepositoryOutput() RepositoryOutput {
	return o
}

func (o RepositoryOutput) ToRepositoryOutputWithContext(ctx context.Context) RepositoryOutput {
	return o
}

// The associated comment.
func (o RepositoryOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Comment }).(pulumi.StringOutput)
}

// The list of components.
func (o RepositoryOutput) Components() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringArrayOutput { return v.Components }).(pulumi.StringArrayOutput)
}

// Indicates the activation status.
func (o RepositoryOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Repository) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The absolute path of the source list file that contains this repository.
func (o RepositoryOutput) FilePath() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.FilePath }).(pulumi.StringOutput)
}

// The format of the defining source list file.
func (o RepositoryOutput) FileType() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.FileType }).(pulumi.StringOutput)
}

// The index within the defining source list file.
func (o RepositoryOutput) Index() pulumi.IntOutput {
	return o.ApplyT(func(v *Repository) pulumi.IntOutput { return v.Index }).(pulumi.IntOutput)
}

// The name of the target Proxmox VE node.
func (o RepositoryOutput) Node() pulumi.StringOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringOutput { return v.Node }).(pulumi.StringOutput)
}

// The list of package types.
func (o RepositoryOutput) PackageTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringArrayOutput { return v.PackageTypes }).(pulumi.StringArrayOutput)
}

// The list of package distributions.
func (o RepositoryOutput) Suites() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringArrayOutput { return v.Suites }).(pulumi.StringArrayOutput)
}

// The list of repository URIs.
func (o RepositoryOutput) Uris() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Repository) pulumi.StringArrayOutput { return v.Uris }).(pulumi.StringArrayOutput)
}

type RepositoryArrayOutput struct{ *pulumi.OutputState }

func (RepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repository)(nil)).Elem()
}

func (o RepositoryArrayOutput) ToRepositoryArrayOutput() RepositoryArrayOutput {
	return o
}

func (o RepositoryArrayOutput) ToRepositoryArrayOutputWithContext(ctx context.Context) RepositoryArrayOutput {
	return o
}

func (o RepositoryArrayOutput) Index(i pulumi.IntInput) RepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Repository {
		return vs[0].([]*Repository)[vs[1].(int)]
	}).(RepositoryOutput)
}

type RepositoryMapOutput struct{ *pulumi.OutputState }

func (RepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repository)(nil)).Elem()
}

func (o RepositoryMapOutput) ToRepositoryMapOutput() RepositoryMapOutput {
	return o
}

func (o RepositoryMapOutput) ToRepositoryMapOutputWithContext(ctx context.Context) RepositoryMapOutput {
	return o
}

func (o RepositoryMapOutput) MapIndex(k pulumi.StringInput) RepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Repository {
		return vs[0].(map[string]*Repository)[vs[1].(string)]
	}).(RepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryInput)(nil)).Elem(), &Repository{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryArrayInput)(nil)).Elem(), RepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryMapInput)(nil)).Elem(), RepositoryMap{})
	pulumi.RegisterOutputType(RepositoryOutput{})
	pulumi.RegisterOutputType(RepositoryArrayOutput{})
	pulumi.RegisterOutputType(RepositoryMapOutput{})
}
