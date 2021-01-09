package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(name="username")
	WebElement userName;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	public void login()
	{
		userName.sendKeys("abcd.wxyz@defg.com");
	}

}
