package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.NC_LoginPageLocator;

public class NopCommerceLoginPageStepDefinition {
	
	NC_LoginPageLocator loginPage = new NC_LoginPageLocator();
	
	@Given("^User is on landing page$")
	public void launchNopCommerceSession() {
		
		loginPage.launchSession("https://admin-demo.nopcommerce.com/login");
		
	}
	
	@When("^User enter username$")
	public void enterUsername(){
		
		loginPage.enterEmail("admin@yourstore.com");
		
	}
	
	@And("^User enters password$")
	public void enterPassword(){
		
		loginPage.enterPassword("admin");
		
	}
	
	@And("^User clicks Log In$")
	public void clickLogIn(){
		
		loginPage.clickLogInBtn();
		
	}
	
	@Then("^User can see Sign In page$")
	public void validateLogin(){
		loginPage.verifySignInPage();
	}
	
	

}
