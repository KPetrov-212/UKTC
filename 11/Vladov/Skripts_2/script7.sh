#!/bin/bash
if [ $# -lt 2 ]; then
    echo "Usage: ./script.sh arg1 arg2 [arg3...]"
    exit 1
fi

echo "You entered: $@"
