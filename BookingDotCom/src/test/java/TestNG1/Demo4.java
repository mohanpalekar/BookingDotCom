package TestNG1;

import java.time.Duration;

import org.testng.annotations.Test;

public class Demo4 {
	
	@Test(timeOut = 5000)
	public void method1() throws InterruptedException {
		System.out.println("method1");
		Thread.sleep(Duration.ofSeconds(10));
		System.out.println("Done");
	}
	
	@Test(description = "Login Test")
	public void method2(){
		System.out.println("method2");
		System.out.println("Done");
	}

}
