#!/bin/bash
if [ $# -ne 1 ]; then
    echo "Usage: ./script.sh filename"
    exit 1
fi

if [ -e "$1" ]; then
    if [ -x "$1" ]; then
        echo "File exists and is executable"
    else
        echo "File is not executable"
    fi
else
    echo "File does not exist"
fi
