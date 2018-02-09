package com.umbrella.Amazon.GenericTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;

/*SWF stands for Small Web Format. SWF files can contain video and vector based 
animations and sound and are designed for efficient delivery over the web.
Why Flash is Difficut to handle
Flash is an outdated technology.
the main difference between flash and other element is that Flash is embedded in SWF files, 
while other elements are embedded in HTML files. That's why HTML is easy to capture compared to flash.
This tag defines a container embedded in < object /> or < embed /> tags in an HTML ) for interactive content 
or external application. Object name is used to locate flash object on webpages.
*/
public class VerifyFlashObject extends TestBase {

	Config config;
	GenericWebSites generic;
	private static final Logger log = LoggerHelper.getLogger(VerifyFlashObject.class);

	@Test
	public void flashApplication() throws InterruptedException {
		log.info(VerifyFlashObject.class.getName() + " Method flashApplication get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		generic = new GenericWebSites(driver);
		generic.testFlashApps();
	}
}
