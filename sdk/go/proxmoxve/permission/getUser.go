// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves information about a specific user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v7/go/proxmoxve/permission"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := permission.GetUser(ctx, &permission.GetUserArgs{
//				UserId: "operation@pam",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserResult
	err := ctx.Invoke("proxmoxve:Permission/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// The user identifier.
	UserId string `pulumi:"userId"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// The access control list.
	Acls []GetUserAcl `pulumi:"acls"`
	// The user comment.
	Comment string `pulumi:"comment"`
	// The user's email address.
	Email string `pulumi:"email"`
	// Whether the user account is enabled.
	Enabled bool `pulumi:"enabled"`
	// The user account's expiration date (RFC 3339).
	ExpirationDate string `pulumi:"expirationDate"`
	// The user's first name.
	FirstName string `pulumi:"firstName"`
	// The user's groups.
	Groups []string `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The user's keys.
	Keys string `pulumi:"keys"`
	// The user's last name.
	LastName string `pulumi:"lastName"`
	UserId   string `pulumi:"userId"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupUserResultOutput, error) {
			args := v.(LookupUserArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("proxmoxve:Permission/getUser:getUser", args, LookupUserResultOutput{}, options).(LookupUserResultOutput), nil
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// The user identifier.
	UserId pulumi.StringInput `pulumi:"userId"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// The access control list.
func (o LookupUserResultOutput) Acls() GetUserAclArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserAcl { return v.Acls }).(GetUserAclArrayOutput)
}

// The user comment.
func (o LookupUserResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The user's email address.
func (o LookupUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// Whether the user account is enabled.
func (o LookupUserResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The user account's expiration date (RFC 3339).
func (o LookupUserResultOutput) ExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.ExpirationDate }).(pulumi.StringOutput)
}

// The user's first name.
func (o LookupUserResultOutput) FirstName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.FirstName }).(pulumi.StringOutput)
}

// The user's groups.
func (o LookupUserResultOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []string { return v.Groups }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The user's keys.
func (o LookupUserResultOutput) Keys() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Keys }).(pulumi.StringOutput)
}

// The user's last name.
func (o LookupUserResultOutput) LastName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.LastName }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.UserId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
