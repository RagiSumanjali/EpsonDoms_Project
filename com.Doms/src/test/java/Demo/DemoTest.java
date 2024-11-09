package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class DemoTest {
	ExtentReports report;
	@Test
	public void DemoTesting1()
	{
	
	//create the test Information
	ExtentTest test = report.createTest("RegressionTest");
	
	//steps information
	test.log(Status.INFO, "Step1: Launch the browser successfully");
	
	test.log(Status.INFO, "Step2: Navigating to the application via URL Successfully");
	
	test.log(Status.INFO, "Step3: Verified the webpage Successfully");
	
	if ("Harry".equals("Harry")) {
		test.log(Status.PASS, "Step4: Verified the webelements displayed");
	}
	else {
		test.log(Status.FAIL, "Step4: Verified the webelements Not displayed");
	}
	
	//test.log(Status.SKIP, "Step5: Element is hidden");
	
	report.flush();
	System.out.println("Execution is done");
	}
	@Test
	public void DemoTest1()
	{
		
	}
	public void DemoTest2()
	{
		
	}
	public void DemoTest3()
	{
		
	}
	public void DemoTest4()
	{
		
	}
	public void DemoTest5()
	{
		
	}
}

