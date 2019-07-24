package configuration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pageObjects.driverClass;

public class windowHandleClass extends driverClass {

	public windowHandleClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void handleNewTabOrWindows(){
	String parentWindowHandler = driver.getWindowHandle(); 
	String subWindowHandler = null;

	Set<String> handles = driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	while (iterator.hasNext()){
	    subWindowHandler = iterator.next();
	    driver.switchTo().window(subWindowHandler);

//	    System.out.println(subWindowHandler);
	}

	
	
	
	
	
	
	
}}
