package com.demo.io.stream;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_io_demo {
	public static void main(String[] args) {
		String filepath = "resources/test2.text";
		String val = "This is example of Buffered";
		writing(filepath,val);
		reading(filepath);
	}

	private static void reading(String filepath) {
		try (FileReader fileReader = new FileReader(filepath);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String value = null;
			while((value = bufferedReader.readLine()) != null) {
				System.out.println(value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void writing(String filepath, String val) {
		try (FileWriter fileWriter = new FileWriter(filepath);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write(val);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
