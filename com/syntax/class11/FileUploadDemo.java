package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {


	public static String url = "http://the-internet.herokuapp.com";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		WebElement fileUploadButton = driver.findElement(By.linkText("File Upload"));
		fileUploadButton.click();
		WebElement fileChoose = driver.findElement(By.id("file-upload"));
		fileChoose.sendKeys("/Users/musaozdemir/Desktop/YES.docx");
		WebElement uploadButton = driver.findElement(By.id("file-submit"));
		uploadButton.click();
		
		
		
	}
}
