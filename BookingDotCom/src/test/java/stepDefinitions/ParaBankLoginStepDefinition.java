package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locators.ParaBankLoginLocators;

public class ParaBankLoginStepDefinition {
	
	ParaBankLoginLocators loginPage = new ParaBankLoginLocators();
	
	@Given("^User is on the landing page of Para bank$")
	public void launchSession() {
		
		loginPage.launchSession("https://parabank.parasoft.com/parabank/index.htm");
		
	}
	
	@When("^User enters login data as (.*) and (.*)$")
	public void enterLoginDetails(String userName, String password) {
		
		loginPage.enterUserName(userName);
		
		loginPage.enterPassword(password);
		
	}
	
	@And("^User clicks Login$")
	public void clickSignIn() {
		
		loginPage.clickLogin();
		
	}
	
	@When("^User click Register$")
	public void clickRegister() {

		loginPage.clickRegister();
	}

}
