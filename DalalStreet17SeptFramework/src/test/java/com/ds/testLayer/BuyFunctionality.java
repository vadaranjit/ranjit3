package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class BuyFunctionality extends TestBase {
		
		@Test
		public void verifyBuyFunctionality() throws InterruptedException
		{	
			String expected_output = "Order Created successfully";
			//------------------------------------------------
			dash_obj.enterCompanyName("Wipro");
			dash_obj.clickOnOption();
			Thread.sleep(2000);
			//------------------------------------------------
			exchange_obj.clickOnBuyButton1();
			Thread.sleep(2000);
			exchange_obj.enterBuyQuanity("2");
			Thread.sleep(2000);
			exchange_obj.clickOnBuyButton2();
			Thread.sleep(2000);
			//---------------------------------------------------
			String actual_output = exchange_obj.buyOrderResult();
			Assert.assertEquals(actual_output, expected_output);
			
		}
		
		@Test
		public void verifyBuyIntradayFunctionality() throws InterruptedException
		{	
			String expected_output = "Order Created Successfully";
			//------------------------------------------------
			dash_obj.enterCompanyName("Wipro");
			dash_obj.clickOnOption();
			Thread.sleep(2000);
			//------------------------------------------------
			exchange_obj.clickOnBuyButton1();
			exchange_obj.clickOnBuyIntradayButton();
			Thread.sleep(1000);
			exchange_obj.enterBuyQuanity("10");
			Thread.sleep(1000);
			exchange_obj.clickOnBuyButton2();
			Thread.sleep(2000);
			String actual_output = exchange_obj.buyOrderIntradayResult();
			Assert.assertEquals(actual_output, expected_output);
			
		}
} 
