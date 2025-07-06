package com.demo.sabitha.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OdjectStreamDemo1 {
	public static void main(String[] args) {
		String filepath="sabitha/Atm.txt";
		AtmObject atmObject=new AtmObject(1234,"sabitha","AS2345678IN","A234",20000.00);
		ObjectWriter(filepath,atmObject);
		OdjectReader(filepath);
		
	}

	private static void OdjectReader(String filepath) {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath))) {
			 AtmObject atmObject= (AtmObject) objectInputStream.readObject();
			System.out.println(atmObject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void ObjectWriter(String filepath, AtmObject atmObject) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath))) {
			objectOutputStream.writeObject(atmObject);
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
