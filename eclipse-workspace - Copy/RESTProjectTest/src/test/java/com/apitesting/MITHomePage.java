package com.apitesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class MITHomePage {
	
	//@Test
	public void HomePageTest()
	{
		Response response = get("http://localhost:3000/");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	
	//@Test
	public void GETApiTest2() 
	{
		baseURI = "http://localhost:8888";
		given().get("/products").then().statusCode(200).body("find {it.id = 1}.id", equalTo(1)).log().all();
		given().get("/products/1").then().statusCode(200).body("id", equalTo("1")).log().all();
		//given().get("/users?page=2").then().statusCode(200).body("data[1].email", equalTo("lindsay.ferguson@reqres.in")).log().all();

	}
	
	//@Test
	public void POSTRequest() 
	{
		Map<String,Object> map = new HashMap<String,Object>();
		JSONObject request = new JSONObject(map);
		request.put("name","Raghul");
		request.put("job","Software Developer");
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:8888";
		given().header("Content-type","/products").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).post("/products").then().statusCode(201).log().all();
	}
	
	@Test
	public void PUTRequest()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghul kumar");
		request.put("job", "fullstack developer");
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:8888";
		given().header("Content-type","/products").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).put("/products/3").then().statusCode(200).log().all();
	}
}
