package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.BaseUrl;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	BaseUrl baseurl;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void setUp()
	{
		initialization();
		baseurl= new BaseUrl(); 
		loginpage= baseurl.clickLogin();		
	}
	
	@Test
	public void LoginPageTittleTest()
	{
		String tittle= loginpage.validateLoginPageTittle();
		Assert.assertEquals(tittle, "Cogmento CRM");
	}
	
	@Test
	public void LoginTest()
	{
		loginpage.Login(prop.getProperty("user"), prop.getProperty("password"));
		
//		loginpage.Login(prop.getProperty("user"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
