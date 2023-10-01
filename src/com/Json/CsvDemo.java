package com.Json;


	
	public class CsvDemo {
		
		private int Id;
		private String Name;
		private double Salary;
		private String Department;
		private boolean correct;
		public CsvDemo(int id, String name, double salary, String department, boolean correct) {
			super();
			Id = id;
			Name = name;
			Salary = salary;
			Department = department;
			this.correct = correct;
		}
		
		
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public boolean isCorrect() {
			return correct;
		}
		public void setCorrect(boolean correct) {
			this.correct = correct;
		}
		
		
}
