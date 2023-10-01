package com.Jdx;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MarsDemo {
	
		private int id;
		private String name;
		private double salary;
		
		public MarsDemo(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		@XmlElement
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@XmlElement
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@XmlElement
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

		
		@Override
		public String toString() {
			return "MarsDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

		public MarsDemo() {
			super();
			
		}
		
		
		

	}



