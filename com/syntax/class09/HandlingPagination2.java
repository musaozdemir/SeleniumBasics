package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPagination2 {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		password.sendKeys("Hum@nhrm123");
		loginButton.click();
		Thread.sleep(2000);
		WebElement pim = driver.findElement(By.linkText("PIM"));
		pim.click();
		WebElement addemployee = driver.findElement(By.id("menu_pim_addEmployee"));
		addemployee.click();
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		firstName.sendKeys("Ali");
		lastName.sendKeys("Nazarow");
		
		WebElement eployeeId = driver.findElement(By.id("employeeId"));
		String empId = eployeeId.getAttribute("value");
		
		WebElement saveButton = driver.findElement(By.id("btnSave"));
		saveButton.click();
		
		WebElement employeeList = driver.findElement(By.linkText("Employee List"));
		employeeList.click();

		WebElement sortByNameButton = driver.findElement(By.xpath("//a[contains(text(), 'First ')]"));
		sortByNameButton.click();

		boolean flag = true;
		while (flag) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
			for (int i = 0; i < rows.size(); i++) {
				String rowText = rows.get(i).getText();
				if (rowText.contains(empId)) {
					flag = false;
					WebElement checkBox = driver  //getting i from iteration and locating only the checkbox
							.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + i + "]/td[1]"));
					checkBox.click();
					WebElement delete = driver.findElement(By.id("btnDelete"));
					delete.click();
					WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
					confirmDelete.click();
					break;
				}
			}
			WebElement next = driver.findElement(By.linkText("Next"));
			next.click();
			
		}
	}

}
