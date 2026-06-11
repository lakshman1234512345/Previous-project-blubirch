package com.project.code;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.baseclass.WebdriverCommaLib;
import com.project.baseclass.initialiazePage;

public class Repair extends initialiazePage {
	
	WebdriverCommaLib timing;
	@FindBy(xpath = "//h4[text()='Repair']")
	private WebElement Repair;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[1]")
	private WebElement repairSelectItem;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement repairUpdate;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement repairVendorName;
	@FindBy(xpath = "//div[text()='Rang Rogan']")
	private WebElement repairSelectVendor;
	@FindBy(xpath = "//input[@required='required']")
	private WebElement repairQuatation;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement repairTypeField;
	@FindBy(xpath = "//div[text()='Service center']")
	private WebElement repairSelectService;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement repairGradeField;
	@FindBy(xpath = "//div[text()='Good']")
	private WebElement repairGradeSelect;
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement repairSubmit;
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement repairOkButton;
	public Repair() {
		PageFactory.initElements(driver, this);
	}
	
	public void repair() throws InterruptedException {
		Thread.sleep(1000);
		Repair.click();
	}
	public void repairSelectItem() throws InterruptedException {
		timing.explicitElementSelected(driver, "repairSelectItem");
	Thread.sleep(2000);
		repairSelectItem.click();
	}
	public void repairUpdate() {
		repairUpdate.click();
	}
	public void repairVendorName() {
		repairVendorName.click();
	}
	public void repairSelectVendor() {
		repairSelectVendor.click();
	}
	public void repairQuatation() throws InterruptedException {
		Thread.sleep(1000);
		repairQuatation.click();
		Thread.sleep(1000);
		repairQuatation.sendKeys("1000");
	}
	public void repairTypeField() {
		repairTypeField.click();
	}
	public void repairSelectService() {
		repairSelectService.click();
	}
	public void repairGradeField() {
		repairGradeField.click();
		
	}
	public void repairGradeSelect() {
		repairGradeSelect.click();
	}
	public void repairSubmit() {
		repairSubmit.click();
	}
	public void repairOkButton() {
		repairOkButton.click();
	}
	
	
	
	

}
