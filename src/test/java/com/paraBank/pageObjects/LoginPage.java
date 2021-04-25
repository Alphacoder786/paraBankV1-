package com.paraBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver; 
	

	public LoginPage(WebDriver  rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using ="//input[@name='username']")
	@CacheLookup
	WebElement UserNameTxt;
	
	@FindBy(how = How.XPATH, using ="//input[@name='password']")
	@CacheLookup
	WebElement passwordTxt;
	
	
	@FindBy(how = How.XPATH, using ="//input[@class='button' or text()='Log In'] ")
	@CacheLookup
	WebElement loginBtn;
	
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement logoutBtn;
	
	@FindBy(how = How.XPATH, using ="//b[contains(text(),'Welcome') or text()='Welcome' ]") 
	@CacheLookup
	WebElement WelcomeMessage;
//	 //b[text()='Welcome']  || //b[contains(text(),'Welcome')]
	
	
	
	
	public void setUserName(String uname) throws InterruptedException
	{
		UserNameTxt.click();
		Thread.sleep(1000);		
		UserNameTxt.sendKeys(uname);
	}
	
	public void setPassword(String pwd) throws InterruptedException
	{
		passwordTxt.click();
		Thread.sleep(1000);
		passwordTxt.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		loginBtn.click();
	}	
	
	public void clickLogout()
	{
		logoutBtn.click();
	}
	
	public  String message()
	{

		String WelcomeTxt = WelcomeMessage.getText();		
		return (WelcomeTxt);
		

	}
}
