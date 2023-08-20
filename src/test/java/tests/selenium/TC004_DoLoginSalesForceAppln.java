package tests.selenium;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.selenium.LoginPageSF;

public class TC004_DoLoginSalesForceAppln extends PreAndPost {

	@BeforeTest
	public void setValues() {

		testCaseName = "Create Incident (Using Selenium)";
		testDescription = "Create a new Incident";
		nodes = "Incident Management";
		authors = "Sarath";
		category = "UI";
		dataSheetName = "TC002";

	}

	@Test(dataProvider = "fetchData")
	public void doLogin(String filter, String user, String short_desc) {
		new LoginPageSF(driver, test).loginApp();
	}

}
