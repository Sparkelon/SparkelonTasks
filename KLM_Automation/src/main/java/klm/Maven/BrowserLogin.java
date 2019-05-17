package klm.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLogin {
	static WebDriver driver;
	public static WebDriver fn_LaunchBrowser(String browsername){
		/*if(browsername=="CH"){
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}else*/ if(browsername=="FF"){
		driver= new FirefoxDriver();
		}/*else if(browsername=="IE"){
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		}*/
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		return driver;
		}
	public static void fn_OpenURL(String url){
		driver.get(url);
		driver.manage().window().maximize();
		}
	
	
}
