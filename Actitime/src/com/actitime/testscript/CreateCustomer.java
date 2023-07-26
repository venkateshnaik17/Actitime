package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
//	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer", true);
		FileLib f = new FileLib();
		String cn = f.getExceldata("CreateCustomer", 1, 0);
		String cd = f.getExceldata("CreateCustomer", 1, 1);
		HomePage h = new HomePage(driver);
		h.setTaskBtn();
		TaskListPage task = new TaskListPage(driver);
		task.getAddNewBtn().click();
		task.getCreatenewcustomerBtn().click();
		task.getCustomerNameTextField().sendKeys(cn);
		task.getCustomerDescriptionTextField().sendKeys(cd);
		task.getSelectCustomerDropdown().click();
		task.getBigbangCmpny().click();
		task.getCreatecustBtn().click();
		Thread.sleep(4000);
		String actualText = task.getCaptureNewCustomertext().getText();
		Assert.assertEquals(actualText, cn);
	}

}
