
package com.umbrella.Amazon.generics;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Bhanu Pratap https://www.youtube.com/user/MrBhanupratap29/playlists
 * 
 *         Syntax: JavascriptExecutor js = (JavascriptExecutor) driver;
 *         js.executeScript(Script,Arguments);
 * 
 *         Script – The JavaScript to execute Arguments –The arguments to the
 *         script(Optional). May be empty. Returns –One of Boolean, Long,
 *         String, List, WebElement, or null.
 * 
 */
public class JavaScriptHelper {

	private WebDriver driver;
	private Logger Log = LoggerHelper.getLogger(JavaScriptHelper.class);

	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
		Log.debug("JavaScriptHelper : " + this.driver.hashCode());
	}

	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Log.info(script);
		return exe.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Log.info(script);
		return exe.executeScript(script, args);
	}

	public void scrollToElemet(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
		Log.info(element);
	}

	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();
		Log.info(element);
	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);
		Log.info(element);
	}

	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
		Log.info(element);
	}

	public void scrollDownVertically() {
		executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollUpVertically() {
		executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	public void scrollDownByPixel() {
		executeScript("window.scrollBy(0,1500)");
	}

	public void scrollUpByPixel() {
		executeScript("window.scrollBy(0,-1500)");
	}

	public void ZoomInBypercentage() {
		executeScript("document.body.style.zoom='40%'");
	}

	public void ZoomBy100percentage() {
		executeScript("document.body.style.zoom='100%'");
	}

	/**
	 * Clicks on an element that is visible or not. This is useful instead of
	 * when we are not sure if the element is displayed or not.
	 *
	 * @param element
	 *            Web element.
	 */
	public void jsClick(WebElement element) {
		((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", element);
	}

	/*
	 * we can just use element.click() method to click on any element. But
	 * sometimes, when there are any issues performing click on any element, we
	 * can use JavaScriptExecutor.
	 */

	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getStackTrace());
		}
	}

	public void enterTextUsingJavaScript() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('pass').value='SoftwareTestingMaterial.com';");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnButtonJavaScript() {
		WebElement loginbutton = driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", loginbutton);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void checkBoxJavaScript() {
		// to handle checkbox
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('enter element id').checked=false;");
	}

	public void generateAlertBox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("alert('hello world');");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void refreshBrowserUsingJS() {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Log.info("Refreshing The Browser");
			Thread.sleep(3000);
			jse.executeScript("history.go(0)");

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getInnerTextUsingjavaScript() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String sText = jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
	}

	public void getPagetitleUsingJs() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String sText = jse.executeScript("return document.title;").toString();
		System.out.println(sText);
	}

	public void getPageDomainJs() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String sText = jse.executeScript("return document.domain;").toString();
		System.out.println(sText);
	}

	public void getPageURLUsingJs() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String sText = jse.executeScript("return document.URL;").toString();
		System.out.println(sText);
	}

	public void mouseHoverUsingJS() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("$('a.nav-a nav-a-2').hover()");

	}
	
	public void navigateURLusingJS()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.location = 'https://www.softwaretestingmaterial.com");
	}

}
