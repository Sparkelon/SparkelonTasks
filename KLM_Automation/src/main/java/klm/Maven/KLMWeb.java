package klm.Maven;
/*package klm.Maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import com.sparkelon.Business.CommonMethods;

*//**
 * Created by Alekhya
 *//*

public class KLMWeb {
		
	public WebDriver driver;
public String expected ;
public String actual ;


@BeforeMethod
@Parameters("browser")
public void setUp(String browser) throws Exception 
{
	
	
	driver = CommonMethods.Execute(browser);
	
	
    driver.get(CommonMethods.baseUrl);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    WebElement agreepop= driver.findElement(By.xpath( "//*[text()=' Agree ']"));
    if(agreepop.isDisplayed() && agreepop.isEnabled()){
  	  agreepop.click();
    }
   Thread.sleep(3000);
}


@Test
public  void signIn() {

      
 }  
@Test
public void openApplication() throws Throwable {
		
	 CommonMethods loginogin= new CommonMethods();
       System.out.println("Browser Launch");

       loginogin.firstpage();
	
}
	      
		
	
	}
	  
	  
	  */