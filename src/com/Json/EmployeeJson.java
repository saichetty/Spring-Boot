package com.Json;
import java.util.Arrays;

public class EmployeeJson {

	private int id;
	private String name;
	private double salary;
	String [] address;
	
   
	
	public EmployeeJson() {
		
	}
	
	
	public EmployeeJson(int id, String name, double salary, String[] address) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String[] getAddress() {
		return address;
	}


	public void setAddress(String[] address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "EmployeeJson [id=" + id + ", name=" + name + ", salary=" + salary + ", address="
				+ Arrays.toString(address) + "]";
	}
	
	
	
}
