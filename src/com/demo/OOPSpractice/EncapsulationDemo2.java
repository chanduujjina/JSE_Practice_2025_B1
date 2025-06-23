package com.demo.OOPSpractice;

public class EncapsulationDemo2 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setname("Abhiram");
		System.out.println(student.getname());student.getname();
	}
}
class Student{
	private String name;
	public void setname(String n) {
		name =n;
	}
	public String getname() {
		return name;
	}
}
