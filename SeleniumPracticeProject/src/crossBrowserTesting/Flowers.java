package crossBrowserTesting;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flowers {
	@Test
//	@Parameters("flower")
	public void printFlower(@Optional("Lily") String flowerName) {
		System.out.println(flowerName);
	}
}
