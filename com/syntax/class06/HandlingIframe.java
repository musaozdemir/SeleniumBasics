package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {
	
	public static String url = "http://www.uitestpractice.com/Students/Switchto";
	
	public static void main(String[] args) throws InterruptedException {
		
			

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			driver.switchTo().frame(0); // switch with 
			WebElement textBox = driver.findElement(By.id("name"));
			textBox.sendKeys("Syntax!!!");
			
			driver.switchTo().defaultContent();
			
			
			
			WebElement clickOnLinkText = driver.findElement(By.xpath("//h3[text() = 'click on the below link: ']"));
			String text = clickOnLinkText.getText();
			System.out.println(text);
			
			Thread.sleep(3000);
			
			driver.switchTo().frame("iframe_a"); // switch with text name
			textBox.clear();
			textBox.sendKeys("Banch 7!!!");
	
			
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@src ='/Demo.html']"));
			driver.switchTo().frame(iframe); // switch with element
			textBox.clear();
			textBox.sendKeys("How are you today?");
	
			
			
			Thread.sleep(10000);
			driver.quit();
			
	}

}
