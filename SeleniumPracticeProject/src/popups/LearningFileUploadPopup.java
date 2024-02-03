package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningFileUploadPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.naukri.com/");
	driver.findElement(By.linkText("Register")).click();
	
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(2000);
	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_D);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_R);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_D);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_R);
	
}
}
