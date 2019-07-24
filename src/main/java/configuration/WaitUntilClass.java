package configuration;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.driverClass;

public class WaitUntilClass extends driverClass {

	public WaitUntilClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec) {

		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(timoutSec, TimeUnit.SECONDS)
				.pollingEvery(pollingSec, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class, TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);

		for (int i = 0; i < 2; i++) {
			try {
				// fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We
				// are processing through trillions of data events, this insight
				// may take more than 15 minutes to complete.']")));
				fWait.until(ExpectedConditions.visibilityOf(element));
				// fWait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (Exception e) {

				System.out.println("Element Not found trying again - " + element.toString().substring(70));
				e.printStackTrace();

			}
		}

		return element;

	}

	public void waitUntil(String xpath) {

		(new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	public void waitUntilVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void waitUntilInvisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void implicit_Wait(WebElement ele) throws Exception {

		for (int i = 0; i < 90; i++) {
			if ((ele).isDisplayed())
				break;
			else {
				Assert.fail();

			}

		}

	}
}
