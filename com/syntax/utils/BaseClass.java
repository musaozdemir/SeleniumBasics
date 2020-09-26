package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	/** 
	 *  this return navigates to hrms website
	 * @returnVB w333333
	 * @author musaozdemir
	 */

	public static WebDriver setUp() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		return driver;

	}
/**
 * this method will quit the browser
 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
