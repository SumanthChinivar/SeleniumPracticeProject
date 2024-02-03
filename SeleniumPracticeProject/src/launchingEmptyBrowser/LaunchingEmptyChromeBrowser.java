package launchingEmptyBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}
}
