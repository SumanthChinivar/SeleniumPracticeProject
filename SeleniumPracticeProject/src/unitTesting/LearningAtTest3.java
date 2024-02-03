package unitTesting;

import org.testng.annotations.Test;

public class LearningAtTest3 {

	@Test(priority=1)
	public void xray()
	{
		System.out.println("I am an xray method");
	}
	
	@Test(priority=2)
	public void mri()
	{
		System.out.println("I am MRI method");
	}
}
