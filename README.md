
# Getting equipped with Unit Testing In Java 
[![Build Status](https://travis-ci.org/jboss-outreach/compressor-head.svg?branch=addtravis)](https://travis-ci.org/Jboss-Outreach/compressor-head)

This repository is structured to help you getting started with unit testing and integration testing with `JUnit` `Java` and `Gradle`.

## What is Unit Testing?

Unit testing is a testing technique using which individual modules of the program are tested to determine if there are any issues.
We are going to be using [JUnit](http://junit.org/junit5/), which is a unit testing framework for Java programming language.

## Setting up the Project

* Download[Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html) installed on your system.
* Make sure you have declared the `JAVA_HOME` environment variable to the directory where JDK was installed. 
* Fork the repository by clicking on the Fork icon at the top right corner of the repository page.
* Clone the repository on to your local machine by running the following commands on git:
		`git clone https://github.com/[YOUR-USERNAME]/junit-get-started.git`
* Refer [Forking and Cloning in git](https://help.github.com/articles/fork-a-repo/) if you are stuck somewhere.

## Running the tests
1. Set the present working directory in terminal (or cmd) to your project. (`cd \YOUR_PROJECT_DIRECTORY`).
2. Run `./gradlew test` on Linux/Unix or `gradlew test` on Windows.

###### Alternatively, if you are using an IDE like [Intellij IDEA](https://www.jetbrains.com/idea/)
1. Import the Git repository into the IDE and allow Gradle.
2. Right-click the src/test/ directory.
3. Click `Run 'All Tests'` or simply use the `Ctrl-Shift-F10` keyboard shortcut.

## Contributing test cases
1. Add a **new** test class under src/test/java for the suite of test cases to be added.
2. Add 5 JUnit test cases in that class, one for each:
		-assertTrue
		-assertFalse
		-assertEquals
		-and any other two variety.
3. Do verify that the tests successfully builds.
4. Create a [pull request](https://help.github.com/articles/about-pull-requests/) requesting to merge the commits on your fork to this repository.
5. Write a very conscise but informative pull request message,explaining the test cases in your pull request! Remember to use your words wisely. 

## Points to keep in mind while contributing
* 
* There is not much content in main code (src/main/). *Add your test code to (src/test/) only. 
* Do not edit ApplicationTest.java! Create a **new test class** instead to avoid merge conflicts.
* Remember to add comments in your code so that the other person can know what the test module does.
* Class names should always be in PascalCase.
* This repository has Travis CI integration, verify that it builds successfully before submitting the task. 

## Additional Reading
* [Assert Documentation](http://junit.sourceforge.net/javadoc/org/junit/Assert.html)
* [Junit Test Framework](https://www.tutorialspoint.com/junit/junit_test_framework.htm)
* [Best Coding Practices](https://en.wikipedia.org/wiki/Best_coding_practices) 