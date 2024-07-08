package com.apitesting;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatychAndDeleteRequest {
	
	@Test
	
	public void PUTRequest()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghul");
		request.put("job", "fullstack developer");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		given().header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).put("/users/2").then().statusCode(200).log().all();
	}
	//@Test
	public void PATCHRequest()
	{
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghul");
		request.put("job", "fullstack developer");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		given().header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).patch("/users/2").then().statusCode(200).log().all();
	}
	//@Test
	public void DELETERequest()
	{
		baseURI = "https://reqres.in";
		
		when().delete("/api/users?page=2").then().statusCode(204).log().all();

	}
}
