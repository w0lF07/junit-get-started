# Getting Started with Unit Testing in Java

This repository is structured to help you getting started with unit testing and integration testing with `JUnit` `Java` and `Gradle`


## Setting Up the Project

* Set up Java 7+ on your operating system.
* Set the environment variable `JAVA_HOME` to the root directory of your JDK installation.
* *Fork* and *clone* the Git repository.


## Running the Tests
1. Set the present working directory in terminal to your project.
2. Run `./gradlew test` on Linux/Unix and `gradlew test` on Windows.


###### Alternatively, if using an IDE like [Intellij IDEA](https://www.jetbrains.com/idea/),
1. Import the Git repository into the IDE and allow Gradle to sync for a few minutes.
2. Right-click the src/test/ directory.
3. Click `Run 'All Tests'` or simply use the `Ctrl-Shift-F10` keyboard shortcut.


## Contributing Tests
1. Add a new test class under src/test/java for the suite of test cases to be added.
2. Add 5 or more JUnit test cases in the newly added class.  
   There should be at least one of each assert type listed below:
    * [Assert.assertTrue](http://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html#assertTrue-boolean-)
    * [Assert.assertFalse](http://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html#assertFalse-boolean-)
    * [Assert.assertEquals](http://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html#assertEquals-byte-byte-)
    * Any other types of assert types (i.e. [Assert.assertArrayEquals](http://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html#assertArrayEquals-boolean:A-boolean:A-))
3. Verify that the tests [successfully complete](https://github.com/jboss-outreach/junit-get-started#running-the-tests).
4. Create a pull request requesting to merge the commits on your fork to this repository. [(Reference)](https://guides.github.com/introduction/flow/)
5. Write a concise and convincing pull request message explaining the test cases in your pull request!


## Things to Take Note of When Contributing
* There is nothing to work on in the main source (src/main/). Only test cases (src/test/) should be modified and run.
* Do not edit ApplicationTest.java! Create a new test class instead to avoid merge conflicts.
* Class names should always be in [PascalCase](https://en.wikipedia.org/wiki/PascalCase)
