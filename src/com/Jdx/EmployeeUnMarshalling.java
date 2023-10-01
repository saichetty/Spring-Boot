package com.Jdx;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class EmployeeUnMarshalling {
	public static void main(String[] args) throws JAXBException {
		
//		File f= new File("C://Users//user//OneDrive//Desktop//New folder//Sudhdad.xml");
		File f1 = new File("Sudhdad.xml");
		
			JAXBContext jcu= JAXBContext.newInstance(Employee.class);
			Unmarshaller unm= jcu.createUnmarshaller();
//			Employee eum= (Employee) unm.unmarshal(f);
			Employee eum1=(Employee) unm.unmarshal(f1);
			System.out.println(eum1);
//			System.out.println(eum);
		
	}

}
