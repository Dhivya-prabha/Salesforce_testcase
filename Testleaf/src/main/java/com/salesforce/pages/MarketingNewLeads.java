package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class MarketingNewLeads extends ProjectSpecificMethods {
	public MarketingNewLeads() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Lead']")
	private WebElement ClickNewLead;

	public MarketingNewLeads clickNewLead() throws InterruptedException {
		Thread.sleep(4000);
		clickUsingJs(ClickNewLead);
		return this;

}
	@FindBy(how = How.XPATH, using = "(//div[@class='uiPopupTrigger']//a)[1]")
	private WebElement ClickLeadSalutation;

	public MarketingNewLeads clickLeadSalutation() {
		click(ClickLeadSalutation);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Mr.']")
	private WebElement SelectLeadSalutation;

	public MarketingNewLeads SelectLeadSalutation() throws InterruptedException {
		Thread.sleep(3000);
		clickUsingJs(SelectLeadSalutation);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//input[contains(@class,'lastName compoundBLRadius')]")
	WebElement Leadname;

	public MarketingNewLeads enterLeadname() {
		clearAndType(Leadname, "David");
		return this;
	}
	@FindBy(how = How.XPATH, using = "(//input[@class=' input'])[3]")
	WebElement Companyname;

	public MarketingNewLeads LeadCompanyname() {
		clearAndType(Companyname, "TCS");
		return this;
	}
	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	private WebElement ClickLeadSave;

	public MarketingNewLeads ClickLeadSave() {
		click(ClickLeadSave);
		return this;
	}
}