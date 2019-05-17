package klm.Maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SingletonDriver
{
public static WebDriver driver = null;
public static void Initiallize()
{
if(driver == null)
{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Complete selenium\\ChromeDriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
}
}
public static void close()
{
driver.close();
}
public static void quit()
{
driver.quit();
}
}
