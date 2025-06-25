package com.demo.sudha1.file.handler;

import java.io.File;

public class FileHandlerDemo {
	public static void main(String[] args) {
		String fielpath="C:\\Automatic\\f1\\f2";
		 File file=new File(fielpath);
		if (file.mkdirs()) {
			System.out.println("Folders created");
			
		}
		else {
			System.out.println("Folders already exists");
		}
	}
	
	 
	

}
