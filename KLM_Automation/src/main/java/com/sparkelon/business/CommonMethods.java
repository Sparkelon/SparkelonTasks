package com.sparkelon.business;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public  void secondmethod(WebDriver driver) throws Exception {
		  String klmfile ="C:\\Users\\Sparkelon\\Desktop\\Alekhya\\Klmm.xls";
			FileInputStream fis = new FileInputStream(klmfile );
	    Workbook wb =Workbook.getWorkbook(fis);
	    Sheet s=wb.getSheet("FromList");
		  WebElement deptflightlink=driver.findElement( By.xpath( "//span[@class='bf-flight-overview__price-button__amount g-hc-ignore']"));
	      
	      deptflightlink.click();
	       Thread.sleep(5000);
	      
	      // WebElement availflightdate= driver.findElement(By.xpath("//*[@data-a11ydate = 'Wednesday, November 28, 2018']"));
	       WebElement availflightdate= driver.findElement(By.xpath(s.getCell(12,1).getContents()));
	       Thread.sleep(3000);
	       availflightdate.click();
	       
	       
	       
	       //code for  choose a return flight date --EUR....
	       Thread.sleep(7000);
	       
		      //*[@id="brandedFaresWidgetContainer"]/div/div/div[3]/div[2]/div/ul/li[2]/div[1]/div/div
		        
		        driver.findElement((By.xpath("//li[@class='bf-flight-list__item g-hc-ignore']"))).click();
		        
		        //driver.findElement((By.xpath( "/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/div/ul/li/div[1]/div/div/div[5]/button"))).click();
		        Thread.sleep(6000);
		        
		        //first page continue --we can see here continue,mail my search details
		        WebElement Continue =driver.findElement((By.xpath( "//*[@id='bf-continue-button']")));
		        
		        Continue.sendKeys(Keys.DOWN);
		        Thread.sleep(3000);
		        Continue.click();
		        Thread.sleep(9000);
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("window.scrollBy(0,250)", ""); 
		        Thread.sleep(4000);
		        // 2nd page continue --we can see here back and continue buttons /html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]  /html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]
		       // WebElement Continue1= driver.findElement(By.xpath( "//*[@id=\"uniqueProductShopAppContainer\"]/div/div/div/div[1]/div/div[1]/ul/li[3]/button[1]/span"));
		       // WebElement Continue1 =driver.findElement((By.xpath("/html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]")));
		        //	"//*[@id=\"uniqueProductShopAppContainer\"]/div/div/div/div[1]/div/div[1]/ul/li[3]/button[1]")));
		        		
		      //*[@id="uniqueProductShopAppContainer"]/div/div/div/div[1]/div/div[1]/ul/li[3]/button[1]
		        WebElement Continue1 =driver.findElement((By.xpath("//li[@class='ps-page-product-list-booking__product-list__navigation g-forms-button-group g-clear']//button[1]")));
			      
		        
		        Continue1.sendKeys(Keys.DOWN);
		       
		        Thread.sleep(9000);
		        Continue1.click();
		        Thread.sleep(5000);
	       
	  }
	  
	  public void lastpage(WebDriver driver) throws Exception, IOException {
		  String klmfile ="C:\\Users\\Sparkelon\\Desktop\\Alekhya\\Klmm.xls";
				FileInputStream fis = new FileInputStream(klmfile );
		    Workbook wb =Workbook.getWorkbook(fis);
		    Sheet s=wb.getSheet("FromList");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
	      jse.executeScript("window.scrollBy(0,250)", "");
	      WebElement Title = driver.findElement(By.xpath("//select[@id='passengerField_1000_title']"));
	      /*JavascriptExecutor js = (JavascriptExecutor) driver;
	      
	 	  js.executeScript("arguments[0].scrollIntoView();", Title);*/
	 	 // Title.sendKeys(Keys.DOWN); 
	 	  Select dropdown= new Select(Title);    
	 	  dropdown.selectByVisibleText("Mrs") ; 
	 	  
	 	  jse.executeScript("window.scrollBy(0,250)", "");
	 	  
	 	 /* String klmfile ="C:\\Users\\admin\\Desktop\\KLM\\Klmm.xls";
	 		FileInputStream fis = new FileInputStream(klmfile );
	       Workbook wb =Workbook.getWorkbook(fis);
	       Sheet s=wb.getSheet("ToList");
	       int rowCount = s.getRows();
	       int colcount =s.getColumns();*/
	       Thread.sleep(2000);
	       WebElement firstname = driver.findElement(By.id("passengerField_1000_firstName"));
	           //input[@id='passengerField_1001_firstName']
	 	  firstname.sendKeys(s.getCell(4,1).getContents());
	 	 //firstname.sendKeys("alekkk");
	 	Thread.sleep(2000);
	 	   WebElement lastname = driver.findElement(By.id("passengerField_1000_lastName"));
	 		//input[@id='passengerField_1001_lastName']
	 	   lastname.sendKeys(s.getCell(5,1).getContents());
	 	 
	 
	 	 
	 	  Thread.sleep(4000);  
		   	     
	 	     driver.findElement(By.id("passengerField_1000_emailAddress")).sendKeys(s.getCell(8,1).getContents());
	 	     //sendKeys("thumatialekhya@gmail.com");
	 	     //sendKeys(s.getCell(1,10).getContents());
	 	     Thread.sleep(3000);
	 	    driver.findElement(By.id("passengerField_1000_phoneNumberFirst")).sendKeys(s.getCell(9,1).getContents());
	 	  //  sendKeys("657764287");
	 	    //sendKeys(s.getCell(1,11).getContents());
	 	   //adult title
	 	   
	 	  Thread.sleep(7000);
	 	  
	 	   WebElement Title1 = driver.findElement(By.id("passengerField_1001_title"));
	 	    
	 	  // Title1.sendKeys(Keys.DOWN);
	 		//  js.executeScript("arguments[0].scrollIntoView();", Title1);
	 		   Thread.sleep(2000);
	 		  Select dropdown1= new Select(Title1);    
	 		  dropdown1.selectByVisibleText("Mr") ; 
	 		
	 		  Thread.sleep(2000);
	 		
	 		  WebElement firstname1 = driver.findElement(By.id("passengerField_1001_firstName"));
	           //input[@id='passengerField_1001_firstName']
	 	 // firstname1.sendKeys(s.getCell(1,10).getContents());
	 	  firstname1.sendKeys("manuu");
	 	   WebElement lastname1 = driver.findElement(By.id("passengerField_1001_lastName"));
	 		//input[@id='passengerField_1001_lastName']
	 	   Thread.sleep(2000);
	 	   lastname1.sendKeys("madhineni");
	 	  
	 	   jse.executeScript("window.scrollBy(0,700)", "");
	 	 driver.findElement(By.xpath("//h3[contains(text(),'No insurance')]")).click();
	 	   Thread.sleep(2000);   
	 	   
	 	   WebElement submit =driver.findElement(By.xpath("//*[@id='checkout-step-submit']"));
	 	   
	 	   Thread.sleep(10000); 
	 	 submit.click();
	   Thread.sleep(7000);   
	   driver.get("https://www.klm.com/home/nl/en");
	   Thread.sleep(5000); 
	  }
}

