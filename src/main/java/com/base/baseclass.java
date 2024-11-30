package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore.Entry.Attribute;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class baseclass {
	
	public  static WebDriver driver;
	
	
	public static WebDriver browser(String f) {
		 
		 if (f.equalsIgnoreCase("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\driver\\chromedriver.exe");
             driver = new ChromeDriver();
			 
			} 
		 
		 
		 else if (f.equalsIgnoreCase("firefox")) {
			 
			 System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\driver\\geckodriver.exe");

				 driver = new FirefoxDriver(); 
			 
			
		}
		 
		 return driver;
		
		
			
		
	}
	
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	
	public static void refresh() {
		
		driver.navigate().refresh();
		
	}
	
	
	public static void inputelement(WebElement a, String f) {
		
		a.sendKeys(f);
	
	}
	
	
   public static void click(WebElement c) {
	   
	   c.click();
	   
}
   
   public static void forward() {
	   
	   driver.navigate().forward();
	   
	}
   
   public static void back() {
	   
	   driver.navigate().back();
	

}
   
   public static void title() {
	
	   String title = driver.getTitle();
	   
	   System.out.println(title);

}
	
   
   public static void currenturl() {
	   
	   
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);

}
   
   public static void pagesource() {
	
	   String pageSource = driver.getPageSource();
	   
	   System.out.println(pageSource);

}
   
 public static void Wait(int t){


	 driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);

}
 
 public static void urllaunch(String g) {
	 
	 driver.get(g);
	

}
 
 
 public static  void screenshot(String b) throws IOException {
	 
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 
	 File s = ts.getScreenshotAs(OutputType.FILE);
	 
	 File d= new File("C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\Screenshot\\"+b+".png");
	 
	 FileUtils.copyFile(s, d);
	 
	 
}
 
 public static void Alert(String d) {
	 
	 if (d.equalsIgnoreCase("simple")) {
		 
		 driver.switchTo().alert().accept();
		
	}

	 else if (d.equalsIgnoreCase("confirm")) {
		 
		 driver.switchTo().alert().dismiss();
		
	}

 else if (d.equalsIgnoreCase("prompt")) {
		 
		 driver.switchTo().alert().sendKeys("done");

		 driver.switchTo().alert().accept();
		 
		
	}

}
 
 
 public static void text(WebElement c) {
	 
   String text = c.getText();
   
   System.out.println(text);

}
 
 public static void displayed(WebElement d) {
	
	 boolean displayed = d.isDisplayed();
	 
	 System.out.println(displayed);

}
 
 public static void enabled(WebElement e) {
	boolean enabled = e.isEnabled();
	
	System.out.println(enabled);

}
 
 public static void selected(WebElement s) {
	 
	 boolean selected = s.isSelected();
	 
	 System.out.println(selected);
	

}
 
 public static void Attribute(WebElement d) {
	
	 String attribute = d.getAttribute("value");
	 
	 System.out.println(attribute);
	 
}
 
 
 public static void mouseover(WebElement d, String e) {
	
	 Actions a =new Actions(driver);
	 
	 a.moveToElement(d).build().perform();
	 
	 if (e.equalsIgnoreCase("right")) {
		 
		 a.contextClick(d).build().perform(); 
		
	}
	 
	 else if (e.equalsIgnoreCase("click")) {
		 
		 a.click(d).build().perform(); 
			 
		
	}
	 
	 else if (e.equalsIgnoreCase("hold")) {
		 
		 a.clickAndHold(d).build().perform();
		
	}
	 
	 else if (e.equalsIgnoreCase("double")) {
		 
		 a.doubleClick(d).build().perform();
		
	}
	 
 }
	 
	 
	 public static void keyboard() throws AWTException {
		 
		 Robot r=new Robot();
		 
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 
		 
		 
}
	 
	 public static void quit() {
		
		 driver.quit();

	}
	 
	 public static void close() {
			
		 driver.close();

	} 
	 
	 
	
	 public static void cookies() {
		
		 driver.manage().deleteAllCookies();		 

	}
	 
	 
	 public static void dropdown(WebElement element,String type,String value) {
		 
		 Select s=new Select(element);
		 
		 if (type.equalsIgnoreCase("value")) {
			 
			 
			 s.selectByValue(value);
			
		}
		 
		 else if (type.equalsIgnoreCase("visible text")) {
			 
			 s.selectByVisibleText(value);
			 
			 
			
		}
		 
		 else if (type.equalsIgnoreCase("index")) {
			 
			 int parseInt = Integer.parseInt(value);
			
			 s.selectByIndex(parseInt);
		}
		 
		
		

	}
	 
	 
	 public static void scrolling(String type,WebElement b) {
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 if (type.equalsIgnoreCase("down")) {
			 
			 
			 js.executeScript("window.scrollBy(0,3000);");
			
		}
		 
		 else if (type.equalsIgnoreCase("up")) {
			 
			 js.executeScript("window.scrollBy(0,-3000);");
			
		}
		 
		 else if (type.equalsIgnoreCase("view")) {
			 
			 js.executeScript("arguments[0].scrollIntoView();", b);
			
		}
		  
		 
}


	public static void Deselect(WebElement c, String type, String value) {
	
		Select s=new Select(c);
		
		if (type.equalsIgnoreCase("value")) {
			
			s.deselectByValue(value);
			
		}
		
		else if (type.equalsIgnoreCase("visible text")) {
			
			s.deselectByVisibleText(value);
			
			}
		
		
		else if (type.equalsIgnoreCase("index")) {
			
			int parseInt = Integer.parseInt(value);
			
			s.deselectByIndex(parseInt);
			
		}
		
		else if (type.equalsIgnoreCase("all")) {
			
			s.deselectAll();
			
		}
		
	}


	public static void frame(String type, WebElement a, WebElement b) {
		
		if (type.equalsIgnoreCase("single")) {
			
			driver.switchTo().frame(a);
			
		}
		
		else if (type.equalsIgnoreCase("multiple")) {
			
			driver.switchTo().frame(a);
			
			driver.switchTo().frame(b);
			
			
			
		}
		
		
		
			
		}

	 
	 
}	 

			 


 
 
 
	
	
	


