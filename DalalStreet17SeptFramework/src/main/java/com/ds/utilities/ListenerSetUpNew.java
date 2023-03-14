package com.ds.utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListenerSetUpNew extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test case execution started - "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test case execution completed - "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("\nTest case execution failed - "+result.getName());
		System.out.println("Take Screenshot\n");
		UtilClass obj = new UtilClass();
		try 
		{
			obj.screenshot(driver,result.getName());
		} 
		catch (IOException e) 
		{		
			e.printStackTrace();
		} 
		
	} 

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test case execution skipped - "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		//System.out.println("onTestSuccess");
	}

	@Override
	public void onStart(ITestContext context) {
		///System.out.println("onTestSuccess");
	}

	@Override
	public void onFinish(ITestContext context) {
	
		//System.out.println("onTestSuccess");
	}

}
