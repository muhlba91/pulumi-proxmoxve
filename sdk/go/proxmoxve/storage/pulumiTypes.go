// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storage

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type FileSourceFile struct {
	Changed  *bool   `pulumi:"changed"`
	Checksum *string `pulumi:"checksum"`
	FileName *string `pulumi:"fileName"`
	Insecure *bool   `pulumi:"insecure"`
	Path     string  `pulumi:"path"`
}

// FileSourceFileInput is an input type that accepts FileSourceFileArgs and FileSourceFileOutput values.
// You can construct a concrete instance of `FileSourceFileInput` via:
//
//	FileSourceFileArgs{...}
type FileSourceFileInput interface {
	pulumi.Input

	ToFileSourceFileOutput() FileSourceFileOutput
	ToFileSourceFileOutputWithContext(context.Context) FileSourceFileOutput
}

type FileSourceFileArgs struct {
	Changed  pulumi.BoolPtrInput   `pulumi:"changed"`
	Checksum pulumi.StringPtrInput `pulumi:"checksum"`
	FileName pulumi.StringPtrInput `pulumi:"fileName"`
	Insecure pulumi.BoolPtrInput   `pulumi:"insecure"`
	Path     pulumi.StringInput    `pulumi:"path"`
}

func (FileSourceFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSourceFile)(nil)).Elem()
}

func (i FileSourceFileArgs) ToFileSourceFileOutput() FileSourceFileOutput {
	return i.ToFileSourceFileOutputWithContext(context.Background())
}

func (i FileSourceFileArgs) ToFileSourceFileOutputWithContext(ctx context.Context) FileSourceFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceFileOutput)
}

func (i FileSourceFileArgs) ToFileSourceFilePtrOutput() FileSourceFilePtrOutput {
	return i.ToFileSourceFilePtrOutputWithContext(context.Background())
}

func (i FileSourceFileArgs) ToFileSourceFilePtrOutputWithContext(ctx context.Context) FileSourceFilePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceFileOutput).ToFileSourceFilePtrOutputWithContext(ctx)
}

// FileSourceFilePtrInput is an input type that accepts FileSourceFileArgs, FileSourceFilePtr and FileSourceFilePtrOutput values.
// You can construct a concrete instance of `FileSourceFilePtrInput` via:
//
//	        FileSourceFileArgs{...}
//
//	or:
//
//	        nil
type FileSourceFilePtrInput interface {
	pulumi.Input

	ToFileSourceFilePtrOutput() FileSourceFilePtrOutput
	ToFileSourceFilePtrOutputWithContext(context.Context) FileSourceFilePtrOutput
}

type fileSourceFilePtrType FileSourceFileArgs

func FileSourceFilePtr(v *FileSourceFileArgs) FileSourceFilePtrInput {
	return (*fileSourceFilePtrType)(v)
}

func (*fileSourceFilePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSourceFile)(nil)).Elem()
}

func (i *fileSourceFilePtrType) ToFileSourceFilePtrOutput() FileSourceFilePtrOutput {
	return i.ToFileSourceFilePtrOutputWithContext(context.Background())
}

func (i *fileSourceFilePtrType) ToFileSourceFilePtrOutputWithContext(ctx context.Context) FileSourceFilePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceFilePtrOutput)
}

type FileSourceFileOutput struct{ *pulumi.OutputState }

func (FileSourceFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSourceFile)(nil)).Elem()
}

func (o FileSourceFileOutput) ToFileSourceFileOutput() FileSourceFileOutput {
	return o
}

func (o FileSourceFileOutput) ToFileSourceFileOutputWithContext(ctx context.Context) FileSourceFileOutput {
	return o
}

func (o FileSourceFileOutput) ToFileSourceFilePtrOutput() FileSourceFilePtrOutput {
	return o.ToFileSourceFilePtrOutputWithContext(context.Background())
}

func (o FileSourceFileOutput) ToFileSourceFilePtrOutputWithContext(ctx context.Context) FileSourceFilePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v FileSourceFile) *FileSourceFile {
		return &v
	}).(FileSourceFilePtrOutput)
}

func (o FileSourceFileOutput) Changed() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FileSourceFile) *bool { return v.Changed }).(pulumi.BoolPtrOutput)
}

