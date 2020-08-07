package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssIntro {
	
	
	//http://166.62.36.207/syntaxpractice/index.html
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://166.62.36.207/syntaxpractice/index.html");
	driver.findElement(By.cssSelector("a#btn_basic_example")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hi everyone. how are you today?");
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	driver.findElement(By.cssSelector("input#sum1")).sendKeys("66");
	driver.findElement(By.cssSelector("input#sum2")).sendKeys("34");
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
	Thread.sleep(4000);
	driver.quit();
	
	
	}
}
