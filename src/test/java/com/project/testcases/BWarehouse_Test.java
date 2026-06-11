package com.project.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazePage;
import com.project.code.BWarehouse;
public class BWarehouse_Test extends initialiazePage {
	BWarehouse disposition;
	@BeforeTest
	public void dispositonBCL() {
		disposition=new BWarehouse();
	}
//	public void disposition1() {
//		object = new warehousepage();
//	}

	@Test
	public void clickOnDispositionlinkTest() throws InterruptedException {
		disposition.clickOnDidposition();
	}


}
