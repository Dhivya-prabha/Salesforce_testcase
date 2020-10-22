package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.selenium.api.base.SeleniumBase;

public class SalesNewOpportunity extends SeleniumBase {

	public SalesNewOpportunity() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Opportunity']")
	private WebElement ClickNewOpportunity;

	public SalesNewOpportunity clickNewOpportunity() {
		clickUsingJs(ClickNewOpportunity);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//input[@class=' input'])[2]")
	WebElement SalesOpportunityname;

	public SalesNewOpportunity enterOpportunityname() {
		clearAndType(SalesOpportunityname, "SalesReports");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='datePicker-openIcon display']")
	private WebElement SalesCloseDate;

	public SalesNewOpportunity clickOnSalesCloseDate() {
		click(SalesCloseDate);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//table[@class='calGrid']")
	private WebElement SalesClickCloseDate;

	public SalesNewOpportunity clickSalesCloseDate() {
		click(SalesClickCloseDate);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='uiPopupTrigger']//a)[1]")
	private WebElement SalesClickStage;

	public SalesNewOpportunity clickSalesStage() {
		clickUsingJs(SalesClickStage);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Value Proposition']")
	private WebElement SalesSelectStage;

	public SalesNewOpportunity SelectSalesStage() {
		clickUsingJs(SalesSelectStage);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	private WebElement SaveOpportunity;

	public SalesNewOpportunity SaveOpportunity() {
		clickUsingJs(SaveOpportunity);
		return this;
	}

}
