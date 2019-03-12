package com.TheGreatCourses.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)

@CucumberOptions(
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:output/report.html", 
			"pretty","html:reports/test-report"},
	
	tags="@login",
	glue= "com.TheGreatCourses.StepDef",
	features = "classpath:features",
	monochrome = true
	)
 
 


public class Runnertest {

}
