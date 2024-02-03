package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LearningMoveToElementUsingCoordinates {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.linkText("Log in"));
		Point point1 =driver.findElement(By.linkText("Log in")).getLocation();
		action.moveByOffset(point1.getX(), point1.getY()).click().perform();
		WebElement cart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		action.moveToElement(cart, 0, 0).click().perform();
	}
}
