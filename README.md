# Fashionette
# Fashionette Task Testing – QA Automation Assessment

*- Build Tool:* Maven
## Test RUN

Notes: To run all Scenarios in Transactions.feature, use `@Regression` tag in the CukesRunner class/Cucumber Options

#### Way:
- Clone the projects
- Import maven dependencies from POM\
- Go *src -> test > java > com > fashionette > runners > CukesRunner* and RUN\
- To generate "HTML Maven Cucumber Report" ;
  > Open Maven right side panel
  > Double Click Project's Lifecycle
  > Click "verify"

#### System Requirements:
- Java 12+ SDK

#### Recommended Plugins for IDE
1 - Cucumber for Java from JetBrains\
2 - Gherkin from JetBrains

## Test Framework Cucumber BBD
- I am using Page Object Modelling to enhance test maintenance and reducing code duplication. This is one of the most famous Selenium approaches.
- I used Maven to manage and centralize my dependencies which I have pom.xml
- I use Page Object Classes to store and identify the elements that I work on
- I am using Cucumber and Gherkin language for non-technical people to understand what is going on in testing
- To interact with browsers, I am utilizing Selenium WebDriver
- I used a Cucumber Scenario outline and example feature
- In the Feature folder, I store my feature files separately, and it helps in the usability of the codes
- For assertions/verifications, to compare expected and actual results I utilize Junit assertions
- I use hook class as pre-and post-test implementations

## Test Reports Locations
1- Cucumber HTML Plugin Reports
*target -> cucumber-html-reports > overview-steps.html*
(Right Click and Open in any Browser )


### End
