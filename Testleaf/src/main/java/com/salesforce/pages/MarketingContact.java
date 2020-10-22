package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class MarketingContact extends ProjectSpecificMethods{
	public MarketingContact() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Contact']")
	private WebElement clickMarketingNewContacts;

	public MarketingContact clickMarketingNewContacts() {
		clickUsingJs(clickMarketingNewContacts);
		return this;
	}
	
    @FindBy(how = How.XPATH, using = "//span[text()='Salutation']/following::a")
	private WebElement clickMarketingContactsSalutation;

	public MarketingContact clickMarketingContactsSalutation() {
		clickUsingJs(clickMarketingContactsSalutation);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//a[@title='Mr.']")
	private WebElement MarketSalutationTitle;

	public MarketingContact MarketSalutationTitle() {
		click(MarketSalutationTitle);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	WebElement MarketLastname;

	public MarketingContact MarketLastname() {
		clearAndType(MarketLastname, "Kumar");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	WebElement MarketFirstname;

	public MarketingContact MarketFirstname() {
		clearAndType(MarketFirstname, "Vinoth");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[@title='Save & New']/following::span")
	private WebElement MarketSaveContacts;

	public MarketingContact MarketSaveContacts() {
		click(MarketSaveContacts);
		return this;
	}
}
