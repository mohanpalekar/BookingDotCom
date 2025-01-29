import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//Initialize js executor
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		String url = "https://www.flipkart.com/";

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().to("https://www.amazon.in/");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.close();

	}

}
