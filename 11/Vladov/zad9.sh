#!/bin/bash
mkdir -p logs_backup
find . -name "*.log" -exec mv {} logs_backup/ \;
