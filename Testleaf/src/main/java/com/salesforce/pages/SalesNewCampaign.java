package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class SalesNewCampaign  extends ProjectSpecificMethods{
	
	public SalesNewCampaign() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='New Campaign']")
	private WebElement clickSalesNewCampaign;

	public SalesNewCampaign clickSalesNewCampaign() {
		clickUsingJs(clickSalesNewCampaign);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//label[contains(@class,'label inputLabel')]/following-sibling::input")
	private WebElement campaignName;
	
	public SalesNewCampaign SalesCampaignName() {
		clearAndType(campaignName, "Product Outlet");
		return this;
	}
	@FindBy(how = How.XPATH, using = "//a[@class='select']")
	private WebElement clickSalesCampaignType;

	public SalesNewCampaign clickSalesCampaignType() {
		clickUsingJs(clickSalesCampaignType);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//a[@title='Trade Show']")
	private WebElement selectSalesCampaignType;

	public SalesNewCampaign selectSalesCampaignType() {
		clickUsingJs(selectSalesCampaignType);
		return this;
	}
	@FindBy(how = How.XPATH, using = "//button[@title='Save']//span[1]")
	private WebElement saveSalesCampaign;

	public SalesNewCampaign saveSalesCampaign() {
		clickUsingJs(saveSalesCampaign);
		return this;
	}
}
