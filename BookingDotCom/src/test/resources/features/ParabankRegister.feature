#Author: your.email@your.domain.com

@tag
Feature: Register

  @ParaBankRegister
  Scenario: Register with Parabank
    Given User is on the landing page of Para bank
    When User click Register 
    And User enters registration details