#!/bin/bash
num=50
if [ "$num" -lt 0 ]; then
    echo "The number is less than 0."
elif [ "$num" -gt 100 ]; then
    echo "The number is greater than 100."
else
    echo "The number is between 0 and 100."
fi
