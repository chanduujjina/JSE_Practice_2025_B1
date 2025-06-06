package com.demo.oops.client;

import com.demo.oops.StudentInfo;
import com.demo.oops.Teacher;

public class AssocationClient {
	
	public static void main(String[] args) {
		
		StudentInfo studentInfo = new StudentInfo(1, "teststd");
		
	Teacher teacher = new Teacher(1, "test teacher", studentInfo);
	
	System.out.println(teacher);
	}

}
