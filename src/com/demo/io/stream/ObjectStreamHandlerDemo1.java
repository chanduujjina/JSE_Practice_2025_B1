package com.demo.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamHandlerDemo1 {
	
	public static void main(String[] args) {
		
		Sample sample = new Sample(1, "test", "test");
		
		String filePath = "resources/sample.txt";
		
		writeDataTofile(filePath,sample);//serlization
		Sample readDataFromFile = readDataFromFile(filePath);//deserilzation
		System.out.println(readDataFromFile);
		
	}

	private static Sample readDataFromFile(String filePath) {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
			Sample sample = (Sample)objectInputStream.readObject();
			return sample;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	private static void writeDataTofile(String filePath, Sample sample) {
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
			
			objectOutputStream.writeObject(sample);
			System.out.println("Object file created sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
