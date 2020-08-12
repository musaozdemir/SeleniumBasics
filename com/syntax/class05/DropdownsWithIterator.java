package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsWithIterator {

	public static String url = "http://www.amazon.com";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement catagoriesDD = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(catagoriesDD);
		List<WebElement> options=select.getOptions();
		Iterator<WebElement> iT = options.iterator();
		while(iT.hasNext()){
			WebElement option = iT.next();
			String optionText = option.getText();
			System.out.println(optionText);
		}
		
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
	
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
