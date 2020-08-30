package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

//	Go to https://demoqa.com/browser-windows
//	click on New Tab and print the text from new tab in the console
//	click on New Window and print the text from new window in the console
//	click on New Window Message and print the text from new window in the console
//	Verify the title is displayed
//	Print out the title of the main page

	public static String url = "https://demoqa.com/browser-windows";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String mainPageHandle = driver.getWindowHandle(); 
		System.out.println(mainPageHandle);
		
		driver.findElement(By.xpath("//button[@id ='tabButton']")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> allWindowsHandle = driver.getWindowHandles();
		System.out.println(allWindowsHandle.size());
		
		Iterator<String> it = allWindowsHandle.iterator();
		while(it.hasNext()) {
			String childHandle = it.next();
			if(!childHandle.equals(mainPageHandle)) { 
				driver.switchTo().window(childHandle);
				System.out.println(childHandle);
				Thread.sleep(2000);
				
		
				driver.close();
			}
			
		}
		
		
		
		
		
//		String newTabPageHandle = driver.getWindowHandle(); 
//		driver.switchTo().window(newTabPageHandle);
//		System.out.println(newTabPageHandle);
//		String newTabText = driver.findElement(By.id("//h1[@id ='sampleHeading']")).getText();
//		System.out.println(newTabText);
//		
//		driver.switchTo().window(mainPageHandle);
//		
//		
//		Thread.sleep(60000);
//		driver.quit();
//		
		
		
		
		
		
		
		

	}

}
