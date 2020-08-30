package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTabe {

	public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fdefault.aspx";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id= 'ctl00_MainContent_orderGrid']/tbody/tr"));

		System.out.println("number of rows: " + rows.size());

		for (int i = 0; i < rows.size(); i++) {
			if (i > 0) {
				String rowText = rows.get(i).getText();

				System.out.println(rowText);

				if (rowText.contains("Bob Feather")) {
					driver.findElements(By.xpath("//table[@id= 'ctl00_MainContent_orderGrid']/tbody/tr/td[1]"))
							.get(i-1).click();
					break;

				}
			}
		}
//		Thread.sleep(10000);
//		driver.close();

	}
}
