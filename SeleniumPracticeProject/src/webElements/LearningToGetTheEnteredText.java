package webElements;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToGetTheEnteredText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.woodlandworldwide.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("standard-bare")).sendKeys("Sneakers");
		Thread.sleep(2000);
		String value = driver.findElement(By.id("standard-bare")).getAttribute("value");
		System.out.println(value);
	}
}
