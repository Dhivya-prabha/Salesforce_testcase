package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.selenium.api.base.SeleniumBase;

public class Login extends SeleniumBase{
	
	public Login() {
		PageFactory.initElements(getDriver(), this);
		//switchToFrame(0);
	}
	@FindBy(how = How.ID, using="username") WebElement eleUsername;
	public Login enterUsername() {
		clearAndType(eleUsername, "Dhivya@testleaf.com");
		return this;
	}
	@FindBy(how = How.ID, using="password") WebElement elePassword;
	public Login enterPassword() {
		clearAndType(elePassword, "India@123");
		return this;
	}
	@FindBy(how = How.CSS, using="input#Login") WebElement eleLoginButton;
	public HomeSalesforce clickLogin() throws InterruptedException {
		click(eleLoginButton);
		Thread.sleep(5000);
		return new HomeSalesforce();
		
		
	}

	}
