#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -lt 1 ]; then
  echo "Usage: $0 ExampleClassName"
  exit 1
fi
CLASS="$1"
java -cp classes "$CLASS"
