package com.demo.sabitha.io.stream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo1 {
	public static void main(String[] args) {
		String path="sabitha/Test.txt";
		String value="Io stream programs in java";
		WriteData(path,value);
		ReadData(path);
		
	}
private static void ReadData(String path) {
	try(FileReader fileReader=new FileReader(path)){
		int ch=0;
		while((ch=fileReader.read())!=-1) {
			System.out.print((char)ch);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
private static void WriteData(String path,String value) {
	try(FileWriter filewriter = new FileWriter(path)) {
		filewriter.write(value);
		System.out.println("success");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}