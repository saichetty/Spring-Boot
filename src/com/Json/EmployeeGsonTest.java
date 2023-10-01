package com.Json;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class EmployeeGsonTest {

	
	public static void main(String[] args) throws IOException {
		
		String [] address= {"Ntpc", "Ramagumdam", "Telangana"};
		
		EmployeeJson emp= new EmployeeJson(100, "Saikumar", 50000.00, address);
		
		Gson gson= new Gson();
		
		FileWriter fw = new FileWriter("Saiiiiiiiii.json");
		
		gson.toJson(emp,fw);
		fw.close();
		
		
		String jsondata= gson.toJson(emp);
		System.out.println(jsondata);
		
		
		
	}
}
