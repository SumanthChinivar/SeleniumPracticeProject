package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningNoArgumentContextClick {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	Actions action=new Actions(driver);
	WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	action.moveToElement(rightClick).perform();
	action.contextClick().perform();
	List<WebElement> allOptions = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li"));
	for(WebElement option:allOptions)
	{
		System.out.println(option.getText());
	}
}
}
