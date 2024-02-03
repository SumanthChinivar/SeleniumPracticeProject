package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPageSource {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://espncricinfo.com/");
		
		System.out.println(driver.getPageSource());
}
}
