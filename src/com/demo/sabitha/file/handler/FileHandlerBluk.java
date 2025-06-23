package com.demo.sabitha.file.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerBluk {
	public static void main(String[] args) throws IOException {
		String[] Content=getStringData();
		File parentfile=new File("sabitha/Bulk");
		if(!parentfile.isDirectory()) {
			parentfile.mkdir();
		}
		for(int i=0;i<Content.length;i++) {

			String filename="file{num}.txt";
			String filepath=filename.replace("{num}",String.valueOf(i));
			File file=new File(parentfile,filepath);
			//file.createNewFile();
				try (FileWriter fileWriter = new FileWriter(file)) {
					fileWriter.write(Content[i]);
						System.out.println("successfully");
				}
				//path & Info
				System.out.println("getAbsoluteFile "+file.getAbsoluteFile());
				System.out.println("getAbsolutePath "+file.getAbsolutePath());
				System.out.println("getCanonicalpath "+file.getCanonicalPath());
				//getparentfile and getparent two methods return same
				System.out.println("getparentFile "+file.getParentFile());
				System.out.println(file.getParent());
				System.out.println("path "+file.toPath());
				System.out.println("URL "+file.toURI());
				//File Metadata
				//compareTO to check the parentfile and file it return the different of int + or -
				System.out.println("compareTo "+parentfile.compareTo(file));
				System.out.println("Exists  "+file.exists());
				System.out.println("hashcode "+file.hashCode());
				System.out.println("ishidden   "+file.isHidden());
				System.out.println("canRead "+file.canRead());
				System.out.println("canWriter "+file.canWrite());
				System.out.println("canexecute "+file.canExecute());
				System.out.println("setReadOnly "+file.setReadOnly());
				
				
		
		}
		//File Metadata
		System.out.println("isfile  "+parentfile.isFile());
		System.out.println("isDirectory  "+parentfile.isDirectory());
		//path & Info
		System.out.println("getFreespace  "+parentfile.getFreeSpace());
		
		
	}
	
	

	private static String[] getStringData() {
		String [] data=new String[10];
		String value="this is my {num} in my folder";
		for(int i=0;i<data.length;i++) {
			data[i]=value.replace("{num}",String.valueOf(i));
		}
		return data;
		
	}
	
	

}
