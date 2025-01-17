package stepDefinitions;

import io.cucumber.java.en.When;
import locators.SignInPageLocator;

public class SignInPageStepDefinition {
	
	SignInPageLocator signInPage = new SignInPageLocator();
	
	@When("^user enter username$")
	public void enterUserName() {
		
		signInPage.enterUserName();
		
	}
	

}
