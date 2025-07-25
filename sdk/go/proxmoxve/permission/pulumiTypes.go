// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

var _ = internal.GetEnvOrDefault

type GroupAcl struct {
	// The path.
	Path string `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate *bool `pulumi:"propagate"`
	// The role identifier.
	RoleId string `pulumi:"roleId"`
}

// GroupAclInput is an input type that accepts GroupAclArgs and GroupAclOutput values.
// You can construct a concrete instance of `GroupAclInput` via:
//
//	GroupAclArgs{...}
type GroupAclInput interface {
	pulumi.Input

	ToGroupAclOutput() GroupAclOutput
	ToGroupAclOutputWithContext(context.Context) GroupAclOutput
}

type GroupAclArgs struct {
	// The path.
	Path pulumi.StringInput `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate pulumi.BoolPtrInput `pulumi:"propagate"`
	// The role identifier.
	RoleId pulumi.StringInput `pulumi:"roleId"`
}

func (GroupAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupAcl)(nil)).Elem()
}

func (i GroupAclArgs) ToGroupAclOutput() GroupAclOutput {
	return i.ToGroupAclOutputWithContext(context.Background())
}

func (i GroupAclArgs) ToGroupAclOutputWithContext(ctx context.Context) GroupAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupAclOutput)
}

// GroupAclArrayInput is an input type that accepts GroupAclArray and GroupAclArrayOutput values.
// You can construct a concrete instance of `GroupAclArrayInput` via:
//
//	GroupAclArray{ GroupAclArgs{...} }
type GroupAclArrayInput interface {
	pulumi.Input

	ToGroupAclArrayOutput() GroupAclArrayOutput
	ToGroupAclArrayOutputWithContext(context.Context) GroupAclArrayOutput
}

type GroupAclArray []GroupAclInput

func (GroupAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GroupAcl)(nil)).Elem()
}

func (i GroupAclArray) ToGroupAclArrayOutput() GroupAclArrayOutput {
	return i.ToGroupAclArrayOutputWithContext(context.Background())
}

func (i GroupAclArray) ToGroupAclArrayOutputWithContext(ctx context.Context) GroupAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupAclArrayOutput)
}

type GroupAclOutput struct{ *pulumi.OutputState }

func (GroupAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GroupAcl)(nil)).Elem()
}

func (o GroupAclOutput) ToGroupAclOutput() GroupAclOutput {
	return o
}

func (o GroupAclOutput) ToGroupAclOutputWithContext(ctx context.Context) GroupAclOutput {
	return o
}

// The path.
func (o GroupAclOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v GroupAcl) string { return v.Path }).(pulumi.StringOutput)
}

// Whether to propagate to child paths.
func (o GroupAclOutput) Propagate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GroupAcl) *bool { return v.Propagate }).(pulumi.BoolPtrOutput)
}

// The role identifier.
func (o GroupAclOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v GroupAcl) string { return v.RoleId }).(pulumi.StringOutput)
}

type GroupAclArrayOutput struct{ *pulumi.OutputState }

func (GroupAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GroupAcl)(nil)).Elem()
}

func (o GroupAclArrayOutput) ToGroupAclArrayOutput() GroupAclArrayOutput {
	return o
}

func (o GroupAclArrayOutput) ToGroupAclArrayOutputWithContext(ctx context.Context) GroupAclArrayOutput {
	return o
}

func (o GroupAclArrayOutput) Index(i pulumi.IntInput) GroupAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GroupAcl {
		return vs[0].([]GroupAcl)[vs[1].(int)]
	}).(GroupAclOutput)
}

type PoolMember struct {
	// The datastore identifier.
	DatastoreId *string `pulumi:"datastoreId"`
	// The member identifier.
	Id *string `pulumi:"id"`
	// The node name.
	NodeName *string `pulumi:"nodeName"`
	// The member type.
	Type *string `pulumi:"type"`
	// The virtual machine identifier.
	VmId *int `pulumi:"vmId"`
}

// PoolMemberInput is an input type that accepts PoolMemberArgs and PoolMemberOutput values.
// You can construct a concrete instance of `PoolMemberInput` via:
//
//	PoolMemberArgs{...}
type PoolMemberInput interface {
	pulumi.Input

	ToPoolMemberOutput() PoolMemberOutput
	ToPoolMemberOutputWithContext(context.Context) PoolMemberOutput
}

