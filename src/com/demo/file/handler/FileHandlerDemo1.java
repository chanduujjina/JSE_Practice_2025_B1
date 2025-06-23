package com.demo.file.handler;

import java.io.File;
import java.io.IOException;

public class FileHandlerDemo1 {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "E://Chandu//File_Automatically//FA1//FA2";
		
		File file = new File(filePath);
		
		
		//create a folder
		boolean isDirectoryCreated = file.mkdirs();
		
		if (isDirectoryCreated) {
			System.out.println("Created the folder Sucessfully");
		}
		
		else {
			System.out.println("already file created");
		}
		
		
		System.out.println(file.canRead());
		
		System.out.println(file.canWrite());
		
		System.out.println(file.canExecute());
		
	}

}
