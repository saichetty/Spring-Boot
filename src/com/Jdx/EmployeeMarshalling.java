package com.Jdx;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.tools.jconsole.JConsoleContext;

public class EmployeeMarshalling {
	
	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Saikumar patel");
		emp.setSalary(60000.00);
		emp.setValue(true);
		
		try {
			JConsoleContext jc = (JConsoleContext) JAXBContext.newInstance(Employee.class);
			Marshaller mars= ((JAXBContext) jc).createMarshaller();
			mars.marshal(emp, new File("Sudhdad.xml"));
			mars.marshal(emp, new File ("C://Users//user//OneDrive//Desktop//New folder//Sudh999.xml"));
			
			
		} catch (JAXBException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
