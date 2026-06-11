package com.project.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazePage;
public class Logout_In extends initialiazePage{
	@FindBy(xpath = "(//img[@align='center'])[1]")
	private WebElement logout;	
	
	@FindBy(className = "logout-text")
	private WebElement logoutbtn;
	public Logout_In() {
		PageFactory.initElements(driver, this);
	}
	
	public void  logout(){
		logout.click();
	}
	
	public void logout1() {
		logoutbtn.click();
	}

}
