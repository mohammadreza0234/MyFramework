package com.amazon.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.pages.LoginWebElements;
import com.amazon.testbase.BaseClass;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest() throws IOException, InterruptedException{
		LoginWebElements login = new LoginWebElements();
		
		
		login.signIn.click();
		Thread.sleep(2000);

		
		
		
		login.username.sendKeys("mohammadreza.hedayatifard@stu.bahcesehir.edu.tr");
		Thread.sleep(3000);

		
		login.continueButton.click();
		Thread.sleep(1500);
		
		
		login.password.sendKeys("251581");
		login.signinBtn.click();
		Thread.sleep(5000);
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("screenshots/login.png"));

	}
	
}
