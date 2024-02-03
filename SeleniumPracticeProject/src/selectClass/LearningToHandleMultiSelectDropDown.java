package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningToHandleMultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select select =new Select(dropdown);
		
		select.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(2000);
		
		select.selectByValue("99");
		Thread.sleep(2000);
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		
		
		select.deselectByIndex(0);
		System.out.println(select.getFirstSelectedOption().getText());
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement ele:selectedOptions)
		{
			System.out.println(ele.getText());
		}
		
		Thread.sleep(2000);
		
		}
}
