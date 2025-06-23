package com.demo.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerDemo2 {
	
	

	public static void main(String[] args) throws IOException {
		
		String filePath = "E://Chandu//File_Automatically//FA1//FA2/Test.txt";
		
		File file = new File(filePath);
		
		
		//it will separate your folder from your file
		File parentFile = file.getParentFile();
		
		if (!parentFile.isDirectory()) {
			parentFile.mkdirs();
		}
		
		boolean createNewFile = file.createNewFile();
		
		if (createNewFile) {
			System.out.println("File Created Sucessfully");
		}
		
		else {
			System.out.println("File Alredy exists");
		}
		
		//write the content
		
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("This file created automatically by Java Program");
			System.out.println("Content is ctread in file sucessfully");
		}
		
		
		//create a temp file
		
		File createTempFile = File.createTempFile("test", ".txt");
		
		System.out.println(createTempFile.getAbsolutePath());
		
		
	}

}
