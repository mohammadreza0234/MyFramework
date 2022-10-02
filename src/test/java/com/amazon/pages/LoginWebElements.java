package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.testbase.BaseClass;

public class LoginWebElements extends BaseClass{

	@FindBy(id = "ap_email")
	public WebElement username;
	
	@FindBy(id = "ap_password")
	public WebElement password;
	
	@FindBy(xpath = "//span[@id='auth-signin-button']")
	public WebElement signinBtn;
	
	@FindBy (linkText = "Sign in")
	public WebElement signIn;
	
	
	@FindBy (id = "continue")
	public WebElement continueButton;
	
	public LoginWebElements() {
		PageFactory.initElements(driver, this);
	}
	
}
