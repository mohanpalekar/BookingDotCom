package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;

public class DriverUtil {

	private WebDriver driver;

	private static JavascriptExecutor jse;

	private static WebDriverWait wait;

	public void launchSession(String url) {

		//		WebDriver driverParam = new DriverFactory("chrome").getDriverManager().getDriver();
		//
		//		Driver.getDriverInstace().setDriver(driverParam);

		driver= Driver.getDriverInstace().getDriver(); 

		jse = (JavascriptExecutor) driver;

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get(url);

		// driver.manage().window().maximize();

	}

	public WebElement waitUntilElementToBeClickable(By locator) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		executionOrder(element);

		return element;

	}

	public WebElement waitUntilpPresenceOfElementLocated(By locator) {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		executionOrder(element);

		return element;

	}

	public void scrollToElement(WebElement element) {

		jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);

	}

	public void highLightElement(WebElement element) {

		jse.executeScript("arguments[0].setAttribute('style', 'border: 4px solid green;');", element);

	}

	public void removeHighLightElement(WebElement element) {

		jse.executeScript("arguments[0].setAttribute('style', 'border: 4px solid white;');", element);

	}

	public void pause(long duration) {
		try {
			TimeUnit.MILLISECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeSession() {

		Driver.getDriverInstace().closeDriver();

	}

	public void executionOrder(WebElement element) {

		scrollToElement(element);

		highLightElement(element);

		pause(1);

		removeHighLightElement(element);

		pause(1);
	}


}
