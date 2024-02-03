package mobiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vivo {
	@Test(groups = "smoke")
	public void switchOn() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.vivo.com/in");
		System.out.println("Vivo is launched");
		driver.manage().window().maximize();
		driver.quit();
	}
}
