package com.demo.file.handler;

import java.io.File;

public class RenameFileDemo1 {
	
	public static void main(String[] args) {
		
		String basePath = "E://Chandu//File_Automatically//FA1//FA2/";
		
		//source
		File file = new File(basePath+"Test.txt");
		
		//destination
		File newFile = new File(basePath+"Test1.txt");
		
		//rename File
		boolean isFileRenamed = file.renameTo(newFile);
		
		if (isFileRenamed) {
			System.out.println("File renamed Sucessfully");
		}
		else {
			System.out.println("Failed /already renamed the file");
		}
		
	}

}
