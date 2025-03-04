#!/bin/bash
read -s -p "Enter password: " PASS1
echo
read -s -p "Confirm password: " PASS2
echo

if [ "$PASS1" == "$PASS2" ]; then
    echo "Password confirmed"
else
    echo "Passwords do not match"
fi
