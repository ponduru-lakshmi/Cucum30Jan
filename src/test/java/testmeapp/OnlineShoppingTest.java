package testmeapp;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testmeapp.utility.Drivers;


public class OnlineShoppingTest {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	//SoftAssert sa=new SoftAssert();
	
	@BeforeTest
	public void startReportBeforeTest()
	{
		driver=Drivers.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
		extent=new ExtentReports();
		logger=extent.createTest("Start report");
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name","GFT NexGen Testing ");
		extent.setSystemInfo("Environment","TestMeApp case study");
		extent.setSystemInfo("User Name","usha");
		htmlReporter.config().setDocumentTitle("Title of the report comes here");
		htmlReporter.config().setReportName("Name of the report comes here");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}
     
	
	
	
	
	
	
  @Test(priority=1 ,enabled=false)
  public void testRegistration() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2a.09.22\\Desktop\\selbrowserdriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By .id("userName")).sendKeys("usha3435");
	  driver.findElement(By .xpath("//*[@id=\"err\"]")).click();
	  Boolean a=driver.findElement(By .tagName("h3")).isDisplayed();
	  if(a=true)
	  {
		  driver.findElement(By .xpath("//*[@id=\"err\"]")).click();
		  driver.findElement(By .name("firstName") ).sendKeys("usha");
		  driver.findElement(By .name("lastName") ).sendKeys("ba");
		  driver.findElement(By .name("password") ).sendKeys("password123");
		  driver.findElement(By .name("confirmPassword") ).sendKeys("password123");
		  driver.findElement(By .xpath("//input[@value='Female']")).click();
		  driver.findElement(By .id("emailAddress")).sendKeys("usha123@gmail.com");
		  driver.findElement(By .id("mobileNumber")).sendKeys("8679456145");
		  driver.findElement(By .name("dob")).sendKeys("27-01-2019");
		  driver.findElement(By .id("address")).sendKeys("hyderabad");
		  Select sel=new Select(driver.findElement(By .name("securityQuestion")));
		  sel.selectByIndex(1);
		  driver.findElement(By .id("answer")).sendKeys("Blue");
		  driver.findElement(By .name("Submit")).click();
		  String msg=driver.findElement(By .xpath("//div[contains(text(),'User Registered Succesfully!!! Please login')]")).getText();
		  Assert.assertEquals(msg,"User Registered Succesfully!!! Please login" );
		  logger=extent.createTest("registration test");
	  }
  }
  
  
	@Test(priority=2)
	public void testLogin()
	{
		logger=extent.createTest("login test");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		//*[@id="userName"]
		driver.findElement(By .id("userName")).sendKeys("lalitha");
		driver.findElement(By .id("password")).sendKeys("password123");
		driver.findElement(By .xpath("//html//body//main//div//div//div//form//fieldset//div[4]//div//input[1]")).click();
		//Assert.assertEquals("Home", driver.getTitle());
		//System.out.println("logged in");
		String s=driver.findElement(By .linkText("SignOut")).getText();
		
		Assert.assertEquals("SignOut", s);
		  logger.log(Status.INFO,MarkupHelper.createLabel("Login Success!!!",ExtentColor.GREEN));
		
	}
	
	
	@Test(priority=3)
	public void testCart()
	{
		logger=extent.createTest("test cart");
		driver.findElement(By .name("products")).sendKeys("headphone");
		driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		//String b=driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).getText();
		// Assert.assertEquals("Add to cart", b);
		logger.log(Status.INFO,MarkupHelper.createLabel("Add to cart",ExtentColor.GREEN));
		
	}
	
	
	
	@Test(priority=4)
	public void testPayment()
	{
		
	driver.findElement(By .xpath("html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By .xpath("//input[@value='Andhra Bank']")));
	driver.findElement(By .xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label")).click();
	driver.findElement(By .id("btn")).click();
	driver.findElement(By .name("username")).sendKeys("123456");
	driver.findElement(By .name("password")).sendKeys("Pass@456");
	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	String b=driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
	Assert.assertEquals("Your order has been confirmed", b);
	logger=extent.createTest("payment test");
	logger.log(Status.INFO,MarkupHelper.createLabel("Your order has been confirmed",ExtentColor.GREEN));
	
}
	
	
	
	
	
	

	
	
		
@AfterMethod
   public void getResult(ITestResult result) throws Exception {
	  if(result.getStatus()==ITestResult.FAILURE) {
	       
	      logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"- Test case failed",ExtentColor.RED));
	      TakesScreenshot sht=(TakesScreenshot)driver;
	       File src=sht.getScreenshotAs(OutputType.FILE);
	       System.getProperty("C:\\Users\\Training_H2a.09.22\\eclipse-workspace\\OnlineShoppingTest\\"
	       		+ "extent-reports\\snapshot.png");
	       FileUtils.copyFile(src,new File("C:\\Users\\Training_H2a.09.22\\eclipse-workspace"
	       		+ "\\OnlineShoppingTest\\extent-reports\\snapshot.png"));
	       logger.addScreenCaptureFromPath("C:\\Users\\Training_H2a.09.22\\eclipse-workspace"
	       		+ "\\OnlineShoppingTest\\extent-reports\\snapshot.png", result.getName());
		   logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable()+"- Test case failed",ExtentColor.RED));
		   Thread.sleep(2000);
	  }else if(result.getStatus()==ITestResult.SKIP) {
		  logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"- Test case skip",ExtentColor.ORANGE));
		  
	  }
  }

@AfterTest
public void endReportAfterTest()
{
	logger=extent.createTest("end report");
	extent.flush();
	driver.close();
}
}
