package com.Json;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class PersonApp {
	public static void main(String[] args) throws IOException {
		
		String [] hobbies= {"Cricket","browsing"};
		
		Person michel = new Person("michel",32, hobbies);
		
		
//		System.out.println(michel);
		
//		Object java into Json
		
		
		Gson gson = new Gson();
		
		FileWriter writer = new FileWriter("Person.json");
		gson.toJson(michel,writer);
		writer.close();
		
		String jsonData = gson.toJson(michel);
		System.out.println(jsonData);
		
		
	}

}
