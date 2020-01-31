package seldemos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
  @Test(dataProvider="login")//method name or dp name
  public void dpTest(String user,String pass) {
	  System.out.println("user:"+user+"pass:"+pass);
  }
  @DataProvider(name="login")
  public Object[][] logindata()
  {
	  Object[][] data= {{"mike","john"},{"john","piper"},{"peter","parker"}};
	  return data;
  }
}
