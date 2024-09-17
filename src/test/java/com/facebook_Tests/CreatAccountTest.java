package com.facebook_Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_base.Base_Test;
import com.facebook_page.CreateAccountPage;
import com.facebook_utilities.TestReader;

public class CreatAccountTest extends Base_Test{

	CreateAccountPage cap;
	TestReader tr;
	
	@BeforeMethod
	public void openfacebook() {
		openapplication();
	}
	
	@Test
	public void openAccountTest() {
	    cap= new CreateAccountPage(driver);
	    tr = new TestReader();
	    
		cap.clickOnNewAcc();
		
		cap.FirstName(tr.readF_name());
		cap.Surname(tr.readS_name());
		cap.Email(tr.readEmail());
		cap.password(tr.readPasS());
		cap.clickOnDateMonthYear();
		//cap.clickOnMonth();
		//cap.clickOnYear();
		cap.clickOnGender();
		cap.clickOnSignUp();
	}
	
	
	
	//@AfterMethod
	public void closefacebook() {
		closeApplication();
	}
}
