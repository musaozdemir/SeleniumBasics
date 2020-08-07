package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String actualTitle = driver.getTitle();
		String expectedtitle = "Web Orders";
		
		if(actualTitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("this is the rigth title");
		} else {
			System.out.println("this is the wrong title");
		}
		
		
		//		System.out.println(actualTitle);
		
		driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_logout")).click();
		
		
	}

}
