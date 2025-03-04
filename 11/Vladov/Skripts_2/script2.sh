#!/bin/bash
FILE="testfile.txt"

if [ -r "$FILE" ]; then
    cat "$FILE"
else
    echo "File is not readable"
fi
