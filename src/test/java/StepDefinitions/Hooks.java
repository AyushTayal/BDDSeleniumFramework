package StepDefinitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseClass.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	//private static WebDriver driver;
	
	 
	
	@Before
	public void beforeTest() throws IOException
	{
		Base b=new Base();
		System.out.println("I will execute before each Test");
		b.launchBrowser();
		
	}
	
	@After
	public void afterTest()
	{
		System.out.println("I will execute After each Test");
		Base.driver.close();
	}

}
