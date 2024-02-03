package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoggingInToDemoWebShopUsingDataProvider {
	@DataProvider(name = "testDataForLogin")
	public String[][] loginCredential() {
		String[][] loginData = { { "chanikyachandragupta7@gmail.com", "ramrom1234" },
				{ "komalgupta121@gmail.com", "Shakuni123.@" },
				{"sumanthchinivar16@gmail.com","Rowdy@123"}
				};
		return loginData;
	}

	@Test(dataProvider = "testDataForLogin")
	public void login(String[] cred) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
}
