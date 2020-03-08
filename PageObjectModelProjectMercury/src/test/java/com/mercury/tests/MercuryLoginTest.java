package com.mercury.tests;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercury.pages.MercuryLoginPage;
import com.mercury.pages.BaseClass;
//import com.mercury.utility.BrowserFactory;

public class MercuryLoginTest extends BaseClass{
	
	//WebDriver driver; //we will get this from BaseClass when extended
	
	@Test
	public void loginApp() 
	{
		//driver = BrowserFactory.StarApplication(driver, "Chrome", "http://newtours.demoaut.com/");
		//System.out.println(driver.getTitle());
		
		MercuryLoginPage loginPage=PageFactory.initElements(driver, MercuryLoginPage.class);
		loginPage.loginToMercury("mercury","mercury");
		
		//BrowserFactory.quitBrowser(driver);
	}
	

}
