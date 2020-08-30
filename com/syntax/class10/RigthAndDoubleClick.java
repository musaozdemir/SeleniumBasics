package com.syntax.class10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigthAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
	
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rigthClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(rigthClickButton).perform();
		WebElement edit = driver.findElement(By.xpath("//span[text() = 'Edit']"));
		action.click(edit).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		action.doubleClick(doubleClickButton).perform();
		Thread.sleep(2000);
		alert.accept();
		
		
	
	
	}
}
