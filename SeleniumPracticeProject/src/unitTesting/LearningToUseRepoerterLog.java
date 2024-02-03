package unitTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningToUseRepoerterLog {
	@Test
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Window is maximized");
		driver.get("https://testng.org/testng-eclipse-update-site/");
		Reporter.log("Url is launched");
		driver.quit();
		Reporter.log("Browser is closed");
	}
}
