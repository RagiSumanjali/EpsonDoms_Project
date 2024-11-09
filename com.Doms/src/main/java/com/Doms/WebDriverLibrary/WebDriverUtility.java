package com.Doms.WebDriverLibrary;

	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
    import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

    /**
     * This class provides the Reusable Methods to perform all Browser Related Actions
     *
     *@author AJJU
     */
    
	public  class WebDriverUtility {

		public static WebDriver driver_static;
		public Object test;
		public WebDriverWait wait;
		public WebDriver driver;
		public Select selectobj;
		public Actions actionobj;
		public Robot robotobj;
		
		/**
		 * This Method used to launch the Specific Browser 
		 * 
		 * @param String Browser Name
		 *@return void*/
		public void launchBrowser(String browser) {
			// Step1: Launch the Browser-----> Chrome, Edge, safari
			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver_static = driver;
				break;

			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver_static = driver;
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver_static = driver;
				break;

			default:
				System.out.println("Entered incorrect browser name stupid");
				break;
			}
			
			Reporter.log("\"Step1: Successully launched\"");
		}
		
		/**
		 * This Method is Used to Navigate to the Particular Application
		 * 
		 * @param String URL
		 * @return void*/
		public void NavigateToApplication(String url) {
			driver.get(url);
		}
		
		/**
		 * This Method is Used to Maximize the Browser
		 * 
		 *@return void */
		 
		public void maximizeTheBrowser() {
			driver.manage().window().maximize();
		}
		/**
		 * This Method is Used to Close the Browser
		 * 
		 *@return void */
		public void closeTheBrowser() {
			driver.close();
		}
		/**
		 * This Method is Used to Close All the Browser
		 * 
		 *@return void */
		public void closeAllBrowser() {
			driver.quit();
		}
		/**
		 * This Method is Used to waitImplicitly
		 * @param long duration
		 *@return void */
		public void waitImplicitly(long duration) {
			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		}
		/**
		 * This Method is Used to waitExplicitly
		 * @param long duration, WebElement element
		 *@return void */
		public void waitExplicitily(long duration, WebElement element) {
			wait = new WebDriverWait(driver, duration);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		/**
		 * This Method is Used to selectOptionInDropdown By using Index Value
		 * @param WebElement element,int index
		 *@return void */
		public void selectOptionInDropdown(WebElement element, int index) {
			selectobj.selectByIndex(index);
		}
		/**
		 * This Method is Used to selectOptionInDropdown By using VisibleText
		 * @param WebElement element,String visibletext
		 *@return void */
		public void selectOptionInDropdown(WebElement element, String visibletext) {
			selectobj.selectByVisibleText(visibletext);
		}
		/**
		 * This Method is Used to selectOptionInDropdown By value
		 * @param String value,WebElement element
		 *@return void */
		public void selectOptionInDropdown(String value, WebElement element) {
			selectobj.selectByVisibleText(value);
		}
		/**
		 * This Method is Used for MouseOvering 
		 * @param WebElement element
		 *@return void */
		public void mouseHovering(WebElement element) {
			actionobj.moveToElement(element).perform();
		}
		/**
		 * This Method is Used to Press The Key by using KeyboardHandling
		 *@return void */
		public void pressTheKey_pageDown() {
			robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
		}
		/**
		 * This Method is Used to Release The Key by using KeyboardHandling
		 *@return void */
		public void ReleaseTheKey() {
			robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);

		}
		/**
		 * This Method is Used to Accept the POPUP
		 *@return void */
		public void alertPopupAccept() {
			driver.switchTo().alert().accept();
		}
		/**
		 * This Method is Used to Dismiss the POPUP
		 *@return void */
		public void alertPopupDismiss() {
			driver.switchTo().alert().dismiss();
		}
		/**
		 * This Method is Used to switch Control To Frame
		 * @param int index
		 *@return void */
		public void switchControlToFrame(int index) {
			driver.switchTo().frame(0);
		}
		/**
		 * This Method is Used to switch Control To Frame1
		 * @param WebElement element
		 *@return void */
		public void switchControlToFrame1(WebElement element) {
			driver.switchTo().frame(element);
		}
		/**
		 * This Method is Used to switch Control To Main1
		 *@return void */
		public void switchBackControlToMain1() {
			driver.switchTo().defaultContent();
		}
		/**
		 * This Method is Used to switch Control To Window1
		 * @param String windowaddress
		 *@return void */
		public void switchControlToWindow1(String windowaddress) {

			driver.switchTo().window(windowaddress);
		}
		/**
		 * This Method is Used to switch Control To Frame
		 * @param WebElement element
		 *@return void */
		public void switchControlToFrame(WebElement element)
		{
			driver.switchTo().frame(element);	
		}
		/**
		 * This Method is Used to switch Control To Main
		 *@return void */
		public void switchBackControlToMain()
		{
			driver.switchTo().defaultContent();
		}
		/**
		 * This Method is Used to switch Control To Window
		 * @param String windowaddress
		 *@return void */
		public void switchControlToWindow(String windowaddress)
		{
		
			driver.switchTo().window(windowaddress);
		}
		
	}
