package com.Doms.PageRepository;

import org.openqa.selenium.WebDriver;

public class PageManagement {
	public WebDriver driver;
	public LoginPage loginpageobj;
	public RegisterPage registerpageobj;
	public WelcomePage welcomepageobj;
	
	//initialisation
	public PageManagement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage initloginpage()
	{
		loginpageobj = new LoginPage(driver);
		return loginpageobj;
		
	}
	public RegisterPage initRegisterpage()
	{
		registerpageobj =new RegisterPage(driver);
		return registerpageobj;
		
	}
	public WelcomePage initWelcomepage()
	{
		welcomepageobj = new WelcomePage(driver);
		return this.welcomepageobj;
		
	}

	
}
