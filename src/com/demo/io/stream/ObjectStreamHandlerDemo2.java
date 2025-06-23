package com.demo.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamHandlerDemo2 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/AccountDetails.txt";
		
		AccountDetails accountDetails = new AccountDetails(1,"chandu", "1234567894", "1234567894", "testPan", "male", "Chandu@129", "01f23");
		
		writeObjectToFile(filePath,accountDetails);//serlization
		readObjectFromFile(filePath);
	}

	private static void readObjectFromFile(String filePath) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
			AccountDetails details =(AccountDetails)inputStream.readObject();
			System.out.println(details);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeObjectToFile(String filePath, AccountDetails accountDetails) {
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
			objectOutputStream.writeObject(accountDetails);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
