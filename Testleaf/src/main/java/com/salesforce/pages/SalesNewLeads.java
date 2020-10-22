package com.salesforce.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class SalesNewLeads extends ProjectSpecificMethods {
	public SalesNewLeads() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Lead']")
	private WebElement ClickNewLead;

	public SalesNewLeads clickNewLead() throws InterruptedException {
		Thread.sleep(4000);
		clickUsingJs(ClickNewLead);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//div[@class='uiPopupTrigger']//a)[1]")
	private WebElement ClickLeadSalutation;

	public SalesNewLeads clickLeadSalutation() {
		click(ClickLeadSalutation);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Mr.']")
	private WebElement SelectLeadSalutation;

	public SalesNewLeads SelectLeadSalutation() throws InterruptedException {
		Thread.sleep(3000);
		clickUsingJs(SelectLeadSalutation);
		// jsClick("arguments[0].click()", SelectLeadSalutation);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'lastName compoundBLRadius')]")
	WebElement Leadname;

	public SalesNewLeads enterLeadname() {
		clearAndType(Leadname, "Balaji");
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//input[@class=' input'])[3]")
	WebElement Companyname;

	public SalesNewLeads LeadCompanyname() {
		clearAndType(Companyname, "TCS");
		return this;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	private WebElement ClickLeadSave;

	public SalesNewLeads ClickLeadSave() {
		click(ClickLeadSave);
		return this;
	}
}
