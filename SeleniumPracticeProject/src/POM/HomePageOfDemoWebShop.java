package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOfDemoWebShop {
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink()
	{
		return registerLink;
	}
}
