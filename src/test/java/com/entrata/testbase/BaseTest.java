package com.entrata.testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.entrata.util.ExtentManager;
import com.entrata.util.ScreenshotUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
	protected WebDriver driver;
	protected static ExtentReports extent;
	protected static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@BeforeSuite
	public void startExtent() {
		extent = ExtentManager.createInstance();
	}

	@AfterSuite
	public void endExtent() {
		extent.flush();
	}

	@BeforeMethod
	public void setup(Method method) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ExtentTest extentTest = extent.createTest(method.getName());
		test.set(extentTest);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = ScreenshotUtil.takeScreenshot(driver, result.getName());
			test.get().fail(result.getThrowable());
			test.get().addScreenCaptureFromPath(path);
		}
		driver.quit();
	}

	public void log(String msg) {
		test.get().info(msg);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