type PoolMemberArgs struct {
	// The datastore identifier.
	DatastoreId pulumi.StringPtrInput `pulumi:"datastoreId"`
	// The member identifier.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The node name.
	NodeName pulumi.StringPtrInput `pulumi:"nodeName"`
	// The member type.
	Type pulumi.StringPtrInput `pulumi:"type"`
	// The virtual machine identifier.
	VmId pulumi.IntPtrInput `pulumi:"vmId"`
}

func (PoolMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*PoolMember)(nil)).Elem()
}

func (i PoolMemberArgs) ToPoolMemberOutput() PoolMemberOutput {
	return i.ToPoolMemberOutputWithContext(context.Background())
}

func (i PoolMemberArgs) ToPoolMemberOutputWithContext(ctx context.Context) PoolMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PoolMemberOutput)
}

// PoolMemberArrayInput is an input type that accepts PoolMemberArray and PoolMemberArrayOutput values.
// You can construct a concrete instance of `PoolMemberArrayInput` via:
//
//	PoolMemberArray{ PoolMemberArgs{...} }
type PoolMemberArrayInput interface {
	pulumi.Input

	ToPoolMemberArrayOutput() PoolMemberArrayOutput
	ToPoolMemberArrayOutputWithContext(context.Context) PoolMemberArrayOutput
}

type PoolMemberArray []PoolMemberInput

func (PoolMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PoolMember)(nil)).Elem()
}

func (i PoolMemberArray) ToPoolMemberArrayOutput() PoolMemberArrayOutput {
	return i.ToPoolMemberArrayOutputWithContext(context.Background())
}

func (i PoolMemberArray) ToPoolMemberArrayOutputWithContext(ctx context.Context) PoolMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PoolMemberArrayOutput)
}

type PoolMemberOutput struct{ *pulumi.OutputState }

func (PoolMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*PoolMember)(nil)).Elem()
}

func (o PoolMemberOutput) ToPoolMemberOutput() PoolMemberOutput {
	return o
}

func (o PoolMemberOutput) ToPoolMemberOutputWithContext(ctx context.Context) PoolMemberOutput {
	return o
}

// The datastore identifier.
func (o PoolMemberOutput) DatastoreId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PoolMember) *string { return v.DatastoreId }).(pulumi.StringPtrOutput)
}

// The member identifier.
func (o PoolMemberOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PoolMember) *string { return v.Id }).(pulumi.StringPtrOutput)
}

// The node name.
func (o PoolMemberOutput) NodeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PoolMember) *string { return v.NodeName }).(pulumi.StringPtrOutput)
}

// The member type.
func (o PoolMemberOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v PoolMember) *string { return v.Type }).(pulumi.StringPtrOutput)
}

// The virtual machine identifier.
func (o PoolMemberOutput) VmId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v PoolMember) *int { return v.VmId }).(pulumi.IntPtrOutput)
}

type PoolMemberArrayOutput struct{ *pulumi.OutputState }

func (PoolMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]PoolMember)(nil)).Elem()
}

func (o PoolMemberArrayOutput) ToPoolMemberArrayOutput() PoolMemberArrayOutput {
	return o
}

func (o PoolMemberArrayOutput) ToPoolMemberArrayOutputWithContext(ctx context.Context) PoolMemberArrayOutput {
	return o
}

func (o PoolMemberArrayOutput) Index(i pulumi.IntInput) PoolMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) PoolMember {
		return vs[0].([]PoolMember)[vs[1].(int)]
	}).(PoolMemberOutput)
}

type UserAcl struct {
	// The path.
	Path string `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate *bool `pulumi:"propagate"`
	// The role identifier.
	RoleId string `pulumi:"roleId"`
}

// UserAclInput is an input type that accepts UserAclArgs and UserAclOutput values.
// You can construct a concrete instance of `UserAclInput` via:
//
//	UserAclArgs{...}
type UserAclInput interface {
	pulumi.Input

	ToUserAclOutput() UserAclOutput
	ToUserAclOutputWithContext(context.Context) UserAclOutput
}

type UserAclArgs struct {
	// The path.
	Path pulumi.StringInput `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate pulumi.BoolPtrInput `pulumi:"propagate"`
	// The role identifier.
	RoleId pulumi.StringInput `pulumi:"roleId"`
}

