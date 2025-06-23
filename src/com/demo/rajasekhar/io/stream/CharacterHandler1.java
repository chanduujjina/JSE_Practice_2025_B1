  package com.demo.rajasekhar.io.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterHandler1 {
	public static void main(String[] args) {
		String filepath = "rajresources/Test.txt";
		String value = "Hi i am rajasekhar from choragudi";
		writeDataToFile(filepath , value);
		readDataFromFile(filepath);
	}
	private static void readDataFromFile(String filepath) {
		try (FileReader fileReader = new FileReader(filepath)) {
		int ch = 0;
		while((ch = fileReader.read()) !=-1) {
			System.out.print((char)ch);
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	private static void writeDataToFile(String filepath, String value) {
		try (FileWriter fileWriter = new FileWriter(filepath)) {
			fileWriter.write(value);
			System.out.println("File Creation and Content Writing is Sucessfull");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} 
