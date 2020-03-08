package com.mercury.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	
	

	public static WebDriver StarApplication(WebDriver driver,String browserName, String appUrl)
	{
		if(browserName.equals("Chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if (browserName.equals("Firefox"))
		{

			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{

			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We don't support browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
		
			
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	

}
