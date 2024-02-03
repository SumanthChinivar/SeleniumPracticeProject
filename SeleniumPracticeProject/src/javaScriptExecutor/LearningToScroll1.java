package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningToScroll1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(;;)
		{
			try
			{
			    driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
				break;
			}catch(NoSuchElementException e)
			{
				jse.executeScript("window.scrollBy(0,100);");
			}
		}
		
	}
}
