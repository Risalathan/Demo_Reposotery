package com.TheGreatCourses.Pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.TheGreatCourses.StepDef.Hooks;

public class CountLinkpage extends Hooks {
	final static Logger logger = Logger.getLogger(HomePage.class);
	//private String homepageURL = "http://www.thegreatcourses.com/";

	public CountLinkpage goto_theGreatCoursesWebsite() {
		driver.get("http://www.thegreatcourses.com/");
		String actualPageTitle = driver.getTitle();
		System.out.println("Website title: " + actualPageTitle);
		assertEquals(actualPageTitle, "Online Courses & Lectures for Home Study and Lifelong Learning");
		return this;
	}
	
	public CountLinkpage CountTotalLinkontheCoursesWebsite() {
		
		return this;
	}	
	
	
	
}
