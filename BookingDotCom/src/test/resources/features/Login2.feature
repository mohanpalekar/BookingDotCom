#Author: your.email@your.domain.com

@tag
Feature: Register

Background:
  Given User is on landing page of BookingDotCom
  When user dismisses popup

  @Register @sanity
  Scenario: Login with correct credentials
  When user clicks sign in
  When user enter username
  Then user closes browser
  
   #@Register1 @sanity
  #Scenario: Login with correct credentials
  #Given User is on landing page of BookingDotCom 
  #When user dismisses popup
  #When user clicks sign in
  #When user enter username as test123@gmail.com
  #Then user closes browser
  #
  #@Register1 @sanity
  #Scenario: Login with correct credentials
  #Given User is on landing page of BookingDotCom 
  #When user dismisses popup
  #When user clicks sign in
  #When user enter username as test1234@gmail.com
  #Then user closes browser
  #
  #@Register1 @sanity
  #Scenario: Login with correct credentials
  #Given User is on landing page of BookingDotCom 
  #When user dismisses popup
  #When user clicks sign in
  #When user enter username as test12345@gmail.com
  #Then user closes browser
  
  Scenario Outline: Login with correct credentials
  
  @Register2 @sanity
  Scenario Outline: Login with correct credentials
  When user clicks sign in
  When user enter username as <username>
  #Then user closes browser
  
  Examples: 
  
  |username|
  |test123@gmail.com|
  #|test1234@gmail.com|
  #|test12345@gmail.com|
  
  