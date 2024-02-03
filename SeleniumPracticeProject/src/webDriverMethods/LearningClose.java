package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClose {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Downloads/TestPage.html");
	driver.close();
	driver.quit();
}
}
