package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotOfWebElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tatamotors.com/");
		
		WebElement serachButton=driver.findElement(By.linkText("Search"));
		File ss=serachButton.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorShots/serachButton.png");
		FileHandler.copy(ss, file);
	}
}
