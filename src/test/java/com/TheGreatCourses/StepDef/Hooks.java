package com.TheGreatCourses.StepDef;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.TheGreatCourses.Library.Seleniumhelper;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

		final static Logger logger = Logger.getLogger(Hooks.class);
		
		public static WebDriver driver;
		public static  Seleniumhelper myLib;
		public static  Seleniumhelper path;
		

		@Before
		public void openBrowser() throws MalformedURLException {
			myLib = new Seleniumhelper(driver);
			driver =myLib.startChromeBrowser();		
		}

		@After
		public void embedScreenshot(Scenario scenario){
				if (scenario.isFailed()){
					try {
						scenario.write("Current Page URL is"  + driver.getCurrentUrl());
						byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					    scenario.embed(screenshot, "image/png");
					    
					    System.out.println("----We Are Taking Screenshot---------");
					    String ScreenshotExtent =myLib.captureScreenshot(scenario.getName(), "target/images/");
					    Reporter.addScreenCaptureFromPath(ScreenshotExtent, "Screenshot_Error");
					    
					
					 {
					}
					//myLib.captureScreenshot(result.getName(), "target/images/");
				}catch (WebDriverException somePlatformsDontSupportScreenshots) {
					System.err.println(somePlatformsDontSupportScreenshots.getMessage());
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
				    driver.close();
					driver.quit();
				
			}
		}

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
