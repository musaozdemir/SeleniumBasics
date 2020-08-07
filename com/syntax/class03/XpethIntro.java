package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpethIntro {

	//https://slack-redir.net/link?url=http%3A%2F%2Fsecure.smartbearsoftware.com%2Fsamples%2FTestComplete11%2FWebOrders%2Fdefault.aspx
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://slack-redir.net/link?url=http%3A%2F%2Fsecure.smartbearsoftware.com%2Fsamples%2FTestComplete11%2FWebOrders%2Fdefault.aspx\n");
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id ='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	
	}
	
	
	
}
