package configuration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.driverClass;

public class JavaScriptHandler extends driverClass {

	public JavaScriptHandler(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void clickOnElement(WebElement element){
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	
}
}
