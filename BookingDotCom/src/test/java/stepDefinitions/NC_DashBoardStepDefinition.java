package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.NC_DashboardPageLocators;

public class NC_DashBoardStepDefinition {
	
	NC_DashboardPageLocators dashBoardPage = new NC_DashboardPageLocators();
	
	@Then("^User can see dashboard$")
	public void verifyDashboard() {
		
		dashBoardPage.verifyDashboardPage();
		
	}
	
	@When("^User clicks Log out$")
	public void clickLogoutBtn() {
		
		dashBoardPage.clickLogoutBtn();
		
	}

}
