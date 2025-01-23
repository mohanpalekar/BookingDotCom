package stepDefinitions;

import io.cucumber.java.en.And;
import locators.ParabankRegisterPageLocators;

public class ParabankRegisterStepDefinition {
	
	ParabankRegisterPageLocators register = new ParabankRegisterPageLocators();
	
	@And("^User enters registration details$")
	public void enterRegistrationDetails() {
		register.enterRegistrationDetails();
	}

}
