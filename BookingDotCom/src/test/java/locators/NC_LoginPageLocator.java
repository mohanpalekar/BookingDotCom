package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class NC_LoginPageLocator extends DriverUtil{
	
	private By email = By.id("Email");
	
	private By password = By.id("Password");
	
	private By loginBtn = By.xpath("//button[@type='submit']");
	
	private By loginPageWelcomeText = By.xpath("//div[@class='title']");
	
	public void enterEmail(String userName) {
		WebElement element = waitUntilElementToBeClickable(email);
		element.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		element.sendKeys(userName);
	}
	
	public void enterPassword(String passWord) {
		WebElement element = waitUntilElementToBeClickable(password);
		element.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		element.sendKeys(passWord);
	}
	
	public void clickLogInBtn() {
		WebElement element = waitUntilElementToBeClickable(loginBtn);
		element.click();
	}
	
	public void verifySignInPage() {
		WebElement element = waitUntilpPresenceOfElementLocated(loginPageWelcomeText);
		Assert.assertEquals(element.getText(), "Welcome, please sign in!");
	}

}
