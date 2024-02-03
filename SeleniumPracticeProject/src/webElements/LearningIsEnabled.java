package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/5");
		Thread.sleep(7000);
		boolean result = driver.findElement(By.id("Check")).isEnabled();
		System.out.println(result);
		driver.findElement(By.id("Check Delivery")).sendKeys("577126");
		Thread.sleep(5000);
		boolean res1 = driver.findElement(By.id("Check")).isEnabled();
		System.out.println(res1);
	}
}
