package com.extentreports;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {

	@Test
	public void extentreport() throws IOException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); // html file will be generated
		ExtentSparkReporter faliedspark = new ExtentSparkReporter("failed-tests-index.html").filter().statusFilter()
				.as(new Status[] { Status.FAIL }).apply(); // to get only failed test cases
		faliedspark.config().setDocumentTitle("Failed Reports");

		extent.attachReporter(spark, faliedspark);

		/*
		 * final File CONF = new File("extent.json"); spark.loadJSONConfig(CONF);
		 * 
		 * final File CONF = new File("extent"); spark.loadXMLConfig(CONF);
		 */

		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation");
		spark.config().setReportName("Extent Reports");

		ExtentTest test = extent.createTest("Login Test").assignAuthor("Raghavendra").assignCategory("Smoke")
				.assignDevice("chrome"); // test node
		test.pass("app is opened "); // steps node
		test.info("user name is entered");
		test.info("pwd is entered");
		test.pass("logged in successfully");

		ExtentTest test1 = extent.createTest("Home Page").assignAuthor("Raghavendra").assignCategory("Regression"); // test
																													// node

		test1.pass("Home page is visible "); // steps node
		test1.info("KYC is diplaying");
		test1.info("Menu is available");
		test1.pass("Profile is visible");
		test1.fail("chips not visible");

		extent.flush();

		Desktop.getDesktop().browse(new File("index.html").toURI()); // to open reports automatically
		Desktop.getDesktop().browse(new File("failed-tests-index.html").toURI());

	}

}
