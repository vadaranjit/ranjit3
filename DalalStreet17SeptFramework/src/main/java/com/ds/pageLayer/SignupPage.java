package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage 
{
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='fw-medium text-primary']")
	private WebElement SignupButton;
	
	@FindBy(xpath="//input[@id='formrow-firstname-Input']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@id='formrow-lastname-Input']")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email_id;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath="//input[@id='customControlInline']")
	private WebElement check_box;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement get_your_juorney_started;
	
	
	public void ClickOnSignupButton() 
	{
		SignupButton.click();
	}
	public void EnterFristName(String firstname) 
	{
		first_name.sendKeys(firstname);
	}
	public void EnterLastName(String lastname) 
	{
		last_name.sendKeys(lastname);
	}
	public void EnterEmailId(String emailid) 
	{
		Email_id.sendKeys(emailid);
	}
	public void EnterPassword(String passwordsc) 
	{
		Password.sendKeys(passwordsc);
	}
	public void ClickOnAgreeButton() 
	{
		check_box.click();
	}
	public void ClickOnGetYourJuorneyStarted() 
	{
		get_your_juorney_started.click();
	}
}