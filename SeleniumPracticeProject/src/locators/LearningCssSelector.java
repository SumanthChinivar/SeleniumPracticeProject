package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='head-search-1234']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("div[class='head-search-1234']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search-input']")).sendKeys("Shirt");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='search-input']")).sendKeys(Keys.ENTER);
		
	}
}
