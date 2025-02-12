package TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo6 {
	
	@Test(groups= {"g1"})
	public void method1(){
		System.out.println("method 1");
	}
	
	@Test(groups= {"g1"})
	public void method2(){
		System.out.println("method 2");
	}
	
	@Test(groups= {"g1"})
	public void method3(){
		System.out.println("method 3");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}


}
