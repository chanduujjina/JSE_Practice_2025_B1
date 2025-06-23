package com.demo.sabitha.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerDemo3Bulk {
	public static void main(String[] args) throws IOException {
		File file=new File("sabitha/File/test.txt");
		File parent=file.getParentFile();
		if(!parent.isDirectory()) {
			parent.mkdir();
		}
		if(file.createNewFile()) {
			System.out.println(" created successfully");
		}
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("this is my java file");
			System.out.println("success");
		}
		File file1=file.createTempFile("file1",".txt");
		System.out.println(file1.getAbsolutePath());
		//File Create=file.createTempFile("file2",".txt",file1);
		//System.out.println(Create.getAbsolutePath());
		file.deleteOnExit();
		System.out.println(file.delete());
		
	}

}
