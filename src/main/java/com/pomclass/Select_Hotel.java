package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	public Select_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id="radiobutton_0")
	private WebElement chooseHotel;
	
	@FindBy(id="continue")
	private WebElement continue_Button;

	public WebElement getContinue_Button() {
		return continue_Button;
	}

	public WebElement getChooseHotel() {
		return chooseHotel;
	}

	

}
