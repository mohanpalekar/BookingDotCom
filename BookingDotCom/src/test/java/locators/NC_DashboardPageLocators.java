package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;


public class NC_DashboardPageLocators extends DriverUtil{
	
	private By dashBoard = By.xpath("//h1[contains(text(), 'Dashboard')]");
	
	private By logoutBtn =  By.linkText("Logout");
	
	public void verifyDashboardPage() {
		
		WebElement element = waitUntilpPresenceOfElementLocated(dashBoard);
		
		Assert.assertEquals(element.getText(), "Dashboard");
		
	}
	
	public void clickLogoutBtn() {
		
		WebElement element = waitUntilElementToBeClickable(logoutBtn);
		
		element.click();
	}

}
