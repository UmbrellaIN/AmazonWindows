package com.umbrella.Amazon.GuiTests;

import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;

//document.getElementById()	Returns the element that has the ID attribute with the specified value
//document.getElementsByClassName()	Returns a NodeList containing all elements with the specified class name
//document.getElementsByName()	Returns a NodeList containing all elements with a specified name
//document.getElementsByTagName()	Returns a NodeList containing all elements with the specified tag name

public class VerifyVideoStreaming extends TestBase {

	Config config;
	GenericWebSites generic;

	private static final Logger log = LoggerHelper.getLogger(VerifyVideoStreaming.class);

	@Test
	public void verifyYouTube() throws InterruptedException {
		// http://www.excel-easy.com/data-analysis/charts.html
		log.info(VerifyVideoStreaming.class.getName() + " Method verifyYouTube " + " Get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		//generic.youTubeSearchButton();
		//generic.getFirstVideo();
		//generic.variousvideoOperation();
		//generic.getReadYStateofVideo();
		generic.skipAdd();

	}

}
