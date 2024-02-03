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

public class LearningConfigurationAnnotation2 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executed Before the class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before a method");
	}

	@Test
	public void demo() {
		System.out.println("I am a demo method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After a method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executed after the class");
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