func (UserAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*UserAcl)(nil)).Elem()
}

func (i UserAclArgs) ToUserAclOutput() UserAclOutput {
	return i.ToUserAclOutputWithContext(context.Background())
}

func (i UserAclArgs) ToUserAclOutputWithContext(ctx context.Context) UserAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAclOutput)
}

// UserAclArrayInput is an input type that accepts UserAclArray and UserAclArrayOutput values.
// You can construct a concrete instance of `UserAclArrayInput` via:
//
//	UserAclArray{ UserAclArgs{...} }
type UserAclArrayInput interface {
	pulumi.Input

	ToUserAclArrayOutput() UserAclArrayOutput
	ToUserAclArrayOutputWithContext(context.Context) UserAclArrayOutput
}

type UserAclArray []UserAclInput

func (UserAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]UserAcl)(nil)).Elem()
}

func (i UserAclArray) ToUserAclArrayOutput() UserAclArrayOutput {
	return i.ToUserAclArrayOutputWithContext(context.Background())
}

func (i UserAclArray) ToUserAclArrayOutputWithContext(ctx context.Context) UserAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserAclArrayOutput)
}

type UserAclOutput struct{ *pulumi.OutputState }

func (UserAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*UserAcl)(nil)).Elem()
}

func (o UserAclOutput) ToUserAclOutput() UserAclOutput {
	return o
}

func (o UserAclOutput) ToUserAclOutputWithContext(ctx context.Context) UserAclOutput {
	return o
}

// The path.
func (o UserAclOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v UserAcl) string { return v.Path }).(pulumi.StringOutput)
}

// Whether to propagate to child paths.
func (o UserAclOutput) Propagate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v UserAcl) *bool { return v.Propagate }).(pulumi.BoolPtrOutput)
}

// The role identifier.
func (o UserAclOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v UserAcl) string { return v.RoleId }).(pulumi.StringOutput)
}

type UserAclArrayOutput struct{ *pulumi.OutputState }

func (UserAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]UserAcl)(nil)).Elem()
}

func (o UserAclArrayOutput) ToUserAclArrayOutput() UserAclArrayOutput {
	return o
}

func (o UserAclArrayOutput) ToUserAclArrayOutputWithContext(ctx context.Context) UserAclArrayOutput {
	return o
}

func (o UserAclArrayOutput) Index(i pulumi.IntInput) UserAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) UserAcl {
		return vs[0].([]UserAcl)[vs[1].(int)]
	}).(UserAclOutput)
}

type GetGroupAcl struct {
	// The path.
	Path string `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate bool `pulumi:"propagate"`
	// The role identifier.
	RoleId string `pulumi:"roleId"`
}

// GetGroupAclInput is an input type that accepts GetGroupAclArgs and GetGroupAclOutput values.
// You can construct a concrete instance of `GetGroupAclInput` via:
//
//	GetGroupAclArgs{...}
type GetGroupAclInput interface {
	pulumi.Input

	ToGetGroupAclOutput() GetGroupAclOutput
	ToGetGroupAclOutputWithContext(context.Context) GetGroupAclOutput
}

type GetGroupAclArgs struct {
	// The path.
	Path pulumi.StringInput `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate pulumi.BoolInput `pulumi:"propagate"`
	// The role identifier.
	RoleId pulumi.StringInput `pulumi:"roleId"`
}

func (GetGroupAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupAcl)(nil)).Elem()
}

func (i GetGroupAclArgs) ToGetGroupAclOutput() GetGroupAclOutput {
	return i.ToGetGroupAclOutputWithContext(context.Background())
}

func (i GetGroupAclArgs) ToGetGroupAclOutputWithContext(ctx context.Context) GetGroupAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetGroupAclOutput)
}

