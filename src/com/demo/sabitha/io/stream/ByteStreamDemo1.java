package com.demo.sabitha.io.stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ByteStreamDemo1 {
	public static void main(String[] args) {
		String [] imagedata=new ByteStreamDemo1().GetArryaElement();
		String path="sabitha/images/file{num}.jpg";
		
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
		
		bytedata[0]=new Encode().readEncodeDataFromFile("C:/Users/dokku/Downloads/NTR.jpeg");
		bytedata[1]=new Encode().readEncodeDataFromFile("C:/Users/dokku/Downloads/Assignment.jpeg");
		bytedata[2]=new Encode().readEncodeDataFromFile("C:/Users/dokku/Downloads/Assignment1.jpeg");
		bytedata[3]=new Encode().readEncodeDataFromFile("C:/Users/dokku/Downloads/Assignment2.jpeg");
		bytedata[4]=new Encode().readEncodeDataFromFile("C:/Users/dokku/Downloads/Assignment3.jpeg");
	
		return bytedata ;
		
	}

}
