package configuration;

import org.openqa.selenium.WebDriver;

import pageObjects.driverClass;

public class constantClass extends driverClass {

	public constantClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String url="http://executeautomation.com/demosite/Login.html";
	public static String validusername="sagar";
	public static String ValidPassword="dhal";
}
