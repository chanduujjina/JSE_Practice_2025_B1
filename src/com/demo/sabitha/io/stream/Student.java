package com.demo.sabitha.io.stream;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 3477098462572003672L;
	private int std_Id;
	private String std_Name;
	private String std_Number;
	private char std_Grand;
	public Student(int std_Id, String std_Name, String std_Number, char std_Grand) {
		super();
		this.std_Id = std_Id;
		this.std_Name = std_Name;
		this.std_Number = std_Number;
		this.std_Grand = std_Grand;
	}
	@Override
	public String toString() {
		return "Student [std_Id=" + std_Id + ", std_Name=" + std_Name + ", std_Number=" + std_Number + ", std_Grand="
				+ std_Grand + "]";
	}
	

}
