# ICS4U 2019 Culminating Task

Use your group's fork of this repository to complete the culminating task.

## Setting up the helper shortcut

Use the **Open Terminal Window** shortcut (Control-Option-Command T) to open a Terminal window in the **ics4u-2019-culminating-task** folder.

The following commands only need to be run once.

To install the `./acp` shortcut, copy and paste these commands into your Terminal window:

```
rm -rf acp
echo -e 'acp' >> .gitignore
echo -e '.DS_Store' >> .gitignore
echo -e '#!/bin/bash' >> acp
echo -e 'git add *' >> acp
echo -e 'git commit -m "$1"' >> acp
echo -e 'OUTPUT=`git branch | grep \* | cut -d " " -f2`' >> acp
echo -e 'git push -u origin "${OUTPUT}"' >> acp
chmod +x acp
```

## Source control in teams

There are many models for organizing collaborative software development using source control.

To avoid figuratively stepping on each other's toes, you will make use of **branches** and **issues** when writing and commiting code.

### Using branches

To use a branch, you must **create** and then **checkout** the branch.

Name a branch based on the issue you are addressing with your work.

For example, to create a branch that addresses issue #1, first make sure you are on the master branch. Type:

```
git checkout master
```

Then create the new branch:

```
git branch issue1
```

Then check out that branch:

```
git checkout issue1
```

You are now ready to start making changes to source code.

### Committing your work

The shortcut installed earlier makes adding, committing, and pushing code to the remote a one-step process.

Say that as part of completing issue #1, you added a help screen.

You would save that code with this command:

```
./acp "Finished help screen"
```

In one step, you have added any changed files, commited those changes, and pushed them to the remote copy of the branch you are working on.
