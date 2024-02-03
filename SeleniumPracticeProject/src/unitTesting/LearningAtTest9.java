package unitTesting;

import org.testng.annotations.Test;

public class LearningAtTest9 {
	@Test(enabled = false)
	public void demo()
	{
		System.out.println("Hello, how are you?");
	}
	
	@Test(enabled = true)
	public void sample()
	{
		System.out.println("Hey, I am fine.");
	}
	
	@Test
	public void example()
	{
		System.out.println("Hai, Thank you");
	}
}
