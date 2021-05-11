package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;
import com.base.BaseClass;
import com.pomclass.Book_Hotel;
import com.pomclass.Booked_Itinerary;
import com.pomclass.Booking_Conformation;
import com.pomclass.Login_Page;
import com.pomclass.SearchHotel;
import com.pomclass.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;
	public static Login_Page login = new Login_Page(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
			openLink("http://adactinhotelapp.com/");
	}

	@When("^user Enter The UserName In UserName Field$")
	public void user_Enter_The_UserName_In_UserName_Field() throws Throwable {
			inputValues(login.getUserName(), "Madhanjohn");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
			inputValues(login.getPassword(), "T02AP9");
	}

	@Then("^user Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(login.getLogin());
	}
	
	public static SearchHotel search = new SearchHotel(driver);
	
	
	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		selectText(search.getLocation(), "London", "value");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		selectText(search.getHotels(), "Hotel Creek", "value");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		selectText(search.getRoom_Type(), "Super Deluxe", "value");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		selectText(search.getRoom_Nos(), "3", "index");
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		inputValues(search.getCheck_In(), "11/05/2021");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		inputValues(search.getCheck_Out(), "12/05/2021");
	}

	@When("^user Select Adult Person Number Per Room$")
	public void user_Select_Adult_Person_Number_Per_Room() throws Throwable {
		selectText(search.getAdult_Room(), "3", "index");
	}

	@When("^user Select Children Person Number Per Room$")
	public void user_Select_Children_Person_Number_Per_Room() throws Throwable {
		selectText(search.getChild_Room(), "3", "index");
	}

	@Then("^user Click On The Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(search.getSubmit());
	}

	 public static Select_Hotel sel = new Select_Hotel(driver);
	
	@When("^user Select the Hotel$")
	public void user_Select_the_Hotel() throws Throwable {
		clickOnElement(sel.getChooseHotel());
	}

	@Then("^user Click On The Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(sel.getContinue_Button());
	}
	
	public static Book_Hotel book = new Book_Hotel(driver);
	
	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	    inputValues(book.getFirstName(), "Madhan");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	   inputValues(book.getLastName(), "John");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	    	inputValues(book.getBillingaddress(), "No 24, Kannapiran St, Old Pallavaram");
	}

	@When("^user Enter The Credit Card Number In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_No_Field() throws Throwable {
	    inputValues(book.getCard_Number(), "1234567890123456");
	}

	@When("^user Select Credit Card Type In Credit Card Type Field$")
	public void user_Select_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    selectText(book.getCard_Type(), "Master Card", "text");
	}

	@When("^user Select Expiry Date In Expiry Date Field$")
	public void user_Select_Expiry_Date_In_Expiry_Date_Field() throws Throwable {
	    selectText(book.getExp_Month(), "March", "text");
	}

	@When("^user Select Expiry Year In Expiry Year Field$")
	public void user_Select_Expiry_Year_In_Expiry_Year_Field() throws Throwable {
	   selectText(book.getExp_year(), "2022", "value");
	}

	@When("^user Enter the CVV Number In CVV Number Field$")
	public void user_Enter_the_CVV_Number_In_CVV_Number_Field() throws Throwable {
	   inputValues(book.getCcvNumber(), "123");
	}

	@Then("^user Click Book Now Button And It Navigate To Book Confirmation Page$")
	public void user_Click_Book_Now_Button_And_It_Navigate_To_Book_Confirmation_Page() throws Throwable {
	   clickOnElement(book.getBook());
	}
	
	public static Booking_Conformation book_Conform = new Booking_Conformation(driver);
	
	@Then("^user Click On The My Itinerary Button And It Navigate To Booked Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page() throws Throwable {
		Thread.sleep(5000);
		clickOnElement(book_Conform.getMyitinery());
	   
	}

	
	public static Booked_Itinerary book_Itinery = new Booked_Itinerary(driver);
	
	@When("^user Click On The Order Id Check Box In Order Id Field$")
	public void user_Click_On_The_Order_Id_Check_Box_In_Order_Id_Field() throws Throwable {
	   clickOnElement(book_Itinery.getBooked_Itinery());
	}

	@Then("^user Click On The Logout Button And It Succefully Logout From Adaction$")
	public void user_Click_On_The_Logout_Button_And_It_Succefully_Logout_From_Adaction() throws Throwable {
	   clickOnElement(book_Itinery.getLogout());
	}

}
