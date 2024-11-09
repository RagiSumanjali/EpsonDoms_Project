package com.Doms.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	@FindBy(xpath="//input[contains(@type,'datetime-local')]")
	private WebElement birth;
	
	@FindBy(xpath="(//input[contains(@type,'radio')])[2]")
	private WebElement gender;
	
	@FindBy(xpath="//input[contains(@type,'checkbox')]")
	private WebElement places;
	
	@FindBy(xpath="//select[contains(@name,'country1')]")
	private WebElement country;
	
	@FindBy(xpath="//textarea[contains(@name,'feedback')]")
	private WebElement feedback;
	
	@FindBy(xpath="//input[contains(@type,'file')]")
	private WebElement upload;
	
	@FindBy(xpath="//input[contains(@type,'submit')]")
	private WebElement register;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;

	//Getters
	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getBirth() {
		return birth;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPlaces() {
		return places;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getFeedback() {
		return feedback;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getRegister() {
		return register;
	}
	
	public WebElement getContactUs() {
		return contactUs;
	}
	
	
	
	
}
