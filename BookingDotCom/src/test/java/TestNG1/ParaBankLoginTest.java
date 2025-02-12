package TestNG1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Driver.Driver;
import Driver.DriverFactory;
import Utils.ExcelUtil;
import locators.ParaBankLoginLocators;

public class ParaBankLoginTest {

	private ParaBankLoginLocators loginPage;

	@BeforeTest
	public void setup() {

		String browser = System.getProperty("browserName");

		System.out.println(browser);

		WebDriver driverParam = new DriverFactory(browser).getDriverManager().getDriver();

		Driver.getDriverInstace().setDriver(driverParam);

		Driver.getDriverInstace().getDriver().manage().window().maximize();

	}


	@Test(dataProvider = "getTestData")
	public void loginWithValidData(String userName, String password) {	

		loginPage = new ParaBankLoginLocators();

		loginPage.launchSession("https://parabank.parasoft.com/parabank/index.htm");

		loginPage.enterUserName(userName);

		loginPage.enterPassword(password);

		loginPage.clickLogin();	

	}

	@AfterTest
	public void tearDown() {

		loginPage.closeSession();

	}

	@DataProvider
	public Object[][] getTestData(){

		String filePath = "src//test//resources//testData//Book1.xlsx";

		String sheetName = "Login";

		ExcelUtil excel = new ExcelUtil(filePath, sheetName);	

		Object [][] testData = excel.readExcelData();

		return testData;
	}



}
