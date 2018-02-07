package com.umbrella.Amazon.GenericTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;
import com.umbrella.Amazon.utilities.Java8andJava9;

public class Java8and9NewFeatures extends TestBase {
	
	Config config;
	GenericWebSites genericWebSites;
	Java8andJava9 javanew = new Java8andJava9();
	private final Logger log = LoggerHelper.getLogger(Java8and9NewFeatures.class);
	
	@Test
	public void verifyStreams() throws InterruptedException{
		log.info("This test is for verifyAjaxCall");
		log.info(Java8and9NewFeatures.class.getName()+ " method name verifyStreams " + "Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		
	}
	
	@Test
	public void verifyLambdaExpression() throws InterruptedException{
		log.info("This test is for verifyAjaxCall");
		log.info(Java8and9NewFeatures.class.getName()+ " method name verifyLambdaExpression " + "Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		javanew.printusingLambda();
	}
	

}
