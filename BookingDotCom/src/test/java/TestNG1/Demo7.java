package TestNG1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelUtil;

public class Demo7 {

	@Test(dataProvider = "getTestData")
	public void method(String userName, String passWord) {
		
		System.out.println("Test");
		
		System.out.println("Username = "+userName+", Password = "+passWord);
		
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
