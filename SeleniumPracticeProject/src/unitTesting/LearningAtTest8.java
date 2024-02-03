package unitTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningAtTest8 {
@Test(invocationCount = 10, threadPoolSize = 5)
public void learningThreadPoolSize()
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://testng.org/testng-eclipse-update-site/");
	driver.manage().window().maximize();
	driver.quit();
}
}
