package com.entrata.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntrataDemoPage {

	WebDriver driver;

	WebDriverWait wait;

	public EntrataDemoPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void enterInputData(String fieldName, String fieldData) {
		WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(fieldName)));
		inputElement.sendKeys(fieldData);
	}

	public void enterSelectData(String fieldName, String fieldData) {
		WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(fieldName)));

		Select select = new Select(selectElement);
		select.selectByVisibleText(fieldData);

	}

}
