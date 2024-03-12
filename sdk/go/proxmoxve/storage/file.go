// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a file.
//
// ## Example Usage
//
// ### Backups (`dump`)
//
// > **Note:** The resource with this content type uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Storage.NewFile(ctx, "backup", &Storage.FileArgs{
//				ContentType: pulumi.String("dump"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("pve"),
//				SourceFile: &storage.FileSourceFileArgs{
//					Path: pulumi.String("vzdump-lxc-100-2023_11_08-23_10_05.tar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Images
//
// **Consider using `Download.File` resource instead. Using this resource for images is less efficient (requires to transfer uploaded image to node) though still supported.**
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Storage.NewFile(ctx, "ubuntuContainerTemplate", &Storage.FileArgs{
//				ContentType: pulumi.String("iso"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("pve"),
//				SourceFile: &storage.FileSourceFileArgs{
//					Path: pulumi.String("https://cloud-images.ubuntu.com/jammy/20230929/jammy-server-cloudimg-amd64-disk-kvm.img"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Container Template (`vztmpl`)
//
// **Consider using `Download.File` resource instead. Using this resource for container images is less efficient (requires to transfer uploaded image to node) though still supported.**
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Storage"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Storage.NewFile(ctx, "ubuntuContainerTemplate", &Storage.FileArgs{
//				ContentType: pulumi.String("vztmpl"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("first-node"),
//				SourceFile: &storage.FileSourceFileArgs{
//					Path: pulumi.String("https://download.proxmox.com/images/system/ubuntu-20.04-standard_20.04-1_amd64.tar.gz"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Important Notes
//
// The Proxmox VE API endpoint for file uploads does not support chunked transfer
// encoding, which means that we must first store the source file as a temporary
// file locally before uploading it.
//
// You must ensure that you have at least `Size-in-MB * 2 + 1` MB of storage space
// available (twice the size plus overhead because a multipart payload needs to be
// created as another temporary file).
//
// By default, if the specified file already exists, the resource will
// unconditionally replace it and take ownership of the resource. On destruction,
// the file will be deleted as if it did not exist before. If you want to prevent
// the resource from replacing the file, set `overwrite` to `false`.
//
// ## Import
//
// Instances can be imported using the `node_name`, `datastore_id`, `content_type`
//
// and the `file_name` in the following format:
//
// text
//
// node_name:datastore_id/content_type/file_name
//
// Example:
//
// bash
//
// ```sh
// $ pulumi import proxmoxve:Storage/file:File cloud_config pve/local:snippets/example.cloud-config.yaml
// ```
type File struct {
	pulumi.CustomResourceState

	// The content type. If not specified, the content
	// type will be inferred from the file extension. Valid values are:
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// The datastore id.
	DatastoreId pulumi.StringOutput `pulumi:"datastoreId"`
	// The file modification date (RFC 3339).
	FileModificationDate pulumi.StringOutput `pulumi:"fileModificationDate"`
	// The file name.
	FileName pulumi.StringOutput `pulumi:"fileName"`
	// The file size in bytes.
	FileSize pulumi.IntOutput `pulumi:"fileSize"`
	// The file tag.
	FileTag pulumi.StringOutput `pulumi:"fileTag"`
	// The node name.
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// Whether to overwrite an existing file (defaults to
	// `true`).
	Overwrite pulumi.BoolPtrOutput `pulumi:"overwrite"`
	// The source file (conflicts with `sourceRaw`),
	// could be a local file or a URL. If the source file is a URL, the file will
	// be downloaded and stored locally before uploading it to Proxmox VE.
	SourceFile FileSourceFilePtrOutput `pulumi:"sourceFile"`
	// The raw source (conflicts with `sourceFile`).
	SourceRaw FileSourceRawPtrOutput `pulumi:"sourceRaw"`
	// Timeout for uploading ISO/VSTMPL files in
	// seconds (defaults to 1800).
	TimeoutUpload pulumi.IntPtrOutput `pulumi:"timeoutUpload"`
}

// NewFile registers a new resource with the given unique name, arguments, and options.
func NewFile(ctx *pulumi.Context,
	name string, args *FileArgs, opts ...pulumi.ResourceOption) (*File, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatastoreId == nil {
		return nil, errors.New("invalid value for required argument 'DatastoreId'")
	}
	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource File
	err := ctx.RegisterResource("proxmoxve:Storage/file:File", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFile gets an existing File resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileState, opts ...pulumi.ResourceOption) (*File, error) {
	var resource File
	err := ctx.ReadResource("proxmoxve:Storage/file:File", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering File resources.
type fileState struct {
	// The content type. If not specified, the content
	// type will be inferred from the file extension. Valid values are:
	ContentType *string `pulumi:"contentType"`
	// The datastore id.
	DatastoreId *string `pulumi:"datastoreId"`
	// The file modification date (RFC 3339).
	FileModificationDate *string `pulumi:"fileModificationDate"`
	// The file name.
	FileName *string `pulumi:"fileName"`
	// The file size in bytes.
	FileSize *int `pulumi:"fileSize"`
	// The file tag.
	FileTag *string `pulumi:"fileTag"`
	// The node name.
	NodeName *string `pulumi:"nodeName"`
	// Whether to overwrite an existing file (defaults to
	// `true`).
	Overwrite *bool `pulumi:"overwrite"`
	// The source file (conflicts with `sourceRaw`),
	// could be a local file or a URL. If the source file is a URL, the file will
	// be downloaded and stored locally before uploading it to Proxmox VE.
	SourceFile *FileSourceFile `pulumi:"sourceFile"`
	// The raw source (conflicts with `sourceFile`).
	SourceRaw *FileSourceRaw `pulumi:"sourceRaw"`
	// Timeout for uploading ISO/VSTMPL files in
	// seconds (defaults to 1800).
	TimeoutUpload *int `pulumi:"timeoutUpload"`
}

type FileState struct {
	// The content type. If not specified, the content
	// type will be inferred from the file extension. Valid values are:
	ContentType pulumi.StringPtrInput
	// The datastore id.
	DatastoreId pulumi.StringPtrInput
	// The file modification date (RFC 3339).
	FileModificationDate pulumi.StringPtrInput
	// The file name.
	FileName pulumi.StringPtrInput
	// The file size in bytes.
	FileSize pulumi.IntPtrInput
	// The file tag.
	FileTag pulumi.StringPtrInput
	// The node name.
	NodeName pulumi.StringPtrInput
	// Whether to overwrite an existing file (defaults to
	// `true`).
	Overwrite pulumi.BoolPtrInput
	// The source file (conflicts with `sourceRaw`),
	// could be a local file or a URL. If the source file is a URL, the file will
	// be downloaded and stored locally before uploading it to Proxmox VE.
	SourceFile FileSourceFilePtrInput
	// The raw source (conflicts with `sourceFile`).
	SourceRaw FileSourceRawPtrInput
	// Timeout for uploading ISO/VSTMPL files in
	// seconds (defaults to 1800).
	TimeoutUpload pulumi.IntPtrInput
}

func (FileState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileState)(nil)).Elem()
}

type fileArgs struct {
	// The content type. If not specified, the content
	// type will be inferred from the file extension. Valid values are:
	ContentType *string `pulumi:"contentType"`
	// The datastore id.
	DatastoreId string `pulumi:"datastoreId"`
	// The node name.
	NodeName string `pulumi:"nodeName"`
	// Whether to overwrite an existing file (defaults to
	// `true`).
	Overwrite *bool `pulumi:"overwrite"`
	// The source file (conflicts with `sourceRaw`),
	// could be a local file or a URL. If the source file is a URL, the file will
	// be downloaded and stored locally before uploading it to Proxmox VE.
	SourceFile *FileSourceFile `pulumi:"sourceFile"`
	// The raw source (conflicts with `sourceFile`).
	SourceRaw *FileSourceRaw `pulumi:"sourceRaw"`
	// Timeout for uploading ISO/VSTMPL files in
	// seconds (defaults to 1800).
	TimeoutUpload *int `pulumi:"timeoutUpload"`
}

// The set of arguments for constructing a File resource.
type FileArgs struct {
	// The content type. If not specified, the content
	// type will be inferred from the file extension. Valid values are:
	ContentType pulumi.StringPtrInput
	// The datastore id.
	DatastoreId pulumi.StringInput
	// The node name.
	NodeName pulumi.StringInput
	// Whether to overwrite an existing file (defaults to
	// `true`).
	Overwrite pulumi.BoolPtrInput
	// The source file (conflicts with `sourceRaw`),
	// could be a local file or a URL. If the source file is a URL, the file will
	// be downloaded and stored locally before uploading it to Proxmox VE.
	SourceFile FileSourceFilePtrInput
	// The raw source (conflicts with `sourceFile`).
	SourceRaw FileSourceRawPtrInput
	// Timeout for uploading ISO/VSTMPL files in
	// seconds (defaults to 1800).
	TimeoutUpload pulumi.IntPtrInput
}

func (FileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileArgs)(nil)).Elem()
}

type FileInput interface {
	pulumi.Input

	ToFileOutput() FileOutput
	ToFileOutputWithContext(ctx context.Context) FileOutput
}

func (*File) ElementType() reflect.Type {
	return reflect.TypeOf((**File)(nil)).Elem()
}

func (i *File) ToFileOutput() FileOutput {
	return i.ToFileOutputWithContext(context.Background())
}

func (i *File) ToFileOutputWithContext(ctx context.Context) FileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileOutput)
}

