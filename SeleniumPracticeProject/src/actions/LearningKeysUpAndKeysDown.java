package actions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.CharSequenceInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeysUpAndKeysDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Thread.sleep(2000);
		action.sendKeys(search, "SmartPhones").perform();
		Thread.sleep(2000);
		action.moveToElement(search).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DELETE).build().perform();	
	}
}
