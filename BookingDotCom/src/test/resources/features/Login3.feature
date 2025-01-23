#Author: your.email@your.domain.com

@tag
Feature: ResetPassword

  @ResetPassword @sanity 
  Scenario: Login with correct credentials
  Given User is on landing page of BookingDotCom
  When user dismisses popup
  When user clicks sign in
  When user enter username
  Then user closes browser