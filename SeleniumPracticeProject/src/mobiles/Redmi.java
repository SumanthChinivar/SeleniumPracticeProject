package mobiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redmi {

	@Test(groups = "smoke")
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mi.com/in");
		System.out.println("Redmi is started");
		driver.manage().window().maximize();
		driver.quit();
	}
}
