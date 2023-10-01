package com.Json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;



public class EmployeeJsonAPI {

	
	public static void main(String[] args) throws IOException  {
		

		String [] address= {"Ntpc", "Ramagumdam", "Telangana"};
		EmployeeJson emp= new EmployeeJson(100,"Saikumar",50000.00, address);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonData = mapper.writeValueAsString(emp);
		
//		System.out.println(jsonData);
		
//		Here given external desktop path instead of just file name
		mapper.writeValue(new File("C:\\Users\\user\\OneDrive\\Desktop\\Json-jars\\ConvertToJson3.json"),emp);
		
	
	
		
		
		
//		To read the data from json to Java form in same class
	
		ObjectMapper map1 = new ObjectMapper();
		
		String json= "C:\\Users\\user\\OneDrive\\Desktop\\Json-jars\\ConvertToJson1.json"; 
		EmployeeJson e1= map1.readValue(new File(json),EmployeeJson.class);
		System.out.println(e1);
		
		
		
		
		
		
		
		
		
		
	}
	}	
		
		
