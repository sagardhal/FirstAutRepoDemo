package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.browserTest;
import pageObjects.loginPageDemo;

public class BaseClass extends browserTest{

	public void Test() throws InterruptedException{
		
        driver.get("http://executeautomation.com/demosite/Login.html");
		   loginPageDemo lgn=new loginPageDemo(driver);
			lgn.enterUserNamePasswordAndLogin("sagar", "dhal");	
			
			(new WebDriverWait(driver, 50))
					  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//DIV[@title='ALL']")));
	}
}