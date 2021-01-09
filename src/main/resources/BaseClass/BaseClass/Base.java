package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	private static String browserName;
	private static String URL;
	
	public static WebDriver driver;
	private static String driverPath;
	
	
	
//	public Base(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		
//		this.driver=driver;
//	}

	public void launchBrowser() throws IOException
	{
	File file=new File("G://SeleniumCucumberFramework//BDDSelenium//src//main//resources//Properties//Config.properties");
	FileInputStream fis=new FileInputStream(file);
	
	Properties prop=new Properties();
	
	
	prop.load(fis);
	
	browserName=prop.getProperty("browser");
	URL=prop.getProperty("URL");
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		driverPath=System.getProperty("user.dir")+ "\\Drivers\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver=new ChromeDriver();
		launchApplication();
	}
	
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		driverPath=System.getProperty("user.dir")+ "\\Drivers\\FirefoxDriver\\geckodriver.exe";
		System.setProperty("webdriver.firefox.driver", driverPath);
		
		driver=new FirefoxDriver();
	}
	
	else if(browserName.equalsIgnoreCase("InternetExplorer"))
	{
		driverPath=System.getProperty("user.dir")+ "\\Drivers\\IEDriver\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", driverPath);
		
		driver=new InternetExplorerDriver();
	}
	
	else
	{
		
		driver=null;
		System.out.println("No browser Set");
	}

  }
	
	public void launchApplication()
	{
	
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
	}
	

}
