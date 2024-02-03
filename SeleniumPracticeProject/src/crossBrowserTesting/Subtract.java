package crossBrowserTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Subtract {
	@Test
	@Parameters({"a","b"})
	public void subtract(int c,int d) {
		System.out.println(c - d);
	}
}
