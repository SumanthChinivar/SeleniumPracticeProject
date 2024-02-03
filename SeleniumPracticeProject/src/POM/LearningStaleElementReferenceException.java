package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningStaleElementReferenceException {

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Empty Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);

		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("DemoWebshop is launched", true);

		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys("SmartPhone");

		driver.navigate().refresh();

		searchField = driver.findElement(By.id("small-searchterms"));
		System.out.println(searchField.getAttribute("value"));
	}
}

