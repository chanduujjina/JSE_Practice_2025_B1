package com.demo.file.handler;

import java.io.File;

public class ListingFilesDemo {
	
	public static void main(String[] args) {
		
		File folder = new File("resources/");
		
		
		
		File[] listFiles = folder.listFiles();
		
		//list only directories
		for(File file : listFiles) {
			
			if (file.isDirectory()) {
			System.out.println(file.getName());
			}
		}
		
		//list only files
		
		for (File file : listFiles) {
			
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
		
	}

}
