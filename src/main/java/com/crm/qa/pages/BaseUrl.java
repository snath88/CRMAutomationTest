package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class BaseUrl extends TestBase {
	
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")
	WebElement login;
	
	@FindBy(xpath="//span[@class='mdi-chart-bar icon icon-md']")  
	WebElement SignUp;
	
	@FindBy(xpath="(//*[name()='image'])[1]")   ///images/cogtiny1.jpg
	WebElement logo;
	
	
	public BaseUrl()
	{
		PageFactory.initElements(driver, this);
		
//		PageFactory.initElements(driver, HomePage.class);
	}
	
	public String validateHomePageTittle()
	{
		String tittle= driver.getTitle();
		return tittle;
	}
	
	public Boolean validateHomePageLogo()
	{
		Boolean crmLogo= logo.isDisplayed();
		return crmLogo;
		
	}
	
	public LoginPage clickLogin()
	{
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
		TestUtil.clickon(login);
		
		return new LoginPage();
	}

}
