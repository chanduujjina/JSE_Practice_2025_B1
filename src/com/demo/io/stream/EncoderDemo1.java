package com.demo.io.stream;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Base64;

public class EncoderDemo1 {
	public static void main(String[] args) {
		String filepath = "resources/images/image1.jpg";
		String filepath2 = "resources/images/image2.jpg";
		String im = readData(filepath);
		String im2 = readData(filepath2);
		//System.out.println(im);
		System.out.println(im2);
		
	}

	private static String readData(String filepath) {
		try (FileInputStream fil = new FileInputStream(filepath)) {
			byte [] by = fil.readAllBytes();
			return Base64.getEncoder().encodeToString(by);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
