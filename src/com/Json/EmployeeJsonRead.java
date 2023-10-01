package com.Json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeJsonRead {
	
		public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
			
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectMapper map1 = new ObjectMapper();
		
		String json= "C:\\Users\\user\\OneDrive\\Desktop\\Json-jars\\ConvertToJson3.json"; 
		EmployeeJson e1= map1.readValue(new File(json),EmployeeJson.class);
		System.out.println(e1);

}
}