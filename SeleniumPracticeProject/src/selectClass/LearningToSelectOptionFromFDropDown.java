package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningToSelectOptionFromFDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/desktops");
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(0);
		
		WebElement dropdown1 = driver.findElement(By.id("products-pagesize"));
		Select select1=new Select(dropdown1);
		select1.selectByVisibleText("12");
		
		WebElement dropdown2 = driver.findElement(By.id("products-viewmode"));
		Select select2=new Select(dropdown2);
		select2.selectByIndex(1);	
		
		
		
	}
}
