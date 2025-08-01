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

// Manages the custom SSL/TLS certificate for a specific node.
type Certifi struct {
	pulumi.CustomResourceState

	// The PEM encoded certificate.
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// The PEM encoded certificate chain.
	CertificateChain pulumi.StringPtrOutput `pulumi:"certificateChain"`
	// The expiration date (RFC 3339).
	ExpirationDate pulumi.StringOutput `pulumi:"expirationDate"`
	// The file name.
	FileName pulumi.StringOutput `pulumi:"fileName"`
	// The issuer.
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// A node name.
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// Whether to overwrite an existing certificate
	Overwrite pulumi.BoolPtrOutput `pulumi:"overwrite"`
	// The PEM encoded private key.
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	// The public key size.
	PublicKeySize pulumi.IntOutput `pulumi:"publicKeySize"`
	// The public key type.
	PublicKeyType pulumi.StringOutput `pulumi:"publicKeyType"`
	// The SSL fingerprint.
	SslFingerprint pulumi.StringOutput `pulumi:"sslFingerprint"`
	// The start date (RFC 3339).
	StartDate pulumi.StringOutput `pulumi:"startDate"`
	// The subject.
	Subject pulumi.StringOutput `pulumi:"subject"`
	// The subject alternative names.
	SubjectAlternativeNames pulumi.StringArrayOutput `pulumi:"subjectAlternativeNames"`
}

// NewCertifi registers a new resource with the given unique name, arguments, and options.
func NewCertifi(ctx *pulumi.Context,
	name string, args *CertifiArgs, opts ...pulumi.ResourceOption) (*Certifi, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	if args.PrivateKey == nil {
		return nil, errors.New("invalid value for required argument 'PrivateKey'")
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Certifi
	err := ctx.RegisterResource("proxmoxve:index/certifi:Certifi", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertifi gets an existing Certifi resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertifi(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertifiState, opts ...pulumi.ResourceOption) (*Certifi, error) {
	var resource Certifi
	err := ctx.ReadResource("proxmoxve:index/certifi:Certifi", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Certifi resources.
type certifiState struct {
	// The PEM encoded certificate.
	Certificate *string `pulumi:"certificate"`
	// The PEM encoded certificate chain.
	CertificateChain *string `pulumi:"certificateChain"`
	// The expiration date (RFC 3339).
	ExpirationDate *string `pulumi:"expirationDate"`
	// The file name.
	FileName *string `pulumi:"fileName"`
	// The issuer.
	Issuer *string `pulumi:"issuer"`
	// A node name.
	NodeName *string `pulumi:"nodeName"`
	// Whether to overwrite an existing certificate
	Overwrite *bool `pulumi:"overwrite"`
	// The PEM encoded private key.
	PrivateKey *string `pulumi:"privateKey"`
	// The public key size.
	PublicKeySize *int `pulumi:"publicKeySize"`
	// The public key type.
	PublicKeyType *string `pulumi:"publicKeyType"`
	// The SSL fingerprint.
	SslFingerprint *string `pulumi:"sslFingerprint"`
	// The start date (RFC 3339).
	StartDate *string `pulumi:"startDate"`
	// The subject.
	Subject *string `pulumi:"subject"`
	// The subject alternative names.
	SubjectAlternativeNames []string `pulumi:"subjectAlternativeNames"`
}

type CertifiState struct {
	// The PEM encoded certificate.
	Certificate pulumi.StringPtrInput
	// The PEM encoded certificate chain.
	CertificateChain pulumi.StringPtrInput
	// The expiration date (RFC 3339).
	ExpirationDate pulumi.StringPtrInput
	// The file name.
	FileName pulumi.StringPtrInput
	// The issuer.
	Issuer pulumi.StringPtrInput
	// A node name.
	NodeName pulumi.StringPtrInput
	// Whether to overwrite an existing certificate
	Overwrite pulumi.BoolPtrInput
	// The PEM encoded private key.
	PrivateKey pulumi.StringPtrInput
	// The public key size.
	PublicKeySize pulumi.IntPtrInput
	// The public key type.
	PublicKeyType pulumi.StringPtrInput
	// The SSL fingerprint.
	SslFingerprint pulumi.StringPtrInput
	// The start date (RFC 3339).
	StartDate pulumi.StringPtrInput
	// The subject.
	Subject pulumi.StringPtrInput
	// The subject alternative names.
	SubjectAlternativeNames pulumi.StringArrayInput
}

func (CertifiState) ElementType() reflect.Type {
	return reflect.TypeOf((*certifiState)(nil)).Elem()
}

type certifiArgs struct {
	// The PEM encoded certificate.
	Certificate string `pulumi:"certificate"`
	// The PEM encoded certificate chain.
	CertificateChain *string `pulumi:"certificateChain"`
	// A node name.
	NodeName string `pulumi:"nodeName"`
	// Whether to overwrite an existing certificate
	Overwrite *bool `pulumi:"overwrite"`
	// The PEM encoded private key.
	PrivateKey string `pulumi:"privateKey"`
}

// The set of arguments for constructing a Certifi resource.
type CertifiArgs struct {
	// The PEM encoded certificate.
	Certificate pulumi.StringInput
	// The PEM encoded certificate chain.
	CertificateChain pulumi.StringPtrInput
	// A node name.
	NodeName pulumi.StringInput
	// Whether to overwrite an existing certificate
	Overwrite pulumi.BoolPtrInput
	// The PEM encoded private key.
	PrivateKey pulumi.StringInput
}

func (CertifiArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certifiArgs)(nil)).Elem()
}

type CertifiInput interface {
	pulumi.Input

	ToCertifiOutput() CertifiOutput
	ToCertifiOutputWithContext(ctx context.Context) CertifiOutput
}

func (*Certifi) ElementType() reflect.Type {
	return reflect.TypeOf((**Certifi)(nil)).Elem()
}

func (i *Certifi) ToCertifiOutput() CertifiOutput {
	return i.ToCertifiOutputWithContext(context.Background())
}

func (i *Certifi) ToCertifiOutputWithContext(ctx context.Context) CertifiOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertifiOutput)
}

// CertifiArrayInput is an input type that accepts CertifiArray and CertifiArrayOutput values.
// You can construct a concrete instance of `CertifiArrayInput` via:
//
//	CertifiArray{ CertifiArgs{...} }
type CertifiArrayInput interface {
	pulumi.Input

	ToCertifiArrayOutput() CertifiArrayOutput
	ToCertifiArrayOutputWithContext(context.Context) CertifiArrayOutput
}

type CertifiArray []CertifiInput

func (CertifiArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certifi)(nil)).Elem()
}

