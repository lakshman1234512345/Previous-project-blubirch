package com.project.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebdriverCommaLib extends initialiazePage  {
	public static WebDriver driver;
	WebDriverWait wait;
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void Explicit(WebDriver aText, String eText) {

		wait = new WebDriverWait(aText, Duration.ofSeconds(5));
		wait.until((Function) ExpectedConditions.elementToBeClickable(By.xpath(eText)));
	}

	public void explicitTextPresent(WebElement aText, String eText) {

		wait = new WebDriverWait((WebDriver) aText, Duration.ofSeconds(5));
		wait.until((Function) ExpectedConditions.textToBePresentInElement(aText,eText));
	}
	public void explicitElementSelected(WebDriver aText, String eText) {

		wait = new WebDriverWait(aText, Duration.ofSeconds(5));
		wait.until((Function) ExpectedConditions.elementToBeSelected(By.xpath(eText)));
	}
	public void waitForTheElement(By locator, String waitType) throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
	   Reporter.log("Explicit Wait Started");
	    if ("CLICKABILITY_OF_ELEMENT_LOCATED".equalsIgnoreCase(waitType)) {
	        wait.until(ExpectedConditions.elementToBeClickable(locator));
	    } else if ("PRESENCE_OF_ELEMENT_LOCATED".equalsIgnoreCase(waitType)) {
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    } else if ("INVISIBILITY_OF_ELEMENT".equalsIgnoreCase(waitType)) {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	    } else if ("IS_ALERT_PRESENT ".equalsIgnoreCase(waitType)) {
	        wait.until(ExpectedConditions.alertIsPresent());
	    } else {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    Reporter.log("Explicit Wait Ended");
	}
	public void clickUsingJScrExe(By a_element) throws Exception {
		Reporter.log("clickUsingJSexe started");
        new WebDriverWait(driver, Duration.ofSeconds(15L));
        WebElement w_element1 = driver.findElement(a_element);
        JavascriptExecutor w_executor = (JavascriptExecutor)driver;
        w_executor.executeScript("arguments[0].click();", new Object[]{w_element1});
        Reporter.log("clickUsingJSexe completed");
    }

	

	public void customWaitForElementDisplayed(WebElement element) {
		int i = 0;
		while (i < 100) {
			try {
				element.isDisplayed();
				break;
			} catch (Exception e) {
				i++;
			}
		}
	}

}
