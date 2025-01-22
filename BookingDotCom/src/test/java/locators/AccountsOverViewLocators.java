package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class AccountsOverViewLocators extends DriverUtil{

	private By accountsOverview = By.xpath("//h1[contains(text(),'Accounts Overview')]");

	private By logoutBtn = By.linkText("Log Out");

	public void clickLogOutbtn() {

		WebElement element = waitUntilElementToBeClickable(logoutBtn);

		element.click();
	}

	public void verifyAccountsOverview() {

		WebElement element = waitUntilpPresenceOfElementLocated(accountsOverview);

		Assert.assertEquals(element.getText(), "Accounts Overview");
	}

}
