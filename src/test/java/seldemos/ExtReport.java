package seldemos;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtReport {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;

  @BeforeTest
  public void startReport() 
  {
	  
  }
  @Test
public void passTest(){
	
}
  @Test
public void failTets()
{
	
}
  @Test
public void skipTest()
{
	
}
  @AfterMethod
public void getResult(ITestResult result)
{
	
}
  @AfterTest
public void endReport()
{
	
}
}