func (o FileSourceFileOutput) Checksum() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FileSourceFile) *string { return v.Checksum }).(pulumi.StringPtrOutput)
}

func (o FileSourceFileOutput) FileName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v FileSourceFile) *string { return v.FileName }).(pulumi.StringPtrOutput)
}

func (o FileSourceFileOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v FileSourceFile) *bool { return v.Insecure }).(pulumi.BoolPtrOutput)
}

func (o FileSourceFileOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v FileSourceFile) string { return v.Path }).(pulumi.StringOutput)
}

type FileSourceFilePtrOutput struct{ *pulumi.OutputState }

func (FileSourceFilePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSourceFile)(nil)).Elem()
}

func (o FileSourceFilePtrOutput) ToFileSourceFilePtrOutput() FileSourceFilePtrOutput {
	return o
}

func (o FileSourceFilePtrOutput) ToFileSourceFilePtrOutputWithContext(ctx context.Context) FileSourceFilePtrOutput {
	return o
}

func (o FileSourceFilePtrOutput) Elem() FileSourceFileOutput {
	return o.ApplyT(func(v *FileSourceFile) FileSourceFile {
		if v != nil {
			return *v
		}
		var ret FileSourceFile
		return ret
	}).(FileSourceFileOutput)
}

func (o FileSourceFilePtrOutput) Changed() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileSourceFile) *bool {
		if v == nil {
			return nil
		}
		return v.Changed
	}).(pulumi.BoolPtrOutput)
}

func (o FileSourceFilePtrOutput) Checksum() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSourceFile) *string {
		if v == nil {
			return nil
		}
		return v.Checksum
	}).(pulumi.StringPtrOutput)
}

func (o FileSourceFilePtrOutput) FileName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSourceFile) *string {
		if v == nil {
			return nil
		}
		return v.FileName
	}).(pulumi.StringPtrOutput)
}

func (o FileSourceFilePtrOutput) Insecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileSourceFile) *bool {
		if v == nil {
			return nil
		}
		return v.Insecure
	}).(pulumi.BoolPtrOutput)
}

func (o FileSourceFilePtrOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSourceFile) *string {
		if v == nil {
			return nil
		}
		return &v.Path
	}).(pulumi.StringPtrOutput)
}

type FileSourceRaw struct {
	Data     string `pulumi:"data"`
	FileName string `pulumi:"fileName"`
	Resize   *int   `pulumi:"resize"`
}

// FileSourceRawInput is an input type that accepts FileSourceRawArgs and FileSourceRawOutput values.
// You can construct a concrete instance of `FileSourceRawInput` via:
//
//	FileSourceRawArgs{...}
type FileSourceRawInput interface {
	pulumi.Input

	ToFileSourceRawOutput() FileSourceRawOutput
	ToFileSourceRawOutputWithContext(context.Context) FileSourceRawOutput
}

type FileSourceRawArgs struct {
	Data     pulumi.StringInput `pulumi:"data"`
	FileName pulumi.StringInput `pulumi:"fileName"`
	Resize   pulumi.IntPtrInput `pulumi:"resize"`
}

func (FileSourceRawArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSourceRaw)(nil)).Elem()
}

func (i FileSourceRawArgs) ToFileSourceRawOutput() FileSourceRawOutput {
	return i.ToFileSourceRawOutputWithContext(context.Background())
}

func (i FileSourceRawArgs) ToFileSourceRawOutputWithContext(ctx context.Context) FileSourceRawOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceRawOutput)
}

func (i FileSourceRawArgs) ToFileSourceRawPtrOutput() FileSourceRawPtrOutput {
	return i.ToFileSourceRawPtrOutputWithContext(context.Background())
}

func (i FileSourceRawArgs) ToFileSourceRawPtrOutputWithContext(ctx context.Context) FileSourceRawPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceRawOutput).ToFileSourceRawPtrOutputWithContext(ctx)
}

