package com.demo.rajasekhar.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler2 {
	
	public static void main(String[] args) throws IOException {
		String filepath = "C://File_Automatically//FA1//FA2//Test.txt";
		

		File file =new File(filepath);
		
		File parentFile = file.getParentFile();
		
		if(!parentFile.isDirectory()) {
			parentFile.mkdirs();
		}
		boolean createNewFile = file.createNewFile();
		 
		if (createNewFile) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File Exists");
		}
		
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("This is Automated by java ");
			System.out.println("Content is created Successfully");
		}	
		
	
	
	
	}
	
}    
