package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class LandingPageLocators extends DriverUtil{

	private By popUp = By.xpath("//button[starts-with(@aria-label,'Dismiss')]");

	private By signIn = By.linkText("Sign in");

	public void closePopUp() {

		WebElement element = waitUntilElementToBeClickable(popUp);

		element.click();
	}

	public void clickSignIn() {

		WebElement element = waitUntilElementToBeClickable(signIn);

		element.click();

	}

}