// GetGroupAclArrayInput is an input type that accepts GetGroupAclArray and GetGroupAclArrayOutput values.
// You can construct a concrete instance of `GetGroupAclArrayInput` via:
//
//	GetGroupAclArray{ GetGroupAclArgs{...} }
type GetGroupAclArrayInput interface {
	pulumi.Input

	ToGetGroupAclArrayOutput() GetGroupAclArrayOutput
	ToGetGroupAclArrayOutputWithContext(context.Context) GetGroupAclArrayOutput
}

type GetGroupAclArray []GetGroupAclInput

func (GetGroupAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetGroupAcl)(nil)).Elem()
}

func (i GetGroupAclArray) ToGetGroupAclArrayOutput() GetGroupAclArrayOutput {
	return i.ToGetGroupAclArrayOutputWithContext(context.Background())
}

func (i GetGroupAclArray) ToGetGroupAclArrayOutputWithContext(ctx context.Context) GetGroupAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetGroupAclArrayOutput)
}

type GetGroupAclOutput struct{ *pulumi.OutputState }

func (GetGroupAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupAcl)(nil)).Elem()
}

func (o GetGroupAclOutput) ToGetGroupAclOutput() GetGroupAclOutput {
	return o
}

func (o GetGroupAclOutput) ToGetGroupAclOutputWithContext(ctx context.Context) GetGroupAclOutput {
	return o
}

// The path.
func (o GetGroupAclOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupAcl) string { return v.Path }).(pulumi.StringOutput)
}

// Whether to propagate to child paths.
func (o GetGroupAclOutput) Propagate() pulumi.BoolOutput {
	return o.ApplyT(func(v GetGroupAcl) bool { return v.Propagate }).(pulumi.BoolOutput)
}

// The role identifier.
func (o GetGroupAclOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupAcl) string { return v.RoleId }).(pulumi.StringOutput)
}

type GetGroupAclArrayOutput struct{ *pulumi.OutputState }

func (GetGroupAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetGroupAcl)(nil)).Elem()
}

func (o GetGroupAclArrayOutput) ToGetGroupAclArrayOutput() GetGroupAclArrayOutput {
	return o
}

func (o GetGroupAclArrayOutput) ToGetGroupAclArrayOutputWithContext(ctx context.Context) GetGroupAclArrayOutput {
	return o
}

func (o GetGroupAclArrayOutput) Index(i pulumi.IntInput) GetGroupAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetGroupAcl {
		return vs[0].([]GetGroupAcl)[vs[1].(int)]
	}).(GetGroupAclOutput)
}

type GetPoolMember struct {
	// The datastore identifier.
	DatastoreId string `pulumi:"datastoreId"`
	// The member identifier.
	Id string `pulumi:"id"`
	// The node name.
	NodeName string `pulumi:"nodeName"`
	// The member type.
	Type string `pulumi:"type"`
	// The virtual machine identifier.
	VmId int `pulumi:"vmId"`
}

// GetPoolMemberInput is an input type that accepts GetPoolMemberArgs and GetPoolMemberOutput values.
// You can construct a concrete instance of `GetPoolMemberInput` via:
//
//	GetPoolMemberArgs{...}
type GetPoolMemberInput interface {
	pulumi.Input

	ToGetPoolMemberOutput() GetPoolMemberOutput
	ToGetPoolMemberOutputWithContext(context.Context) GetPoolMemberOutput
}

type GetPoolMemberArgs struct {
	// The datastore identifier.
	DatastoreId pulumi.StringInput `pulumi:"datastoreId"`
	// The member identifier.
	Id pulumi.StringInput `pulumi:"id"`
	// The node name.
	NodeName pulumi.StringInput `pulumi:"nodeName"`
	// The member type.
	Type pulumi.StringInput `pulumi:"type"`
	// The virtual machine identifier.
	VmId pulumi.IntInput `pulumi:"vmId"`
}

func (GetPoolMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPoolMember)(nil)).Elem()
}

func (i GetPoolMemberArgs) ToGetPoolMemberOutput() GetPoolMemberOutput {
	return i.ToGetPoolMemberOutputWithContext(context.Background())
}

func (i GetPoolMemberArgs) ToGetPoolMemberOutputWithContext(ctx context.Context) GetPoolMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetPoolMemberOutput)
}

