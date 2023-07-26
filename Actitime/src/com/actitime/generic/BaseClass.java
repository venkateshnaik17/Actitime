package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {
		Reporter.log("Open Browser", true);
		driver = new ChromeDriver();
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("close browser", true);
		driver.close();
	}

	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login", true);
		FileLib f = new FileLib();
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);

	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		HomePage h = new HomePage(driver);
		h.setLogout();

	}
}
