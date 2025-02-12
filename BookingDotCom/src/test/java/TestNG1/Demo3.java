package TestNG1;

import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(groups = {"Group1"})
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test(groups = {"Group1", "Group2"})
	public void method2() {
		System.out.println("method 2");
	}

	
	@Test(groups = {"Group1"})
	public void method3() {
		System.out.println("method 3");
	}

	
	@Test(groups = {"Group1", "Group2"})
	public void method4() {
		System.out.println("method 4");
	}


}
