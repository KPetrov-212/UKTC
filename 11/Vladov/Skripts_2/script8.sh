#!/bin/bash
if [ $# -lt 2 ]; then
    echo "Usage: ./script.sh old_filename new_filename"
    exit 1
fi

if [ ! -e "$1" ]; then
    echo "File does not exist"
    exit 1
fi

mv "$1" "$2"
echo "File renamed to $2"
