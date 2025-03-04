#!/bin/bash
read -p "Enter filename: " FILE

if [ -x "$FILE" ]; then
    ./"$FILE"
else
    echo "File is not executable"
fi
