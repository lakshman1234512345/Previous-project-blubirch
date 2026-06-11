package com.project.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.baseclass.initialiazePage;
import com.project.code.Logout_In;
public class Logout_InTest extends initialiazePage{
	Logout_In kl;
	@BeforeMethod
	public void Logout() {
	   kl = new Logout_In();
	}
	@Test(priority = 14)
	public void logout() {
		kl.logout();
	}
     @Test(priority = 15)
	public void Logout_Test() {
		kl.logout1();
	}

}
