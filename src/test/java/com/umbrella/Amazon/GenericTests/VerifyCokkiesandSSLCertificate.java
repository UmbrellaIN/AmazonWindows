package com.umbrella.Amazon.GenericTests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.Amazon.PageFactory.GenericWebSites;
import com.umbrella.Amazon.generics.LoggerHelper;
import com.umbrella.Amazon.testCore.Config;
import com.umbrella.Amazon.testCore.TestBase;

/*An HTTP cookie is a small piece of data sent from a website and stored on the user's 
computer by the user's web browser while the user is browsing. 
2.1	Session cookie - svaed till the session ie rowser is not closed
2.2	Persistent cookie - saved utin a specfic amount of time
2.3	Secure cookie - A secure cookie can only be transmitted over an encrypted connection (i.e. HTTPS). 
2.4	HttpOnly cookie -An HttpOnly cookie cannot be accessed by client-side APIs, such as JavaScript.
2.5	SameSite cookie - 
2.6	Third-party cookie
2.7	Supercookie
2.7.1	Other uses
2.8	Zombie cookie
driver.manage().getCookies();   // Return The List of all Cookies
driver.manage().getCookieNamed(arg0);  //Return specific cookie according to name
driver.manage().addCookie(arg0);   //Create and add the cookie
driver.manage().deleteCookie(arg0);  // Delete specific cookie
driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according Name
driver.manage().deleteAllCookies();  // Delete all cookies
For example, when automating Online Shopping Application, you many need to automate test scenarios like place order, View Cart, Payment Information, order confirmation, etc.
If cookies are not stored, you will need to perform login action every time before you execute above listed test scenarios. This will increase your coding effort and execution time.
The solution is to store cookies in a File. Later, retrieve the values of cookie from this file and add to it your current browser session. As a result, you can skip the login steps in every Test Case because your driver session has this information in it.
The application server now treats your browser session as authenticated and directly takes you to your requested URL.
*/public class VerifyCokkiesandSSLCertificate extends TestBase {

	Config config;
	GenericWebSites genericWebSites;
	private final Logger log = LoggerHelper.getLogger(VerifyCokkiesandSSLCertificate.class);

	@Test
	public void verifycookies() throws InterruptedException {
		log.info("This test is for verifyAjaxCall");
		log.info(VerifyCokkiesandSSLCertificate.class.getName() + " method name verifycookies " + "Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		genericWebSites = new GenericWebSites(driver);
		genericWebSites.getCookieInformation();
	}
	
	@Test
	public void loginUsingCookieInformation() throws InterruptedException {
		log.info("This test is for loginUsingCookieInformation");
		log.info(VerifyCokkiesandSSLCertificate.class.getName() + " method name loginUsingCookieInformation " + "Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		genericWebSites = new GenericWebSites(driver);
		genericWebSites.authenticationUsingCookie();
		
	}

	@Test
	public void verifySSLCertificate() throws InterruptedException {
		log.info("This test is for verifyAjaxCall");
		log.info(VerifyCokkiesandSSLCertificate.class.getName() + " method name verifySSLCertificate " + "Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
	}
}
