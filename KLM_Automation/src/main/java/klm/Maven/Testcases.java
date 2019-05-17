package klm.Maven;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testcases 
{
@BeforeTest
public void initializeDriver()
{
SingletonDriver.Initiallize();
}
@Test(priority = 0)
public void openurl()
{
SingletonDriver.driver.navigate().to("http://www.way2testing.com");
}
@Test(priority = 1)
public void getTitle()
{
System.out.println(SingletonDriver.driver.getTitle());
}
}