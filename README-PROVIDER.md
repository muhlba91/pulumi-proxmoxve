# Foo Resource Provider

The Foo Resource Provider lets you manage [Foo](http://example.com) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @pulumi/foo
```

or `yarn`:

```bash
yarn add @pulumi/foo
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_foo
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/pulumi/pulumi-foo/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.Foo
```

## Configuration

The following configuration points are available for the `foo` provider:

- `foo:apiKey` (environment: `FOO_API_KEY`) - the API key for `foo`
- `foo:region` (environment: `FOO_REGION`) - the region in which to deploy resources

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/foo/api-docs/).
