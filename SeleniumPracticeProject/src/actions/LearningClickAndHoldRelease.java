package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningClickAndHoldRelease {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(3);
		
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		action.moveToElement(src).clickAndHold().perform();
		
		WebElement target=driver.findElement(By.id("trash"));
		action.moveToElement(target).release().perform() ;
	}
}
