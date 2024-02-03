package unitTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningAtTest6 {
	@Test(timeOut =2000)
	public void learningtimeOut() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testng.org/testng-eclipse-update-site/");
	}
}
