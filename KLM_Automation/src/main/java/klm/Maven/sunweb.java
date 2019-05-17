package klm.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sunweb {
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sparkelon\\Desktop\\Alekhya\\SeleniumNew\\drivers\\geckodriver.exe");
	
  
	WebDriver driver = new FirefoxDriver();
	
    driver.get("https://www.sunweb.nl/wintersport/zoeken?Participants[0][0]=1989-03-20&Participants[0][1]=1989-03-20&Participants[0][2]=1989-03-20&Participants[0][3]=1989-03-20&sort=Popularity&Allocation=2&nResults=10");
    driver.manage().window().maximize();
    Thread.sleep(5000);	

 Thread.sleep(5000);	
    WebElement img= driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/section[1]/article[1]/div[1]/div[1]/div[2]/a[1]"));
    Thread.sleep(2000);	
    img.click();
	}
}
