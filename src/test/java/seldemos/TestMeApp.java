package seldemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMeApp {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	 	  driver.findElement(By .name("userName")).sendKeys("lalitha");
	  driver.findElement(By .name("password")).sendKeys("password123");
	  driver.findElement(By .name("Login")).click();
	  Assert.assertEquals("SignOut", "SignOut");
	  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
  }
}
