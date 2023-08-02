# `pulumictl` - A Swiss Army Knife for Pulumi Development

`pulumictl` is a utility with an intial aim of replacing all Bash, Python and Go scripts used for developing Pulumi, which are often duplicated (un-updated) across repositories. It will do this via the proven "Embrace - Extend - Extinguish" methodology, providing a single binary available via Homebrew (through a custom tap) or GitHub releases for several platforms.

The eventual aim is to provide a utility capable of performing hermetic builds of Pulumi components both locally and in Continuous Integration in order to remove variability and frustration from developer environments.

_*Important Note:* This tool is only intended for use by people working on Pulumi itself, not for those using Pulumi to provision infrastructure!_

## Installation

Add the Pulumi homebrew tap and install:

```bash
brew tap pulumi/tap
brew install pulumictl
```

Or download the binary directly from Github releases and place it in your `$PATH`
