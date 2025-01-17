package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager implements DriverManager{

	@Override
	public WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		
		return new ChromeDriver();
		
	}

}
