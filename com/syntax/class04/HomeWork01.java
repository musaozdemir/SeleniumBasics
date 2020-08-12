package com.syntax.class04;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> genderBoxes = driver.findElements(By.xpath("//input[@name= 'gender']"));
		
		
		
		String SelectedGenderBox = null;	
		
		for (WebElement gender : genderBoxes) {

		
			if (gender.isEnabled()) {
				String genderCheckBox = gender.getAttribute("value");

				if (genderCheckBox.contentEquals("Male")) {
					gender.click();
					SelectedGenderBox=genderCheckBox;
				}
			}

		}

		List<WebElement> ageBoxes = driver.findElements(By.xpath("//input[@name= 'ageGroup']"));
		
		String SelectedAgeBox = null;
		for (WebElement ageOption : ageBoxes) {
			if (ageOption.isEnabled()) {
				String ageCheckBox = ageOption.getAttribute("value");
				if (ageCheckBox.contentEquals("15 - 50")) {
					ageOption.click();
					SelectedAgeBox=ageCheckBox;
				}

			}
		}
		
	
		
		driver.findElement(By.xpath("(//button[@class= 'btn btn-default'])[2]")).click();

		WebElement getValues = driver.findElement(By.xpath("//p[@class= 'groupradiobutton']"));
		
		if(getValues.isDisplayed()) {
			String outputOfGetValues = getValues.getText();
			
			System.out.println(outputOfGetValues);
			
			if (outputOfGetValues.contains(SelectedAgeBox) && outputOfGetValues.contains(SelectedGenderBox)) {
				System.out.println("output verified");
			} else {
				System.out.println("somethong wrong with output");
			}
			
		}
		
		
	
		
	}
}
