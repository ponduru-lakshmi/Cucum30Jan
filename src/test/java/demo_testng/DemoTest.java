package demo_testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTest {
	SoftAssert sa=new SoftAssert();
	
	@BeforeTest
	public void openApp()
	{
		System.out.println("open app method");
	}
	@BeforeMethod
	public void refreshApp()
	{
		System.out.println("inside refresh app before method");
	}
  @Test(priority=3)
  public void register() {
	  sa.assertEquals("register","resister","softassert method");
	  System.out.println("inside register method");
	  sa.assertAll();
  }
  
  @Test(priority=1)
  public void login() {
	  System.out.println("inside login method");
	  
  }
  
  @Test(priority=2)
  public void logout()
  {
	  System.out.println("inside logout method");
  }
  
  @AfterTest
  public void closeApp()
  {
	  System.out.println("inside closeapp after test method");
  }
}
