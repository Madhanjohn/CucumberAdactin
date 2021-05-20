package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adaction.helper.File_Reader_Manager;
import com.base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adaction//feature",
glue="com.adactin.stepdefinition",
monochrome = true,
dryRun = false ,
strict = true ,
tags = ("@smokeTest,@sanityTest"),
plugin = {"html:Report/Html_Report",
			"pretty",
			"json:Reports/Cucumber.json",
			"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
}
		)
public class Test_Runner {
	
	public static WebDriver driver; // nulll
	
	@BeforeClass
	public static void set_Up() throws Exception {
		String browser = File_Reader_Manager.getInstace().getInstaceCR().getBrowser();
		driver = BaseClass.getProperty(browser);
		
	}
	public static void tear_Down() {
		driver.close();
	}	
}
