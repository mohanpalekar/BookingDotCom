package Driver;

import org.openqa.selenium.WebDriver;

public class Driver {

	//multi-threading
	private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	//constructor
	private Driver() {
		super();
	}

	//initialized object
	public static final Driver instance = new Driver();


	//method to get the instance
	public static Driver getDriverInstace() {
		return instance;
	}


	public WebDriver getDriver() {
		return driver.get();
	}

	public void setDriver(final WebDriver driverParam) {
		driver.set(driverParam);
	}

	public void closeDriver() {

		driver.get().quit();
		
		driver.remove();

	}



}
