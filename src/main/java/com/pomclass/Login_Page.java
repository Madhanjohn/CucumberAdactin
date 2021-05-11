package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement Password;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="login")
	private WebElement login;
	
}
