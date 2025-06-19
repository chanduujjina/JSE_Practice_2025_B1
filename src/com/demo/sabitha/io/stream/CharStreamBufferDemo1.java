package com.demo.sabitha.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class CharStreamBufferDemo1 {
	public static void main(String[] args) {
		String filepath="sabitha/Test1.txt";
		String value="IO stream programing in java we can access the data in bulk using Bufferchar";
		Bufferwriter(filepath,value);
		BufferRead(filepath);
	}

	private static void BufferRead(String filepath) {
		try(BufferedReader bufferreader=new BufferedReader(new FileReader(filepath))){
			String str=null;
			while((str=bufferreader.readLine())!=null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void Bufferwriter(String filepath, String value) {
		try (FileWriter filewriter=new FileWriter(filepath);
				BufferedWriter Bfw=new BufferedWriter(filewriter)){
			Bfw.write(value);
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
