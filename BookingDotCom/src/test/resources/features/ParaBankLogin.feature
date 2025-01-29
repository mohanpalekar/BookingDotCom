#Author: your.email@your.domain.com

@ParabankLogin
Feature: Title of your feature
  I want to use this template for my feature file

  @ParabankLogin
  Scenario: Parabank Login
    Given User is on the landing page of Para bank
    When User enters login data as test123@gmail.com and Test@1234
    And User clicks Login 
    Then User should see Accounts Overview
    #And User closes the browser
    
    
    @ParabankLoginTest
  Scenario Outline: Parabank Login
    Given User is on the landing page of Para bank
    When User enters login data as <username> and <password>
    And User clicks Login
    Then User should see Accounts Overview
    #And User closes the browser
    
    Examples:
    
    |username|password|
    |test123@gmail.com|Test@1234|
    #|test1234@gmail.com|Test@12345|