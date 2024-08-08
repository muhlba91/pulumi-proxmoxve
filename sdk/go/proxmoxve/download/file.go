// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package download

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages files upload using PVE download-url API. It can be fully compatible and faster replacement for image files created using `Storage.File`. Supports images for VMs (ISO images) and LXC (CT Templates).
//
// > Besides the `Datastore.AllocateTemplate` privilege, this resource requires both the `Sys.Audit` and `Sys.Modify` privileges.<br><br>
// For more details, see the [`download-url`](https://pve.proxmox.com/pve-docs/api-viewer/index.html#/nodes/{node}/storage/{storage}/download-url) API documentation under the "Required permissions" section.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Download"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Download.NewFile(ctx, "release20231228Debian12BookwormQcow2Img", &Download.FileArgs{
//				Checksum:          pulumi.String("d2fbcf11fb28795842e91364d8c7b69f1870db09ff299eb94e4fbbfa510eb78d141e74c1f4bf6dfa0b7e33d0c3b66e6751886feadb4e9916f778bab1776bdf1b"),
//				ChecksumAlgorithm: pulumi.String("sha512"),
//				ContentType:       pulumi.String("iso"),
//				DatastoreId:       pulumi.String("local"),
//				FileName:          pulumi.String("debian-12-generic-amd64-20231228-1609.img"),
//				NodeName:          pulumi.String("pve"),
//				Url:               pulumi.String("https://cloud.debian.org/images/cloud/bookworm/20231228-1609/debian-12-generic-amd64-20231228-1609.qcow2"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Download.NewFile(ctx, "latestDebian12BookwormQcow2Img", &Download.FileArgs{
//				ContentType: pulumi.String("iso"),
//				DatastoreId: pulumi.String("local"),
//				FileName:    pulumi.String("debian-12-generic-amd64.qcow2.img"),
//				NodeName:    pulumi.String("pve"),
//				Url:         pulumi.String("https://cloud.debian.org/images/cloud/bookworm/latest/debian-12-generic-amd64.qcow2"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Download.NewFile(ctx, "latestUbuntu22JammyQcow2Img", &Download.FileArgs{
//				ContentType: pulumi.String("iso"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("pve"),
//				Url:         pulumi.String("https://cloud-images.ubuntu.com/jammy/current/jammy-server-cloudimg-amd64.img"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Download.NewFile(ctx, "latestStaticUbuntu24NobleQcow2Img", &Download.FileArgs{
//				ContentType: pulumi.String("iso"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("pve"),
//				Overwrite:   pulumi.Bool(false),
//				Url:         pulumi.String("https://cloud-images.ubuntu.com/noble/current/noble-server-cloudimg-amd64.img"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Download.NewFile(ctx, "release20231211Ubuntu22JammyLxcImg", &Download.FileArgs{
//				Checksum:          pulumi.String("c9997dcfea5d826fd04871f960c513665f2e87dd7450bba99f68a97e60e4586e"),
//				ChecksumAlgorithm: pulumi.String("sha256"),
//				ContentType:       pulumi.String("vztmpl"),
//				DatastoreId:       pulumi.String("local"),
//				NodeName:          pulumi.String("pve"),
//				UploadTimeout:     pulumi.Int(4444),
//				Url:               pulumi.String("https://cloud-images.ubuntu.com/releases/22.04/release-20231211/ubuntu-22.04-server-cloudimg-amd64-root.tar.xz"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Download.NewFile(ctx, "latestUbuntu22JammyLxcImg", &Download.FileArgs{
//				ContentType: pulumi.String("vztmpl"),
//				DatastoreId: pulumi.String("local"),
//				NodeName:    pulumi.String("pve"),
//				Url:         pulumi.String("https://cloud-images.ubuntu.com/jammy/current/jammy-server-cloudimg-amd64.tar.gz"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type File struct {
	pulumi.CustomResourceState

	// The expected checksum of the file.
	Checksum pulumi.StringPtrOutput `pulumi:"checksum"`
	// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
	ChecksumAlgorithm pulumi.StringPtrOutput `pulumi:"checksumAlgorithm"`
	// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// The identifier for the target datastore.
	DatastoreId pulumi.StringOutput `pulumi:"datastoreId"`
	// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
	DecompressionAlgorithm pulumi.StringPtrOutput `pulumi:"decompressionAlgorithm"`
	// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
	FileName pulumi.StringOutput `pulumi:"fileName"`
	// The node name.
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
	Overwrite pulumi.BoolOutput `pulumi:"overwrite"`
	// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
	OverwriteUnmanaged pulumi.BoolOutput `pulumi:"overwriteUnmanaged"`
	// The file size.
	Size pulumi.IntOutput `pulumi:"size"`
	// The file download timeout seconds. Default is 600 (10min).
	UploadTimeout pulumi.IntOutput `pulumi:"uploadTimeout"`
	// The URL to download the file from. Format `https?://.*`.
	Url pulumi.StringOutput `pulumi:"url"`
	// By default `true`. If `false`, no SSL/TLS certificates will be verified.
	Verify pulumi.BoolOutput `pulumi:"verify"`
}

