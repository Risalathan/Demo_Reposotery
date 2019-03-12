package com.TheGreatCourses.Pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.TheGreatCourses.StepDef.Hooks;

public class HomePage extends Hooks {
	final static Logger logger = Logger.getLogger(HomePage.class);
	//private String homepageURL = "http://www.thegreatcourses.com/";

	public HomePage goto_theGreatCoursesWebsite() {
		driver.get("http://www.thegreatcourses.com/");
		String actualPageTitle = driver.getTitle();
		System.out.println("Website title: " + actualPageTitle);
		assertEquals(actualPageTitle, "Online Courses & Lectures for Home Study and Lifelong Learning");
		return this;
	}

	public HomePage click_CategoryScience() throws Exception {
		// locating navigation next icon
		/*WebElement navElem = driver.findElement(By.cssSelector(
				"div.itemslider-wrapper:nth-child(4) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
		for (int i = 1; i <=3; i++) {
			navElem.click();
			myLib.customWait(0.5);
		}*/
		// select the science category
		WebElement scienceElem = driver
				.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div[1]/div[3]/div/div/ul/li[2]/a/img[1]"));
		myLib.highlightElement(scienceElem);
		myLib.clickInvisibleWebElement(scienceElem);
  
		return this;
	}
	
	public HomePage click_musice() throws Exception {
		// locating navigation next icon
		WebElement navElem = driver.findElement(By.cssSelector(
				"div.itemslider-wrapper:nth-child(4) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
		for (int i = 1; i <=3; i++) {
			navElem.click();
			myLib.customWait(0.5);
		}
		// select the science category
		WebElement scienceElem = driver
				.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div[1]/div[3]/div/div/ul/li[9]/a/img[1]"));
		myLib.highlightElement(scienceElem);
		myLib.clickInvisibleWebElement(scienceElem);
        //li.category-slide:nth-child(12) > a:nth-child(1) > img:nth-child(1)
		return this;
	}
	
	
}