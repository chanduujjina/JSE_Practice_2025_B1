package com.demo.fileHandler;

import java.io.File;

public class FileHandlerDemo1 {
	public static void main(String[] args) {
		String filepath = "C://Abhi//File_automatic//FA1//FA2";
		File file = new File(filepath);
		boolean iscreated = file.mkdirs();
		System.out.println(iscreated);
	}

}
