package com.demo.sabitha.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandlerDemo2 {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Automtic\\f1\\f2\\test.txt");
		File parent=file.getParentFile();
		if(!parent.isDirectory()) {
			parent.mkdir();
		}
		if(file.createNewFile()) {
				System.out.println("file is created successfully");
			}
			else {
					System.out.println("file already exit");
			}
			try (FileWriter fileWriter = new FileWriter(file)) {
				fileWriter.write("this is automtic file created");
				System.out.println("Success");
			}
			
		
	}

}
