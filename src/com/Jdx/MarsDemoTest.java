package com.Jdx;


import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class MarsDemoTest {
	
	public static void main(String[] args) throws JAXBException, IOException {
		
				MarsDemo mar=new MarsDemo(100, "SaiPatel", 5000.00); 
				JAXBContext context = JAXBContext.newInstance(MarsDemo.class);
				Marshaller marshaller= context.createMarshaller();
//	No need this step	marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);	
//				marshaller.marshal(mar, new File("C:\\Users\\user\\OneDrive\\Desktop\\New folder\\SAI2.xml"));
				marshaller.marshal(mar, new File("SAI5.xml"));
//				StringWriter writer = new StringWriter();
				
				System.out.println("Success");
				
				
	}

}
