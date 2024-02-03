package unitTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.DataUtility;

public class AddingAProductToDemoWebShop {
	@DataProvider(name = "Edata")
	public String[][] businessFlow() throws EncryptedDocumentException, IOException {
		DataUtility utility=new DataUtility();
		String[][] utilityData=utility.readingDataFromMultipleRowColumn("./TestData/DemoWebShopProductDetails.xlsx", "Sheet1");
		return utilityData;
	}

	//Verify user is able to Add a product to the cart 
	@Test(dataProvider = "Edata")
	public void addProductToCart(String[] edata) {
		// Browser setup
		System.setProperty(edata[0], edata[1]);
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		SoftAssert softAssert = new SoftAssert();

		// Launch the application
		driver.get(edata[2]);
		Reporter.log("Web Application launched", true);

		// User trying to Login
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("User clicked on login button", true);
		driver.findElement(By.id("Email")).sendKeys(edata[3]);
		String emailData = driver.findElement(By.id("Email")).getAttribute("value");
		softAssert.assertEquals(emailData, edata[3]);
		Reporter.log("Username Enterted successfully", true);
		driver.findElement(By.id("Password")).sendKeys(edata[4]);
		String passwordData = driver.findElement(By.id("Password")).getAttribute("value");
		softAssert.assertEquals(passwordData, edata[4]);
		Reporter.log("Password is entered orrectly", true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("User clicked on Login", true);
		WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
		softAssert.assertEquals(logoutButton.isDisplayed(), true);
		Reporter.log("User logged in successfully", true);

		// searchForProduct
		driver.findElement(By.id("small-searchterms")).sendKeys(edata[5]);
		String searchTerm = driver.findElement(By.id("small-searchterms")).getAttribute("value");
		softAssert.assertEquals(searchTerm, edata[5]);
		Reporter.log("User is searching for smart phone", true);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Reporter.log("User clicked on search button", true);
		driver.findElement(By.xpath("(//a[text()='Smartphone'])[2]")).click();
		Reporter.log("User clicked on desired product", true);
		softAssert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/smartphone");
		Reporter.log("Smart phone product details is displayed", true);

		// click on add to cart button
		driver.findElement(By.id("add-to-cart-button-43")).click();
		Reporter.log("User clicked on add to cart button",true);
		WebElement addedToCart=driver.findElement(By.xpath("//a[text()='shopping cart']"));
		softAssert.assertEquals(addedToCart.isDisplayed(), true);
		Reporter.log("Product is added to cart",true);
		
		//Verifying product is add to cart or not
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("User clicked on shopping cart link",true);
		String cartPageTitle=driver.getTitle();
		softAssert.assertEquals(cartPageTitle, "Demo Web Shop. Shopping Cart");
		Reporter.log("Shopping cart page is displayed",true);
		WebElement productTitle= driver.findElement(By.linkText("Smartphone"));
		softAssert.assertEquals(productTitle.isDisplayed(), true);
		Reporter.log("Product added to cart successfully",true);
		
		driver.findElement(By.linkText("Log out")).click();
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		softAssert.assertEquals(registerLink.isDisplayed(), true);
		Reporter.log("Logged out successfully",true);
		
		driver.quit();
		Reporter.log("Browser is closed",true);	
	}
}
