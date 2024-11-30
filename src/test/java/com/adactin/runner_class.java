package com.adactin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.baseclass;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.search_hotel;

public class runner_class extends baseclass {

	public static void main(String[] args) throws IOException, InterruptedException {

		browser("chrome");
		
		urllaunch("https://adactinhotelapp.com/");

		maximize();
	
		LoginPage p= new LoginPage(driver);
	    
	    inputelement(p.getUser(), "rollinss");
		
	    inputelement(p.getPass(), "8J90DG");

	    click(p.getLoginbtn());
	   
	   Thread.sleep(3000);
	   
	   search_hotel h=new search_hotel(driver);
		
      dropdown(h.getLocation(), "index", "2");
		
		
		dropdown(h.getRooms(), "value", "2");
		
		
		inputelement(h.getCheckin(), "23/10/1996");
		
		inputelement(h.getCheckout(), "24/10/1996");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		
		dropdown(adult, "value", "1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		click(search);
		
		
		
		
}

	

}
