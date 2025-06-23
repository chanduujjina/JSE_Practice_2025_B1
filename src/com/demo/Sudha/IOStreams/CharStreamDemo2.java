package com.demo.Sudha.IOStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo2 {
	public static void main(String[] args) {
		String path="Sudha/test1.txt";
		String value="IO Streams in java using Buffer  ";
		BufferWritedata(path,value);
		BufferreadData(path);
		
	}

	
		
	

	private static void BufferreadData(String path) {
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String ch = "";
			
			while((ch=reader.readLine())!=null) {
				System.out.print(ch);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void BufferWritedata(String path, String value) {
		try (FileWriter filewriter = new FileWriter(path);BufferedWriter Bwf=new BufferedWriter(filewriter))  {
			Bwf.write(value);
			System.out.println("successfully created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
