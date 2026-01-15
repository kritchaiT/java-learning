#!/usr/bin/env bash
set -euo pipefail
mkdir -p classes
find src -name "*.java" > sources.txt
javac -d classes @sources.txt
rm -f sources.txt
echo "Compiled all .java files into classes/"
