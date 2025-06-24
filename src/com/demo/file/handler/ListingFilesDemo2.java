package com.demo.file.handler;

import java.io.File;

public class ListingFilesDemo2 {
	
	public static void main(String[] args) {
		
		File file = new File("resources/");
		
		 File[] files = file.listFiles();
		
		 if (files != null) {
	            for (File obj : files) {
	                if (obj.isDirectory()) {
	                    System.out.println("Directory: " + obj.getName());
	                }
	            }
	        }
		
		
	}

}
