#!/bin/bash
if [ $# -ne 3 ]; then
    echo "Usage: ./script.sh num1 num2 num3"
    exit 1
fi

SUM=$(( $1 + $2 + $3 ))
echo "Sum: $SUM"
