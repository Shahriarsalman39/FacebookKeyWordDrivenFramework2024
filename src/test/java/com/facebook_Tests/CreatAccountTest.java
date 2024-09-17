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
	
	@BeforeMethod(groups= {"smoke","Regression","Functional"})
	public void openfacebook() {
		openapplication();
	}
	
	@Test(groups= {"smoke","Regression","Functional"})
	public void ValidopenAccountTest() {
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
	
	
	@Test(groups= {"smoke","Regression"})
	public void InvalidopenAccountTest() {
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
	
	@Test(groups= {"smoke","Functional"})
	public void Valid2openAccountTest() {
	    cap= new CreateAccountPage(driver);
	    tr = new TestReader();
	    
		cap.clickOnNewAcc();
		
		cap.FirstName(tr.readF_name());
		cap.Surname(tr.readS_name());
		cap.Email(tr.readEmail());
		cap.password(tr.readPasS());
		cap.clickOnDateMonthYear();
		
		cap.clickOnGender();
		cap.clickOnSignUp();
	}
	
	@Test(groups= {"Regression","Functional"})
	public void Valid3openAccountTest() {
	    cap= new CreateAccountPage(driver);
	    tr = new TestReader();
	    
		cap.clickOnNewAcc();
		
		cap.FirstName(tr.readF_name());
		cap.Surname(tr.readS_name());
		cap.Email(tr.readEmail());
		cap.password(tr.readPasS());
		cap.clickOnDateMonthYear();
		
		cap.clickOnGender();
		cap.clickOnSignUp();
	}
	@AfterMethod(groups= {"smoke","Regression","Functional"})
	public void closefacebook() {
		closeApplication();
	}
}
