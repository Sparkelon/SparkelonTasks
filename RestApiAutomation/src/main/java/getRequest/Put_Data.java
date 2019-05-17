package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Put_Data {
	
	@Test
	public void test1(){
		
		RequestSpecification request = RestAssured.given();
		// We can add Key - Value pairs using the put method
		
		request.header("Content-Type","application/json");
		JSONObject requestParams = new JSONObject();
		requestParams.put("id" ,"13"); 
		requestParams.put("title" ,"json-server");
		 
		requestParams.put("author", "updatedtest1");
		
		request.body(requestParams.toJSONString());
		
		Response response =request.put("http://localhost:3000/posts/13");
		int code =response.getStatusCode();
		
		Assert.assertEquals(code, 200);
	}

}
