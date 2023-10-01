package com.Json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeJackSonTest {
	
	
	public static void main(String[] args) throws IOException {
		
		String [] address= {"Ntpc", "Ramagumdam", "Telangana"};
		EmployeeJson emp= new EmployeeJson(100, "Saikumar", 50000.00, address);
		ObjectMapper om= new ObjectMapper();
		String json=om.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		om.writeValue(new File("EmpJackson.json"),emp);
		
		
//		Now the above Object file is converted into Json format
		
		
//		To Read the Json file
		
		EmployeeJson e1= om.readValue(new File("EmpJackson.json"),EmployeeJson.class);
		System.out.println(e1);
		
	}

}
