package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_hotel {
	
	public static WebDriver driver;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id ="room_nos")
	private WebElement rooms;
	
	@FindBy(id ="datepick_in")
	private WebElement checkin;
	
	@FindBy(id ="datepick_out")
	private WebElement checkout;
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public search_hotel(WebDriver driver1) {
		
		driver=driver1;
		
		PageFactory.initElements(driver, this);
		
		
		
	}

}
