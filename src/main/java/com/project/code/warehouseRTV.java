package com.project.code;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.baseclass.WebdriverCommaLib;
import com.project.baseclass.initialiazePage;

public class warehouseRTV extends initialiazePage {
	WebdriverCommaLib timing;

	public static String Date() {
		LocalDate currentDate = LocalDate.now();

		// Add 5 days
		LocalDate updatedDate = currentDate.plus(5, ChronoUnit.DAYS);

		// Add 1 year
		updatedDate = updatedDate.plus(1, ChronoUnit.YEARS);

		// Add 1 month
		updatedDate = updatedDate.plus(1, ChronoUnit.MONTHS);

		currentDate = LocalDate.now();

		// Add 5 days
		updatedDate = currentDate.plus(5, ChronoUnit.DAYS);

		// Add 1 year
		updatedDate = updatedDate.plus(0, ChronoUnit.YEARS);

		// Add 1 month
		updatedDate = updatedDate.plus(0, ChronoUnit.MONTHS);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String updatedDateString = updatedDate.format(formatter);

		return updatedDateString;
	}

	String s = Date();
	String[] s1 = s.split("-");

	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement monthclick;
	@FindBy(xpath = "//div[@class='accent--text']")
	private WebElement yearclick;
	@FindBy(xpath = "(//td//button[@class!='v-btn v-size--default v-btn--flat v-btn--text v-btn--disabled theme--light'])[1]")
	private WebElement monthselect;
	@FindBy(xpath = "//li[text()='2023']")
	private WebElement yearSelect;
	@FindBy(xpath = "(//button[@class='v-btn v-btn--text v-btn--rounded theme--light'])[1]")
	private WebElement dateClick;
	
	
	
	@FindBy(xpath="//h4[text()='RTV']/following-sibling::h5[@class='grey--text']/span")
	private WebElement RTVOpenCasesCount;
	@FindBy(xpath="(//span[text()='Pending Confirmation:']/following-sibling::span)[1]")
	private WebElement RTVPendingConfirmationCount;
	@FindBy(xpath="(//span[text()='Dispatch:']/following-sibling::span)[1]")
	private WebElement RTVDispatchCount;
	@FindBy(xpath = "//h4[text()='RTV']")
	private WebElement RTV;
//	@FindBy(xpath = "(//a[@class='v-tab v-tab--active']")
//	private WebElement pendingconfirmation;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement select;
	@FindBy(xpath = "//tr[contains(@class,'v-data-table__')]/child::td")
	private List<WebElement> selectOptionTexts;
	@FindBy(xpath = "//span[text()='UPDATE CONFIRMATION']")
	private WebElement updateconfirmation;
	// @FindBy(xpath ="//label[text()='Return Date']/following-sibling::input")
	@FindBy(xpath = "//input[@aria-haspopup='true']")
	private WebElement returndate;
	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//following-sibling::tr[2]/td")
	// @FindBy(xpath = "//tbody//td//child::button[@class='v-btn v-btn--text
	// v-btn--rounded theme--light']")
	private WebElement selectdata;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement cok;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement returnmethod;
	@FindBy(xpath = "//div[text()='Dispatch']")
	private WebElement dispatchscreen;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement documenttype;
	@FindBy(xpath = "//div[text()='Invoice']")
	private WebElement cinvoice;
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submitbtn;
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement submitOkbutton;

	public warehouseRTV() {
		PageFactory.initElements(driver, this);
	}

	public void RTV() throws InterruptedException {
		Thread.sleep(1000);
		String rtvtextt = RTV.getText();
		System.out.println("Page is verifiyed" + rtvtextt);
		Assert.assertEquals(rtvtextt, "RTV");
		RTV.click();
		Thread.sleep(1000);
	}

//	public void pendingconfirmation() {
//		pendingconfirmation.click();
//	}
	public void select() {
		select.click();
		int selectOptionTextsSize = selectOptionTexts.size();
		for (int i = 1; i < selectOptionTextsSize; i++) {
			String selectOptionText = selectOptionTexts.get(i).getText();
			System.out.println(selectOptionText);
		}

	}

	public void updateconfirmation() {
		updateconfirmation.click();
	}

	public void returndate() throws InterruptedException {

		returndate.click();
		Thread.sleep(2000);
		monthclick.click();
		Thread.sleep(2000);
		yearclick.click();
		Thread.sleep(2000);
		yearSelect.click();
		Thread.sleep(2000);
		monthselect.click();
		Thread.sleep(2000);
		dateClick.click();
		Thread.sleep(2000);
		cok.click();

	}

	/*
	 * public void selectData() throws InterruptedException {
	 * 
	 * timing.explicitElementSelected(driver, "selectdata"); selectdata.click();
	 * //Thread.sleep(1000) } 
	 * public void clickOnOK() throws InterruptedException {
	 * //JavascriptExecutor js = (JavascriptExecutor)driver;
	 * //js.executeScript("//span[text()='OK' and @class='v-btn__content'].click()"); 
	 * timing.explicitElementSelected(driver, "cok"); cok.click();
	 * //Thread.sleep(5000); }
	 */
	public void Clickreturnmethod() {
		returnmethod.click();
	}

	public void clickdispatch() {
		dispatchscreen.click();
	}

	public void clickOndocument() {
		documenttype.click();
	}

	public void clickOninvoice() throws InterruptedException {
		cinvoice.click();
		Thread.sleep(1000);
	}

	public void clickOnsubmit() {
		submitbtn.click();
	}

	public void submitOkbutton() {
		submitOkbutton.click();
		System.out.println("Return Date updated succussfully");
	}

}
