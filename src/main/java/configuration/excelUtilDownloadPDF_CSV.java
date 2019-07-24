package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

//import pageObjects.conversationPage;
//import pageObjects.driverClass;
//import pageObjects.filterPage;
//import pageObjects.homePage;

//public class excelUtilDownloadPDF_CSV extends driverClass {
//
//	public excelUtilDownloadPDF_CSV(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
////
//	XSSFWorkbook workbook;
//	XSSFSheet sheet;
//	XSSFCell cell;

//	public void LoginLDownload_PDF_Logout() throws IOException, InterruptedException {
//		conversationPage cnv = new conversationPage(driver);
//		filterPage flp = new filterPage(driver);
//		homePage hmp = new homePage(driver);
//
//		// Import excel sheet.
//		File src = new File("C:\\Users\\mridul\\Desktop\\TestDataforDwnldPdf.xlsx");
//		// Load the file.
//		FileInputStream fis = new FileInputStream(src);
//		// Load he workbook.
//		workbook = new XSSFWorkbook(fis);
//		// Load the sheet in which data is stored.
//		sheet = workbook.getSheetAt(0);
//		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//			/*
//			 * I have added test data in the cell A2 as "testemailone@test.com"
//			 * and B2 as "password" Cell A2 = row 1 and column 0. It reads first
//			 * row as 0, second row as 1 and so on and first column (A) as 0 and
//			 * second column (B) as 1 and so on
//			 */
//
//			// Import data for Email.
//			cell = sheet.getRow(i).getCell(0);
//			cell.setCellType(Cell.CELL_TYPE_STRING);
//			driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).clear();
//			driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).sendKeys(cell.getStringCellValue());
//			// String str1=cell.getStringCellValue();
//			// Import data for password.
//			cell = sheet.getRow(i).getCell(1);
//			cell.setCellType(Cell.CELL_TYPE_STRING);
//			driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).clear();
//			driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).sendKeys(cell.getStringCellValue());
//			Thread.sleep(1000);
//			// To click on Login button
//			driver.findElement(By.xpath("//INPUT[@id='loginBtn']")).click();
//			Thread.sleep(2000);
//			String str = driver.findElement(By.xpath("//P[@class='hitoUser']")).getText();
//
//			System.out.println(str);
//			hmp.clickOnConversationAll();
//			Thread.sleep(2000);
//
//			cnv.clicOnFilterBtn();
//
//			flp.setFilterForDownloadPDF_CSV();
//			Thread.sleep(3000);
//			int post = hmp.getNoOfPosts();
//			if (post <= 50) {
//				cnv.downloadPDF();
//			} else {
//				System.out.println("cant download post above 400");
//			}
//
//			Thread.sleep(10000);
//			// Assert.assertTrue(str1.contains("Your download request has been
//			// received"));
//			driver.navigate().back();
//			Thread.sleep(2000);
//
//			// To click on Account settings dropdown
//			driver.findElement(By.xpath("//I[@class='dropdownicon']")).click();
//
//			// Assert.assertEquals(str,"Hi "+str1+",");
//			// To click on logout button
//			driver.findElement(By.xpath("//A[@href='/site/logout'][text()='Sign Out']")).click();
//		}
//}
		
