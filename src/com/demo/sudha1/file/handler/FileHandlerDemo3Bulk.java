package com.demo.sudha1.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerDemo3Bulk {
	public static void main(String[] args) throws IOException {
		File file= new File("Sudha/File/test.txt");
		File parent=file.getParentFile();
		if (!parent.isDirectory()) {
			parent.mkdir();
			
		}
		if (file.createNewFile()) {
		System.out.println("creation Successfull ");	
		}
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("this is my Java file");
			System.out.println("Sucessfull");
		}
}

}
