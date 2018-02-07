package com.umbrella.Amazon.GuiTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.JavaScriptHelper;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;

public class VerifyJavaScript extends TestBase {

	Config config;
	JavaScriptHelper javascript;
	private static final Logger log = LoggerHelper.getLogger(VerifyJavaScript.class);

	@Test
	public void verifyVariuosJavaScriptuses() {
		log.info(VerifyJavaScript.class.getName() + " started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		javascript = new JavaScriptHelper(driver);
		// To type Text in Selenium WebDriver without using sendKeys() method
		//generic.enterTextUsingJavaScript();
		
	    //to click a button in Selenium WebDriver using JavaScript
		//javascript.clickOnButtonJavaScript();
		
		//To Handle Check Box
		//javascript.checkBoxJavaScript();
		
		
		//To Generate AlertBox
		//javascript.generateAlertBox();
		
		//Refresh Browser
		//javascript.refreshBrowserUsingJS();
		
		//return InnerText
		//javascript.getInnerTextUsingjavaScript();
		
		//to get the Page Domain
		//javascript.getPageDomainJs();

		//to get the Page URL
		//javascript.getPageURLUsingJs();
		
		//mouseHover Using JavaScript
		//javascript.mouseHoverUsingJS();
		
		//mouseHover Using JavaScript
		javascript.navigateURLusingJS();
	}

}
