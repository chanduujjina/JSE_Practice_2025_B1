package com.demo.sudha1.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class FilehandlerBulk {
	public static void main(String[] args) throws IOException {
		
		String [] Content=getStringData();
		File parent= new File("Sudha/Bulk");
		
		if (!parent.isDirectory()) {
			parent.mkdir();
			
		}
		for(int i=0;i<Content.length;i++) {
			String filename="file{Number}.txt";
			String filepath=filename.replace("{Number}", String.valueOf(i));
			File file= new File(parent,filepath);
			//file.createNewFile();
			try (FileWriter fileWriter=new FileWriter(file)) {
				fileWriter.write(Content [i]);
				System.out.println("successfull");
				
				
			}
			
		}
			
		
		
			
		
	}

	private static String[] getStringData() {
		String [] data=  new String [20];
		
		String value="this is my {Number}in my folder";
		for (int i =0;i<data.length;i++) {
			data[i]=value.replace("{Number}", String.valueOf(i));
		}
		return data;
	}

}
