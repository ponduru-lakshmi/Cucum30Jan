package seldemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
	
	WebDriver driver;
  @Test
  public void taction() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\chromedriver.exe");
	  //set the browser driver
	  driver=new ChromeDriver();
	  //open the url
	  driver.navigate().to("https://jqueryui.com/selectable/");
	 // driver.get("http://newtours.demoaut.com/");//second method
	  //title of the page
	  driver.manage().window().maximize();
	 driver.switchTo().frame(0);
	 driver.findElement(By .xpath("//*[@id=\"selectable\"]/li[4]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By .linkText("Droppable")).click();
	driver.switchTo().frame(0);
	  WebElement drag=driver.findElement(By .id("draggable")); 
	  WebElement drop=driver.findElement(By .id("droppable"));
	  Actions a=new Actions(driver);
	  a.dragAndDrop(drag, drop).perform();
	  driver.switchTo().defaultContent();
	  driver.findElement(By .linkText("Menu")).click();
	  driver.switchTo().frame(0);
	  a.moveToElement(driver.findElement(By .id("ui-id-4"))).pause(7).perform();
	  //.moveToElement(driver.findElement(By .id("ui-id-7"))).pause(5).build().perform();
	
  }
}
