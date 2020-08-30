package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropDemo {
	
		public static String url = "https://jqueryui.com/droppable/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
//		action.clickAndHold(draggable).moveToElement(droppable).release().build().perform(); //long way
		action.dragAndDrop(draggable, droppable).perform(); //shoter way
		driver.navigate().refresh();
		
		
	}

}
