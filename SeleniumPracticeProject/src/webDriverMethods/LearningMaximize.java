package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningMaximize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
}
