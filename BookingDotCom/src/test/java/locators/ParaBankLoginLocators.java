package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class ParaBankLoginLocators extends DriverUtil{

	private By userName = By.name("username");

	private By passWord = By.name("password");

	private By logInBtn = By.xpath("//input[@value='Log In']");
	

	public void enterUserName(String input) {

		WebElement element = waitUntilElementToBeClickable(userName);

		element.sendKeys(input);
	}

	public void enterPassword(String input) {

		WebElement element = waitUntilElementToBeClickable(passWord);

		element.sendKeys(input);
	}
	
	public void clickLogin() {

		WebElement element = waitUntilElementToBeClickable(logInBtn);

		element.click();
	}


}
