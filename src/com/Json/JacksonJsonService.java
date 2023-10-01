package com.Json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonService {
	
	public static void main(String[] args) throws IOException {
		
		String [] hobbies= {"Cricket","Browsing"};
		
		Person person = new Person("Sai", 27, hobbies);
		
		ObjectMapper mapper= new ObjectMapper();
		
		String json= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
		
		System.out.println(json);
		
		mapper.writeValue(new File("Pr1.json"),person);
		
//		 To read the Json format file
		Person p1 = mapper.readValue(new File("Pr1.json"), Person.class);
		System.out.println(p1);
		
	}
}
