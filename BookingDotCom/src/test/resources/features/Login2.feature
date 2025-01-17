#Author: your.email@your.domain.com

@tag
Feature: Register

  @Register @sanity
  Scenario: Login with correct credentials
  Given user is on landing page 
  When user dismisses popup
  When user clicks sign in
  When user enter username
  Then user closes browser