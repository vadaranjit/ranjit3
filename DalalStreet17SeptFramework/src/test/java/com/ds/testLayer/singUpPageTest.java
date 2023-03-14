package com.ds.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.SignupPage;
import com.ds.testBase.TestBase;
import com.ds.utilities.UtilClass;

public class singUpPageTest extends TestBase {
	@Test 
	public void verifySingupWithCorrectCred() throws InterruptedException, IOException
	{
		String expected_output = "https://www.apps.dalalstreet.ai/dashboard";
		
		signup_obj.ClickOnSignupButton();		
		signup_obj.EnterFristName("Lalit");
		signup_obj.EnterLastName("vadar");
		signup_obj.EnterEmailId("vadaranjit66556554@gmail.com");
		signup_obj.EnterPassword("12345@ranjit");
		signup_obj.ClickOnAgreeButton();
		signup_obj.ClickOnGetYourJuorneyStarted();
		Thread.sleep(5000);
		String actual_output = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_output, expected_output);
		
	} 
}
