package com.demo.exception.sabitha.handler;

public class Student {
	private String std_Id;
	private String std_Name;
	private String std_Gender;
	private String std_Dob;
	private String std_PAN;
	
	public Student(String std_Id, String std_Name, String std_Gender, String std_Dob, String std_PAN) {
		super();
		this.std_Id = std_Id;
		this.std_Name = std_Name;
		this.std_Gender = std_Gender;
		this.std_Dob = std_Dob;
		this.std_PAN = std_PAN;
	}

	@Override
	public String toString() {
		return "Student [std_Id=" + std_Id + ", std_Name=" + std_Name + ", std_Gender=" + std_Gender + ", std_Dob="
				+ std_Dob + ", std_PAN=" + std_PAN + "]";
	}

	public String getStd_Id() {
		return std_Id;
	}
	
	public void setStd_Id(String std_Id) {
		this.std_Id = std_Id;
	}

	public String getStd_Name() {
		return std_Name;
	}
	
	public void setStd_Name(String std_Name) {
		this.std_Name = std_Name;
	}
	
	public String getStd_Gender() {
		return std_Gender;
	}
	
	public void setStd_Gender(String std_Gender) {
		this.std_Gender = std_Gender;
	}
	
	public String getStd_Dob() {
		return std_Dob;
	}
	
	public void setStd_Dob(String std_Dob) {
		this.std_Dob = std_Dob;
	}
	
	public String getStd_PAN() {
		return std_PAN;
	}
	
	public void setStd_PAN(String std_PAN) {
		this.std_PAN = std_PAN;
	}
	

}
