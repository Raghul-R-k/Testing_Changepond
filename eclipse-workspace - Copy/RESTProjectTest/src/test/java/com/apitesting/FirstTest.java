package com.apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;    //make a static to Restassured package
import io.restassured.response.Response;

import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;
public class FirstTest {
	
	//@Test              //Execute function
	public void GETApiTest1() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		//RestAssured.get("https://reqres.in/api/users?page=2");
	}
	
	
	//BDD   
	@Test
	public void GETApiTest2() 
	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[1].id", equalTo(8)).log().all();
		given().get("/users?page=2").then().statusCode(200).body("data[1].email", equalTo("lindsay.ferguson@reqres.in")).log().all();

	}
}
