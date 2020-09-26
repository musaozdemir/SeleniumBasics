package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	
	//go to https://the-internet.herokuapp.com/dynamic_controls
	//click on checkbox and click on remove
	//verify the text
	//click on enable verify the textbox is enabled
	//enter text and click disable
	//verify the textbox is disabled
	
	public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input"));
		checkBox.click();

		Thread.sleep(5000);
		driver.close();

		
	
	
	}
	
}