func (i CertifiArray) ToCertifiArrayOutput() CertifiArrayOutput {
	return i.ToCertifiArrayOutputWithContext(context.Background())
}

func (i CertifiArray) ToCertifiArrayOutputWithContext(ctx context.Context) CertifiArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertifiArrayOutput)
}

// CertifiMapInput is an input type that accepts CertifiMap and CertifiMapOutput values.
// You can construct a concrete instance of `CertifiMapInput` via:
//
//	CertifiMap{ "key": CertifiArgs{...} }
type CertifiMapInput interface {
	pulumi.Input

	ToCertifiMapOutput() CertifiMapOutput
	ToCertifiMapOutputWithContext(context.Context) CertifiMapOutput
}

type CertifiMap map[string]CertifiInput

func (CertifiMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certifi)(nil)).Elem()
}

func (i CertifiMap) ToCertifiMapOutput() CertifiMapOutput {
	return i.ToCertifiMapOutputWithContext(context.Background())
}

func (i CertifiMap) ToCertifiMapOutputWithContext(ctx context.Context) CertifiMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertifiMapOutput)
}

type CertifiOutput struct{ *pulumi.OutputState }

func (CertifiOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Certifi)(nil)).Elem()
}

func (o CertifiOutput) ToCertifiOutput() CertifiOutput {
	return o
}

func (o CertifiOutput) ToCertifiOutputWithContext(ctx context.Context) CertifiOutput {
	return o
}

// The PEM encoded certificate.
func (o CertifiOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// The PEM encoded certificate chain.
func (o CertifiOutput) CertificateChain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringPtrOutput { return v.CertificateChain }).(pulumi.StringPtrOutput)
}

// The expiration date (RFC 3339).
func (o CertifiOutput) ExpirationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.ExpirationDate }).(pulumi.StringOutput)
}

// The file name.
func (o CertifiOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.FileName }).(pulumi.StringOutput)
}

// The issuer.
func (o CertifiOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// A node name.
func (o CertifiOutput) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// Whether to overwrite an existing certificate
func (o CertifiOutput) Overwrite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Certifi) pulumi.BoolPtrOutput { return v.Overwrite }).(pulumi.BoolPtrOutput)
}

// The PEM encoded private key.
func (o CertifiOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

// The public key size.
func (o CertifiOutput) PublicKeySize() pulumi.IntOutput {
	return o.ApplyT(func(v *Certifi) pulumi.IntOutput { return v.PublicKeySize }).(pulumi.IntOutput)
}

// The public key type.
func (o CertifiOutput) PublicKeyType() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.PublicKeyType }).(pulumi.StringOutput)
}

// The SSL fingerprint.
func (o CertifiOutput) SslFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.SslFingerprint }).(pulumi.StringOutput)
}

// The start date (RFC 3339).
func (o CertifiOutput) StartDate() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.StartDate }).(pulumi.StringOutput)
}

// The subject.
func (o CertifiOutput) Subject() pulumi.StringOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringOutput { return v.Subject }).(pulumi.StringOutput)
}

// The subject alternative names.
func (o CertifiOutput) SubjectAlternativeNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Certifi) pulumi.StringArrayOutput { return v.SubjectAlternativeNames }).(pulumi.StringArrayOutput)
}

type CertifiArrayOutput struct{ *pulumi.OutputState }

func (CertifiArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Certifi)(nil)).Elem()
}

func (o CertifiArrayOutput) ToCertifiArrayOutput() CertifiArrayOutput {
	return o
}

func (o CertifiArrayOutput) ToCertifiArrayOutputWithContext(ctx context.Context) CertifiArrayOutput {
	return o
}

func (o CertifiArrayOutput) Index(i pulumi.IntInput) CertifiOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Certifi {
		return vs[0].([]*Certifi)[vs[1].(int)]
	}).(CertifiOutput)
}

type CertifiMapOutput struct{ *pulumi.OutputState }

func (CertifiMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Certifi)(nil)).Elem()
}

func (o CertifiMapOutput) ToCertifiMapOutput() CertifiMapOutput {
	return o
}

func (o CertifiMapOutput) ToCertifiMapOutputWithContext(ctx context.Context) CertifiMapOutput {
	return o
}

func (o CertifiMapOutput) MapIndex(k pulumi.StringInput) CertifiOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Certifi {
		return vs[0].(map[string]*Certifi)[vs[1].(string)]
	}).(CertifiOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertifiInput)(nil)).Elem(), &Certifi{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertifiArrayInput)(nil)).Elem(), CertifiArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertifiMapInput)(nil)).Elem(), CertifiMap{})
	pulumi.RegisterOutputType(CertifiOutput{})
	pulumi.RegisterOutputType(CertifiArrayOutput{})
	pulumi.RegisterOutputType(CertifiMapOutput{})
}
