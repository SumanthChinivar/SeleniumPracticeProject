package unitTesting;

import org.testng.annotations.Test;

public class LearningAtTest4 {
	@Test(priority=0)
	public void alpha() {
		System.out.println("I am an alpha method");
	}

	@Test
	public void gamma() {
		System.out.println("I am a gamma method");
	}

	@Test(priority=-1)
	public void beta() {
		System.out.println("I am a beta method");
	}
	
	@Test
	public void cos()
	{
		System.out.println("I am a cosine method");
	}
}
