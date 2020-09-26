package com.syntax.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
//	http://www.uitestpractice.com/Students/Index
	

	public static String url = "http://www.uitestpractice.com/Students/Index";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

	List<WebElement> table = driver.findElements(By.xpath("//table[@class= 'table']/tbody/tr"));
	System.out.println(table.size());
	
	for (WebElement webElements : table) {
		System.out.println(webElements.getText());
	}
	
	
	
	
	
	
	
	
	
	driver.quit();
	
	}
}