// NewFile registers a new resource with the given unique name, arguments, and options.
func NewFile(ctx *pulumi.Context,
	name string, args *FileArgs, opts ...pulumi.ResourceOption) (*File, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContentType == nil {
		return nil, errors.New("invalid value for required argument 'ContentType'")
	}
	if args.DatastoreId == nil {
		return nil, errors.New("invalid value for required argument 'DatastoreId'")
	}
	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource File
	err := ctx.RegisterResource("proxmoxve:Download/file:File", name, args, &resource, opts...)
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
	err := ctx.ReadResource("proxmoxve:Download/file:File", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering File resources.
type fileState struct {
	// The expected checksum of the file.
	Checksum *string `pulumi:"checksum"`
	// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
	ChecksumAlgorithm *string `pulumi:"checksumAlgorithm"`
	// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
	ContentType *string `pulumi:"contentType"`
	// The identifier for the target datastore.
	DatastoreId *string `pulumi:"datastoreId"`
	// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
	DecompressionAlgorithm *string `pulumi:"decompressionAlgorithm"`
	// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
	FileName *string `pulumi:"fileName"`
	// The node name.
	NodeName *string `pulumi:"nodeName"`
	// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
	Overwrite *bool `pulumi:"overwrite"`
	// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
	OverwriteUnmanaged *bool `pulumi:"overwriteUnmanaged"`
	// The file size.
	Size *int `pulumi:"size"`
	// The file download timeout seconds. Default is 600 (10min).
	UploadTimeout *int `pulumi:"uploadTimeout"`
	// The URL to download the file from. Format `https?://.*`.
	Url *string `pulumi:"url"`
	// By default `true`. If `false`, no SSL/TLS certificates will be verified.
	Verify *bool `pulumi:"verify"`
}

type FileState struct {
	// The expected checksum of the file.
	Checksum pulumi.StringPtrInput
	// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
	ChecksumAlgorithm pulumi.StringPtrInput
	// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
	ContentType pulumi.StringPtrInput
	// The identifier for the target datastore.
	DatastoreId pulumi.StringPtrInput
	// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
	DecompressionAlgorithm pulumi.StringPtrInput
	// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
	FileName pulumi.StringPtrInput
	// The node name.
	NodeName pulumi.StringPtrInput
	// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
	Overwrite pulumi.BoolPtrInput
	// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
	OverwriteUnmanaged pulumi.BoolPtrInput
	// The file size.
	Size pulumi.IntPtrInput
	// The file download timeout seconds. Default is 600 (10min).
	UploadTimeout pulumi.IntPtrInput
	// The URL to download the file from. Format `https?://.*`.
	Url pulumi.StringPtrInput
	// By default `true`. If `false`, no SSL/TLS certificates will be verified.
	Verify pulumi.BoolPtrInput
}

func (FileState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileState)(nil)).Elem()
}

