package com.entrata.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.entrata.pages.EntrataDemoPage;
import com.entrata.pages.HomePage;
import com.entrata.testbase.BaseTest;

public class TC_EnterFormDetails extends BaseTest {

	@Test
	public void enterFormDetails() {
		HomePage home = new HomePage(driver);
		EntrataDemoPage demoPage = new EntrataDemoPage(driver);

		driver.get("https://www.entrata.com");
		log("Navigated to entrata.com");

		Assert.assertTrue(driver.getTitle().contains("Property Management Software | Entrata"));
		log("Verified title contains 'Property Management Software | Entrata'");

		home.clickButtonLink("Watch demo");
		log("Clicked on Demo Button on Homepage");

		demoPage.enterInputData("FirstName", "Nikhil");
		log("Entered FirstName as Nikhil");

		demoPage.enterInputData("LastName", "Mutalik");
		log("Entered LastName as Mutalik");

		demoPage.enterInputData("Email", "nikhilm@gmail.com");
		log("Entered Email as nikhilm@gmail.com");

		demoPage.enterInputData("Company", "Entrata");
		log("Entered Company as Entrata");

		demoPage.enterInputData("Phone", "7837378373");
		log("Entered Phone as 7837378373");

		demoPage.enterSelectData("Unit_Count__c", "101 - 300");
		log("Selected No of Units = 101 - 300");

		demoPage.enterInputData("Title", "Software Test engineer");
		log("Entered Job Title as Software Test engineer");

		demoPage.enterSelectData("demoRequest", "a Resident");
		log("Selected Iam = a Resident");

	}

}
