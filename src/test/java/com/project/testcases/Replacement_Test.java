package com.project.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.code.Replacement;

public class Replacement_Test {
	
	Replacement replace;
	@BeforeTest
	public void replacementModule() {
		replace=new Replacement();
	}
	@Test(priority = 3)
	public void Replacement() {
		replace.Replacement();

	}
	public void replaceSelect() {
		replace.replaceSelect();
	}
	public void replaceUpdate() {
		replace.replaceUpdate();
	}
	public void replaceReturnMethod() {
		replace.replaceReturnMethod();
	}
	public void replaceReturnDate() {
		replace.replaceReturnDate();
	}
	public void replaceReturnCalenderSelect() {
		replace.replaceReturnCalenderSelect();
	}
	public void replaceReturnCalendorOk() {
		replace.replaceReturnCalendorOk();
	}
	public void replaceSubmit() {
		replace.replaceSubmit();
	}
	public void replaceOKButton() {
		replace.replaceOKButton();
	}

}
