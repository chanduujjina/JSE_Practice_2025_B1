package com.demo.io.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamandlerDemo1 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/Test1.txt";
		
		String value = "IO Stream is technique to handle plain or binary data store or access";
		
		writeDataToFile(filePath , value);
		
		readDataFromFile(filePath);
	}

	private static void readDataFromFile(String filePath) {
		
		try (FileReader fileReader = new FileReader(filePath)) {
			
			int ch = 0;
			
			while((ch = fileReader.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeDataToFile(String filePath, String value) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(value);
			System.out.println("File creation and content wriring is sucessfull");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
