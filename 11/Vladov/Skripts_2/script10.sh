#!/bin/bash
FILE="newFile.txt"

if [ -e "$FILE" ] && [ -r "$FILE" ] && [ -w "$FILE" ]; then
    echo "File exists, is readable, and is writable"
else
    echo "Conditions not met"
fi
