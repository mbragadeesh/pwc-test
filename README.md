# pwcTestChallenge
A Brief Overview of the Solution:

1.	Solution is designed using Cucumber BDD framework with Serenity Reporting in JAVA.
2.	Project is a Maven and dependencies are defined in pom.xml
3.	Tests are written using Cucumber Feature file in Gherking BDD format with the respective Step Definitions
4.	Framework is designed in the Page Object Model Fashion
5.	Random number generation is handled through the commons-lang (java open source libraries)
To Run the tests:

Repository URL - git@github.com:mbragadeesh/serenityCucumberBDD.git
1.	Clone the Repository to your local Folder.
2.	Using Command Prompt, navigate to the serenityCucumberBDD folder where POM.xml is located
3.	Run mvn clean, followed by mvn install (Maven should be configured already in the system and added to environment variables)
4.	Above Step 3, will take 5 - 7 mins, to download the dependencies defined in POM.xml and then test will run
5.	Serenity BDD HTML report will be generated after the test execution with the screenshots and can be located in pwc-test/target/site/index.html
6.	Open the index.html in Google Chrome, to see the BDD Cucumber Reporting
