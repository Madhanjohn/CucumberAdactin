package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	public SearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_Type;
	
	@FindBy(id="room_nos")
	private WebElement room_Nos;
	
	@FindBy(id="datepick_in")
	private WebElement Check_In;
	
	@FindBy(id="datepick_out")
	private WebElement Check_Out;
	
	@FindBy(id="adult_room")
	private WebElement adult_Room;
	
	@FindBy(id="child_room")
	private WebElement child_Room;
	
	public WebElement getLocation() {
		return location;
	}

	

	public WebElement getHotels() {
		return hotels;
	}



	public WebElement getRoom_Type() {
		return room_Type;
	}



	public WebElement getRoom_Nos() {
		return room_Nos;
	}



	public WebElement getCheck_In() {
		return Check_In;
	}


	public WebElement getCheck_Out() {
		return Check_Out;
	}

	public void setCheck_Out(WebElement check_Out) {
		Check_Out = check_Out;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}



	public WebElement getChild_Room() {
		return child_Room;
	}

	

	public WebElement getSubmit() {
		return submit;
	}



	@FindBy(id="Submit")
	private WebElement submit;
	

}
