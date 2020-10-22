package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.selenium.api.base.SeleniumBase;

public class Sales  extends SeleniumBase{
	public Sales() {
		PageFactory.initElements(getDriver(), this);
	}
//	Click on Leads()
	@FindBy(how = How.XPATH, using = "//a[@title = 'Leads']/following::a")
	private WebElement SalesNewLeads;

	public SalesNewLeads clickOnSalesNewLeads() {
		click(SalesNewLeads);
		return new SalesNewLeads();
		
	}
//	Click on Task()
	@FindBy(how = How.XPATH, using = "//a[@title = 'Tasks']/following::a")
	private WebElement SalesNewTasks;

	public SalesNewTask clickOnSalesNewTasks() {
		click(SalesNewTasks);
		return new SalesNewTask();
	}
	// Click on Opportunity()
		@FindBy(how = How.XPATH, using = "//a[@title = 'Opportunities']/following::a")
		private WebElement SalesOpportunity;

		public SalesNewOpportunity clickOnSalesOpportunity() {
			click(SalesOpportunity);
			return new SalesNewOpportunity();
		}
//		Click on NewAccount()
		@FindBy(how = How.XPATH, using = "//a[@title = 'Accounts']/following::a")
		private WebElement SalesNewAccounts;

		public SalesNewAccount clickOnSalesNewAccounts() {
			click(SalesNewAccounts);
			return new SalesNewAccount();
		}
//		Click on NewContacts()
		@FindBy(how = How.XPATH, using = "//a[@title = 'Contacts']/following::a")
		private WebElement SalesNewContacts;

		public SalesNewContacts clickOnSalesNewContacts() {
			click(SalesNewContacts);
			return new SalesNewContacts();
		}		
		
//		Click on NewCampaign()
		@FindBy(how = How.XPATH, using = "//a[@title = 'Campaigns']/following::a")
		private WebElement SalesNewCampaign;

		public SalesNewCampaign clickOnSalesNewCampaign() {
			click(SalesNewCampaign);
			return new SalesNewCampaign();
}
}