package com.entrata.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.entrata.pages.HomePage;
import com.entrata.testbase.BaseTest;

public class NavigationTest extends BaseTest {
	@Test
	public void verifyNavigationToProducts01() {
		driver.get("https://www.entrata.com");
		log("Navigated to entrata.com");

		Assert.assertTrue(driver.getTitle().contains("Property Management Software | Entrata"));
		log("Verified title contains 'Property Management Software | Entrata'");

		HomePage home = new HomePage(driver);
		home.clickMouseHover("Products");
		log("Mouse poiter hover on Products Menu");

		home.clickNavLink("Property Operations");
		log("clicked on Property Operations Menu"); 

		home.clickNavLink("ProspectPortal");
		log("clicked on ProspectPortal Sub-Menu"); 

		Assert.assertTrue(driver.getTitle().contains("ProspectPortal"));
		log("Verified title contains 'ProspectPortal'");

	}

	@Test
	public void verifyNavigationToProducts02(){
		driver.get("https://www.entrata.com");
		log("Navigated to entrata.com");

		Assert.assertTrue(driver.getTitle().contains("Property Management Software | Entrata"));
		log("Verified title contains 'Property Management Software | Entrata'");

		HomePage home = new HomePage(driver);
		home.clickMouseHover("Products");
		log("Mouse poiter hover on Products Menu");
		
		home.clickNavLink("AI");
		log("clicked on AI & Automation Operations Menu"); 
		
		home.clickNavLink("Leasing AI");
		log("clicked on Leasing AI Sub-Menu"); 

		Assert.assertTrue(driver.getTitle().contains("Leasing AI"));
		log("Verified title contains 'Leasing AI'");

	}

}