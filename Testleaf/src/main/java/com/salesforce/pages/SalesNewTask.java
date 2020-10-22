package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.testng.api.base.ProjectSpecificMethods;

public class SalesNewTask extends ProjectSpecificMethods {

	public SalesNewTask() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "//span[text()='New Task']")
	private WebElement ClickSalesNewTask;

	public SalesNewTask ClickSalesNewTask() {
		clickUsingJs(ClickSalesNewTask);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//label[text()='Subject']/following::input")
	WebElement SalesTaskname;

	public SalesNewTask SalesTaskname() {
		clearAndType(SalesTaskname, "SalesReports");
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='label inputLabel uiPicklistLabel-left form-element__label uiPicklistLabel']/following-sibling::div)[2]")
	private WebElement ClickSalesNormal;

	public SalesNewTask ClickSalesNormal() {
		click(ClickSalesNormal);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//li[@role='presentation']/a[@title='Normal']")
	private WebElement SelectTaskTitle;

	public SalesNewTask SelectTaskTitle() {
		click(SelectTaskTitle);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class='label inputLabel uiPicklistLabel-left form-element__label uiPicklistLabel']/following-sibling::div)[1]")
	private WebElement ClickTaskStatus;

	public SalesNewTask ClickTaskStatus() {
		click(ClickTaskStatus);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//li[@role='presentation']/a[@title='In Progress']")
	private WebElement SelectTaskStatus;

	public SalesNewTask SelectTaskStatus() {
		click(SelectTaskStatus);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class=' label bBody'])[3]")
	private WebElement ClickTaskSave;

	public SalesNewTask ClickTaskSave() {
		click(ClickTaskSave);
		return this;
	}

}
