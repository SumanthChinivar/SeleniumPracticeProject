package unitTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningAtTest7 {
@Test(invocationCount = 5) 
public void learningInvocationCOunt()
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://pexpo.in/");
	driver.manage().window().maximize();
	driver.quit();
}
}
