package com.demo.sabitha.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	
	public static void main(String[] args) {
		String filepath="sabitha/student.txt";
		Student student=new Student(1,"sabitha","123456789",'B');
		ObjectWriter(filepath,student);
		//System.out.println(ObjectReader(filepath));
		
	}

	private static void ObjectReader(String filepath) {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filepath))) {
			Student student1=(Student) objectInputStream.readObject();
			System.out.println(student1.toString());
			//return student1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
	}
		
	

	private static void ObjectWriter(String filepath,Student student) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filepath))) {
			objectOutputStream.writeObject(student);
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
