package TestNG1;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 1)
	public void method1() {
		System.out.println("Method 1");
	}
	
	@Test(priority = 2)
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(priority = -1)
	public void method4() {
		System.out.println("Method 4");
	}
	
	@Test(groups = {"Group1"})
	public void method6() {
		System.out.println("Method 5");
	}
	
	@Test(priority = 0)
	public void method3() {
		System.out.println("Method 3");
	}
	
	@Test()
	public void method5() {
		System.out.println("Method 6");
	}

}
