package com.TheGreatCourses.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.TheGreatCourses.StepDef.Hooks;

public class ScienceCoursesPage extends Hooks{

	public ScienceCoursesPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.className("category-products"));
		Assert.assertNotNull(elem);
		return this;
	}
	
	public ScienceCoursesPage select_A_Course()
	{
		List<WebElement> products = driver.findElements(By.className("product-name"));
		for(WebElement singleCourse : products)
		{
			if(singleCourse.getText().contains("Our Night Sky"))
			{
				singleCourse.click();
				break;
			}
		}
		return this;
	}
	
/*	//////////////// helper method section //////////////////////
	private void click_Course(String courseTitleNameText)
	{
		List<WebElement> products = driver.findElements(By.className("product-name"));
		for(WebElement singleCourse : products)
		{
			if(singleCourse.getText().contains(courseTitleNameText))
			{
				singleCourse.click();
				break;
			}
		}
	}

	*/

	
}




















