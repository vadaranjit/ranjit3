package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {
	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- obj repo -----------------
	
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//li[@class='nav-item'][2]")
	private WebElement sell_btn1;
	
	@FindBy(xpath="//button[@class='w-md btn btn-danger']")
	private WebElement sell_btn2;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement buy_quantity_txtbox;//input[@name='input-Qunatity']
	
	@FindBy(xpath="//input[@class='form-control form-control']")
	private WebElement sell_quantity_txtbox;
	
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement buy_btn2; 
	
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	private WebElement buy_order_result;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[2]")
	private WebElement Buy_intraday_order;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[6]")
	private WebElement Sell_intraday_order;
	
	
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	private WebElement Buy_intraday_order_result;
	
	//------------ action methods -------------
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void clickOnBuyIntradayButton()
	{
		Buy_intraday_order.click();
	}
	
	public void clickOnSellIntradayButton()
	{
		Sell_intraday_order.click();
	}
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	public void clickOnSellButton1()
	{
		sell_btn1.click();
	}
	
	public void clickOnSellButton2()
	{
		sell_btn2.click();
	}
	
	public void enterBuyQuanity(String count)
	{
		buy_quantity_txtbox.click();
		buy_quantity_txtbox.sendKeys(count);
	}
	
	public void enterSellQuanity(String count)
	{
		sell_quantity_txtbox.click();
		sell_quantity_txtbox.sendKeys(count);
	}
	public String buyOrderResult()
	{
		String sc = buy_order_result.getText();
		return sc;
	}

	public String buyOrderIntradayResult() {
		String result = Buy_intraday_order_result.getText();
		return result;
	}
	
}
