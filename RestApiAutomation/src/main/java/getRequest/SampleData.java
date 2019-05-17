package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import  org.testng.asserts.*;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
public class SampleData {
@Test
	public void testResponseCode(){
		
		Response resp =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	
		int code = resp.getStatusCode();
		
		System.out.println("Status code is :" +code);
		Assert.assertEquals(code, 200);
		
String data=resp.asString();
		
		System.out.println("data is :" +data);	
		
	}

@Test
public void testData(){
	
	Response resp =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	
    String data=resp.asString();
	
	System.out.println("data is :" +data);	
	System.out.println("response time :" +resp.getTime());	
}


}
