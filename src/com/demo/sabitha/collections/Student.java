package com.demo.sabitha.collections;

public class Student {
	private int id;
	private String name;
	private char Grand;
	private long Marks;
	private long PhoneNumber;
	private String Gender;
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	public Student(int id, String name, char grand, long marks, long phoneNumber, String gender) {
		super();
		this.id = id;
		this.name = name;
		Grand = grand;
		Marks = marks;
		PhoneNumber = phoneNumber;
		Gender = gender;
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Grand=" + Grand + ", Marks=" + Marks + ", PhoneNumber="
				+ PhoneNumber + ", Gender=" + Gender + "]";
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
	
	public char getGrand() {
		return Grand;
	}
	
	public void setGrand(char grand) {
		Grand = grand;
	}
	
	public long getMarks() {
		return Marks;
	}
	
	public void setMarks(long marks) {
		Marks = marks;
	}
	
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	

}
