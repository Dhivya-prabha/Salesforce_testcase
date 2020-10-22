package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class SalesNewContacts extends ProjectSpecificMethods{
	public SalesNewContacts() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Contact']")
	private WebElement clickSalesNewContacts;

	public SalesNewContacts clickSalesNewContacts() {
		clickUsingJs(clickSalesNewContacts);
		return this;
	}
	
    @FindBy(how = How.XPATH, using = "//span[text()='Salutation']/following::a")
	private WebElement clickSalesContactsSalutation;

	public SalesNewContacts clickSalesContactsSalutation() {
		clickUsingJs(clickSalesContactsSalutation);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Mr.']")
	private WebElement SalesSalutationTitle;

	public SalesNewContacts SalesSalutationTitle() {
		click(SalesSalutationTitle);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	WebElement SalesLastname;

	public SalesNewContacts SalesLastname() {
		clearAndType(SalesLastname, "Kumar");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	WebElement SalesFirstname;

	public SalesNewContacts SalesFirstname() {
		clearAndType(SalesFirstname, "Vinoth");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[@title='Save & New']/following::span")
	private WebElement SalesSaveContacts;

	public SalesNewContacts SalesSaveContacts() {
		click(SalesSaveContacts);
		return this;
	}
}
