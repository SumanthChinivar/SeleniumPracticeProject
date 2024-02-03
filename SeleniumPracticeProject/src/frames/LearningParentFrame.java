package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningParentFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("C:\\Users\\user\\Downloads\\iframe.html");

		driver.switchTo().frame("FR2");
		driver.findElement(By.id("click-to-show")).click();
		driver.findElement(By.id("txt_sm_search")).sendKeys("Nexon");
		driver.findElement(By.id("btn_sm_search")).click();
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	
	}
}
