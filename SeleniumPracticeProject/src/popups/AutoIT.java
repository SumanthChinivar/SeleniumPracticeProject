package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\user\\OneDrive\\Desktop\\FP.exe");
	}
}
