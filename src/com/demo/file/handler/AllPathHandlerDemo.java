package com.demo.file.handler;

import java.io.File;
import java.io.IOException;

public class AllPathHandlerDemo {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "resources/../Files/";
		
		File file = new File(filePath);
		
		System.out.println("AP:"+file.getAbsolutePath());
		
		System.out.println("CP:"+file.getCanonicalPath());
		
		System.out.println("P:"+file.getPath());
	}

}
