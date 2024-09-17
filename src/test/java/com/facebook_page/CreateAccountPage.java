package com.facebook_page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public CreateAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[starts-with(@id,'u_0_')]") public WebElement creatrNewAcc;	
	@FindBy(xpath="//input[@name='firstname']") public WebElement F_Name;
	@FindBy(xpath="//input[@name='lastname']") public WebElement Sur_Name;
	@FindBy(xpath="//input[starts-with(@id,'u_2_d_')]") public WebElement Email;
	@FindBy(xpath="//input[contains(@id,'password_s')]") public WebElement pasS;
	@FindBy(xpath="//select[@id='day']/option[text()='11']") public WebElement daTe;
	@FindBy(xpath="//select[@id='month']/option[text()='Aug']") public WebElement monTh;
	@FindBy(xpath="//select[@name='birthday_year']/option[text()='1995']") public WebElement yeaR;
	//@FindBy(xpath="//span[contains(@id,'u_2_k')]/span[2]/label") public WebElement GendeR;
	//@FindBy(xpath="//*[text()='Male']") public WebElement GendeR;
	
	//@FindBy(xpath="//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Female']]") public WebElement GendeR;
	              //span[@class='_5k_2 _5dba']/input[precending-sibling::label[text()='Female']]
	
	@FindBy(xpath="//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]") public WebElement GendeR;
	@FindBy(xpath="//button[contains(@class,'_6j mvm _6wk _6wl _58mi')]") public WebElement signUp;
	
	
	
	public void clickOnNewAcc() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(creatrNewAcc)).click();
		}
	
	public WebElement FirstName( String enterFirst_name ) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		wait.until(ExpectedConditions.visibilityOf(F_Name));
		F_Name.sendKeys(enterFirst_name);
		return Email;
	}
	

	public WebElement Surname(String enterSurName) {
		Sur_Name.sendKeys(enterSurName);
		return Sur_Name;
		
	}
	
	public WebElement Email(String enterEmail) {
		Email.sendKeys(enterEmail);
		return Email;
		
	}
	
	public WebElement password(String enterPass) {
		pasS.sendKeys(enterPass);
		return pasS;
		
	}
	
	public void clickOnDateMonthYear() {
		monTh.click();
		daTe.click();
		yeaR.click();
		
		}
	
	/*public void clickOnMonth() {
		daTe.click();
		
		}
	
	public void clickOnYear() {
		yeaR.click();
		
		}*/
	
	public void clickOnGender() {
		GendeR.click();
		
		}
	
	public void clickOnSignUp() {
		
		 wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOf(signUp)).click();
		
		}
	
	}
	
	
