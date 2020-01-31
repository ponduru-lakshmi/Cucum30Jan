package seldemos;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelPassingValues {
	WebDriver driver;
  @Test
  public void PassValues() throws Exception{
	  driver = Drivers.getDriver("chrome");
	  FileInputStream fos=new FileInputStream(new File("C:\\Users\\Training_H2a.09.22\\Desktop\\ExcelSheet.xlsx"));
	  driver.get("http://newtours.demoaut.com/");
	  XSSFWorkbook xw=new XSSFWorkbook(fos);
	  XSSFSheet xs=xw.getSheet("DataJan");
	  //row count
	  int rowcnt=xs.getLastRowNum();
	  	  for(int i=0;i<=rowcnt;i++)
	   {
		  String username=xs.getRow(i+1).getCell(0).getStringCellValue();
		  String password=xs.getRow(i+1).getCell(1).getStringCellValue();
		  String confirmPassword=xs.getRow(i+1).getCell(2).getStringCellValue();
		  driver.findElement(By .name("email")).sendKeys(username);
		  
	  }
	  
  }
}
