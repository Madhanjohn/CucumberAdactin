package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
public static WebDriver driver;
	
	public Booked_Itinerary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement booked_Itinery;
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getBooked_Itinery() {
		return booked_Itinery;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
