package mobiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IPhone {
	@Test(groups="smoke")
	public void startIPhone() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/");
		System.out.println("Iphone is launched");
		driver.manage().window().maximize();
		driver.quit();
	}

	@Test(groups="Functional", dependsOnMethods = {"startIPhone","updateIPhone"})
	public void endIPhone()
	{
		System.out.println("Iphone is stopped");
	}
	
	@Test(groups="Integration")
	public void updateIPhone()
	{
		System.out.println("Iphone updated");
	}
}
