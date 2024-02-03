package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider1 {

	@DataProvider()
	public String[][] data()
	{
		String[][] data= {{"Sumanth","TYP1213"},{"Vijaya","TYP1234"}};
		return data;
	}
	
	@Test(dataProvider = "data")
	public void printData(String [] cred)
	{
		System.out.println(cred[0]);
		System.out.println(cred[1]);
	}
}
