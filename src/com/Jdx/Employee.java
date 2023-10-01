package com.Jdx;

import javax.xml.bind.annotation.*;

@XmlRootElement (name="Sai")
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private boolean value;
	
	@XmlAttribute
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@XmlAttribute
	public boolean isValue() {
		return value;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", value=" + value + "]";
	}
	
	
	
	
	
//	private int id;
//	private String name;
//	private String department;
//	private double fee;
//	private CollegeName clgName;
	
	
}
