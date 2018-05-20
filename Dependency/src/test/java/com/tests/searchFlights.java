package com.tests;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class searchFlights {
	
	@Test
	public void flights() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_B7A.03.26\\Desktop\\Browser_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("FromTag"));
		
        Actions act1 = new Actions(driver);
        
        /*act1.keyDown(from, Keys.SHIFT).perform();
        Thread.sleep(2000);
        act1.sendKeys("h").perform();
        Thread.sleep(2000);
        act1.keyUp(from, Keys.SHIFT).perform();
        Thread.sleep(2000);
        act1.sendKeys("yd").perform();
        Thread.sleep(2000);
        act1.sendKeys(Keys.ENTER).perform();*/
        
        WebElement to = driver.findElement(By.id("ToTag"));
        to.sendKeys("ban");
        
        WebElement ul = driver.findElement(By.id("ui-id-2"));
        List<WebElement> list = ul.findElements(By.tagName("li"));
        
        //Assert.assertEquals(list.size(), 10);
        
        for(WebElement e : list) {
        	String city = e.getText();
        	if(city.contains("BKK")) {
        		e.click();
        		break;
        	}
        	
        }
        
        
        
        
        /*
        
 1 package com.tests; 
2 
 
3 import java.util.List; 
4 
 
5 import org.openqa.selenium.By; 
6 import org.openqa.selenium.Keys; 
7 import org.openqa.selenium.WebDriver; 
8 import org.openqa.selenium.WebElement; 
9 import org.openqa.selenium.chrome.ChromeDriver; 
10 import org.openqa.selenium.interactions.Actions; 
11 import org.testng.Assert; 
12 import org.testng.annotations.Test; 
13 
 
14 public class NewTest3 { 
15 	 
16 	@Test 
17 	public void testClearTrip() throws InterruptedException 
18 	{ 
19 		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe"); 
20 		WebDriver driver=new ChromeDriver(); 
21 		 
22 		driver.get("http://www.cleartrip.com/"); 
23 		driver.manage().window().maximize(); 
24 		 
25 		WebElement from=driver.findElement(By.id("FromTag")); 
26 		 
27 		Actions act1=new Actions(driver); 
28 		act1.keyDown(from,Keys.SHIFT).perform(); 
29 		Thread.sleep(2000); 
30 		act1.sendKeys("h").perform();; 
31 		Thread.sleep(2000); 
32 		act1.keyUp(Keys.SHIFT).perform(); 
33 		Thread.sleep(2000); 
34 		act1.sendKeys("yd").perform(); 
35 		Thread.sleep(2000); 
36 		act1.sendKeys(Keys.ENTER).perform(); 
37 		 
38 		 
39 		WebElement to=driver.findElement(By.id("ToTag")); 
40 		to.sendKeys("ban"); 
41 		 
42 		Thread.sleep(2000); 
43 		 
44 		WebElement ul=driver.findElement(By.id("ui-id-2")); 
45 		List<WebElement> list=ul.findElements(By.tagName("li")); 
46 		Assert.assertEquals(list.size(),10); 
47 		 
48 		for(WebElement e:list) 
49 		{ 
50 			String city=e.getText(); 
51 			if(city.contains("BKK")) 
52 			{ 
53 				e.click(); 
54 				break; 
55 			} 
56 		} 
57 		 
58 		/*Actions act2=new Actions(driver); 
59 		act2.sendKeys(to,"ban").perform(); 
60 		Thread.sleep(2000); 
61 		act2.sendKeys(Keys.ARROW_DOWN).perform(); 
62 		Thread.sleep(2000); 
63 		act2.sendKeys(Keys.ENTER).perform();*/ 
 	 
 	
 
 
 } 

         
         
             
        
        
		
}
	


