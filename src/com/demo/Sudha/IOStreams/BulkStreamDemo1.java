package com.demo.Sudha.IOStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class BulkStreamDemo1 {

		public static void main(String[] args) {
			String [] imagedata=new BulkStreamDemo1().GetArryaElement();
			String path="Sudha/pics/file{num}.jpg";
			
			for(int i=0;i<imagedata.length;i++) {
				
				String filepath=path.replace("{num}",String.valueOf(i));
				
				try (FileOutputStream fos=new FileOutputStream(filepath)){
					
					byte[] images=Base64.getDecoder().decode(imagedata[i]);
					
					fos.write(images);
					System.out.println("success");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		private String[] GetArryaElement() {
			String [] bytedata=new String[5];
			
			bytedata[0]= Encode.readEncodeDataFromFile("C:/Users/chara/Downloads/cherry.jpeg");
			bytedata[1]= Encode.readEncodeDataFromFile("C:/Users/chara/Downloads/1pic.jpeg");
			bytedata[2]= Encode.readEncodeDataFromFile("C:/Users/chara/Downloads/2pic.jpeg");
			bytedata[3]= Encode.readEncodeDataFromFile("C:/Users/chara/Downloads/3pic.jpeg");
			bytedata[4]= Encode.readEncodeDataFromFile("C:/Users/chara/Downloads/4pic.jpeg");
			
			
			
			
			return bytedata ;
			
		}

	}

	