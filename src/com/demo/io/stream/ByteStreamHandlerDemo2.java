package com.demo.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ByteStreamHandlerDemo2 {
	
	public static void main(String[] args) {
		
		String inputFile = "resources/images/Kubernates_Founder.jpg";
		
	      byte[] imageData = readDataFromFile(inputFile);
	      
	      String outputFile = "resources/images/Kubernates_founder_copy.jpg";
		
		writeDatatoFile(outputFile,imageData);
	}

	private static byte[] readDataFromFile(String inputFile) {
		
		try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
			byte[] readAllBytes = fileInputStream.readAllBytes();
			System.out.println("reading file sucessfully");
			return readAllBytes;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
private static String readEncodeDataFromFile(String inputFile) {
		
		try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
			byte[] readAllBytes = fileInputStream.readAllBytes();
			System.out.println("reading file sucessfully");
			return Base64.getEncoder().encodeToString(readAllBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	private static void writeDatatoFile(String fileName, byte[] imageData) {
		
		//byte[] imageBinary = Base64.getDecoder().decode(value);
		
		try (FileOutputStream fous = new FileOutputStream(fileName)) {
			fous.write(imageData);
			
			System.out.println("File created successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
