package com.demo.sabitha.db.prototype;

public class ProtoType implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student=new Student(1,"sabitha","female","1234567899");
		 Student stude = (Student) student.clone();
		 System.out.println(stude.hashCode());
		 System.out.println(student.hashCode());
		
	}

}
