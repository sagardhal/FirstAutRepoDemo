package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class driverClass {
	 protected WebDriver driver;

	    public driverClass(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	}

