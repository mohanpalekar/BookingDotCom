package Hooks;

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
	
	@BeforeAll()
	public static void beforeAll() {
		
		System.out.println("Before All");
		
	}
	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before scenario");
		
		WebDriver driverParam = new DriverFactory("chrome").getDriverManager().getDriver();

		Driver.getDriverInstace().setDriver(driverParam);
		
		Driver.getDriverInstace().getDriver().manage().window().maximize();
		
	}
	
	@BeforeStep
	public void beforeStep() {
		
		System.out.println("Before Step");
	}
	
	@AfterStep
	public void afterStep() {
		
		System.out.println("After Step");
	}
	
	
	@After
	public void afterScenario(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriverInstace().getDriver();
			
			 byte [] screenshotData = screenshot.getScreenshotAs(OutputType.BYTES);
			 
			 scenario.attach(screenshotData, "image/png", scenario.getName());
			 
			 scenario.log("FAILED");
			
		}
		
		System.out.println("after scenario");
		
		Driver.getDriverInstace().closeDriver();
		
	}
	
	@AfterAll()
	public static void afterAll() {
		
		System.out.println("After All");
		
	}
	
	

}
