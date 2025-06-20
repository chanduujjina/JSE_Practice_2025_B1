package com.demo.oops;

public class StudentInfo {
	
	private int id;
	
	private String name;

	
	public StudentInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + "]";
	}


}
