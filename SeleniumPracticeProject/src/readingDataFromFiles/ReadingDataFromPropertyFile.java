package readingDataFromFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		File file=new File("./TestData/DemoWebShopLogin.properties");
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverKey=(String)prop.get("driverKey");
		System.out.println(driverKey);
		
		String driverPath=(String)prop.get("driverPath");
		System.out.println(driverPath);
		
		String url=(String)prop.get("url");
		System.out.println(url);
		
		String userName=(String)prop.get("username");
		System.out.println(userName);
		
		String password=(String)prop.get("password");
		System.out.println(password);
	}
}
