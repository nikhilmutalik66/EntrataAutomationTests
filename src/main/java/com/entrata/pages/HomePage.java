package com.entrata.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickMouseHover(String linkName) {

		By link = By.xpath("//div[contains(text(),'" + linkName + "')]");

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(link));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).perform();
	}

	public void clickNavLink(String linkName) {
		By link = By.xpath("//div[contains(text(),'" + linkName + "')]");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(link));
		element.click();
	}

	public void clickButtonLink(String buttonName) {
		By button = By.xpath("//a[contains(text(),'" + buttonName + "')]");
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(button));

		element.click();
	}
}