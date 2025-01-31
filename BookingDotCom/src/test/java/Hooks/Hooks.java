package Hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Driver.Driver;
import Driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private final static Logger logger = LogManager.getLogger(Hooks.class);
	
	@BeforeAll()
	public static void beforeAll() {
		
		logger.info("Before All");
		
	}
	
	@Before
	public void beforeScenario() {
		
		logger.info("Before scenario");
		
		WebDriver driverParam = new DriverFactory("chrome").getDriverManager().getDriver();

		Driver.getDriverInstace().setDriver(driverParam);
		
		Driver.getDriverInstace().getDriver().manage().window().maximize();
		
		logger.info("Driver is initialized");
		
	}
	
	@BeforeStep
	public void beforeStep() {
		
		//logger.info("Before Step");
	}
	
	@AfterStep
	public void afterStep() {
		
		//logger.info("After Step");
	}
	
	
	@After
	public void afterScenario(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			logger.error("Scenario Failed : "+scenario.getName());
			
			TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriverInstace().getDriver();
			
			 byte [] screenshotData = screenshot.getScreenshotAs(OutputType.BYTES);
			 
			 scenario.attach(screenshotData, "image/png", scenario.getName());
			 
			 scenario.log("FAILED");
			 
			 logger.error("Captured screenshot for failed scenario : "+scenario.getName());
			
		}
		
		logger.info("after scenario");
		
		Driver.getDriverInstace().closeDriver();
		
		logger.info("Driver is closed");
		
	}
	
	@AfterAll()
	public static void afterAll() {
		
		logger.info("After All");
		
	}
	
	

}
