package com.parallel;

import org.testng.annotations.Test;

import com.base.baseclass;

public class paralleltest extends baseclass {
	
	@Test
   public void facebook() {
		
	   browser("chrome");
	   
	   urllaunch("https://www.facebook.com/");
	   
	   System.out.println("done");
	   
}
	@Test
	public void insta() {
		
		browser("chrome");
		
		urllaunch("https://www.instagram.com/?hl=en");
		
		System.out.println("done");
		

	}
	
	
	

}
