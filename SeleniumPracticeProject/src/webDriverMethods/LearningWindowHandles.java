package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Downloads/TestPage.html");
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(5000);
	
	System.out.println(driver.getWindowHandles());
}
}
