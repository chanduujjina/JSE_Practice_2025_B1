package com.demo.oops;

public class Teacher {
	
	private int teacherId;
	
	private String teacherName;
	
	private StudentInfo student;
	
	public Teacher(int teacherId, String teacherName,StudentInfo student) {
		this.teacherId = teacherId;
		this.teacherName =teacherName;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", student=" + student + "]";
	}

}
