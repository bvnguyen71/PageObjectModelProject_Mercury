package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.mercury.utility.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	
	@BeforeClass
	
	public void setUp()
	{
		driver = BrowserFactory.StarApplication(driver, "Chrome", "http://newtours.demoaut.com/");
	}
	
	
	@AfterClass
	
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
}
