package com.paraBank.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.paraBank.pageObjects.LoginPage;



public class TC_LoginTest_001  extends BaseClass{
	
	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
		
		logger.info("URL is Opened");  
        driver.navigate().refresh();
        
        
        LoginPage lp = new LoginPage(driver);  //creating object of Login Page      
        lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		Thread.sleep(4000);
		
		
		if (lp.message().equalsIgnoreCase("Welcome")){
			Assert.assertTrue(true);			
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
		
		
	}
	

}
