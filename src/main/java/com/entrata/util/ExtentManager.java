package com.entrata.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports createInstance() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
        reporter.config().setDocumentTitle("Entrata Automation Report");
        reporter.config().setReportName("Entrata Functional Tests");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}
