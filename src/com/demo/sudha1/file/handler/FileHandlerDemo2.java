package com.demo.sudha1.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerDemo2 {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Automatic\\f1\\f2\\text1.txt");
		File parent=file.getParentFile();
		if (!parent.isDirectory()) {
			parent.mkdir();
			
		}
		
			
			if (file.createNewFile()==true) {
				System.out.println("file is successfully created");
			}
			else {
				System.out.println("file already exists");
				
			}
			try (FileWriter fileWriter = new FileWriter(file)) {
				fileWriter.write("this is Automatic file");
			}
			System.out.println("Successfull");
		}
		}
	
	 
	





