package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.pages.Login;
import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class TC_002_MarketingContacts extends ProjectSpecificMethods {
	@BeforeTest
	void setReportDetails() {
		testcaseName = this.getClass().getSimpleName();
		testcaseDec = "Create a Chat Queue Entry";
		author = "Balaji";
		category = "Smoke";
	}

	@Test
	public void MarketingContacts () throws InterruptedException {
	         new Login()
			.enterUsername()
			.enterPassword()
			.clickLogin()
			.clickOnMenu()
			.clickOnViewAll()
			.clickOnMarketing()
			.clickOnMarketingContact()
			.clickMarketingNewContacts()
			.clickMarketingContactsSalutation()
			.MarketSalutationTitle()
			.MarketLastname()
			.MarketFirstname()
			.MarketSaveContacts();
			
	}
}
