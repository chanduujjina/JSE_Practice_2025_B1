package com.demo.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamHandlerDemo2 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/Test2.txt";
		
		String value = "IO Stream is technique to handle plain or binary data store or access.BufferedStream is to use handle large memory file";
		
		writeDataToFile(filePath , value);
		
		readDataFromFile(filePath);
	}

	private static void readDataFromFile(String filePath) {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			
			String value = null;
			while((value =bufferedReader.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeDataToFile(String filePath, String value) {
		
		try (FileWriter fileWriter = new FileWriter(filePath);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write(value);
			
			System.out.println("File created sucessfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
