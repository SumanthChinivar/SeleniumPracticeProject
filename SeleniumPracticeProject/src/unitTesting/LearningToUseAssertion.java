package unitTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningToUseAssertion {
	@Test
	public void login() throws InterruptedException
	{
		String username = "komalgupta121@gmail.com";
		String password = "Shakuni123.@";

		// Launching the browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized",true);

		// Adding implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// launching the website
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Demowebshop is launched",true);

		// click on login
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("user clicked on login",true);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop. Login");
		Reporter.log("Login page is displayed",true);

		// Logging in to the application

		// Entering email id
//		Thread.sleep(2000);
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys(username);
//		Reporter.log("Email has been entered to email id text field",true);
//
//		// Entering password
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.id("Password")).sendKeys(password);
//		Reporter.log("Password is entered",true);
//
//		// clicking on login button
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		System.out.println("Clicked on login button");
//
//		// To check whether user is logged in or not
//		if (driver.findElement(By.linkText("komalgupta121@gmail.com")).isDisplayed()) {
//			Reporter.log("User logged in successfully",true);
//		} else {
//			Reporter.log("Login failed",true);
//		}
//
//		// Clicking on logout
//		driver.findElement(By.linkText("Log out")).click();
//		Reporter.log("The user clicked on log out",true);
//		if (driver.findElement(By.linkText("Register")).isDisplayed()) {
//			Reporter.log("User logged out successfully",true);
//		} else
//			Reporter.log("Logout failed",true);
//
//		// closing the browser
//		driver.quit();
//		Reporter.log("Browser is closed",true);
	}
}
