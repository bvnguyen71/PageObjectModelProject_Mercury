package com.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryLoginPage {
	
	WebDriver driver;  // ldriver will be stored in this 'driver'
	
	
	public MercuryLoginPage(WebDriver ldriver) //ldriver comes from main tettcase
	{
		this.driver=ldriver;
	}

	@FindBy(name="userName") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(name="login") WebElement sigin;
	
	public void loginToMercury(String usernameApplication, String passwordApplication)
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{

		}
		
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		sigin.click();
	}


	
}
