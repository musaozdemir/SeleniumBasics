package com.syntax.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPagewithFindBy extends BaseClass{

	@FindBy(id ="txtUsername")
	public WebElement usernameTextBox;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement passwordTextBox;
	
	@FindBy(css = "input#btnLogin")
	public WebElement loginButton;
	
//	@FindBy(xpath = "//table[id= 'resultTable']/tbosy/tr")
//	public List<WebElement> table;
	
	public LoginPagewithFindBy() {
		PageFactory.initElements(driver, this );
	}
	
	
}
