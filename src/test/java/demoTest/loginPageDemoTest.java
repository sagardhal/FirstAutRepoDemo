package demoTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import ExtentReport.ExtentTestManager;
import configuration.constantClass;
import pageObjects.browserTest;
import pageObjects.loginPageDemo;

public class loginPageDemoTest extends browserTest{
	

	@Test(priority=1)
	public void logIn_TC_1(Method method) throws InterruptedException{
		 ExtentTestManager.startTest(method.getName()," checking Login with Invalid Username And invalid Password.");

		loginPageDemo lgn =new loginPageDemo(driver);
		driver.get(constantClass.url);
		Thread.sleep(1000);
		lgn.enterUserNamePasswordAndLogin(constantClass.validusername,constantClass.ValidPassword);
		Thread.sleep(1500);
          
}}
