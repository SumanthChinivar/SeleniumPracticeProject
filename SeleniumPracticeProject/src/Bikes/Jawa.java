package Bikes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jawa {
	@Test(dependsOnGroups = "system")
	public void longRideOnJawa() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jawamotorcycles.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
