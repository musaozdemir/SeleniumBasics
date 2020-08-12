package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement daysDD = driver.findElement(By.id("select-demo"));
		Select select = new Select(daysDD); // id we have select tag in ispaction we can use select Class.
		select.selectByIndex(2); // selecting 1.way = by index
		Thread.sleep(1500);
		select.selectByVisibleText("Wednesday"); // selecting 2.way = by visiableText
		Thread.sleep(1500);
		select.selectByValue("Saturday"); // selecting 3.way = by Value
		
		Thread.sleep(2000);
		
		
		List<WebElement> options =select.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1500);
		}
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}	
}
