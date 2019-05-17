package com.sparkelon.business;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sparkelon.business.CommonMethods;
import com.sparkelon.business.ExcelReading;

public class KlmInitialscreen  {
int i;

public WebDriver driver;


@BeforeTest
public void openBrowser(){

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sparkelon\\Desktop\\Alekhya\\SeleniumNew\\drivers\\geckodriver.exe");
	
	driver =  new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@Test
public void launchBrowser() throws Exception {
	
	 driver.get(Constants.baseUrl);

	  WebElement element = (new WebDriverWait(driver, 20))
               .until(ExpectedConditions.elementToBeClickable(By.xpath( "//*[text()=' Agree ']")));
	  element.click();
}

	@Test
	public void searchflight() throws Exception{
		
		
	 		//System.out.println(excel.getCellDataString(1, 0));
		
     for( i=1;i<3;i++){
    	 String projectPath =System.getProperty("user.dir");
			ExcelReading excel =new ExcelReading(projectPath +"/excel/Klmmnew.xlsx", "FromList");
			//from text box
			      		WebElement fromtext = driver.findElement(By.xpath(Constants.fromtext));
			      		 fromtext.sendKeys(excel.getCellDataString(i, 0));
			
			      		 
			              Actions action = new Actions(driver);
			              action.moveToElement(fromtext).build().perform();
			              fromtext.sendKeys(Keys.DOWN);
			              fromtext.sendKeys(Keys.RETURN);
			              Thread.sleep(3000);
			              
			//to text box
			              WebElement totext = driver.findElement(By.xpath(Constants.totext));
			              totext.sendKeys(excel.getCellDataString(i,1));
			             // Actions action1 = new Actions(driver);
			              action.moveToElement(totext).build().perform();
			              totext.sendKeys(Keys.DOWN);
			              totext.sendKeys(Keys.RETURN);
			              Thread.sleep(3000);
			 //departure date
			              driver.findElement(By.xpath(Constants.Departuredate)).click();
			              Thread.sleep(2000);
			              driver.findElement(By.xpath(excel.getCellDataString(i,2))).click();
			              
			             
			              
			     // System.out.println(s.getCell(2,i).getContents());
						       
			      Thread.sleep(3000);
			      
			//passengers
			       		driver.findElement(By.xpath(Constants.passengers)).click();
			       		driver.findElement(By.xpath(Constants.Addpassengers)).click();
			       driver.findElement(By.xpath(Constants.passengersok)).click();
			       Thread.sleep(3000);
			//travel class dropdown
			      driver.findElement(By.xpath(Constants.travelclassdrop)).click();
			       Thread.sleep(2000);
			      // driver.findElement(By.xpath("//option[@value='ECONOMY']")).click();
			       driver.findElement(By.xpath(excel.getCellDataString(i,3))).click();
			       Thread.sleep(2000);
			       
			//view offers
			       driver.findElement(By.xpath(Constants.viewofferbtn)).click();
 
       Constants c1=new Constants();
    // c1.firstmethod(driver,i);
    c1.secondmethod(driver,i);
       c1.lastpage(driver,i );
     Thread.sleep(7000);
     driver.get(Constants.baseUrl);  
     Thread.sleep(5000);
     }      
              
    
              
 
}
	
		
	 
	     
}



