package com.project.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.WebdriverCommaLib;
import com.project.baseclass.initialiazePage;

public class Replacement extends initialiazePage {
	
	WebdriverCommaLib timing;
	@FindBy(xpath = "//h4[text()='Replacement']")
	private WebElement Replacement;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement replaceSelect;
	@FindBy(xpath = "//span[text()='UPDATE Confirmation']")
	private WebElement replaceUpdate;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement replaceReturnMethod;
	@FindBy(xpath = "//input[@role='button']")
	private WebElement replaceReturnDate;
	@FindBy(xpath = "//tbody//td//child::button[@class='v-btn v-btn--text v-btn--rounded theme--light']")
	private WebElement replaceReturnCalenderSelect;
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement replaceReturnCalendorOk;
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement replaceSubmit;
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement replaceOKButton;
	
	
	public Replacement() {
		PageFactory.initElements(driver, Replacement);
	}
	public void Replacement() {
		Replacement.click();
		}
	public void replaceSelect() {
		timing.explicitElementSelected(driver, "repairSelectItem");
		replaceSelect.click();
		
	}
	public void replaceUpdate() {
		replaceUpdate.click();
	}
	public void replaceReturnMethod() {
		replaceReturnMethod.click();
	}
	public void replaceReturnDate() {
		replaceReturnDate.click();
	}
	
	public void replaceReturnCalenderSelect() {
		timing.explicitElementSelected(driver, "replaceReturnCalenderSelect");
		replaceReturnCalenderSelect.click();
	}
	public void replaceReturnCalendorOk() {
		timing.explicitElementSelected(driver, "replaceReturnCalendorOk");
		replaceReturnCalendorOk.click();
	}
	public void replaceSubmit() {
		replaceSubmit.click();
	}
	public void replaceOKButton() {
		replaceOKButton.click();
	}

}
