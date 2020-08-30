package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllerts {
	
	public static String url = "http://www.uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {
		
			

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			WebElement simpleAlertButton = driver.findElement(By.id("alert"));
			simpleAlertButton.click();
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			
			
			WebElement confirmationAlertButton = driver.findElement(By.id("confirm"));
			confirmationAlertButton.click();
			
			String confirmAllertText = alert.getText();
			System.out.println(confirmAllertText);
			Thread.sleep(2000);
			alert.dismiss();
			
			
			WebElement prompAlertButton = driver.findElement(By.id("prompt"));
			prompAlertButton.click();
			Thread.sleep(3000);
			
			alert.sendKeys("Syntaxxxxxxxx");
			Thread.sleep(3500);
			alert.accept();
			
			
			
			
			
			Thread.sleep(10000);
			driver.quit();
			
	}

}
