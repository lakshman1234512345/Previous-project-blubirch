package com.project.testcases;



import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import com.project.baseclass.initialiazePage;
import com.project.code.signIn_QAdev;
public class signIn_QATest extends initialiazePage {
	
	//Excel1 e;
	signIn_QAdev cc;

	
	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();
		// login = new Sign_In();
	}

	@BeforeClass
	public void signIn() throws InterruptedException {
		cc = new signIn_QAdev();
   		 //Thread.sleep(2000);
	}
	
	@Test
	public void loginTest() throws InterruptedException, EventException, IOException {
		Thread.sleep(1000);
	   //.loginWithValid("lakshman_central","blubirch123");
		//Thread.sleep(3000);

	    cc.loginWithValid(cc.getExcelData("login",1,0),cc.getExcelData("login", 1, 1));
	}
	/*
	@DataProvider(name="loginWithValid")
	public Object[][] loginWithValid(){
		Object[][] data=new Object[0][1];
		data[0][0]="lakshman_central";
		data[0][1]="blubirch123";
		return data;
	}*/


	
	@AfterSuite
	public void tearDown() {
		// driver.quit();

	}
}
