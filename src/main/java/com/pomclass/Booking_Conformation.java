package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	
	public static WebDriver driver;
	
	public Booking_Conformation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(id="my_itinerary")
	private WebElement myitinery;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyitinery() {
		return myitinery;
	}
	
	
}
