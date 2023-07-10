package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"./src/test/java/features"},
		glue = {"stepDefinitions", "com.cucumber.hook"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:reports/cucumberReports.html", "json:reports/JSONReports.json" ,
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				 }
//		,
		
//		tags = "@integrationScenario"
		)

public class CcumberRunner extends AbstractTestNGCucumberTests {
	
	

}
