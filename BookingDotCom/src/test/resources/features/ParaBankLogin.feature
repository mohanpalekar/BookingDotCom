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
    And User closes the browser