package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kawasaki {
	@Test
	public void ride() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
