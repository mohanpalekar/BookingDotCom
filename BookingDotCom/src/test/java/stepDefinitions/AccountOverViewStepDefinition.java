package stepDefinitions;

import io.cucumber.java.en.Then;
import locators.AccountsOverViewLocators;

public class AccountOverViewStepDefinition {
	
	AccountsOverViewLocators overViewPage = new AccountsOverViewLocators();
	
	@Then("^User should see Accounts Overview$")
	public void verifyLogin() {
		
		overViewPage.verifyAccountsOverview();
		
	}
	
	@Then("^User closes the browser$")
	public void closeSession() {
		
		overViewPage.clickLogOutbtn();
		
		overViewPage.closeSession();
		
	}

}
