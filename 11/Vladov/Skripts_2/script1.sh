#!/bin/bash
FILE="testfile.txt"

if [ -e "$FILE" ]; then
    echo "File Exists"
else
    touch "$FILE"
    echo "File created"
fi
