package com.Doms.JavaScriptLibrary;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;

	import com.Doms.WebDriverLibrary.WebDriverUtility;

	public class JavaScriptUtility {
		
		
		public JavascriptExecutor javascriptobj;
		
		
		public void enterData_DisabledElement(WebElement element,String data)
		{
			javascriptobj = (JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("arguments[0].vaue="+data+"",element);

		}

		public void click_DisabledElement(WebElement element)
		{
			javascriptobj = (JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("arguments[0]/click()",element);

			
		}
		public void defaultverticalscrollBy()
		{
			javascriptobj = (JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("window.scrollBy(1000,1000)");

	}
		public void defaultverticalscrollTo()
		{
			javascriptobj = (JavascriptExecutor)WebDriverUtility.driver_static;
			javascriptobj.executeScript("window.scrollTo(1000,1000)");

		}
		
		public void scrollUsingView(WebElement element,boolean value)
		{
			javascriptobj=(JavascriptExecutor)WebDriverUtility.driver_static;
			
			javascriptobj.executeScript("arguments[0].scrollIntoview("+value+");",element);
		}
		
		
		
	}
