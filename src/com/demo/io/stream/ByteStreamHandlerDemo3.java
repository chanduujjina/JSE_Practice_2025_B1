package com.demo.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ByteStreamHandlerDemo3 {
	
	public static void main(String[] args) {
		
		String inputFile = "resources/images/Founder_Gradel.jpg";
		
	     String encodedImageStringData = readEncodeDataFromFile(inputFile);
	      
	      String outputFile = "resources/images/Founder_Gradely_copy.jpg";
		
		writeDatatoFile(outputFile,encodedImageStringData);
	}

	
	


	private static String readEncodeDataFromFile(String inputFile) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			byte[] readAllBytes = fileInputStream.readAllBytes();
			System.out.println("Read file Successfully");
			return Base64.getEncoder().encodeToString(readAllBytes);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
	}





	private static void writeDatatoFile(String fileName, String encodedString) {
		
	byte[] byteArray = Base64.getDecoder().decode(encodedString);
		
		try (FileOutputStream fous = new FileOutputStream(fileName)) {
			fous.write(byteArray);
			
			System.out.println("File created successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
