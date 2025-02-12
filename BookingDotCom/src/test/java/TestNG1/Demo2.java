package TestNG1;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(enabled=true, groups = {"Group1"})
	public void demo2_method1() {
		
		System.out.println("method1");
	
	}
	
	
	@Test(dependsOnMethods = {"demo2_method1"})
	public void demo2_method2() {
		
		System.out.println("method2");
	}
	
	@Test(groups = {"Group1"})
	public void demo2_method3() {
		
		System.out.println("method3");
	}
	
	

}
