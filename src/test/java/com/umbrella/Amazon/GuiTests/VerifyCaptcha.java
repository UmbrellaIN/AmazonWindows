package com.umbrella.Amazon.GuiTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;
/*
https://sqa.stackexchange.com/questions/25631/how-to-handle-captcha-in-selenium-webdriver
https://sqa.stackexchange.com/questions/12416/automation-and-bypassing-google-no-captcha-recaptcha
https://stackoverflow.com/questions/18935696/how-to-read-the-text-from-image-captcha-by-using-selenium-webdriver-with-java
http://revan28.lima-city.de/death_by_captcha/readme.html
https://stackoverflow.com/questions/25491953/how-to-handle-online-captchas-in-webdriver
http://tech.chitgoks.com/2012/02/16/how-to-use-death-by-captcha-in-java-with-url-captcha-images/
	*/
public class VerifyCaptcha extends TestBase {

	Config config;
	GenericWebSites generic;
	private static final Logger log = LoggerHelper.getLogger(VerifyColor.class);

	@Test
	public void verifyCaptchausingOCRARPISEAPI() throws InterruptedException {
		log.info(VerifyColor.class.getName() + " Method verifytextcolor get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		generic.getcolorforWebelement();
		log.info("I m closing verifyColor");
	}

	@Test
	public void DeathbycapthcaAPI() throws InterruptedException {
		log.info(VerifyColor.class.getName() + " Method verifytextcolor get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		generic.getcolorforWebelement();
		log.info("I m closing verifyColor");
	}

}
