package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.salesforce.pages.Login;
import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class TC_001_CreateNewCampaign  extends ProjectSpecificMethods{
	@BeforeTest
	void setReportDetails() {
		testcaseName = this.getClass().getSimpleName();
		testcaseDec = "Create a Chat Queue Entry";
		author = "Balaji";
		category = "Smoke";
	}

	@Test
	public void createNewCampaign () throws InterruptedException {
		new Login()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickOnMenu()
		.clickOnViewAll()
		.clickOnSales()
		.clickOnSalesNewCampaign()
		.clickSalesNewCampaign()
		.SalesCampaignName()
		.clickSalesCampaignType()
		.selectSalesCampaignType()
		.saveSalesCampaign();

}
}