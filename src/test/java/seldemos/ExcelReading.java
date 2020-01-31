package seldemos;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
  @Test
  
  public void test1() throws Exception {
	  FileInputStream fos=new FileInputStream(new File("C:\\Users\\Training_H2a.09.22\\Desktop\\ExcelSheet.xlsx"));
	  XSSFWorkbook xw=new XSSFWorkbook(fos);
	  XSSFSheet xs=xw.getSheet("DataJan");
	  //row count
	  int rowcnt=xs.getLastRowNum();
	  String username=xs.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(username);
	  //XSSFWorkbook xw1=new XSSFWorkbook
	  xs.getRow(0).createCell(3).setCellValue("Status");
	  xs.getRow(1).createCell(3).setCellValue("Pass");
	  FileOutputStream fos1=new FileOutputStream(new File("C:\\Users\\Training_H2a.09.22\\Desktop\\ExcelSheet.xlsx"));
	  xw.write(fos1);
	  fos1.close();
  }
}
