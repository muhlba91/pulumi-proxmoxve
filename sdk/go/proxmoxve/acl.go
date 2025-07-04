// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages ACLs on the Proxmox cluster.
//
// ACLs are used to control access to resources in the Proxmox cluster.
// Each ACL consists of a path, a user, group or token, a role, and a flag to allow propagation of permissions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve"
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/permission"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			operationsAutomation, err := permission.NewUser(ctx, "operationsAutomation", &permission.UserArgs{
//				Comment:  pulumi.String("Managed by Pulumi"),
//				Password: pulumi.String("a-strong-password"),
//				UserId:   pulumi.String("operations-automation@pve"),
//			})
//			if err != nil {
//				return err
//			}
//			operationsMonitoring, err := permission.NewRole(ctx, "operationsMonitoring", &permission.RoleArgs{
//				RoleId: pulumi.String("operations-monitoring"),
//				Privileges: pulumi.StringArray{
//					pulumi.String("VM.Monitor"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = proxmoxve.NewAcl(ctx, "operationsAutomationMonitoring", &proxmoxve.AclArgs{
//				UserId:    operationsAutomation.UserId,
//				RoleId:    operationsMonitoring.RoleId,
//				Path:      pulumi.String("/vms/1234"),
//				Propagate: pulumi.Bool(true),
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
// ACL can be imported using its unique identifier, e.g.: {path}?{group|user@realm|user@realm!token}?{role}
//
// ```sh
// $ pulumi import proxmoxve:index/acl:Acl operations_automation_monitoring /?monitor@pve?operations-monitoring
// ```
type Acl struct {
	pulumi.CustomResourceState

	// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
	GroupId pulumi.StringPtrOutput `pulumi:"groupId"`
	// Access control path
	Path pulumi.StringOutput `pulumi:"path"`
	// Allow to propagate (inherit) permissions.
	Propagate pulumi.BoolOutput `pulumi:"propagate"`
	// The role to apply
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
	TokenId pulumi.StringPtrOutput `pulumi:"tokenId"`
	// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
}

// NewAcl registers a new resource with the given unique name, arguments, and options.
func NewAcl(ctx *pulumi.Context,
	name string, args *AclArgs, opts ...pulumi.ResourceOption) (*Acl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Acl
	err := ctx.RegisterResource("proxmoxve:index/acl:Acl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAcl gets an existing Acl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAcl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclState, opts ...pulumi.ResourceOption) (*Acl, error) {
	var resource Acl
	err := ctx.ReadResource("proxmoxve:index/acl:Acl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Acl resources.
type aclState struct {
	// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
	GroupId *string `pulumi:"groupId"`
	// Access control path
	Path *string `pulumi:"path"`
	// Allow to propagate (inherit) permissions.
	Propagate *bool `pulumi:"propagate"`
	// The role to apply
	RoleId *string `pulumi:"roleId"`
	// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
	TokenId *string `pulumi:"tokenId"`
	// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
	UserId *string `pulumi:"userId"`
}

type AclState struct {
	// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
	GroupId pulumi.StringPtrInput
	// Access control path
	Path pulumi.StringPtrInput
	// Allow to propagate (inherit) permissions.
	Propagate pulumi.BoolPtrInput
	// The role to apply
	RoleId pulumi.StringPtrInput
	// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
	TokenId pulumi.StringPtrInput
	// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
	UserId pulumi.StringPtrInput
}

func (AclState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclState)(nil)).Elem()
}

type aclArgs struct {
	// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
	GroupId *string `pulumi:"groupId"`
	// Access control path
	Path string `pulumi:"path"`
	// Allow to propagate (inherit) permissions.
	Propagate *bool `pulumi:"propagate"`
	// The role to apply
	RoleId string `pulumi:"roleId"`
	// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
	TokenId *string `pulumi:"tokenId"`
	// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a Acl resource.
type AclArgs struct {
	// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
	GroupId pulumi.StringPtrInput
	// Access control path
	Path pulumi.StringInput
	// Allow to propagate (inherit) permissions.
	Propagate pulumi.BoolPtrInput
	// The role to apply
	RoleId pulumi.StringInput
	// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
	TokenId pulumi.StringPtrInput
	// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
	UserId pulumi.StringPtrInput
}

func (AclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclArgs)(nil)).Elem()
}

type AclInput interface {
	pulumi.Input

	ToAclOutput() AclOutput
	ToAclOutputWithContext(ctx context.Context) AclOutput
}

