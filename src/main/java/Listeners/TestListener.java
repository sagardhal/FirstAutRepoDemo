package Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentManager;
import ExtentReport.ExtentTestManager;
import pageObjects.browserTest;

public class TestListener extends  browserTest implements ITestListener{
	 private static String getTestMethodName(ITestResult iTestResult) {
	        return iTestResult.getMethod().getConstructorOrMethod().getName();
	    }
	 
	    @Override
	    public void onStart(ITestContext iTestContext) {
	        System.out.println(  iTestContext.getName()+"  =>> STARTED ");
	        iTestContext.setAttribute("WebDriver", browserTest.driver);
	    }
	 
	    @Override
	    public void onFinish(ITestContext iTestContext) {
	        System.out.println( iTestContext.getName()+ "  =>> FINISHED");
	        //Do tier down operations for extentreports reporting!
	        ExtentTestManager.endTest();
	        ExtentManager.getReporter().flush();
	    }
	 
	    @Override
	    public void onTestStart(ITestResult iTestResult) {
	        System.out.println(getTestMethodName(iTestResult) + " =>> STARTED");
//	        ExtentTestManager.getTest().log(LogStatus.INFO, "Starting test " + iTestResult.getMethod().getMethodName());
//	        ExtentTestManager.getTest().log(LogStatus.INFO, "Test passed");
	    }
	    
	 
	    @Override
	    public void onTestSuccess(ITestResult iTestResult) {
	        System.out.println(getTestMethodName(iTestResult) + "=>> SUCCEED");
	        System.out.println("===================================================== ");
	        //Extentreports log operation for passed tests.
//	        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
	        Object testClass = iTestResult.getInstance();
	        WebDriver webDriver = ((browserTest) testClass).getDriver();
	 
	        String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
	                getScreenshotAs(OutputType.BASE64);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed",

            ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));

	    }
	 
	    @Override
	    public void onTestFailure(ITestResult iTestResult) {
	        System.out.println(getTestMethodName(iTestResult) + "  =>> FAILED");
	        System.out.println("===================================================== ");

	        //Get driver from BaseTest and assign to local webdriver variable.
	        Object testClass = iTestResult.getInstance();
	        WebDriver webDriver = ((browserTest) testClass).getDriver();
	 
	        String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
	                getScreenshotAs(OutputType.BASE64);
	 
	        //Extentreports log and screenshot operations for failed tests.
	        ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
	                ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	    }
	 
	    @Override
	    public void onTestSkipped(ITestResult iTestResult) {
	        System.out.println( getTestMethodName(iTestResult) + "  =>> SKIPED");
	        System.out.println("===================================================== ");

	        //Extentreports log operation for skipped tests.
	        Object testClass = iTestResult.getInstance();
	        WebDriver webDriver = ((browserTest) testClass).getDriver();
	 
	        String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).
	                getScreenshotAs(OutputType.BASE64);
	        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped",
	                ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));

	        		
	    }
	 
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	    }}
	    
	   