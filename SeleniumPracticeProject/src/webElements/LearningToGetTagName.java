package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToGetTagName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tourism.gov.in/");

		String tagname=driver.findElement(By.xpath("//img[@alt='national emblem']")).getTagName();
		System.out.println(tagname);
	}
}
