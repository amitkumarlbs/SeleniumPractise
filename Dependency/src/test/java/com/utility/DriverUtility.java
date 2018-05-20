package com.utility; 
 
 
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.chrome.ChromeDriver; 
 import org.openqa.selenium.firefox.FirefoxDriver; 
 import org.openqa.selenium.ie.InternetExplorerDriver; 
 
 
 public class DriverUtility { 
 	 
 	public static WebDriver getDriver(String browser) 
 	{ 
 		if(browser.equals("chrome")) 
 		{ 
 			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_B7A.03.26\\Desktop\\Browser_drivers\\chromedriver_win32\\chromedriver.exe"); 
 			return new ChromeDriver(); 
 		} 
 		else if(browser.equals("firefox")) 
 		{ 
 			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_B7A.03.26\\Desktop\\Browser_drivers\\geckodriver-v0.20.1-win64\\geckodriver.exe"); 
 			return new FirefoxDriver(); 
 		} 
 		else if(browser.equals("ie")) 
 		{ 
 			System.setProperty("webdriver.ie.driver","C:\\Users\\Training_B7A.03.26\\Desktop\\Browser_drivers\\IEDriverServer_x64_3.11.1\\IEDriverServer.exe"); 
 			return new InternetExplorerDriver(); 
 		} 
 		else 
 		{ 
 			return null; 
 		} 
 	} 
 
 
 } 
