package configurationAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigAnnotation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After a method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed Before the class");
	}

	@Test
	public void demo() {
		System.out.println("I am a demo method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before a method");
	}
	
	@Test
	public void sample()
	{
		System.out.println("I am a sample method");
	}

	@BeforeSuite
	public void demo2()
	{
		System.out.println("Hai");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
