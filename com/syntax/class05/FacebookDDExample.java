package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDDExample {

	
	public static String url = "https://www.facebook.com/r.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Mick");
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id ='password_step_input']")).sendKeys("abcd1234");
		
		
		List<WebElement> genderBox = driver.findElements(By.xpath("//input[@name ='sex']"));
		
		for(WebElement gender:genderBox) {
			String genderCheckBox = gender.getAttribute("Value");
			if(genderCheckBox.contentEquals("2")) {
				gender.click();
			
		}
		}
		
		

		WebElement  months= driver.findElement(By.id("month"));
		Select selectMoth =new Select(months);
		List<WebElement> optionsMonth =selectMoth.getOptions();
		if (optionsMonth.size() - 1 == 12) {
			System.out.println("Options of month size is correct");
		} else {
			System.out.println("Options of month size is NOT correct");
		}
		selectMoth.selectByVisibleText("Mar");
		
		WebElement  days= driver.findElement(By.id("day"));
		Select selectDay =new Select(days);
		List<WebElement> optionsDay =selectDay.getOptions();
		if (optionsDay.size() - 1 == 31) {
			System.out.println("Options of Day size is correct");
		} else {
			System.out.println("Options of Day size is NOT correct");
		}
		selectDay.selectByIndex(14);
		
		WebElement years= driver.findElement(By.id("year"));
		Select selectYears =new Select(years);
		List<WebElement> optionsYear =selectYears.getOptions();
		if (optionsYear.size() - 1 == 116) {
			System.out.println("Options of year size is correct");
		} else {
			System.out.println("Options of year size is NOT correct");
		}
		selectYears.selectByValue("1986");
				
		
		driver.findElement(By.id("u_0_14")).click();
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