// FileArrayInput is an input type that accepts FileArray and FileArrayOutput values.
// You can construct a concrete instance of `FileArrayInput` via:
//
//	FileArray{ FileArgs{...} }
type FileArrayInput interface {
	pulumi.Input

	ToFileArrayOutput() FileArrayOutput
	ToFileArrayOutputWithContext(context.Context) FileArrayOutput
}

type FileArray []FileInput

func (FileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*File)(nil)).Elem()
}

func (i FileArray) ToFileArrayOutput() FileArrayOutput {
	return i.ToFileArrayOutputWithContext(context.Background())
}

func (i FileArray) ToFileArrayOutputWithContext(ctx context.Context) FileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileArrayOutput)
}

// FileMapInput is an input type that accepts FileMap and FileMapOutput values.
// You can construct a concrete instance of `FileMapInput` via:
//
//	FileMap{ "key": FileArgs{...} }
type FileMapInput interface {
	pulumi.Input

	ToFileMapOutput() FileMapOutput
	ToFileMapOutputWithContext(context.Context) FileMapOutput
}

type FileMap map[string]FileInput

func (FileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*File)(nil)).Elem()
}

func (i FileMap) ToFileMapOutput() FileMapOutput {
	return i.ToFileMapOutputWithContext(context.Background())
}

