package seldemos;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelBasic {
	
	private static final List<WebElement> WebElement = null;
	WebDriver driver;
  @Test
  public void test() {
	  String bro_name="chrome";
	  if(bro_name=="chrome")
	  {
		//set chrome driver path
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\chromedriver.exe");
		  //set the browser driver
		  driver=new ChromeDriver();
		  //open the url
		  driver.navigate().to("http://www.google.co.in");
		 // driver.get("http://newtours.demoaut.com/");//second method
		  //title of the page
		  driver.manage().window().maximize();
		  System.out.println("The title of the page is "+driver.getTitle());
		  driver.findElement(By .linkText("Gmail")).click();
		  System.out.println("The title of the page is "+driver.getTitle());
		  driver.findElement(By .linkText("Terms")).click();
		  System.out.println("The title of the page is "+driver.getTitle());
		 
		  Set<String> windHand=driver.getWindowHandles();
		  System.out.println(windHand.size());
		  Iterator<String> ita=windHand.iterator();
		  String str1=ita.next().toString();
		  System.out.println(str1);
		  String str2=ita.next().toString();
		  driver.switchTo().window(str2);
		  System.out.println("The title of the page is "+driver.getTitle());
		  driver.findElement(By .linkText("view archived versions")).click();
		//  driver.findElement(By.linkText("REGISTER")).click();
		// Select sel=new Select(driver.findElement(By .name("country")));
		//  sel.selectByValue("243");
		//  sel.selectByIndex(200);
		//  sel.selectByVisibleText("ISRAEL");
		  
		 // System.out.println(driver.getCurrentUrl());
		  
		
		  
		 // driver.findElement(By .name("email")).sendKeys("John");
		 // driver.findElement(By .name("password")).sendKeys("mary");
		 // driver.findElement(By .name("confirmPassword")).sendKeys("mary");
		  
		 
		  
		 // driver.findElement(By .name("register")).click();
		   // Assert.assertEquals("Note:Your user name is John.","Note:Your user name is John.","REGISTER");
		  //  driver.navigate().refresh();//page refresh
			//  driver.navigate().back();
		  //  driver.quit();
	  }
  }
}
	/* else if(bro_name=="ff")
	  {
		//set chrome driver path
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\geckodriver.exe");
		  //set the browser driver
		  driver=new FirefoxDriver();
		  //open the url
		  driver.get("http://newtours.demoaut.com/");
		  //title of the page
		  System.out.println("The title of the page is "+driver.getTitle());
	  }
	  //else if(bro_name=="ie")
	  {
		//set chrome driver path
		  System.setProperty("webdriver.ie.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\IEDriverServer.exe");
		  //set the browser driver
		  driver=new InternetExplorerDriver();
		  //open the url
		  driver.get("http://www.amazon.in/");
		  //title of the page
		  System.out.println("The title of the page is "+driver.getTitle());
		  List<WebElement> link_coll=driver.findElements(By .tagName("a"));
		  for(int i=0;i<=link_coll.size()-1;i++)
		  {
			  //to retrive the link names
			  String lnk_name=link_coll.get(i).getText();
			  System.out.println(lnk_name);
			  if(lnk_name.equalsIgnoreCase("Try Prime"))
			  {
				  System.out.println("link found");
				  link_coll.get(i).click();
				  break;
			  }
		  }
		  System.out.println("The no of links in page:"+link_coll.size());
		  
	  }
	 else
	  {
		  System.out.println("browser not found");
	  }
	  
  }
}*/
