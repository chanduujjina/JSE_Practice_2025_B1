  package com.demo.rajasekhar.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class Encodingimage {
  	
  	public static void main(String[] args) {
  		
  		String imageFilePath = "rajresources/images/ratan tata.jpg";
  		String image2 = "rajresources/images/th.jpeg";
  		
  		String im = encodeimage(imageFilePath);
  		String im2 = encodeimage(image2);
  		//System.out.println(im+"\n");
  		System.out.println(im2);
  			
  		
  	}

	private static String encodeimage(String imageFilePath) {
		try (FileInputStream fis = new FileInputStream (imageFilePath)) {
			
			byte [] ReadAllBytes = fis.readAllBytes();
			return Base64.getEncoder().encodeToString(ReadAllBytes);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		}
		
	}
  
