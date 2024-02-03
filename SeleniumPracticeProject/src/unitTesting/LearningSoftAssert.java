package unitTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	@Test
	public void login() {
		String username = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";

		// Launching the browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized", true);
		SoftAssert softAssert=new SoftAssert();

		// Adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// launching the website
		driver.get("https://demowebshop.tricentis.com/");
		softAssert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis");
		Reporter.log("Demowebshop is launched", true);
		
		// click on login
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("user clicked on login", true);
		String title = driver.getTitle();
		softAssert.assertEquals(title, "Demo Web Shop");
		Reporter.log("Login page is displayed", true);
		softAssert.assertAll();
	}
}
