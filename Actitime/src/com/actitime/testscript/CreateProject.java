package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateProject extends BaseClass{
	@Test
	public void testCreateProject() {
		Reporter.log("Create project",true);
		HomePage h= new HomePage(driver);
		h.setTaskBtn();
		TaskListPage task = new TaskListPage(driver);
		task.getAddNewBtn().click();
		task.getNewProjectBtn().click();
		task.getEnterProjectNameTextField().sendKeys("banking Project");
		task.getAddProjectDropdown().click();
		task.getSelectCompany().click();
		task.getAddProjectDescriptionTxtField().sendKeys("all bank");
		task.getCustomerDropDown().click();
		task.getOurCompany().click();
		task.getCreateProjectBtn().click();
		
	}
}
