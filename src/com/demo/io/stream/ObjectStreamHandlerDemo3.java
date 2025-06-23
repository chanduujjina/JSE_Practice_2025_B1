package com.demo.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamHandlerDemo3 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/Sample2.txt";
		
		Sample2 sample = new Sample2(1,"test", "test");
		
		writeObjectToFile(filePath,sample);//serlization
		readObjectFromFile(filePath);
	}

	private static void readObjectFromFile(String filePath) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
			Sample2 sample =(Sample2)inputStream.readObject();
			System.out.println(sample);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeObjectToFile(String filePath, Sample2 sample) {
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
			objectOutputStream.writeObject(sample);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
