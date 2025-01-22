#Author: your.email@your.domain.com

@NOP_Login
Feature: NOP Commerce Demo Login Feature

  @NOP_Login_Admin
  Scenario: Login as admin
    Given User is on landing page
    #When User enter username
    #And User enters password
    #And User clicks Log In
    Then User can see dashboard
    When User clicks Log out
    Then User can see Sign In page