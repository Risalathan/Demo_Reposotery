package com.TheGreatCourses.StepDef;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.TheGreatCourses.Library.Seleniumhelper;
import com.TheGreatCourses.Pages.ChooseProductFormatPage;
import com.TheGreatCourses.Pages.HomePage;
import com.TheGreatCourses.Pages.ScienceCoursesPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {
	final static Logger logger = Logger.getLogger(HomepageSteps.class);
	public static HomePage homepage;
	public static ScienceCoursesPage sciencecoursespage;
	public static ChooseProductFormatPage chooseproductformatpage;

	public WebDriver driver;
	public Seleniumhelper myLib;

	public HomepageSteps() {
		driver = Hooks.driver;
		myLib = Hooks.myLib;

	}

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		HomePage homepage = new HomePage();
		homepage.goto_theGreatCoursesWebsite();

	}

	@When("^I choose section$")
	public void i_choose_section() throws Throwable {
		HomePage homepage = new HomePage();
		homepage.click_CategoryScience();
	}

	@When("^I check for the \"([^\"]*)\" in step$")
	public void i_check_for_the_in_step(String section) throws Throwable {
		HomePage homepage = new HomePage();
		homepage.click_CategoryScience();
	}

	@Then("^I nevegete to next page$")
	public void i_nevegete_to_next_page(DataTable arg1) throws Throwable {
		ScienceCoursesPage sciencecoursespage = new ScienceCoursesPage();
		sciencecoursespage.waitUntilPageLoadComplete();
	}
	
	@And("^I am on the Science page$")
	public void I_am_on_the_Science_page()  {
		ScienceCoursesPage sciencecoursespage = new ScienceCoursesPage();
		sciencecoursespage.select_A_Course();
	}
	
    
	
	
	
	
}
