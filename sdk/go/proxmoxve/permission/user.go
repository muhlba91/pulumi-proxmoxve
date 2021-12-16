// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type User struct {
	pulumi.CustomResourceState

	// The access control list
	Acls UserAclArrayOutput `pulumi:"acls"`
	// The user comment
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The user's email address
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Whether the user account is enabled
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The user account's expiration date
	ExpirationDate pulumi.StringPtrOutput `pulumi:"expirationDate"`
	// The user's first name
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// The user's groups
	Groups pulumi.StringArrayOutput `pulumi:"groups"`
	// The user's keys
	Keys pulumi.StringPtrOutput `pulumi:"keys"`
	// The user's last name
	LastName pulumi.StringPtrOutput `pulumi:"lastName"`
	// The user's password
	Password pulumi.StringOutput `pulumi:"password"`
	// The user id
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource User
	err := ctx.RegisterResource("proxmoxve:Permission/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("proxmoxve:Permission/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The access control list
	Acls []UserAcl `pulumi:"acls"`
	// The user comment
	Comment *string `pulumi:"comment"`
	// The user's email address
	Email *string `pulumi:"email"`
	// Whether the user account is enabled
	Enabled *bool `pulumi:"enabled"`
	// The user account's expiration date
	ExpirationDate *string `pulumi:"expirationDate"`
	// The user's first name
	FirstName *string `pulumi:"firstName"`
	// The user's groups
	Groups []string `pulumi:"groups"`
	// The user's keys
	Keys *string `pulumi:"keys"`
	// The user's last name
	LastName *string `pulumi:"lastName"`
	// The user's password
	Password *string `pulumi:"password"`
	// The user id
	UserId *string `pulumi:"userId"`
}

type UserState struct {
	// The access control list
	Acls UserAclArrayInput
	// The user comment
	Comment pulumi.StringPtrInput
	// The user's email address
	Email pulumi.StringPtrInput
	// Whether the user account is enabled
	Enabled pulumi.BoolPtrInput
	// The user account's expiration date
	ExpirationDate pulumi.StringPtrInput
	// The user's first name
	FirstName pulumi.StringPtrInput
	// The user's groups
	Groups pulumi.StringArrayInput
	// The user's keys
	Keys pulumi.StringPtrInput
	// The user's last name
	LastName pulumi.StringPtrInput
	// The user's password
	Password pulumi.StringPtrInput
	// The user id
	UserId pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The access control list
	Acls []UserAcl `pulumi:"acls"`
	// The user comment
	Comment *string `pulumi:"comment"`
	// The user's email address
	Email *string `pulumi:"email"`
	// Whether the user account is enabled
	Enabled *bool `pulumi:"enabled"`
	// The user account's expiration date
	ExpirationDate *string `pulumi:"expirationDate"`
	// The user's first name
	FirstName *string `pulumi:"firstName"`
	// The user's groups
	Groups []string `pulumi:"groups"`
	// The user's keys
	Keys *string `pulumi:"keys"`
	// The user's last name
	LastName *string `pulumi:"lastName"`
	// The user's password
	Password string `pulumi:"password"`
	// The user id
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The access control list
	Acls UserAclArrayInput
	// The user comment
	Comment pulumi.StringPtrInput
	// The user's email address
	Email pulumi.StringPtrInput
	// Whether the user account is enabled
	Enabled pulumi.BoolPtrInput
	// The user account's expiration date
	ExpirationDate pulumi.StringPtrInput
	// The user's first name
	FirstName pulumi.StringPtrInput
	// The user's groups
	Groups pulumi.StringArrayInput
	// The user's keys
	Keys pulumi.StringPtrInput
	// The user's last name
	LastName pulumi.StringPtrInput
	// The user's password
	Password pulumi.StringInput
	// The user id
	UserId pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//          UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//          UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