type fileArgs struct {
	// The expected checksum of the file.
	Checksum *string `pulumi:"checksum"`
	// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
	ChecksumAlgorithm *string `pulumi:"checksumAlgorithm"`
	// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
	ContentType string `pulumi:"contentType"`
	// The identifier for the target datastore.
	DatastoreId string `pulumi:"datastoreId"`
	// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
	DecompressionAlgorithm *string `pulumi:"decompressionAlgorithm"`
	// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
	FileName *string `pulumi:"fileName"`
	// The node name.
	NodeName string `pulumi:"nodeName"`
	// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
	Overwrite *bool `pulumi:"overwrite"`
	// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
	OverwriteUnmanaged *bool `pulumi:"overwriteUnmanaged"`
	// The file download timeout seconds. Default is 600 (10min).
	UploadTimeout *int `pulumi:"uploadTimeout"`
	// The URL to download the file from. Format `https?://.*`.
	Url string `pulumi:"url"`
	// By default `true`. If `false`, no SSL/TLS certificates will be verified.
	Verify *bool `pulumi:"verify"`
}

// The set of arguments for constructing a File resource.
type FileArgs struct {
	// The expected checksum of the file.
	Checksum pulumi.StringPtrInput
	// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
	ChecksumAlgorithm pulumi.StringPtrInput
	// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
	ContentType pulumi.StringInput
	// The identifier for the target datastore.
	DatastoreId pulumi.StringInput
	// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
	DecompressionAlgorithm pulumi.StringPtrInput
	// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
	FileName pulumi.StringPtrInput
	// The node name.
	NodeName pulumi.StringInput
	// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
	Overwrite pulumi.BoolPtrInput
	// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
	OverwriteUnmanaged pulumi.BoolPtrInput
	// The file download timeout seconds. Default is 600 (10min).
	UploadTimeout pulumi.IntPtrInput
	// The URL to download the file from. Format `https?://.*`.
	Url pulumi.StringInput
	// By default `true`. If `false`, no SSL/TLS certificates will be verified.
	Verify pulumi.BoolPtrInput
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

// The expected checksum of the file.
func (o FileOutput) Checksum() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *File) pulumi.StringPtrOutput { return v.Checksum }).(pulumi.StringPtrOutput)
}

// The algorithm to calculate the checksum of the file. Must be `md5` | `sha1` | `sha224` | `sha256` | `sha384` | `sha512`.
func (o FileOutput) ChecksumAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *File) pulumi.StringPtrOutput { return v.ChecksumAlgorithm }).(pulumi.StringPtrOutput)
}

// The file content type. Must be `iso` for VM images or `vztmpl` for LXC images.
func (o FileOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// The identifier for the target datastore.
func (o FileOutput) DatastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.DatastoreId }).(pulumi.StringOutput)
}

// Decompress the downloaded file using the specified compression algorithm. Must be one of `gz` | `lzo` | `zst`.
func (o FileOutput) DecompressionAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *File) pulumi.StringPtrOutput { return v.DecompressionAlgorithm }).(pulumi.StringPtrOutput)
}

// The file name. If not provided, it is calculated using `url`. PVE will raise 'wrong file extension' error for some popular extensions file `.raw` or `.qcow2`. Workaround is to use e.g. `.img` instead.
func (o FileOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.FileName }).(pulumi.StringOutput)
}

// The node name.
func (o FileOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// If `true` and size of uploaded file is different, than size from `url` Content-Length header, file will be downloaded again. If `false`, there will be no checks.
func (o FileOutput) Overwrite() pulumi.BoolOutput {
	return o.ApplyT(func(v *File) pulumi.BoolOutput { return v.Overwrite }).(pulumi.BoolOutput)
}

// If `true` and a file with the same name already exists in the datastore, it will be deleted and the new file will be downloaded. If `false` and the file already exists, an error will be returned.
func (o FileOutput) OverwriteUnmanaged() pulumi.BoolOutput {
	return o.ApplyT(func(v *File) pulumi.BoolOutput { return v.OverwriteUnmanaged }).(pulumi.BoolOutput)
}

// The file size.
func (o FileOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *File) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The file download timeout seconds. Default is 600 (10min).
func (o FileOutput) UploadTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v *File) pulumi.IntOutput { return v.UploadTimeout }).(pulumi.IntOutput)
}

// The URL to download the file from. Format `https?://.*`.
func (o FileOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *File) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// By default `true`. If `false`, no SSL/TLS certificates will be verified.
func (o FileOutput) Verify() pulumi.BoolOutput {
	return o.ApplyT(func(v *File) pulumi.BoolOutput { return v.Verify }).(pulumi.BoolOutput)
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
