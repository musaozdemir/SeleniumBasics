package com.syntax.class09;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalendar {
	
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		password.sendKeys("Hum@nhrm123");
		loginButton.click();
		
	
	
		WebElement leave = driver.findElement(By.linkText("Leave"));
		leave.click();
		
		WebElement leaveList = driver.findElement(By.id("menu_leave_viewLeaveList"));
		leaveList.click();
		
		WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
		fromCalendar.click();
		
		WebElement mDD = driver.findElement(By.className("class=\"ui-datepicker-month\""));
		Select monthDD = new Select(mDD);
		monthDD.deselectByVisibleText("Oct");
		
		WebElement yDD = driver.findElement(By.className("ui-datepicker-year"));
		Select yearDD = new Select(yDD);
		yearDD.deselectByVisibleText("2020");
				
		List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class = 'ui-datapicker-calendar']/tbody/tr/td"));
		for(WebElement fromdate:fromDates) {
			if(fromdate.getText().equals("15")) {
				fromdate.click();
				break;
			}
		}
				
	}
}
