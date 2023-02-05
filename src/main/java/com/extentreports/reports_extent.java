package com.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public final class reports_extent {

	private void extentReport() {
	}

	private static ExtentReports extent;
	public static  ExtentTest test;

	public static void initReport() {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); // html file will be generated
		ExtentSparkReporter faliedspark = new ExtentSparkReporter("failed-tests-index.html").filter().statusFilter()
				.as(new Status[] { Status.FAIL }).apply();
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation");
		spark.config().setReportName("Extent Reports");

	}

	public static void flushReports() throws IOException {

		extent.flush();

		Desktop.getDesktop().browse(new File("index.html").toURI()); // to open reports automatically
		Desktop.getDesktop().browse(new File("failed-tests-index.html").toURI());

	}
	
	public static void createTestcase( String TestcaseName) {
		
		
	 test= 	extent.createTest(TestcaseName);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