// FileSourceRawPtrInput is an input type that accepts FileSourceRawArgs, FileSourceRawPtr and FileSourceRawPtrOutput values.
// You can construct a concrete instance of `FileSourceRawPtrInput` via:
//
//	        FileSourceRawArgs{...}
//
//	or:
//
//	        nil
type FileSourceRawPtrInput interface {
	pulumi.Input

	ToFileSourceRawPtrOutput() FileSourceRawPtrOutput
	ToFileSourceRawPtrOutputWithContext(context.Context) FileSourceRawPtrOutput
}

type fileSourceRawPtrType FileSourceRawArgs

func FileSourceRawPtr(v *FileSourceRawArgs) FileSourceRawPtrInput {
	return (*fileSourceRawPtrType)(v)
}

func (*fileSourceRawPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSourceRaw)(nil)).Elem()
}

func (i *fileSourceRawPtrType) ToFileSourceRawPtrOutput() FileSourceRawPtrOutput {
	return i.ToFileSourceRawPtrOutputWithContext(context.Background())
}

func (i *fileSourceRawPtrType) ToFileSourceRawPtrOutputWithContext(ctx context.Context) FileSourceRawPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSourceRawPtrOutput)
}

type FileSourceRawOutput struct{ *pulumi.OutputState }

func (FileSourceRawOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FileSourceRaw)(nil)).Elem()
}

func (o FileSourceRawOutput) ToFileSourceRawOutput() FileSourceRawOutput {
	return o
}

func (o FileSourceRawOutput) ToFileSourceRawOutputWithContext(ctx context.Context) FileSourceRawOutput {
	return o
}

func (o FileSourceRawOutput) ToFileSourceRawPtrOutput() FileSourceRawPtrOutput {
	return o.ToFileSourceRawPtrOutputWithContext(context.Background())
}

func (o FileSourceRawOutput) ToFileSourceRawPtrOutputWithContext(ctx context.Context) FileSourceRawPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v FileSourceRaw) *FileSourceRaw {
		return &v
	}).(FileSourceRawPtrOutput)
}

func (o FileSourceRawOutput) Data() pulumi.StringOutput {
	return o.ApplyT(func(v FileSourceRaw) string { return v.Data }).(pulumi.StringOutput)
}

func (o FileSourceRawOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v FileSourceRaw) string { return v.FileName }).(pulumi.StringOutput)
}

func (o FileSourceRawOutput) Resize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v FileSourceRaw) *int { return v.Resize }).(pulumi.IntPtrOutput)
}

type FileSourceRawPtrOutput struct{ *pulumi.OutputState }

func (FileSourceRawPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSourceRaw)(nil)).Elem()
}

func (o FileSourceRawPtrOutput) ToFileSourceRawPtrOutput() FileSourceRawPtrOutput {
	return o
}

func (o FileSourceRawPtrOutput) ToFileSourceRawPtrOutputWithContext(ctx context.Context) FileSourceRawPtrOutput {
	return o
}

func (o FileSourceRawPtrOutput) Elem() FileSourceRawOutput {
	return o.ApplyT(func(v *FileSourceRaw) FileSourceRaw {
		if v != nil {
			return *v
		}
		var ret FileSourceRaw
		return ret
	}).(FileSourceRawOutput)
}

func (o FileSourceRawPtrOutput) Data() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSourceRaw) *string {
		if v == nil {
			return nil
		}
		return &v.Data
	}).(pulumi.StringPtrOutput)
}

func (o FileSourceRawPtrOutput) FileName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSourceRaw) *string {
		if v == nil {
			return nil
		}
		return &v.FileName
	}).(pulumi.StringPtrOutput)
}

func (o FileSourceRawPtrOutput) Resize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FileSourceRaw) *int {
		if v == nil {
			return nil
		}
		return v.Resize
	}).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceFileInput)(nil)).Elem(), FileSourceFileArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceFilePtrInput)(nil)).Elem(), FileSourceFileArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceRawInput)(nil)).Elem(), FileSourceRawArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSourceRawPtrInput)(nil)).Elem(), FileSourceRawArgs{})
	pulumi.RegisterOutputType(FileSourceFileOutput{})
	pulumi.RegisterOutputType(FileSourceFilePtrOutput{})
	pulumi.RegisterOutputType(FileSourceRawOutput{})
	pulumi.RegisterOutputType(FileSourceRawPtrOutput{})
}
