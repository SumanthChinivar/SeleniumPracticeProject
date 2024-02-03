package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClearMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.woodlandworldwide.com/");
	Thread.sleep(2000);
//	WebElement search = driver.findElement(By.id("standard-bare"));
//	search.sendKeys("asdfghjkl;'");
//	
//	  Thread.sleep(2000); 
//	  search.clear();
//	 
//	Thread.sleep(2000);
//	search.sendKeys(" hhygiu ");
	
	
	
}
}
