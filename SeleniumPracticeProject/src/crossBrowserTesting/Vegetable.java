package crossBrowserTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetable {
	@Test
	@Parameters("vegetable")
	public void printVegetable(String vegetableName) {
		System.out.println(vegetableName);
	}
}
