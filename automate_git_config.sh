#!/bin/bash

# Set the username and email
git config --global user.name "bshongwe"
git config --global user.email "dru.da.beat.hustle@gmail.com"

echo "Git configuration set up:"
echo "Username: $(git config --global user.name)"
echo "Email: $(git config --global user.email)"
