package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LandingPageLocators;

public class LandingPageStepDefinition {
	
	LandingPageLocators landingPage = new LandingPageLocators();
	
	@Given("^user is on landing page$")
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

}
