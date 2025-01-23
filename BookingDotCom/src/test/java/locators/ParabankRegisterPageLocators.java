package locators;

import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

import Utils.DriverUtil;

public class ParabankRegisterPageLocators extends DriverUtil{

	private By firstName = By.id("customer.firstName");

	private By lastName = By.id("customer.lastName");

	private By street = By.id("customer.address.street");

	private By city = By.id("customer.address.city");

	private By state = By.id("customer.address.state");

	private By zipCode = By.id("customer.address.zipCode");

	private By phoneNumber = By.id("customer.phoneNumber");

	private By ssn = By.id("customer.ssn");

	private By username = By.id("customer.username");

	private By password = By.id("customer.password");

	private By repeatedPassword = By.id("repeatedPassword");

	private By registerBtn = By.xpath("//input[@value='Register']");

	public void enterRegistrationDetails() {

		Faker faker = new Faker(Locale.UK);

		WebElement element = waitUntilElementToBeClickable(firstName);

		element.sendKeys(faker.name().firstName());

		element = waitUntilElementToBeClickable(lastName);

		element.sendKeys(faker.name().lastName());

		element = waitUntilElementToBeClickable(street);

		element.sendKeys(faker.address().streetAddress());

		element = waitUntilElementToBeClickable(city);

		element.sendKeys(faker.address().city());

		element = waitUntilElementToBeClickable(state);

		element.sendKeys(faker.address().state());

		element = waitUntilElementToBeClickable(zipCode);

		element.sendKeys(faker.address().zipCode());
		
		element = waitUntilElementToBeClickable(phoneNumber);

		element.sendKeys(String.valueOf(faker.phoneNumber()));
		
		element = waitUntilElementToBeClickable(ssn);

		element.sendKeys(String.valueOf(faker.number().randomDouble(10, 1234567890, 999999999)));
		
		element = waitUntilElementToBeClickable(username);

		//element.sendKeys(faker.name().username());
		//element.sendKeys(faker.internet().safeEmailAddress());
		//element.sendKeys("test123@gmail.com");
		String userName = String.valueOf(faker.number().randomDouble(9, 111111111, 999999999))+"@gmail.com";
		
		System.out.println(userName);
		
		element.sendKeys(userName);
		
		element = waitUntilElementToBeClickable(password);
		
		String secret = faker.internet().password();
		
		System.out.println("Secret :"+secret);

		element.sendKeys(secret);
		
		element = waitUntilElementToBeClickable(repeatedPassword);

		element.sendKeys(secret);
		
		element = waitUntilElementToBeClickable(registerBtn);

		element.click();

	}

}
