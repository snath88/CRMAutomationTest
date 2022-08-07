/*
 * Author: Sayantan Nath
 * 
 * */



package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BaseUrl;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.RetryAnalyzer;

public class BaseUrlTest extends TestBase{
	
	BaseUrl baseurl;
	LoginPage loginpage;
	
	public BaseUrlTest()
	{
		super();
	}
	
	
	@BeforeMethod	
	public void setUp()
	{
		initialization();
		 baseurl= new BaseUrl();		
	}
	
	@Test (priority=3, retryAnalyzer = RetryAnalyzer.class)
	public void BaseUrlTittletest()
	{
		String tittle= baseurl.validateHomePageTittle();
		
		Assert.assertEquals(tittle, "#1 Free CRM customer relationship management software cloud");  // and support.
	}
	
	
	@Test (priority=2)
	public void BaseUrlPageLogoTest()
	{
		Boolean logo= baseurl.validateHomePageLogo();
		
		Assert.assertTrue(logo);
	}
	
	
	@Test (priority=1)
	public void clickLoginTest()
	{
		loginpage= baseurl.clickLogin();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
