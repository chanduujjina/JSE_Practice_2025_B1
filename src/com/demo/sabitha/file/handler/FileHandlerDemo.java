package com.demo.sabitha.file.handler;

import java.io.File;

public class FileHandlerDemo {
	public static void main(String[] args) {
		String filepath="C:\\Automtic\\f1\\f2";
		File file=new  File(filepath);
		if(file.mkdirs()) {
			System.out.println("Floders is creteds");
		}
		else
		{
			System.out.println("floders already exit");
		}
		
	}

	
	
}
