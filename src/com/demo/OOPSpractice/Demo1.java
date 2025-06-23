package com.demo.OOPSpractice;

public class Demo1 {
	private int StudentID;
	private String StudentName;   //Instance variable
	
	public void getid(int id) {        // setter
		this.StudentID = id;
	}
	
	public void getname(String n) {        // setter
		this.StudentName = n;
	}
	
	public int idprint() {                //getter
		return this.StudentID;
		
	}
	
	public String idname() {                //getter
		return this.StudentName;
		
	}
	
	public Demo1(int id) {                          // constructor
		this.StudentID = id;
	}

}
