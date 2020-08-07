package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		
//		http://166.62.36.207/syntaxpractice/index.html
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		driver.findElement(By.cssSelector("a#btn_basic_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#btn_inter_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text() = 'Input Form with Validations'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Musa");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ozdemir");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("musaozdemir.com");

		
		Thread.sleep(5000);
		driver.close();
		
	}
}
