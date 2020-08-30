package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static String url = "http://166.62.36.207/syntaxpractice/bootstrap-iframe.html";
	
	public static void main(String[] args) throws InterruptedException {
		
			

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@src ='./index.html']"));
			driver.switchTo().frame(iframe); // switch with element
			WebElement logo = driver.findElement(By.id("hide"));
			boolean isLogoDisplayed = logo.isDisplayed();
			System.out.println("is Logo enabled? "+isLogoDisplayed);

			
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("FrameTwo");
			WebElement enrollTodayButton = driver.findElement(By.cssSelector("a.enroll-btn"));
			boolean isButtonEnabled = enrollTodayButton.isDisplayed();
			System.out.println("Enroll today botton is enabled? "+isButtonEnabled);
			enrollTodayButton.click();
			
			
			
			
			driver.switchTo().defaultContent();
			
			
			Thread.sleep(10000);
			driver.quit();
			
	}
}
