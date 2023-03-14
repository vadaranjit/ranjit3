package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class SellFunctionality extends TestBase {
	@Test
	public void verifySellFunctionality() throws InterruptedException
	{	
		String expected_output = "Order Created successfully";
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		Thread.sleep(1000);
		dash_obj.clickOnOption();
		Thread.sleep(2000);
		//-----------------------------------------------------
		exchange_obj.clickOnSellButton1();
		Thread.sleep(2000);
		exchange_obj.enterSellQuanity("3");
		Thread.sleep(1000);
		exchange_obj.clickOnSellButton2();
		Thread.sleep(2000);
		String actual_output = exchange_obj.buyOrderIntradayResult();
		Assert.assertEquals(actual_output, expected_output);
	}
	
	@Test
	public void verifySellIntradayFunctionality() throws InterruptedException
	{
		String expected_output = "Order Created successfully";
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		Thread.sleep(1000);
		dash_obj.clickOnOption();
		Thread.sleep(2000);
		//-----------------------------------------------------
		exchange_obj.clickOnSellButton1();
		exchange_obj.clickOnSellIntradayButton();
		exchange_obj.enterSellQuanity("5");
		exchange_obj.clickOnSellButton2();
		Thread.sleep(2000);
		String actual_output = exchange_obj.buyOrderIntradayResult();
		Assert.assertEquals(actual_output, expected_output);
		
	}
} 
