package com.project.code;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.baseclass.initialiazePage;

public class BWarehouse extends initialiazePage{
	//WebdriverCommaLib timing;
	@FindBy(xpath = "//div[@class='pl-4 response-font col-sm-5 col-md-5 col-5']")
	private WebElement managementSystem;
	@FindBy(xpath = "(//div[@class='mt-3 text-color'])[2]")
	private WebElement disposition;
	@FindBy(xpath="//div[@class='layout ma-0 pa-0 row wrap']//child::div[@class='mt-3 text-color']")
	private List<WebElement> warehouseLocators;
	public BWarehouse() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDidposition() throws InterruptedException {//WAREHOUSEMANEGEMENT VERIFYCATION
		Thread.sleep(2000);
		//timing.explicitTextPresent(managementSystem, "Warehouse Management System");
		int selectOptionTextsSize = warehouseLocators.size();
		for(int i=1;i<selectOptionTextsSize;i++)
		{
			String selectOptionText = warehouseLocators.get(i).getText();
			System.out.println(selectOptionText);
		}
	
		
		String managetext=managementSystem.getText();
		System.out.println("Page is verifiyed"+managetext);
		Assert.assertEquals(managetext,"Warehouse Management System");
		disposition.click();
		Thread.sleep(2000);
//	    JavascriptExecutor j=(JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		j.executeScript("window.scrollBy(0,450)");

	}


}
