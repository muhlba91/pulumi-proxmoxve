// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apt

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves an APT repository from a Proxmox VE cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Apt"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := Apt.GetRepository(ctx, &apt.GetRepositoryArgs{
//				FilePath: "/etc/apt/sources.list",
//				Index:    0,
//				Node:     "pve",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("proxmoxVirtualEnvironmentAptRepository", example)
//			return nil
//		})
//	}
//
// ```
func LookupRepository(ctx *pulumi.Context, args *LookupRepositoryArgs, opts ...pulumi.InvokeOption) (*LookupRepositoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRepositoryResult
	err := ctx.Invoke("proxmoxve:Apt/getRepository:getRepository", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRepository.
type LookupRepositoryArgs struct {
	// The absolute path of the source list file that contains this repository.
	FilePath string `pulumi:"filePath"`
	// The index within the defining source list file.
	Index int `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node string `pulumi:"node"`
}

// A collection of values returned by getRepository.
type LookupRepositoryResult struct {
	// The associated comment.
	Comment string `pulumi:"comment"`
	// The list of components.
	Components []string `pulumi:"components"`
	// Indicates the activation status.
	Enabled bool `pulumi:"enabled"`
	// The absolute path of the source list file that contains this repository.
	FilePath string `pulumi:"filePath"`
	// The format of the defining source list file.
	FileType string `pulumi:"fileType"`
	// The unique identifier of this APT repository data source.
	Id string `pulumi:"id"`
	// The index within the defining source list file.
	Index int `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node string `pulumi:"node"`
	// The list of package types.
	PackageTypes []string `pulumi:"packageTypes"`
	// The list of package distributions.
	Suites []string `pulumi:"suites"`
	// The list of repository URIs.
	Uris []string `pulumi:"uris"`
}

func LookupRepositoryOutput(ctx *pulumi.Context, args LookupRepositoryOutputArgs, opts ...pulumi.InvokeOption) LookupRepositoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRepositoryResult, error) {
			args := v.(LookupRepositoryArgs)
			r, err := LookupRepository(ctx, &args, opts...)
			var s LookupRepositoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupRepositoryResultOutput)
}

// A collection of arguments for invoking getRepository.
type LookupRepositoryOutputArgs struct {
	// The absolute path of the source list file that contains this repository.
	FilePath pulumi.StringInput `pulumi:"filePath"`
	// The index within the defining source list file.
	Index pulumi.IntInput `pulumi:"index"`
	// The name of the target Proxmox VE node.
	Node pulumi.StringInput `pulumi:"node"`
}

func (LookupRepositoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRepositoryArgs)(nil)).Elem()
}

// A collection of values returned by getRepository.
type LookupRepositoryResultOutput struct{ *pulumi.OutputState }

func (LookupRepositoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRepositoryResult)(nil)).Elem()
}

func (o LookupRepositoryResultOutput) ToLookupRepositoryResultOutput() LookupRepositoryResultOutput {
	return o
}

func (o LookupRepositoryResultOutput) ToLookupRepositoryResultOutputWithContext(ctx context.Context) LookupRepositoryResultOutput {
	return o
}

// The associated comment.
func (o LookupRepositoryResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepositoryResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The list of components.
func (o LookupRepositoryResultOutput) Components() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRepositoryResult) []string { return v.Components }).(pulumi.StringArrayOutput)
}

// Indicates the activation status.
func (o LookupRepositoryResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRepositoryResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The absolute path of the source list file that contains this repository.
func (o LookupRepositoryResultOutput) FilePath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepositoryResult) string { return v.FilePath }).(pulumi.StringOutput)
}

// The format of the defining source list file.
func (o LookupRepositoryResultOutput) FileType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepositoryResult) string { return v.FileType }).(pulumi.StringOutput)
}

// The unique identifier of this APT repository data source.
func (o LookupRepositoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepositoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// The index within the defining source list file.
func (o LookupRepositoryResultOutput) Index() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRepositoryResult) int { return v.Index }).(pulumi.IntOutput)
}

// The name of the target Proxmox VE node.
func (o LookupRepositoryResultOutput) Node() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRepositoryResult) string { return v.Node }).(pulumi.StringOutput)
}

// The list of package types.
func (o LookupRepositoryResultOutput) PackageTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRepositoryResult) []string { return v.PackageTypes }).(pulumi.StringArrayOutput)
}

// The list of package distributions.
func (o LookupRepositoryResultOutput) Suites() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRepositoryResult) []string { return v.Suites }).(pulumi.StringArrayOutput)
}

// The list of repository URIs.
func (o LookupRepositoryResultOutput) Uris() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRepositoryResult) []string { return v.Uris }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRepositoryResultOutput{})
}