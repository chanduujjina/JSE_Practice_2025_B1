package com.demo.io.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io_char_example_1 {
	public static void main(String[] args) {
		String filepath = "resources/file.text";
		String value = "This is example of IOstream";
		writeDataTofile(filepath, value);
		contentread(filepath);
	}

	private static void contentread(String filepath) {
		try (FileReader fileReader = new FileReader(filepath)) {
			
			int ch = 0;
			while((ch = fileReader.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writeDataTofile(String filepath, String value) {
		
		try(FileWriter fileWriter = new FileWriter(filepath);) {
			fileWriter.write(value);
			System.out.println("Done");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

}
