package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LandingPageLocators;

public class LandingPageStepDefinition {

	LandingPageLocators landingPage = new LandingPageLocators();

	@Given("^User is on landing page of BookingDotCom$")
	public void launchSessino() {

		landingPage.launchSession("https://www.booking.com/");

	}

	@When("^user clicks sign in$")
	public void clickSignIn() {

		landingPage.clickSignIn();

	}

	@Then("^user closes browser$")
	public void closebrowser() {

		landingPage.closeSession();

	}

	@When("^user dismisses popup$")
	public void dismissPopup() {

		landingPage.closePopUp();

	}

	//	@Then("^User can see Stays service$")
	//	public void verifyStaysService(){
	//		
	//		landingPage.verifyStaysService();
	//		
	//	}
	//	
	//	@Then("^User can see Flights service$")
	//	public void verifyFlightsService(){
	//		
	//		landingPage.verifyFlightsService();
	//		
	//	}
	//	
	//	@Then("^User can see Flight and Hotel service$")
	//	public void verifyFlightsAndHotelService(){
	//		
	//		landingPage.verifyFlightsAndHotelService();
	//		
	//	}

	@Then("^User can see (.*) service$")
	public void verifyService(String serviceName){

		landingPage.verifyService(serviceName);

	}



}
