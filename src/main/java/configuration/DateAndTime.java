package configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;


import pageObjects.driverClass;

public class DateAndTime extends driverClass {

	public DateAndTime(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String provideDate(){
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 return date1;
	}
	
	
	
}
