package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	public Book_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCard_Number() {
		return card_Number;
	}

	public WebElement getCard_Type() {
		return card_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingaddress;
	
	@FindBy(id="cc_num")
	private WebElement card_Number;
	
	@FindBy(id="cc_type")
	private WebElement card_Type;
	
	@FindBy(id="cc_exp_month")
	private WebElement exp_Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement ccvNumber;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	

}
