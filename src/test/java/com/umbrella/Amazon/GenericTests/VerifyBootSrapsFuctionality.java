package com.umbrella.Amazon.GenericTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;

public class VerifyBootSrapsFuctionality extends TestBase{

	Config config;
	private static final Logger log = LoggerHelper.getLogger(VerifyAngularJSFuctionality.class);
	
	@Test
	public void test1()
	{
		log.info(VerifyAngularJSFuctionality.class.getName() + " Method test1 get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
	}
}
