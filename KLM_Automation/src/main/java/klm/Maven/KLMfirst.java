package klm.Maven;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sparkelon.business.Constants;

public class KLMfirst {

	public WebDriver driver;
	
	
	@BeforeTest
	public void openBrowser(){
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
	}
		  /*to click element
		   * JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);*/
		  
		 /*WebElement agreepop= driver.findElement(By.xpath( "//*[text()=' Agree ']"));
		
	      if(agreepop.isDisplayed() && agreepop.isEnabled()){
	    	  agreepop.click();
	      }
	     Thread.sleep(3000);*/
		
