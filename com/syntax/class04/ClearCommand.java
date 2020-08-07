package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		WebElement userNameTextBox = driver.findElement(By.id("ctl00_MainContent_username"));
		userNameTextBox.sendKeys("Tester");

		WebElement passwordTextBox = driver.findElement(By.name("ctl00$MainContent$password"));
		passwordTextBox.sendKeys("test");	
		
		Thread.sleep(2000);

		
		WebElement loginButton = driver.findElement(By.className("button"));
		loginButton.click();
	
		
		WebElement logo = driver.findElement(By.xpath("//h1[text() ='Web Orders']"));
		String logoText = logo.getText();
		
		if(logo.isDisplayed()) {
			if(logoText.contentEquals("Web Orders")){
				System.out.println("This is the rigth logo");
			} else {
				System.out.println("This is the wrong logo");
			}
		}
		
		
//		userNameTextBox.clear();
//		Thread.sleep(3000);
//		passwordTextBox.clear();
		
//		Thread.sleep(6000);
//		driver.quit();
		
	}
}