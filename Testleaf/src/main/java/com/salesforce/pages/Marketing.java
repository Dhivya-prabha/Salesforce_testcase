package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.selenium.api.base.SeleniumBase;

public class Marketing  extends SeleniumBase{
	public Marketing() {
		PageFactory.initElements(getDriver(), this);
	}
//	Click on Leads()
	@FindBy(how = How.XPATH, using = "//a[@title = 'Leads']/following::a")
	private WebElement MarketingNewLeads;

	public MarketingNewLeads clickOnMarketingNewLeads() {
		click(MarketingNewLeads);
		return new MarketingNewLeads();
		
	}
	
//	Click on Contact()
	@FindBy(how = How.XPATH, using = "//a[@title = 'Contacts']/following::a")
	private WebElement MarketingNewContact;

	public MarketingContact clickOnMarketingContact() {
		click(MarketingNewContact);
		return new MarketingContact();
		
	}
//	Click on Opportunity()
	@FindBy(how = How.XPATH, using = "//a[@title = 'Opportunities']/following::a")
	private WebElement MarketingNewOpportunity;

	public MarketingOpportunity clickOnMarketingOpportunity() {
		click(MarketingNewOpportunity);
		return new MarketingOpportunity();
		
	}
}
