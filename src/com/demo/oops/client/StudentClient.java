package com.demo.oops.client;

import com.demo.oops.Student;

public class StudentClient {

	public static void main(String[] args) {
		
		  
		  Student s1 = new Student(); s1.setName("chandu"); s1.setGender("male");
		  s1.setStudentId(1); s1.setPhoneNumber(9573532532l);
		  
		  //access the data with object reference
		  
		  String gender = s1.getGender(); String name = s1.getName();
		  
		  Long phoneNumber = s1.getPhoneNumber();
		  
		  int studentId = s1.getStudentId();
		  
		  System.out.println("geneder: "+gender+
		  " name:"+name+" id:"+studentId+" phoneNumber:"+phoneNumber);
		  
		  
		  Student s2 = new Student(); s2.setName("sabitha"); s2.setGender("female");
		  s2.setStudentId(2); s2.setPhoneNumber(778945131l);
		  
		  System.out.println(s2.toString());
		 

		Student s3 = new Student(3, "Sekhar", "male", 45612385555L);

		System.out.println(s3.toString());

	}

}
