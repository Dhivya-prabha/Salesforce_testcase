package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class MarketingOpportunity  extends ProjectSpecificMethods{
	public MarketingOpportunity() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Opportunity']")
	private WebElement clickMarketingOpportunity;

	public MarketingOpportunity clickMarketingOpportunity() {
		clickUsingJs(clickMarketingOpportunity);
		return this;
	}
	@FindBy(how = How.XPATH, using = "(//input[@class=' input'])[2]")
	WebElement MarketingOpportunityname;

	public MarketingOpportunity enterOpportunityname() {
		clearAndType(MarketingOpportunityname, "MarketingReports");
		return this;
	}
	@FindBy(how = How.XPATH, using = "//a[@class='datePicker-openIcon display']")
	private WebElement MarketingCloseDate;

	public MarketingOpportunity clickOnMarketingCloseDate() {
		click(MarketingCloseDate);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//table[@class='calGrid']")
	private WebElement MarketingClickCloseDate;

	public MarketingOpportunity clickMarketingCloseDate() {
		click(MarketingClickCloseDate);
		return this;
	}
	@FindBy(how = How.XPATH, using = "(//div[@class='uiPopupTrigger']//a)[1]")
	private WebElement MarketingClickStage;

	public MarketingOpportunity clickMarketingStage() {
		clickUsingJs(MarketingClickStage);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//a[@title='Value Proposition']")
	private WebElement MarketingSelectStage;

	public MarketingOpportunity SelectMarketingStage() {
		clickUsingJs(MarketingSelectStage);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	private WebElement SaveOpportunity;

	public MarketingOpportunity SaveOpportunity() {
		clickUsingJs(SaveOpportunity);
		return this;
	}
	
}
