package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Dimension d=driver.findElement(By.id("small-searchterms")).getSize();
		System.out.println("The size is:");
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		Point p=driver.findElement(By.id("small-searchterms")).getLocation();
		System.out.println("The location is");
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Rectangle r = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println("The width, height, X  and Y is:");
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		System.out.println(r.getX());
		System.out.println(r.getY());
	}
}
