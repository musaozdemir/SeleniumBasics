package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAmazonDD {
	public static String url = "http://www.amazon.com";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		
		WebElement catagoriesDD = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(catagoriesDD);
		
		List<WebElement> options=select.getOptions();
		
		for(WebElement option : options) {
			String text = option.getText();
			System.out.println(text);	
		}
		
		select.selectByValue("search-alias=mobile");
	
	
	
		
		Thread.sleep(10000);
		driver.quit();
	}
}
