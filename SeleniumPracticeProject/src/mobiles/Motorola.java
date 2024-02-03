package mobiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Motorola {
	@Test(groups = "system", dependsOnGroups = "smoke")
	public void startAndStop() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.motorola.com/us/");
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	@Test(dependsOnMethods = "startAndStop")
	public void setUp()
	{
		System.out.println("SetUp is ready");
	}
}
