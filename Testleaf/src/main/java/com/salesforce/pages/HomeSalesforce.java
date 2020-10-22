package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.selenium.api.base.SeleniumBase;
import com.testleaft.selenium.api.design.Locators;

public class HomeSalesforce extends SeleniumBase {
	public HomeSalesforce() {
		PageFactory.initElements(getDriver(), this);
	}
	
	//Click on Menu
	@FindBy(how = How.CLASS_NAME, using = "slds-r5")
	private WebElement Menu;
	public HomeSalesforce clickOnMenu(){
		click(Menu);
		return this;
	}
//	Click on View_All
	@FindBy(how = How.XPATH, using = "//button[text()='View All']")
	private WebElement View_all;
	public HomeSalesforce clickOnViewAll(){
		click(View_all);	
		return this;
	}
	@FindBy(how = How.XPATH, using = "//p[text()='Sales']")
	private WebElement Click_Sales;
	public Sales clickOnSales(){
		click(Click_Sales);	
		return new Sales();
	}
	
	@FindBy(how = How.XPATH, using = "//p[text()='Marketing']")
	private WebElement Click_Marketing;
	public Marketing clickOnMarketing(){
		click(Click_Marketing);	
		return new Marketing();
	}
}
