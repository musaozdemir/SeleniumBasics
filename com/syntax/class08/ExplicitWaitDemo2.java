package com.syntax.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
	public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		
		
		WebElement getNewUserButton = driver.findElement(By.id("startButton"));
		getNewUserButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(), 'Welcome')]")));
		WebElement testElement = driver.findElement(By.xpath("//h4[contains(text(), 'Welcome')]"));
		String text = testElement.getText();
		System.out.println(text);

	
		
	
		
	}

}
