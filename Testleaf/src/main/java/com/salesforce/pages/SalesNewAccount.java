package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class SalesNewAccount extends ProjectSpecificMethods {
	public SalesNewAccount() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Account']")
	private WebElement clickSalesNewAccounts;

	public SalesNewAccount clickSalesNewAccounts() {
		clickUsingJs(clickSalesNewAccounts);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//input[@class=' input'])[1]")
	WebElement SalesAccountname;

	public SalesNewAccount SalesFirstname() {
		clearAndType(SalesAccountname, "Vinoth");
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class=' label bBody'])[3]")
	private WebElement SaveSalesNewAccounts;

	public SalesNewAccount SaveSalesNewAccounts() {
		clickUsingJs(SaveSalesNewAccounts);
		return this;
	}

}
