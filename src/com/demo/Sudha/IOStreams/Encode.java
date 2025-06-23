package com.demo.Sudha.IOStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class Encode {
	//public static void main(String[] args) {
		//String path ="C:/Users/chara/Downloads/pic5.jpeg";
	//	System.out.println(readEncodeDataFromFile(path));
		
		
		
	//}
	public static String readEncodeDataFromFile(String path) {
		
		try (FileInputStream fileInputStream = new FileInputStream(path)) {
			byte[] readAllBytes = fileInputStream.readAllBytes();
			System.out.println("");
			return Base64.getEncoder().encodeToString(readAllBytes);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
		

	}
	}