// GetPoolMemberArrayInput is an input type that accepts GetPoolMemberArray and GetPoolMemberArrayOutput values.
// You can construct a concrete instance of `GetPoolMemberArrayInput` via:
//
//	GetPoolMemberArray{ GetPoolMemberArgs{...} }
type GetPoolMemberArrayInput interface {
	pulumi.Input

	ToGetPoolMemberArrayOutput() GetPoolMemberArrayOutput
	ToGetPoolMemberArrayOutputWithContext(context.Context) GetPoolMemberArrayOutput
}

type GetPoolMemberArray []GetPoolMemberInput

func (GetPoolMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetPoolMember)(nil)).Elem()
}

func (i GetPoolMemberArray) ToGetPoolMemberArrayOutput() GetPoolMemberArrayOutput {
	return i.ToGetPoolMemberArrayOutputWithContext(context.Background())
}

func (i GetPoolMemberArray) ToGetPoolMemberArrayOutputWithContext(ctx context.Context) GetPoolMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetPoolMemberArrayOutput)
}

type GetPoolMemberOutput struct{ *pulumi.OutputState }

func (GetPoolMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPoolMember)(nil)).Elem()
}

func (o GetPoolMemberOutput) ToGetPoolMemberOutput() GetPoolMemberOutput {
	return o
}

func (o GetPoolMemberOutput) ToGetPoolMemberOutputWithContext(ctx context.Context) GetPoolMemberOutput {
	return o
}

// The datastore identifier.
func (o GetPoolMemberOutput) DatastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoolMember) string { return v.DatastoreId }).(pulumi.StringOutput)
}

// The member identifier.
func (o GetPoolMemberOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoolMember) string { return v.Id }).(pulumi.StringOutput)
}

// The node name.
func (o GetPoolMemberOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoolMember) string { return v.NodeName }).(pulumi.StringOutput)
}

// The member type.
func (o GetPoolMemberOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetPoolMember) string { return v.Type }).(pulumi.StringOutput)
}

// The virtual machine identifier.
func (o GetPoolMemberOutput) VmId() pulumi.IntOutput {
	return o.ApplyT(func(v GetPoolMember) int { return v.VmId }).(pulumi.IntOutput)
}

type GetPoolMemberArrayOutput struct{ *pulumi.OutputState }

func (GetPoolMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetPoolMember)(nil)).Elem()
}

func (o GetPoolMemberArrayOutput) ToGetPoolMemberArrayOutput() GetPoolMemberArrayOutput {
	return o
}

func (o GetPoolMemberArrayOutput) ToGetPoolMemberArrayOutputWithContext(ctx context.Context) GetPoolMemberArrayOutput {
	return o
}

func (o GetPoolMemberArrayOutput) Index(i pulumi.IntInput) GetPoolMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetPoolMember {
		return vs[0].([]GetPoolMember)[vs[1].(int)]
	}).(GetPoolMemberOutput)
}

