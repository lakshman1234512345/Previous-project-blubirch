package com.project.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazePage;
import com.project.code.Repair;
public class Repair_Test extends initialiazePage {
	
	//Repari pom class object
	Repair Repair1;
	
	
	@BeforeTest
	public void repairModule() {
		Repair1=new Repair();
		System.out.print("pass of Repair");
	}
	@Test(priority = 3)
	public void repair() throws InterruptedException {
		Thread.sleep(1000);
		Repair1.repair();
	}
	@Test(priority = 4)
	public void repairSelectItem() throws InterruptedException {
		Repair1.repairSelectItem();
	}
	@Test(priority = 5)
	public void repairUpdate() {
		Repair1.repairUpdate();
	}
	@Test(priority = 6)
	public void repairVendorName() {
		Repair1.repairVendorName();
	}
	@Test(priority = 7)
	public void repairSelectVendor() {
		Repair1.repairSelectVendor();
	}
	@Test(priority = 8)
	public void repairQuatation() throws InterruptedException{
		Repair1.repairQuatation();
	}
	@Test(priority = 9)
	public void repairTypeField() {
		Repair1.repairTypeField();
	}
	@Test(priority = 10)
	public void repairSelectService() {
		Repair1.repairSelectService();
	}
	@Test(priority = 11)
	public void repairGradeField() {
		Repair1.repairGradeField();
	}
	@Test(priority = 12)
	public void repairGradeSelect() {
		Repair1.repairGradeSelect();
	}
	@Test(priority = 13)
	public void repairSubmit() {
		Repair1.repairSubmit();
	}
	@Test(priority = 14)
	public void repairOkButton() {
		Repair1.repairOkButton();
	}
	

}
