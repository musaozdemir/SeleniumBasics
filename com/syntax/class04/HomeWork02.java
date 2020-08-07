package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {

	// Enter valid username and password (username - Admin, password - Hum@nhrm123)

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();

		WebElement errorMessage = driver.findElement(By.xpath("//span[@id= 'spanMessage']"));

		String errorText = errorMessage.getText();

		if (errorMessage.isDisplayed()) {
			if (errorText.contentEquals("Password cannot be empty")) {
				System.out.println("correct error message with true user name and empty password");

			} else {
				System.out.println("wrong error message with true user name and empty password");
				System.out.println(errorMessage.isEnabled());
			}
		}
		
		System.out.println(errorMessage.isEnabled());
		System.out.println(errorMessage.isSelected());
		driver.quit();

	}

}
