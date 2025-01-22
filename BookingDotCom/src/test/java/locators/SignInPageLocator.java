package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class SignInPageLocator extends DriverUtil{

	private By userName = By.name("username");

	public void enterUserName() {

		WebElement element = waitUntilpPresenceOfElementLocated(userName);

		element.sendKeys("test@gmail.com");

	}

	public void enterUserName(String userNameValue) {

		WebElement element = waitUntilpPresenceOfElementLocated(userName);

		element.sendKeys(userNameValue);
		
		pause(2000);

	}

}
