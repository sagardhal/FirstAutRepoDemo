package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import configuration.BaseClass;
import cucumber.api.java.After;

public class browserTest {
	public static ExtentTest test;
	public static ExtentReports extent;
	 public static WebDriver driver;
	    public WebDriverWait wait;
	 
	    public static WebDriver getDriver() {
	        return driver;
	    }
	    @BeforeClass
	    public static void NormalsetUp()  throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mridul\\Downloads\\chromedriver.exe");
// For open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//For Headless browser
		
//		 ChromeOptions chromeOptions = new ChromeOptions();
//		    chromeOptions.addArguments("--headless");
//		    chromeOptions.addArguments("window-size=1300x700");
//		  driver= new ChromeDriver(chromeOptions);
	    }

//@Parameters("browser")
//@BeforeClass
//public static void setUpForMultiBrowser(String browser)  throws InterruptedException {
//	 
//	  if(browser.equalsIgnoreCase("firefox")) {
//	 
//	   driver = new FirefoxDriver();
//	 
//	 
//	  }else if (browser.equalsIgnoreCase("chrome")) { 
//		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mridul\\Downloads\\chromedriver.exe");
//		// For open browser
//				driver = new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				//For Headless browser
//	  }
//	  else if(browser.equalsIgnoreCase("headless")){
//		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mridul\\Downloads\\chromedriver.exe");
//		  ChromeOptions chromeOptions = new ChromeOptions();
//		    chromeOptions.addArguments("--headless");
//		    chromeOptions.addArguments("window-size=1300x700");
//		  driver= new ChromeDriver(chromeOptions);
//	    }
//	  }
	  
	@After
	public void cleanUp() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