type GetUserAcl struct {
	// The path.
	Path string `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate bool `pulumi:"propagate"`
	// The role identifier.
	RoleId string `pulumi:"roleId"`
}

// GetUserAclInput is an input type that accepts GetUserAclArgs and GetUserAclOutput values.
// You can construct a concrete instance of `GetUserAclInput` via:
//
//	GetUserAclArgs{...}
type GetUserAclInput interface {
	pulumi.Input

	ToGetUserAclOutput() GetUserAclOutput
	ToGetUserAclOutputWithContext(context.Context) GetUserAclOutput
}

type GetUserAclArgs struct {
	// The path.
	Path pulumi.StringInput `pulumi:"path"`
	// Whether to propagate to child paths.
	Propagate pulumi.BoolInput `pulumi:"propagate"`
	// The role identifier.
	RoleId pulumi.StringInput `pulumi:"roleId"`
}

func (GetUserAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserAcl)(nil)).Elem()
}

func (i GetUserAclArgs) ToGetUserAclOutput() GetUserAclOutput {
	return i.ToGetUserAclOutputWithContext(context.Background())
}

func (i GetUserAclArgs) ToGetUserAclOutputWithContext(ctx context.Context) GetUserAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUserAclOutput)
}

// GetUserAclArrayInput is an input type that accepts GetUserAclArray and GetUserAclArrayOutput values.
// You can construct a concrete instance of `GetUserAclArrayInput` via:
//
//	GetUserAclArray{ GetUserAclArgs{...} }
type GetUserAclArrayInput interface {
	pulumi.Input

	ToGetUserAclArrayOutput() GetUserAclArrayOutput
	ToGetUserAclArrayOutputWithContext(context.Context) GetUserAclArrayOutput
}

type GetUserAclArray []GetUserAclInput

func (GetUserAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUserAcl)(nil)).Elem()
}

func (i GetUserAclArray) ToGetUserAclArrayOutput() GetUserAclArrayOutput {
	return i.ToGetUserAclArrayOutputWithContext(context.Background())
}

func (i GetUserAclArray) ToGetUserAclArrayOutputWithContext(ctx context.Context) GetUserAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetUserAclArrayOutput)
}

type GetUserAclOutput struct{ *pulumi.OutputState }

func (GetUserAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserAcl)(nil)).Elem()
}

func (o GetUserAclOutput) ToGetUserAclOutput() GetUserAclOutput {
	return o
}

func (o GetUserAclOutput) ToGetUserAclOutputWithContext(ctx context.Context) GetUserAclOutput {
	return o
}

// The path.
func (o GetUserAclOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserAcl) string { return v.Path }).(pulumi.StringOutput)
}

// Whether to propagate to child paths.
func (o GetUserAclOutput) Propagate() pulumi.BoolOutput {
	return o.ApplyT(func(v GetUserAcl) bool { return v.Propagate }).(pulumi.BoolOutput)
}

// The role identifier.
func (o GetUserAclOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserAcl) string { return v.RoleId }).(pulumi.StringOutput)
}

type GetUserAclArrayOutput struct{ *pulumi.OutputState }

func (GetUserAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetUserAcl)(nil)).Elem()
}

func (o GetUserAclArrayOutput) ToGetUserAclArrayOutput() GetUserAclArrayOutput {
	return o
}

func (o GetUserAclArrayOutput) ToGetUserAclArrayOutputWithContext(ctx context.Context) GetUserAclArrayOutput {
	return o
}

func (o GetUserAclArrayOutput) Index(i pulumi.IntInput) GetUserAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetUserAcl {
		return vs[0].([]GetUserAcl)[vs[1].(int)]
	}).(GetUserAclOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupAclInput)(nil)).Elem(), GroupAclArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupAclArrayInput)(nil)).Elem(), GroupAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PoolMemberInput)(nil)).Elem(), PoolMemberArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*PoolMemberArrayInput)(nil)).Elem(), PoolMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserAclInput)(nil)).Elem(), UserAclArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserAclArrayInput)(nil)).Elem(), UserAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetGroupAclInput)(nil)).Elem(), GetGroupAclArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetGroupAclArrayInput)(nil)).Elem(), GetGroupAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetPoolMemberInput)(nil)).Elem(), GetPoolMemberArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetPoolMemberArrayInput)(nil)).Elem(), GetPoolMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetUserAclInput)(nil)).Elem(), GetUserAclArgs{})
	pulumi.RegisterInputType(reflect.TypeOf((*GetUserAclArrayInput)(nil)).Elem(), GetUserAclArray{})
	pulumi.RegisterOutputType(GroupAclOutput{})
	pulumi.RegisterOutputType(GroupAclArrayOutput{})
	pulumi.RegisterOutputType(PoolMemberOutput{})
	pulumi.RegisterOutputType(PoolMemberArrayOutput{})
	pulumi.RegisterOutputType(UserAclOutput{})
	pulumi.RegisterOutputType(UserAclArrayOutput{})
	pulumi.RegisterOutputType(GetGroupAclOutput{})
	pulumi.RegisterOutputType(GetGroupAclArrayOutput{})
	pulumi.RegisterOutputType(GetPoolMemberOutput{})
	pulumi.RegisterOutputType(GetPoolMemberArrayOutput{})
	pulumi.RegisterOutputType(GetUserAclOutput{})
	pulumi.RegisterOutputType(GetUserAclArrayOutput{})
}
