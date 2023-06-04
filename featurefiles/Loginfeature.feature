#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: login functionality
    Given User is on login page
    When enter username for login
    And enter password for login
      | sujay | Pune |
    And Click on login btn
    Then verfiy user name in page

  @tag2
  Scenario Outline: Register functinality
    Given enter username of user for registartion <name>
    When enter passwrod of user for registation<value>
    Then verify the  status<status>

    Examples: 
      | name  | value | status |
      | name1 | abc   | Pass   |
      | name2 | xyz   | Pass   |
