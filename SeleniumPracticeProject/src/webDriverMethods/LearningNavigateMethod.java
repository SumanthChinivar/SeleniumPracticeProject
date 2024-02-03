package webDriverMethods;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.vibgyorhigh.com/schools/bengaluru");
		Thread.sleep(5000);
		driver.get("https://qspiders.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
	}
}
