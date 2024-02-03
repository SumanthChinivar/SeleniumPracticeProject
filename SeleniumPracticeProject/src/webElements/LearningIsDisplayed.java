package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIsDisplayed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	boolean isDisplayed = driver.findElement(By.xpath("//img[contains(@alt,'Tricentis')]")).isDisplayed();
	System.out.println(isDisplayed);
	
	}
}
