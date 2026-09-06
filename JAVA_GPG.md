# Maven Central signing key: generate & extend

Always work in a throwaway `GNUPGHOME` so nothing touches your real keyring, and
capture the exported secret key + fingerprint before deleting the temp dir —
that's the only thing you need to redo this later.

## 1. Generate a new key

```bash
export GNUPGHOME=$(mktemp -d)

# primary signing key, 10 years validity (prompts for a passphrase unless
# you add --batch --pinentry-mode loopback --passphrase '...')
gpg --quick-generate-key "Daniel Muehlbachler-Pietrzykowski <daniel@muehlbachler.io>" ed25519 sign 10y

# grab the fingerprint
FPR=$(gpg -k --with-colons "daniel@muehlbachler.io" | awk -F: '/^fpr:/{print $10; exit}')

# add an encryption subkey (matches the previous key's shape)
gpg --quick-add-key "$FPR" cv25519 encr 10y

# publish the PUBLIC key so Central can verify signatures
gpg --keyserver keyserver.ubuntu.com --send-keys "$FPR"
  
# export the key material to a file for safe keeping (and later re-import)
gpg --armor --export-secret-keys "$FPR" > signing_key.asc   # -> SIGNING_KEY
echo "$FPR"                                                  # -> SIGNING_KEY_ID (fingerprint)
# SIGNING_PASSWORD = the passphrase you typed when prompted
```

Verify it actually landed on the keyserver before deleting the temp dir:

```bash
gpg --keyserver keyserver.ubuntu.com --recv-keys "$FPR"   # should succeed, uid intact
```

Store `signing_key.asc` contents, `$FPR`, and the passphrase.

Delete the temp dir and the local file:

```bash
rm -rf "$GNUPGHOME"
rm signing_key.asc
```

## 2. Extend an existing key (temp dir is gone — re-import first)

```bash
export GNUPGHOME=$(mktemp -d)

# re-import the secret key (SIGNING_KEY) and unlock it with the passphrase (SIGNING_PASSWORD)
gpg --batch --pinentry-mode loopback --passphrase "$SIGNING_PASSWORD" \
  --import signing_key.asc

FPR=$(gpg -k --with-colons | awk -F: '/^fpr:/{print $10; exit}')

# extend primary key + all its subkeys by 10 more years
gpg --quick-set-expire "$FPR" 10y "*"

# re-publish — expiration changes must be redistributed
gpg --keyserver keyserver.ubuntu.com --send-keys "$FPR"

# re-export: the secret key material is unchanged, but the self-signature
# (which carries the new expiry) must be re-exported
gpg --armor --export-secret-keys "$FPR" > signing_key.asc   # -> new SIGNING_KEY
```

Confirm the new expiry before wiping the temp dir:

```bash
gpg -k --with-colons "$FPR" | awk -F: '/^pub|^sub/{print $1, $7}'   # unix expiry timestamps
```

Store `signing_key.asc` contents.

Delete the temp dir and the local file:

```bash
rm -rf "$GNUPGHOME"
rm signing_key.asc
```

## 3. Validate an exported key (SIGNING_KEY / SIGNING_KEY_ID / SIGNING_PASSWORD)

Run this after generating or extending — it checks the export is complete,
unexpired, published, and actually able to sign. Use a fresh temp dir so
you're validating exactly what would be imported elsewhere.

```bash
export GNUPGHOME=$(mktemp -d)
printf '%s\n' "$SIGNING_KEY" > "$GNUPGHOME/key.asc"

# 1) structurally complete? must show BOTH a ":secret key packet:" (primary)
#    and a ":secret sub key packet:" (encryption subkey) — a lone subkey
#    packet means the export is broken (e.g. --export-secret-subkeys was
#    used by mistake instead of --export-secret-keys)
gpg --dearmor < "$GNUPGHOME/key.asc" > "$GNUPGHOME/key.gpg"
gpg --list-packets "$GNUPGHOME/key.gpg" | grep -E "packet:|expires"

# 2) import it and check it's not expired
gpg --batch --import "$GNUPGHOME/key.asc"
gpg --list-secret-keys --keyid-format=long --with-fingerprint   # look for "[expires: <future date>]" on sec/ssb, not "[expired: ...]"

# 3) it can actually sign and the signature verifies
echo "validation" > "$GNUPGHOME/test.txt"
gpg --batch --pinentry-mode loopback --passphrase "$SIGNING_PASSWORD" \
  --local-user "$SIGNING_KEY_ID" --detach-sign "$GNUPGHOME/test.txt"
gpg --verify "$GNUPGHOME/test.txt.sig" "$GNUPGHOME/test.txt"   # -> "Good signature from ..."

# 4) the PUBLIC key is actually retrievable (what Central checks)
gpg --keyserver keyserver.ubuntu.com --recv-keys "$SIGNING_KEY_ID"

rm -rf "$GNUPGHOME"
```

All four checks must pass before relying on the key for a release.
