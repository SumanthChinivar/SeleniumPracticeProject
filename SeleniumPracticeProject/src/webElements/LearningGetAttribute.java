package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.kalkifashion.com/in/");
		driver.findElement(By.className("head-search-1234")).click();
		Thread.sleep(2000);
		String placeholder=driver.findElement(By.id("search-input")).getAttribute("placeholder");
		System.out.println(placeholder);
	}
}
