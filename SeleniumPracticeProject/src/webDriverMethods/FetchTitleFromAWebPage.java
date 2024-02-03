package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleFromAWebPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.partsbaba.com/");
	System.out.println(driver.getTitle());
}
}
