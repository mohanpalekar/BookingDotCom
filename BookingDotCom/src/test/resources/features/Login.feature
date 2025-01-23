#Author: your.email@your.domain.com

@LoginFeature
Feature: Login

  @Login @sanity @wip
  Scenario: Login with correct credentials
  Given User is on landing page of BookingDotCom
  When user dismisses popup
  When user clicks sign in
  When user enter username
  Then user closes browser
  
  
  @Login1 @sanity @Regression
  Scenario: Login1 with correct credentials
  Given User is on landing page of BookingDotCom
  When user dismisses popup
  When user clicks sign in
  When user enter username
  Then user closes browser