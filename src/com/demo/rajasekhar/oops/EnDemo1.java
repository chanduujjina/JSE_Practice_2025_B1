package com.demo.rajasekhar.oops;

public class EnDemo1 {
	public static void main(String[] args) {
		Student std = new Student(1,"rajasekhar","Male");
		Student std1 = new Student(2,"Hemanth","Male");
		/*
		 * std.setId(1); std.setName("Rajasekhar"); std.setGender("Male");
		 */
		String name=std.getName();
		System.out.println(name);
	}

}
class Student{
	//state
	
	private int id;
	private String name;
	private String gender;
	public Student (int id, String name, String gender) {
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	//behaviour
	
}