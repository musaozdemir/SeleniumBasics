package com.syntax.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPagewithFindBy;
import com.syntax.utils.BaseClass;

public class LoginTestwithFindBy {
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		
		LoginPagewithFindBy login= new LoginPagewithFindBy();
		DashboardPage dashboard = new DashboardPage();
		
		login.usernameTextBox.sendKeys("Admin");
		login.passwordTextBox.sendKeys("Hum@nhrm123");
		login.loginButton.click();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File( "screenshots/HRMS/welcomePages"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String admintext = dashboard.welcomeAdmin.getText();
		System.out.println(admintext);
		
		BaseClass.tearDown();
		
		
	}

}
