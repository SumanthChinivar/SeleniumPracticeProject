package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLCalendarPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LocalDateTime dateAndTime=LocalDateTime.now();
		String month = dateAndTime.getMonth().toString();
		month=month.charAt(0)+month.substring(1,month.length()).toLowerCase();
		int date=dateAndTime.getDayOfMonth();
		int year=dateAndTime.getYear();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]/../..//p[text()='"+date+"']")).click();
	}
}
