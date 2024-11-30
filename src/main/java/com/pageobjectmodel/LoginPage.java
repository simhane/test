package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	
	
	@FindBy(id = "username")
	private WebElement user;
	

	@FindBy(id = "password")
	private WebElement pass;
	
	
	@FindBy(id = "login")
	private WebElement loginbtn;
	
	
	
	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	public LoginPage(WebDriver driver1) {
		
		driver=driver1;
		
		PageFactory.initElements(driver, this);
		
		 
		
		
		
	}



}
