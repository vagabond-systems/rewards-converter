# :airplane: Credit Rewards Converter :airplane:
This is the project repo for the JPMC Software Engineering Lite Program, consult the program instructions for more information.

## Here is the background information on your task
You work in the credit rewards department at JPMorgan Chase. Your team handles conversions from dollars to credit card points,
credit card points to miles, miles to credit card points, and so on. Today, you are working on a ticket involving the
RewardsConverter system, which needs a new part to function. This system is missing a crucial class, which you’ll be creating
over the course of this program. The RewardsConverter system accepts a cash value and returns the corresponding value in
airline miles. The system needs a RewardValue class to function, which represents the correspondence between currencies,
be it cash, airline miles, or something else. It will handle the conversion between all of these scales. In this task, you
will set up your local development environment for coding and implement the aforementioned class.

## Set up your local environment
First, you're going to need access to the codebase: navigate to the “Project Repo”. This repo contains all of the existing
code for the project. This task assumes you have a basic working knowledge of Git. If that is not yet the case, read through
the first three chapters of the “Git Book Excerpt”You’ll use Git for just about every coding project you work on; getting
familiar with the technology is a worthwhile investment. Take a moment to familiarize yourself with the repo, then fork it
to get your own copy. Next, download the codebase to your local machine by cloning your newly forked repo.

# Create a branch for your change
You'll need to create a RewardValue class, but you shouldn’t modify the main branch directly. Other people use that one too,
so any change might get in their way. Instead, you’ll create your own Branch, which will act as a sort of sandbox you can
develop in without stepping on anyone’s toes. With IntelliJ active, click the terminal tab at the bottom of the screen.
Repeat after me: git checkout -b reward-value. This will create a new branch called reward-value. Activate it. Once you
finalize your work, you can merge this branch back into the main. Doing so will distribute your changes to other developers
working on the same repo.

## Create a RewardValue class
Time to make your change - add a new class named RewardValue to the main.java package. Right-click on a directory in the
project tab on the left, then highlight new to create a Java Class.</br>
This class must satisfy the following requirements:
-  RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
-  RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
-  RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
RewardValue must convert from miles to cash at a rate of 0.0035.

## Test it
Time to see if your change worked! Right-click on RewardsConverter in the project pane and click run.
Follow the prompts, and make sure the program functions. If it breaks, debug until it works.
