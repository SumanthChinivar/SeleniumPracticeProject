package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchURLFromAWebPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://open.spotify.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
