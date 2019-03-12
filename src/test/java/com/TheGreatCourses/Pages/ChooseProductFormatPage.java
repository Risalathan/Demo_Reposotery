package com.TheGreatCourses.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.TheGreatCourses.StepDef.Hooks;

public class ChooseProductFormatPage extends Hooks{
	
	public ChooseProductFormatPage waitUntilPageLoadComplete()
	{ 	
		WebElement elem = myLib.waitUntilPageLoadComplete(By.id("media-format-radio"));
		Assert.assertNotNull(elem);
		return this;
	}
	
	public ChooseProductFormatPage click_videoDownloadRadioBtn()
	{
				
		return this;
	}
	
}
