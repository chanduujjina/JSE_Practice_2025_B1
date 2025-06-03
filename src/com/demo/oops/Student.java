package com.demo.oops;

public class Student {
	
	

	private int studentId;//0,1
	
	private String name;//null,chandu
	
	private String gender;//null,male
	
	private Long phoneNumber;//null,9573532532
	
	//default constructor
	
	  public Student() {
	  
	  }
	 
	
	//parametorized constrctor
	public Student(int studentId,String name,String gender,Long phoneNumber) {
		this.studentId = studentId;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	
	//usage of setter and getter methods
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//how to access/retrive data from object
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public Long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", gender=" + gender + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
