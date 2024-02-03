package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPromptPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn"));
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_END);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_END);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_END);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Swagger Documentation")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
	}
}
