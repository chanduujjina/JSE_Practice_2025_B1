package com.demo.rajasekhar.file.handler;

import java.io.File;

public class FileHandler1 {
	public static void main(String[] args) {
		String filepath = "C://File_Automatically//FA1//FA2";
		
		// To Create a Folder
		File file =new File(filepath);

		boolean isDirectoryCreated =  file.mkdirs();

		if (isDirectoryCreated) {
			System.out.println("Created Folder Successfully");
		}
		else {
			System.out.println("Folder is created");

		}
		
	}
}
