#Author: your.email@your.domain.com

@BookingDotCom_Services
Feature: Booking.com Services

Background:
  Given User is on landing page of BookingDotCom
  When user dismisses popup
  

  @BookingDotCom_Stays @Sanity @Regression @Services
  Scenario: Title of your scenario
  Then User can see Stays service
  Then User can see Flights service
  Then User can see Flight and Hotel service
  #And user closes browser
  
  
  @BookingDotCom_Stays_GeneralizationOfLocator
  Scenario: Title of your scenario
  Then User can see Stays service
  Then User can see Flights service
  Then User can see Flight + Hotel service
  #And user closes browser
  
  
  @BookingDotCom_Stays_GeneralizationOfLocator1
  Scenario Outline: Title of your scenario
  Then User can see <serviceName> service
  #And user closes browser
  
  Examples:
  
  |serviceName|
  |Stays|
  |Flights|
  |Flight + Hotel|
  
  
