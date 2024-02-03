package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToFindElementsFromTheWebpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(2000);
		List<WebElement> navBar=driver.findElements(By.xpath("//div[@id='tabs']/div/div"));
		for(WebElement ele:navBar)
		{
			String text=ele.getText();
			System.out.println(text);
		}
	}
}
