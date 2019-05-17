package com.sparkelon.business;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Constants {
	  public final static String MOZILLADRIVERPATH="C:\\Users\\Sparkelon\\Desktop\\Alekhya\\SeleniumNew\\drivers\\geckodriver.exe";
	  public static String baseUrl = "https://www.klm.com/home/nl/en";
	  public static String fromtext="//div[@class='g-search-form--connections']//div[1]//label[1]//input[1]";
	  public static String totext="//div[@class='g-search-form--connections']//div[1]//label[2]//input[1]";
	  
	  public static String passengers= "//span[contains(text(),'Passengers')]" ;
	  public static String Addpassengers= "//div[@class='selectorView']//div[3]//div[1]//button[2]" ;
	  public static String passengersok= "//span[contains(text(),'OK')]" ;
	  public static String travelclassdrop="//select[@class='g-search-form--input g-forms-selectbox']";
	  public static String Departuredate ="//*[@id='est-search-homepage']/div[2]/div[2]/form/div/div[1]/label[3]/input";
	  public static String viewofferbtn ="//div[@class='g-search-form--footer g-clear']//span";
	 
		public  void secondmethod(WebDriver driver, int i) throws Exception {
			 
			String projectPath =System.getProperty("user.dir");
			ExcelReading excel =new ExcelReading(projectPath +"/excel/Klmmnew.xlsx", "FromList");

			WebElement deptflightlink=driver.findElement( By.xpath( "//span[@class='bf-flight-overview__price-button__amount g-hc-ignore']"));
		    deptflightlink.click();
		    Thread.sleep(5000);
		      
		      // WebElement availflightdate= driver.findElement(By.xpath("//*[@data-a11ydate = 'Wednesday, November 28, 2018']"));
		       WebElement availflightdate= driver.findElement(By.xpath(excel.getCellDataString(i,12)));
		       Thread.sleep(3000);
		      // availflightdate.click();
		 /*      Actions actions = new Actions(driver);
		       actions.moveToElement(availflightdate).click().build().perform();*/
		   JavascriptExecutor executor = (JavascriptExecutor)driver;
		   executor.executeScript("arguments[0].click();", availflightdate);
		       
		       //code for  choose a return flight date --EUR....
		       Thread.sleep(7000);
		       
			      //*[@id="brandedFaresWidgetContainer"]/div/div/div[3]/div[2]/div/ul/li[2]/div[1]/div/div
			        
			        driver.findElement((By.xpath("//li[@class='bf-flight-list__item g-hc-ignore']"))).click();
			        
			        //driver.findElement((By.xpath( "/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/div/ul/li/div[1]/div/div/div[5]/button"))).click();
			        Thread.sleep(6000);
			        
			        //first page continue --we can see here continue,mail my search details //*[@id='bf-continue-button']
			        WebElement Continue =driver.findElement((By.xpath( "//button[contains(text(),'Continue')]")));
			        
			        Continue.sendKeys(Keys.DOWN);
			        Thread.sleep(3000);
			        Continue.click();
			        Thread.sleep(5000);
			        JavascriptExecutor jse = (JavascriptExecutor)driver;
			        jse.executeScript("window.scrollBy(0,500)", ""); 
			        Thread.sleep(7000);
			        // 2nd page continue --we can see here back and continue buttons /html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]  /html/body/div[6]/div/div/div/div[1]/div/div[1]/ul/li[5]/button[1]
			       
			        WebElement Continue1 =driver.findElement((By.xpath("//button[@id='bf-continue-button']")));
			        Continue1.sendKeys(Keys.DOWN);
			       
			        jse.executeScript("window.scrollBy(0,500)", ""); 
			        Thread.sleep(9000);
			        Continue1.click();
			        Thread.sleep(5000);
			        

			        WebElement Continue2 =driver.findElement((By.xpath(" //span[contains(text(),'Continue')]")));
			        Continue2.sendKeys(Keys.DOWN);
			       
			        Thread.sleep(9000);
			        Continue2.click();
			        Thread.sleep(5000);
			     
		       
		  }
		  
		  public void lastpage(WebDriver driver,  int i) throws Exception, IOException {
			/*  String klmfile ="C:\\Users\\Sparkelon\\Desktop\\Alekhya\\Klmm.xls";
					FileInputStream fis = new FileInputStream(klmfile );
			    Workbook wb =Workbook.getWorkbook(fis);
			    Sheet s=wb.getSheet("FromList");*/
			    String projectPath =System.getProperty("user.dir");
				ExcelReading excel =new ExcelReading(projectPath +"/excel/Klmmnew.xlsx", "FromList");  
			
			  JavascriptExecutor jse = (JavascriptExecutor)driver;
		      jse.executeScript("window.scrollBy(0,250)", "");
		      WebElement Title = driver.findElement(By.xpath("//select[@id='passengerField_1000_title']"));
		      Select dropdown= new Select(Title);    
		 	  dropdown.selectByVisibleText("Mrs") ; 
		 	  
		 	  jse.executeScript("window.scrollBy(0,250)", "");
		 	  Thread.sleep(2000);
		      
		 	
		 	  POMEleme.firstname(driver).sendKeys(excel.getCellDataString(i,4));
		 	  
		 	Thread.sleep(2000);
		 	
		 	//lastname
		 	 
		 	 POMEleme.lastname(driver).sendKeys(excel.getCellDataString(i,5));
		 	 Thread.sleep(4000);
		 	 POMEleme.emailAddress(driver).sendKeys(excel.getCellDataString(i,8));
		 	 jse.executeScript("window.scrollBy(0,250)", "");
			 Thread.sleep(3000);
			
			WebElement phonenum =  driver.findElement(By.id("passengerField_1000_phoneNumberFirst"));
			String phonenum1 = Integer.toString(excel.getCellDataNum(i,9));
					phonenum.sendKeys(phonenum1);
			  
			  
			// int Val = excel.getCell(9).getNumericCellValue();
			 //POMEleme.phoneNumber(driver).sendKeys(excel.getCellDataString(i, 9));
		 	//driver.findElement(By.id("passengerField_1000_phoneNumberFirst")).sendKeys(excel.getCellDataString(i,9));
		 	 Thread.sleep(7000);

		 	   jse.executeScript("window.scrollBy(0,250)", "");
		 	 //second details
		 	   WebElement Title1 = driver.findElement(By.id("passengerField_1001_title"));
		 	   Thread.sleep(2000);
		 	   Select dropdown1= new Select(Title1);    
		 	   dropdown1.selectByVisibleText("Mr") ; 
		 		Thread.sleep(2000);
		 		
		 		POMEleme.firstname1(driver).sendKeys(excel.getCellDataString(i,13));
			 	Thread.sleep(2000);
				POMEleme.lastname1(driver).sendKeys(excel.getCellDataString(i,14));
		 	  
		 	   jse.executeScript("window.scrollBy(0,700)", "");
		 	 driver.findElement(By.xpath("//h3[contains(text(),'No insurance')]")).click();
		 	   Thread.sleep(2000);   

		 	   jse.executeScript("window.scrollBy(0,400)", "");
		 	  POMEleme.submit(driver).click();
		 	   
		   Thread.sleep(7000);   
		   driver.get("https://www.klm.com/home/nl/en");
		   Thread.sleep(5000); 
		  }

}
