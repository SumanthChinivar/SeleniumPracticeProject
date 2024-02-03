package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningiFrameUsingName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/user/Downloads/iframe%20(1).html");

		driver.switchTo().frame("frame1");
		driver.findElement(By.id("small-searchterms")).sendKeys("Keyboard");
	}
}
