package com.demo.file.handler;

import java.io.File;

public class DeleteFileDemo1 {
	
	public static void main(String[] args) {
		
		String basePath = "resources/Files/sample0.txt";
		
		File file = new File(basePath);
		
		/*
		 * if (file.exists()) { file.delete(); }
		 */
		
		file.deleteOnExit();
	}

}
