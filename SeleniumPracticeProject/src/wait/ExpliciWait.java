package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		WebElement ele=driver.findElement(By.id("Check"));
		driver.findElement(By.id("Check Delivery")).sendKeys("577126");
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		driver.close();
		
		for(;;)
		{
			if(!driver.findElement(By.xpath("")).getText().equals(""))
			{
				driver.findElement(By.xpath("")).sendKeys(Keys.BACK_SPACE);
			}
			else
				break;
		}
	}
}
