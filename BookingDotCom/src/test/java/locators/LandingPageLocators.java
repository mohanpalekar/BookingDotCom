package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;


public class LandingPageLocators extends DriverUtil{

	private By popUp = By.xpath("//button[starts-with(@aria-label,'Dismiss')]");

	private By signIn = By.linkText("Sign in");

	//	private By staysService = By.linkText("Stays");
	//
	//	private By flightsService = By.linkText("Flights");
	//	
	//	private By flightsAndHotelService = By.linkText("Flight + Hotel");

	public void closePopUp() {

		try {

			pause(5000);

			WebElement element = waitUntilElementToBeClickable(popUp);

			element.click();

		}catch(TimeoutException ex) {

			System.out.println(ex.getMessage());

		}
	}

	public void clickSignIn() {

		WebElement element = waitUntilElementToBeClickable(signIn);

		element.click();

	}

	//	public void verifyStaysService() {
	//
	//		WebElement element = waitUntilpPresenceOfElementLocated(staysService);
	//
	//		Assert.assertEquals(element.getText(), "Stays");
	//
	//	}
	//
	//	public void verifyFlightsService() {
	//
	//		WebElement element = waitUntilpPresenceOfElementLocated(flightsService);
	//
	//		Assert.assertEquals(element.getText(), "Flights");
	//
	//	}
	//
	//	public void verifyFlightsAndHotelService() {
	//
	//		WebElement element = waitUntilpPresenceOfElementLocated(flightsAndHotelService);
	//
	//		Assert.assertEquals(element.getText(), "Flight + Hotel");
	//
	//	}

	public By getServicesLocator(String serviceName) {

		return By.linkText(serviceName);

	}

	public void verifyService(String serviceName) {

		WebElement element = waitUntilpPresenceOfElementLocated(getServicesLocator(serviceName));

		Assert.assertEquals(element.getText(), serviceName);

	}

}
