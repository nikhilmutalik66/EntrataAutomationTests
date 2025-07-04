//package com.entrata.pages;
//
//
//public class BasePage {
//	protected WebDriver driver;
//	protected WebDriverWait wait;
//	private static final Logger logger = LogManager.getLogger(BasePage.class);
//
//	public BasePage(WebDriver driver) {
//		this.driver = driver;
//		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		PageFactory.initElements(driver, this);
//	}
//
//	public String getPageTitle() {
//		String title = driver.getTitle();
//		logger.info("Current page title: {}", title);
//		return title;
//	}
//
//	public void navigateTo(String url) {
//		logger.info("Navigating to URL: {}", url);
//		driver.get(url);
//	}
//
//	protected void clickElement(By locator, String elementName) {
//		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
//		logger.info("Clicked on {} element located by: {}", elementName, locator);
//	}
//
//	protected void sendKeysToElement(By locator, String text, String elementName) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
//		logger.info("Entered text '{}' into {} element located by: {}", text, elementName, locator);
//	}
//
//	protected String getElementText(By locator, String elementName) {
//		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
//		logger.info("Retrieved text '{}' from {} element located by: {}", text, elementName, locator);
//		return text;
//	}
//
//	protected boolean isElementDisplayed(By locator, String elementName) {
//		try {
//			boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
//			logger.info("{} element located by {} is displayed: {}", elementName, locator, displayed);
//			return displayed;
//		} catch (org.openqa.selenium.TimeoutException | org.openqa.selenium.NoSuchElementException e) {
//			logger.warn("{} element located by {} is not displayed. Error: {}", elementName, locator, e.getMessage());
//			return false;
//		}
//	}
//}