package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yamaha {
	@Test
	public void riding() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://global.yamaha-motor.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test
	public void parking()
	{
		System.out.println("Parking an yamaha");
	}
}
