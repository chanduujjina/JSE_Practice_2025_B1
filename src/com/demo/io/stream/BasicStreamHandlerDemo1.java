package com.demo.io.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BasicStreamHandlerDemo1 {
	
	public static void main(String[] args) {
		
		String filePath = "resources/basicTest.txt";
		
		String value = "Wiht out try with resouce you can handle using try with finally";
		
		writeDataToFile(filePath,value);
		
		String filePath1 = "resources/basicTest1.txt";
		
		writeDataToFile1(filePath1,value);
	}

	private static void writeDataToFile(String filePath, String value) {
		
		FileWriter fileWriter = null;
		try {
		
		 fileWriter = new FileWriter(filePath);
		 fileWriter.write(value);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {//risky
			try {
				if (fileWriter != null ) {
				fileWriter.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	private static void writeDataToFile1(String filePath, String value) {
		try(FileWriter fileWriter = new FileWriter(filePath)){
			fileWriter.write(value);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private static void writeDataToFile2(String filePath, String value) {
		try (FileWriter fileWriter = new FileWriter(filePath);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
