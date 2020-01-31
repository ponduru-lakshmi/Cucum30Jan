package seldemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xpath {
	
	WebDriver driver;
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  WebElement search=driver.findElement(By .id("small-searchterms"));
	  Actions ac=new Actions(driver);
	  ac.keyDown(search,Keys.SHIFT).perform();
	  driver.findElement(By .xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
			Alert a=driver.switchTo().alert();
			a.accept();
			ac.sendKeys("c").pause(5).sendKeys("o").pause(5).sendKeys("m").pause(5).perform();
			ac.moveToElement(driver.findElement(By .xpath("//*@id=\"ui-id-53\"]"))).pause(5).contextClick().build().perform();
			
  }
}
