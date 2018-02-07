package com.umbrella.Amazon.GuiTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;
/*
You can integrate this colour-verification code in your existing test cases. So there is no need to maintain the separate test cases for colour verification of Elements
You can verify the colour changing scenarios while hovering the mouse on Elements
You can verify the colours of the messages (like error message, warning message, some information, etc.)
First of all, we have to get the value of colour using getCssValue method provided by Selenium Webdriver.*/

public class VerifyColor extends TestBase {

	Config config;
	GenericWebSites generic;
	private static final Logger log = LoggerHelper.getLogger(VerifyColor.class);

	@Test
	public void verifytextcolor() throws InterruptedException {
		log.info(VerifyColor.class.getName() + " Method verifytextcolor get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		generic.getcolorforWebelement();
		log.info("I m closing verifyColor");
	}

	@Test
	public void verifyMessageColor() throws InterruptedException {
		log.info(VerifyColor.class.getName() + " Method verifyMessageColor get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
	}

	@Test
	public void verifyBackGroundcolor() throws InterruptedException {
		log.info(VerifyColor.class.getName() + " Method verifyBackGroundcolor get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		//generic.getcolorforBackGroundWebelement();
		generic.simplemethodtogetBackgroundColor();

	}

}
