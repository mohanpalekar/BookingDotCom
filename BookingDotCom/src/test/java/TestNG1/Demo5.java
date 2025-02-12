package TestNG1;

import org.testng.annotations.Test;

public class Demo5 {
	
//	@Test(invocationCount = 4)
//	public void method1() {	
//		System.out.println();
//	}
	
	@Test(alwaysRun = true, enabled=false)
	public void method2() {	
		System.out.println();
	}
	
	

}
