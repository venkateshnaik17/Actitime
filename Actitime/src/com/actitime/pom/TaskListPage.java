package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement createnewcustomerBtn;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionTextField;

	@FindBy(xpath = "//div[@class='emptySelection' and text()='- Select Customer -']")
	private WebElement selectCustomerDropdown;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")
	private WebElement bigbangCmpny;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']")
	private WebElement captureNewCustomertext;

	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newProjectBtn;

	@FindBy(xpath = "(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectNameTextField;
	
	@FindBy(xpath = "//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement addProjectDropdown;
	
	@FindBy(xpath="(//div[@class='itemRow cpItemRow ' and text()='Big Bang Company'])[2]")
	private WebElement selectCompany;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescriptionTxtField;

	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createProjectBtn;

	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTaskBtn;

	@FindBy(xpath = "(//div[@class='comboboxButton'])[2]")
	private WebElement customerDropDown;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow selected' and text()='Our company']")
	private WebElement ourCompany;

	@FindBy(xpath = "(//div[@class='comboboxButton'])[3]")
	private WebElement projectDropDown;

	@FindBy(xpath = "//div[@class='itemRow cpItemRow selected' and text()='Accounting']")
	private WebElement selectAcconting;

	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskBtn;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getCreatenewcustomerBtn() {
		return createnewcustomerBtn;
	}

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getCustomerDescriptionTextField() {
		return customerDescriptionTextField;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getBigbangCmpny() {
		return bigbangCmpny;
	}

	public WebElement getCreatecustBtn() {
		return createcustBtn;
	}

	public WebElement getCaptureNewCustomertext() {
		return captureNewCustomertext;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getEnterProjectNameTextField() {
		return enterProjectNameTextField;
	}

	public WebElement getAddProjectDropdown() {
		return addProjectDropdown;
	}

	public WebElement getSelectCompany() {
		return selectCompany;
	}

	public WebElement getAddProjectDescriptionTxtField() {
		return addProjectDescriptionTxtField;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getProjectDropDown() {
		return projectDropDown;
	}

	public WebElement getSelectAcconting() {
		return selectAcconting;
	}

	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}

}
