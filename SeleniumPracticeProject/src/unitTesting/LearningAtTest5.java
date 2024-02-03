package unitTesting;

import org.testng.annotations.Test;

public class LearningAtTest5 {
	@Test(priority = 1)
	public void hero() {
		System.out.println("Hero method");
	}

	@Test(priority = 1)
	public void yamaha() {
		System.out.println("I am a yamaha method");
	}
	
	@Test(priority=-2)
	public void kawasaki()
	{
	System.out.println("I am kawaskai method");	
	}
}
