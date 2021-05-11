package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adaction//feature",
glue="com.adactin.stepdefinition")
public class Test_Runner {
	
	public static WebDriver driver; // nulll
	
	@BeforeClass
	public static void set_Up() {
		
		driver = BaseClass.getProperty("chrome");
		
	}
	public static void tear_Down() {
		driver.close();
	}	
}
