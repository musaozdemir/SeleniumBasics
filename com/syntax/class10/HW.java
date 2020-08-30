package com.syntax.class10;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HW {

	public static String url = "https://artoftesting.com/samplesiteforselenium";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		String mainPageHandle = driver.getWindowHandle();

		WebElement simpleText = driver.findElement(By.xpath("//p[text() = 'This is sample text!']"));
		String text = simpleText.getText();
		System.out.println(text);

		WebElement link = driver.findElement(By.xpath("//a[text()= 'This is a link']"));
		link.click();
		driver.switchTo().window(mainPageHandle);

		WebElement textBox = driver.findElement(By.id("fname"));
		textBox.sendKeys("Hello World!");

		WebElement clickButton = driver.findElement(By.xpath("//button[@type = 'button']"));
		clickButton.click();

//	Thread.sleep(2000);
//
//	WebElement doubleClickBotton = driver.findElement(By.id("dblClkBtn"));
//	Actions action = new Actions(driver);
//	action.doubleClick(doubleClickBotton).perform();
//	Thread.sleep(4000);
//	Alert alert = driver.switchTo().alert();
//	alert.accept();

		List<WebElement> genderButton = driver.findElements(By.xpath("//input[@name = 'gender']"));

		for (WebElement genders : genderButton) {
			if (genders.isEnabled()) {
				String genderValue = genders.getAttribute("value");
				if (genderValue.contentEquals("male")) {
					genders.click();
					break;
				}
			}
		}

		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));

		for (WebElement checkbox : checkBoxes) {
			if (checkbox.isEnabled()) {
				String checkBoxValue = checkbox.getAttribute("value");
				if (checkBoxValue.contentEquals("Automation")) {
					checkbox.click();
					break;

				}
			}
		}

		WebElement DD = driver.findElement(By.id("testingDropdown"));
		Select select = new Select(DD);
		select.selectByValue("Manual");

		WebElement alertButton = driver.findElement(By.xpath("//button[text() = 'Generate Alert Box']"));
		alertButton.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement confirmBoxButton = driver.findElement(By.linkText("Generate Confirm Box"));
		confirmBoxButton.click();
		Alert alert2 = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		WebElement draggable = driver.findElement(By.xpath("//img[@id= 'sourceImage']"));
		WebElement droppable = driver.findElement(
				By.xpath("//div[@ondrop= 'if (!window.__cfRLUnblockHandlers) return false; drop(event)']"));

		Actions action = new Actions(driver);
		action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		action.dragAndDrop(draggable, droppable).perform();

		Thread.sleep(10000);
		driver.quit();

	}
}