func (i FileMap) ToFileMapOutputWithContext(ctx context.Context) FileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileMapOutput)
}

type FileOutput struct{ *pulumi.OutputState }

func (FileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**File)(nil)).Elem()
}

func (o FileOutput) ToFileOutput() FileOutput {
	return o
}

func (o FileOutput) ToFileOutputWithContext(ctx context.Context) FileOutput {
	return o
}

// The content type. If not specified, the content
// type will be inferred from the file extension. Valid values are:
func (o FileOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// The datastore id.
func (o FileOutput) DatastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.DatastoreId }).(pulumi.StringOutput)
}

// The file modification date (RFC 3339).
func (o FileOutput) FileModificationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.FileModificationDate }).(pulumi.StringOutput)
}

// The file name.
func (o FileOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.FileName }).(pulumi.StringOutput)
}

// The file size in bytes.
func (o FileOutput) FileSize() pulumi.IntOutput {
	return o.ApplyT(func(v *File) pulumi.IntOutput { return v.FileSize }).(pulumi.IntOutput)
}

// The file tag.
func (o FileOutput) FileTag() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.FileTag }).(pulumi.StringOutput)
}

// The node name.
func (o FileOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// Whether to overwrite an existing file (defaults to
// `true`).
func (o FileOutput) Overwrite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *File) pulumi.BoolPtrOutput { return v.Overwrite }).(pulumi.BoolPtrOutput)
}

// The source file (conflicts with `sourceRaw`),
// could be a local file or a URL. If the source file is a URL, the file will
// be downloaded and stored locally before uploading it to Proxmox VE.
func (o FileOutput) SourceFile() FileSourceFilePtrOutput {
	return o.ApplyT(func(v *File) FileSourceFilePtrOutput { return v.SourceFile }).(FileSourceFilePtrOutput)
}

// The raw source (conflicts with `sourceFile`).
func (o FileOutput) SourceRaw() FileSourceRawPtrOutput {
	return o.ApplyT(func(v *File) FileSourceRawPtrOutput { return v.SourceRaw }).(FileSourceRawPtrOutput)
}

// Timeout for uploading ISO/VSTMPL files in
// seconds (defaults to 1800).
func (o FileOutput) TimeoutUpload() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *File) pulumi.IntPtrOutput { return v.TimeoutUpload }).(pulumi.IntPtrOutput)
}

type FileArrayOutput struct{ *pulumi.OutputState }

func (FileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*File)(nil)).Elem()
}

func (o FileArrayOutput) ToFileArrayOutput() FileArrayOutput {
	return o
}

func (o FileArrayOutput) ToFileArrayOutputWithContext(ctx context.Context) FileArrayOutput {
	return o
}

func (o FileArrayOutput) Index(i pulumi.IntInput) FileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *File {
		return vs[0].([]*File)[vs[1].(int)]
	}).(FileOutput)
}

type FileMapOutput struct{ *pulumi.OutputState }

func (FileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*File)(nil)).Elem()
}

func (o FileMapOutput) ToFileMapOutput() FileMapOutput {
	return o
}

func (o FileMapOutput) ToFileMapOutputWithContext(ctx context.Context) FileMapOutput {
	return o
}

func (o FileMapOutput) MapIndex(k pulumi.StringInput) FileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *File {
		return vs[0].(map[string]*File)[vs[1].(string)]
	}).(FileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileInput)(nil)).Elem(), &File{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileArrayInput)(nil)).Elem(), FileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileMapInput)(nil)).Elem(), FileMap{})
	pulumi.RegisterOutputType(FileOutput{})
	pulumi.RegisterOutputType(FileArrayOutput{})
	pulumi.RegisterOutputType(FileMapOutput{})
}
