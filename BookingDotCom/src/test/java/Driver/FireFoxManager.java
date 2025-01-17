package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxManager implements DriverManager{

	@Override
	public WebDriver getDriver() {
		
		WebDriverManager.firefoxdriver().setup();
		
		return new FirefoxDriver();
	}

}
