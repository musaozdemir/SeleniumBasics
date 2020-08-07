package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Musa");
		driver.findElement(By.name("customer.lastName")).sendKeys("Ozdemir");
		driver.findElement(By.id("customer.address.street")).sendKeys("orlando florida 32810");
		driver.findElement(By.id("customer.address.city")).sendKeys("Orlando");
		driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("32810");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("407-222-33-44");
		driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
		driver.findElement(By.id("customer.username")).sendKeys("musaozdemir");
		driver.findElement(By.id("customer.password")).sendKeys("12345678");
		driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
