package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import ExtentReport.ExtentManager;
import ExtentReport.ExtentTestManager;
import pageObjects.browserTest;
import pageObjects.driverClass;

public class excelUtilLoginLogout extends driverClass {

	
	public excelUtilLoginLogout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
		// TODO Auto-generated constructor stub
	
	
	XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	
	 public void LoginLogout(String File) throws IOException, InterruptedException{
		 // Import excel sheet.
		 File src=new File(File);   
		 // Load the file.
		 FileInputStream fis = new FileInputStream(src);
		 // Load he workbook.
		 workbook = new XSSFWorkbook(fis);
		 // Load the sheet in which data is stored.
		 sheet= workbook.getSheetAt(0);
		 for(int i=1; i<=sheet.getLastRowNum(); i++){
		 /*I have added test data in the cell A2 as "testemailone@test.com" and B2 as "password"
		 Cell A2 = row 1 and column 0. It reads first row as 0, second row as 1 and so on 
		 and first column (A) as 0 and second column (B) as 1 and so on*/ 
		 
		 // Import data for Email.
		 cell = sheet.getRow(i).getCell(0,Row.CREATE_NULL_AS_BLANK);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).clear();
		 driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).sendKeys(cell.getStringCellValue());
		 String str1=cell.getStringCellValue();
		 // Import data for password.
		 cell = sheet.getRow(i).getCell(1,Row.CREATE_NULL_AS_BLANK);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).clear();          
		 driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).sendKeys(cell.getStringCellValue());
		 Thread.sleep(1000);
		 // To click on Login button
		 driver.findElement(By.xpath("//INPUT[@id='loginBtn']")).click();
//		 String str=driver.findElement(By.xpath("//P[@class='hitoUser']")).getText();
		 Thread.sleep(5000);
String str=driver.getCurrentUrl();
if(str.equals("https://20twenty.circussocial.com/unified/#/home")){
//		 System.out.println(str);
//		 Reporter.log(str);
		 // To click on Account settings dropdown 
	Date d = new Date();
    System.out.println(d.toString());
    Reporter.log(d.toString());
		 driver.findElement(By.xpath("//I[@class='chevron circle right small icon']")).click();
		 Thread.sleep(2000);
//         Assert.assertEquals(str,"Hi "+str1+",");
		 // To click on logout button
		 driver.findElement(By.xpath("//SPAN[text()='Sign Out']")).click();
		 System.out.println("successfully login and log out for "+str1);
		 Reporter.log("successfully login and log out for "+str1);
//		 ExtentTestManager.getReporter.log("successfully login and log out for " +str1);
}
else
{
	Date d = new Date();
    System.out.println(d.toString());
    Reporter.log(d.toString());

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss"); 
	// Now you can do whatever you need to do with it, for example copy somewhere
  
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Thread.sleep(5000);
	FileUtils.copyFile(scrFile, new File("C:\\Users\\mridul\\Desktop\\screenshot\\"+sdf.format(d)+".png"));
	System.out.println("Invalid password or Invalid username or Blank username and password field for:"+str1);
	 Reporter.log("Invalid password or Invalid username or Blank username and password field for:"+str1);

}

		 }
		 }
		 
		}