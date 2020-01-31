package seldemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleDemo {
	WebDriver driver;
  @Test
  public void seltest() {
	  driver=Drivers.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	  WebElement cruiseTab=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
	  List<WebElement> trow_coll=cruiseTab.findElements(By .tagName("tr"));
	  System.out.println(trow_coll.size());
	  for(WebElement trow:trow_coll)
	  {
		  System.out.println(trow.getText());
		  List<WebElement> tcol_coll=trow.findElements(By .tagName("td"));
		   System.out.println(tcol_coll.size());
		   for(int c=1;c<=tcol_coll.size();c++)
		   {
			   String pcall=tcol_coll.get(1).getText();
			   if(pcall.equals("Inside Passage")) {
				   System.out.println(tcol_coll.get(0).getText());
				   break;
			   }
			   System.out.println(tcol_coll.get(c).getText());
		   }
		  
	  }
  
  
  }
}
