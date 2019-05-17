package com.sparkelon.business;

import org.openqa.selenium.*;
public class POMEleme {
	 
	
	
	 public static WebElement firstname(WebDriver driver){
	 
	    WebElement firstnamebox = driver.findElement(By.id("passengerField_1000_firstName"));
	 
	    return firstnamebox;
	 
	    }
	 public static WebElement lastname(WebDriver driver){
		 
		    WebElement lastnamebox = driver.findElement(By.id("passengerField_1000_lastName"));
		 
		    return lastnamebox;
		 
		    }
	 
	 public static WebElement emailAddress(WebDriver driver){
		 
		    WebElement emailAddressbox = driver.findElement(By.id("passengerField_1000_emailAddress"));
		 
		    return emailAddressbox;
		 
		    }
	 /*public static WebElement phoneNumber(WebDriver driver){
		 
		    WebElement phoneNumberbox = driver.findElement(By.id("passengerField_1000_phoneNumberFirst"));
		 
		    return phoneNumberbox;
		 
		    }*/
	   
	 
	 public static WebElement firstname1(WebDriver driver){
		 
		    WebElement firstnamebox1 = driver.findElement(By.id("passengerField_1001_firstName"));
		 
		    return firstnamebox1;
		 
		    }
		 public static WebElement lastname1(WebDriver driver){
			 
			    WebElement lastnamebox1 = driver.findElement(By.id("passengerField_1001_lastName"));
			 
			    return lastnamebox1;
			 
			    }
		 public static WebElement submit(WebDriver driver){
			 
			    WebElement submitbtn = driver.findElement(By.xpath("//*[@id='checkout-step-submit']"));
			 
			    return submitbtn;
			 
			    }
		 
}
