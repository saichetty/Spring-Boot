package com.Jdx;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshallingDemo {
	
	public static void main(String[] args) throws JAXBException {
		
		File file = new File("SAI.xml");
		JAXBContext jabContext= JAXBContext.newInstance(MarsDemo.class);
		Unmarshaller um = jabContext.createUnmarshaller();
		MarsDemo mar1 = (MarsDemo) um.unmarshal(file);
		System.out.println(mar1);
		
		
		
		
		
		
		
		
	}

}
