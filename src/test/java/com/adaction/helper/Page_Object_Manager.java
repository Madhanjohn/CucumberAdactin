package com.adaction.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pomclass.Book_Hotel;
import com.pomclass.Booked_Itinerary;
import com.pomclass.Booking_Conformation;
import com.pomclass.Login_Page;
import com.pomclass.SearchHotel;
import com.pomclass.Select_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page login;
	
	private SearchHotel search;
	
	private Select_Hotel select_Hotell;
	
	private Book_Hotel book;
	
	private Booking_Conformation booking_conform;
	
	private Booked_Itinerary book_Itein;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getInstaceLogin() {
		login = new Login_Page(driver);
		return login;
	}
	
	public SearchHotel getInstanceSearch() {
		search = new SearchHotel(driver);
		return search;
	}
	
	public Select_Hotel getInstaceSelect() {
		select_Hotell = new Select_Hotel(driver);
		return select_Hotell;
	}
	
	public Book_Hotel getInstaceBook() {
		book = new Book_Hotel(driver);
		return book;
	}
	
	public Booking_Conformation getInstaceConfromm() {
		booking_conform = new Booking_Conformation(driver);
		return booking_conform;
	}
	
	public Booked_Itinerary getInstanceItinerary() {
		book_Itein = new Booked_Itinerary(driver);
		return book_Itein;
	}

}
