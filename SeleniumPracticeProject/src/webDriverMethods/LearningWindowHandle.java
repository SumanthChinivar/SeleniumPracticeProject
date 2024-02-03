package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		System.out.println(driver.getWindowHandle());
	}
}
