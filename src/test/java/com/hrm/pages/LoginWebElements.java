package com.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.testbase.BaseClass;

public class LoginWebElements extends BaseClass{

	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(id = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button")
	public WebElement loginBtn;
	
	public LoginWebElements() {
		PageFactory.initElements(driver, this);
	}
	
}
