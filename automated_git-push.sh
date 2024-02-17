#!/bin/bash

# Define the branch name
branch_name="reward-value"

# Switch to the branch
git checkout $branch_name

# Make changes to your files here

# Stage the changes
git add .

# Commit the changes with a timestamp
timestamp=$(date +"%Y-%m-%d %T")
commit_message="Task 1: Branch creation & switch for final submission - Automated commit at $timestamp"
git commit -m "$commit_message"

# Push the changes to the remote repository
git push origin $branch_name

echo "Changes committed and pushed to branch $branch_name."
