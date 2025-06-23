package com.demo.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFilesInBulkModedemo1 {
	
	
	public static void main(String[] args) {
		
		String content[]  = getFileContent();
		
		for (String value : content) {
			System.out.println(value);
		}
		
		File parentFile = new File("resources/Files2");
		
		
	     
	     if (!parentFile.isDirectory()) {
	    	 parentFile.mkdirs();
	    	 System.out.println("Direcory created");
	     }
		
		for(int i =0;i<content.length;i++) {
			String fileName = "Regular{num}.txt";
			fileName = fileName.replace("{num}", String.valueOf(i));
			File file = new File(parentFile,fileName);
			
			//create directory if not exists
			
		     
		     
		     //create a file
		     
		     
		     
		     try (FileWriter fileWriter = new FileWriter(file)) {
		    	 fileWriter.write(content[i]);
		    	 System.out.println("File Created successfully:"+file.getAbsolutePath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		}
		
		//list the files
		
		String[] list = parentFile.list();
		
		for(String file : list) {
			System.out.println(file);
		}
		
		File[] listFiles = parentFile.listFiles();
		
		for (File fileOut : listFiles) {
			System.out.println(fileOut.getAbsolutePath());
		}
		
	}

	private static String[] getFileContent() {
		
		String content[] = new String[10];
		
		String value = "This is my {num} file";
		
		for (int i =0; i<10;i++) {
			content[i] = value.replace("{num}", String.valueOf(i));
		}
		
		return content;
	}
	
	

}