//		public void LoginLDownload_PDF_CSV_Logout() throws IOException, InterruptedException{
//			conversationPage cnv = new conversationPage(driver);
//			filterPage flp = new filterPage(driver);
//			homePage hmp = new homePage(driver);
//			driver.get("https://20twenty.circussocial.com/site/login");
//
//			// Import excel sheet.
//			File src = new File("C:\\Users\\mridul\\Desktop\\TestDataforDwnldPdf.xlsx");
//			// Load the file.
//			FileInputStream fis = new FileInputStream(src);
//			// Load he workbook.
//			workbook = new XSSFWorkbook(fis);
//			// Load the sheet in which data is stored.
//			sheet = workbook.getSheetAt(0);
//			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//				/*
//				 * I have added test data in the cell A2 as "testemailone@test.com"
//				 * and B2 as "password" Cell A2 = row 1 and column 0. It reads first
//				 * row as 0, second row as 1 and so on and first column (A) as 0 and
//				 * second column (B) as 1 and so on
//				 */
//
//				// Import data for Email.
//				cell = sheet.getRow(i).getCell(0);
//				cell.setCellType(Cell.CELL_TYPE_STRING);
//				driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).clear();
//				driver.findElement(By.xpath("//INPUT[@id='LoginForm_username']")).sendKeys(cell.getStringCellValue());
////				 String str1=cell.getStringCellValue();
//				// Import data for password.
//				cell = sheet.getRow(i).getCell(1);
//				cell.setCellType(Cell.CELL_TYPE_STRING);
//				driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).clear();
//				driver.findElement(By.xpath("//INPUT[@id='LoginForm_password']")).sendKeys(cell.getStringCellValue());
//				Thread.sleep(1000);
//				// To click on Login button
//				driver.findElement(By.xpath("//INPUT[@id='loginBtn']")).click();
//				Thread.sleep(10000);
////				String str = driver.findElement(By.xpath("//P[@class='hitoUser']")).getText();
//
////				System.out.println(str);
////				Reporter.log(str);
//				hmp.clickOnConversationAll();
////				Thread.sleep(2000);
//
////				cnv.clicOnFilterBtn();
//				
//				Thread.sleep(10000);
//
////				flp.setFilterForDownloadPDF_CSV();
//				Thread.sleep(10000);
//				int post = cnv.getNoOfPosts();
//				System.out.println("No of posts to be downlod"+post);
//				
//				if (post <= 400) {
////					cnv.downloadPDF();
////				
////					Thread.sleep(5000);
////					cnv.downloadCSV();
//					Thread.sleep(10000);
//					driver.findElement(By.xpath("//img[@class='icon-download']")).click();
//					Thread.sleep(10000);
//
//					System.out.println("Time of download"+(driver.findElement(By.xpath("(//TD/self::TD)[9]")).getText()));
//					System.out.println((driver.findElement(By.xpath("(//TD/self::TD)[16]")).getText()));
//				} else {
//					System.out.println("cant download post above 400");
//				}

				//Thread.sleep(10000);
//				 Assert.assertTrue(str1.contains("Your download request has been  received"));
				
//				driver.navigate().back();
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//IMG[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABkAAAAZCAYAAADE6YVjAAACBElEQVR42q2WOy8EURTH/xIWQSGa7TxX4k0kCt9BVqPQqHQEEaIShE+gkCiWWTNDslHhA3hEglInodF4BUu12N3rf8cs4jFz3XWTkzu5c875ndfcDOCxxAqKkibG0xYuhI1nyktG0iYehIUtYaJTCORAd4kYilMmNugsRcfim8hzC5sighJ9SARVdJL4EfABSjCbGn3ICuo8ARkx0KAPsVCvBLHQlE0mjUoQEy36kCiaVSDPUbTpQ2y0KvakPZtM2pQgdjYQGiuVy0CHutNlVNCoiw3vSRro5fOkCiQVxbSQ+rSjdEk/XuUJcxxvFUv02zjfSZh3NgYG3btKB3DFQEdUSlZA5SEaxf8CYGCP3Md43xWq94e3L40SipAn6k8KaNzGNB6mXPpkcEPAhP4ILyKPTRz4DUTANXswKuaR7xdtlef7KQQY6eAPpXtyShpDwDfatI1jNnqODQ966SUl6G2809zvuU/4DFCQQcxSb0lmkqTRAfeQX0AE9dFwXayi3083sYRQin6ZRPxPEJYulz0ok7sqRH6ccH4MLBzRuBb/uGTQ/D84lNMH5xqwccYSdPNrr+Y0VTqyxnts+YtYKH+Xr++kfsZW+rERZqlOCTmVEENOCg9O+LzPwz3uu67svIuN7W/y+b1r49pLPyfuBE7BjWyGh+fu1MSzFvpx/MnpWkDpK0a5IoOaCGDvAAAAAElFTkSuQmCC']")).click();
				// To click on Account settings dropdown
				//Thread.sleep(20000);
			//	String str=driver.getCurrentUrl();
			//Assert.assertEquals(str, "https://20twenty.circussocial.com/site/downloads");;

//				driver.findElement(By.xpath("//I[@class='chevron circle right small icon']")).click();
//				Thread.sleep(2000);
//
//				// Assert.assertEquals(str,"Hi "+str1+",");
//				// To click on logout button
//				driver.findElement(By.xpath("//A[@class='signout']")).click();
			
//		}
//	}
//}