func (*Acl) ElementType() reflect.Type {
	return reflect.TypeOf((**Acl)(nil)).Elem()
}

func (i *Acl) ToAclOutput() AclOutput {
	return i.ToAclOutputWithContext(context.Background())
}

func (i *Acl) ToAclOutputWithContext(ctx context.Context) AclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclOutput)
}

// AclArrayInput is an input type that accepts AclArray and AclArrayOutput values.
// You can construct a concrete instance of `AclArrayInput` via:
//
//	AclArray{ AclArgs{...} }
type AclArrayInput interface {
	pulumi.Input

	ToAclArrayOutput() AclArrayOutput
	ToAclArrayOutputWithContext(context.Context) AclArrayOutput
}

type AclArray []AclInput

func (AclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Acl)(nil)).Elem()
}

func (i AclArray) ToAclArrayOutput() AclArrayOutput {
	return i.ToAclArrayOutputWithContext(context.Background())
}

func (i AclArray) ToAclArrayOutputWithContext(ctx context.Context) AclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclArrayOutput)
}

// AclMapInput is an input type that accepts AclMap and AclMapOutput values.
// You can construct a concrete instance of `AclMapInput` via:
//
//	AclMap{ "key": AclArgs{...} }
type AclMapInput interface {
	pulumi.Input

	ToAclMapOutput() AclMapOutput
	ToAclMapOutputWithContext(context.Context) AclMapOutput
}

type AclMap map[string]AclInput

func (AclMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Acl)(nil)).Elem()
}

func (i AclMap) ToAclMapOutput() AclMapOutput {
	return i.ToAclMapOutputWithContext(context.Background())
}

func (i AclMap) ToAclMapOutputWithContext(ctx context.Context) AclMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclMapOutput)
}

type AclOutput struct{ *pulumi.OutputState }

func (AclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Acl)(nil)).Elem()
}

func (o AclOutput) ToAclOutput() AclOutput {
	return o
}

func (o AclOutput) ToAclOutputWithContext(ctx context.Context) AclOutput {
	return o
}

// The group the ACL should apply to (mutually exclusive with `tokenId` and `userId`)
func (o AclOutput) GroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Acl) pulumi.StringPtrOutput { return v.GroupId }).(pulumi.StringPtrOutput)
}

// Access control path
func (o AclOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *Acl) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// Allow to propagate (inherit) permissions.
func (o AclOutput) Propagate() pulumi.BoolOutput {
	return o.ApplyT(func(v *Acl) pulumi.BoolOutput { return v.Propagate }).(pulumi.BoolOutput)
}

// The role to apply
func (o AclOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Acl) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

// The token the ACL should apply to (mutually exclusive with `groupId` and `userId`)
func (o AclOutput) TokenId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Acl) pulumi.StringPtrOutput { return v.TokenId }).(pulumi.StringPtrOutput)
}

// The user the ACL should apply to (mutually exclusive with `groupId` and `tokenId`)
func (o AclOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Acl) pulumi.StringPtrOutput { return v.UserId }).(pulumi.StringPtrOutput)
}

type AclArrayOutput struct{ *pulumi.OutputState }

func (AclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Acl)(nil)).Elem()
}

func (o AclArrayOutput) ToAclArrayOutput() AclArrayOutput {
	return o
}

func (o AclArrayOutput) ToAclArrayOutputWithContext(ctx context.Context) AclArrayOutput {
	return o
}

func (o AclArrayOutput) Index(i pulumi.IntInput) AclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Acl {
		return vs[0].([]*Acl)[vs[1].(int)]
	}).(AclOutput)
}

type AclMapOutput struct{ *pulumi.OutputState }

func (AclMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Acl)(nil)).Elem()
}

func (o AclMapOutput) ToAclMapOutput() AclMapOutput {
	return o
}

func (o AclMapOutput) ToAclMapOutputWithContext(ctx context.Context) AclMapOutput {
	return o
}

func (o AclMapOutput) MapIndex(k pulumi.StringInput) AclOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Acl {
		return vs[0].(map[string]*Acl)[vs[1].(string)]
	}).(AclOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclInput)(nil)).Elem(), &Acl{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclArrayInput)(nil)).Elem(), AclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclMapInput)(nil)).Elem(), AclMap{})
	pulumi.RegisterOutputType(AclOutput{})
	pulumi.RegisterOutputType(AclArrayOutput{})
	pulumi.RegisterOutputType(AclMapOutput{})
}
