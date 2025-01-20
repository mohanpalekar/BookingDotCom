package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;


public class LandingPageLocators extends DriverUtil{

	private By popUp = By.xpath("//button[starts-with(@aria-label,'Dismiss')]");

	private By signIn = By.linkText("Sign in");

	private By staysService = By.linkText("Stays");

	private By flightsService = By.linkText("Flights");

	public void closePopUp() {

		WebElement element = waitUntilElementToBeClickable(popUp);

		element.click();
	}

	public void clickSignIn() {

		WebElement element = waitUntilElementToBeClickable(signIn);

		element.click();

	}

	public void verifyStaysService() {

		WebElement element = waitUntilpPresenceOfElementLocated(staysService);

		Assert.assertEquals(element.getText(), "Stays");

	}

	public void verifyFlightsService() {

		WebElement element = waitUntilpPresenceOfElementLocated(flightsService);

		Assert.assertEquals(element.getText(), "Flights");

	}

}
