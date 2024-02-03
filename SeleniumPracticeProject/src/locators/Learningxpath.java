package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningxpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodlandworldwide.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys("Sneakers");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='standard-bare']")).sendKeys(Keys.ENTER);
}
}
