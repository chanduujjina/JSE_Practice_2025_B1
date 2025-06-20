package com.demo.Sudha.IOStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo1 {
	public static void main(String[] args) {
		String path="Sudha/test.txt";
		String value="IO Streams in java ";
		Writedata(path,value);
		readData(path);
		
	}

	private static void readData(String path) {
		try (FileReader filereader = new FileReader(path)) {
			int ch = 0;
			
			while((ch=filereader.read())!=-1) {
				System.out.print((char)ch);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void Writedata(String path, String value) {
		try (FileWriter filewriter = new FileWriter(path)) {
			filewriter.write(value);
			System.out.println("successfully created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
